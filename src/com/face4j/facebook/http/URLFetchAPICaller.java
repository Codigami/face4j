package com.face4j.facebook.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;

import com.face4j.facebook.exception.FacebookError;
import com.face4j.facebook.exception.FacebookException;
import com.google.appengine.api.urlfetch.HTTPResponse;
import com.google.appengine.api.urlfetch.URLFetchService;
import com.google.appengine.api.urlfetch.URLFetchServiceFactory;

public class URLFetchAPICaller implements APICallerInterface {

	public String getData(String url, NameValuePair[] nameValuePairs) throws FacebookException {

		URLFetchService fetchService = URLFetchServiceFactory.getURLFetchService();
		URL fetchURL = null;

		HTTPResponse response = null;
		String responseString = null;
		String constructedParams = null;

		try {

			if (nameValuePairs != null) {
				constructedParams = constructParams(nameValuePairs);

				if (url.contains("?")) {
					url = url.concat("&" + constructedParams);
				} else {
					url = url.concat("?" + constructedParams);
				}
			}

			fetchURL = new URL(url);
			response = fetchService.fetch(fetchURL);

			int statusCode = response.getResponseCode();
			if (statusCode != HttpStatus.SC_OK) {
				FacebookError error = new FacebookError(statusCode, "I guess you are not permitted to access this url. HTTP status code:"+statusCode, null);
				throw new FacebookException(error);
			}
			responseString = new String(response.getContent());
		} catch (HttpException e) {
			throw new FacebookException("Http Exception while calling facebook!", e);
		} catch (IOException e) {
			throw new FacebookException("IO Exception while calling facebook!", e);
		}

		return responseString;
	}

	/**
	 * @param url
	 * @param nameValuePairs
	 * @return
	 * @throws FacebookException
	 */
	public String postData(String url, NameValuePair[] nameValuePairs) throws FacebookException {
		
		String content = null;
		String constructedParams = null;
		int statusCode = 0;
		HttpURLConnection connection = null;
        try {
            URL posturl = new URL(url);
            connection = (HttpURLConnection) posturl.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            //connection.setConnectTimeout(10000);
            //connection.setReadTimeout(10000);

            OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
            
            constructedParams = constructParams(nameValuePairs);
            
            writer.write(constructedParams);
            writer.close();
    
            statusCode = connection.getResponseCode();
            if (statusCode != HttpURLConnection.HTTP_OK) {
            	FacebookError error = new FacebookError(statusCode, "I guess you are not permitted to access this url. HTTP status code:"+statusCode, null);
      				throw new FacebookException(error);
            } else {
            //Get Response	
              InputStream is = connection.getInputStream();
              BufferedReader rd = new BufferedReader(new InputStreamReader(is));
              String line;
              StringBuilder response = new StringBuilder(); 
              while((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\r');
              }
              rd.close();
              content =  response.toString();

            }
        } catch (MalformedURLException e) {
        	throw new FacebookException("Malformed URL Exception while calling facebook!", e);
        } catch (IOException e) {
        	throw new FacebookException("IOException while calling facebook!", e);
        } finally{
        	if(connection != null){
        		connection.disconnect();
        	}
        }
        
        return content;
        
	}

	private String constructParams(NameValuePair[] nameValuePairs) {

		StringBuilder builder = null;
		String constructedParams = null;

		for (NameValuePair nameValuePair : nameValuePairs) {
			if(nameValuePair!=null && nameValuePair.getName()!=null && nameValuePair.getValue()!=null){
			if (builder != null) {
				try {
					builder.append("&" + nameValuePair.getName() + "=" + URLEncoder.encode(nameValuePair.getValue(), "UTF-8"));
				} catch (UnsupportedEncodingException e) {
					// TODO: Catch error
				}
			} else {
				builder = new StringBuilder();
				try {
					builder.append(nameValuePair.getName() + "=" + URLEncoder.encode(nameValuePair.getValue(), "UTF-8"));
				} catch (UnsupportedEncodingException e) {
					// TODO: Catch error
				}
			}
			}
		}

		if (builder != null) {
			constructedParams = builder.toString();
		}

		return constructedParams;
	}

}