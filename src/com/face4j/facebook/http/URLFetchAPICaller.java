package com.face4j.facebook.http;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;

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
				throw new FacebookException("I guess you are not permitted to access this url. HTTP status code:" + statusCode,
						statusCode);
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
		
		String constructedParams = null;
		int statusCode = 0;
        try {
            URL posturl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) posturl.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");

            OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
            
            constructedParams = constructParams(nameValuePairs);
            
            writer.write(constructedParams);
            writer.close();
    
            statusCode = connection.getResponseCode();
            if (statusCode != HttpURLConnection.HTTP_OK) {
            	throw new FacebookException("I guess you are not permitted to access this url. HTTP status code:" + statusCode,
						statusCode);
            } else {
            	
            }
        } catch (MalformedURLException e) {
        	throw new FacebookException("Malformed URL Exception while calling facebook!", e);
        } catch (IOException e) {
        	throw new FacebookException("IOException while calling facebook!", e);
        }
        
        return null;
        
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