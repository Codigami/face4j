package com.face4j.facebook.http;

import java.io.IOException;

import org.apache.commons.httpclient.HostConfiguration;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;

import com.face4j.facebook.exception.FacebookException;
import org.apache.commons.httpclient.methods.PostMethod;

/**
 * APICaller will make http requests, obtain that response and return it without processing. Basically, the raw response is returned by every method.
 * @author nischal.shetty
 *
 */
public class APICaller implements APICallerInterface {
	
	private static final APICaller caller = new APICaller();
	private static HttpClient httpClient = null;
	
	private APICaller(){
		
	}
	
	private synchronized static HttpClient getHttpClient() {
		if(null==httpClient){
			MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
			connectionManager.getParams().setMaxConnectionsPerHost(HostConfiguration.ANY_HOST_CONFIGURATION, 15);
			connectionManager.getParams().setMaxTotalConnections(15);
			httpClient = new HttpClient(connectionManager);
		}
		return httpClient;
	}
	
	public static APICaller getInstance(){
		return caller;
	}
	
	
	public String getData(String url, NameValuePair[] nameValuePairs) throws FacebookException{
		HttpClient client = APICaller.getHttpClient();
		String response = null;
		
		GetMethod getMethod = null;
		try{
		 getMethod = new GetMethod(url);
		 
		 if(nameValuePairs!=null){
			 getMethod.setQueryString(nameValuePairs);
		 }
		 
		 int statusCode = client.executeMethod(getMethod);
			if (statusCode != HttpStatus.SC_OK) {
	      throw new FacebookException ("I guess you are not permitted to access this url. HTTP status code:"  + statusCode,statusCode);
	    }
			response = getMethod.getResponseBodyAsString();
		} catch (HttpException e) {
			throw new FacebookException("Http Exception while calling facebook!",e);
		} catch (IOException e) {
			throw new FacebookException("IO Exception while calling facebook!",e);
		}	finally {
	  		getMethod.releaseConnection();
	  }
		return response;
 }


    public String postData(String url, NameValuePair[] nameValuePairs) throws FacebookException {

        HttpClient client = APICaller.getHttpClient();
        String response = null;

        PostMethod postMethod = null;
        try {
            postMethod = new PostMethod(url);

            if (nameValuePairs != null) {
                postMethod.setQueryString(nameValuePairs);
            }

            int statusCode = client.executeMethod(postMethod);
            if (statusCode != HttpStatus.SC_OK) {
                throw new FacebookException("I guess you are not permitted to access this url. HTTP status code:" + statusCode, statusCode);
            }
            response = postMethod.getResponseBodyAsString();
        } catch (HttpException e) {
            throw new FacebookException("Http Exception while calling facebook!", e);
        } catch (IOException e) {
            throw new FacebookException("IO Exception while calling facebook!", e);
        } finally {
            postMethod.releaseConnection();
        }

        return response;
    }
	
	//TODO: delete data method
	
	/*public static void main(String[] args) {
		
		APICaller client = APICaller.getInstance();
		
		//https://graph.facebook.com/me
		//access_token=118528751499071|4d6f2914cdc4d0177cdb5a66-544232058|cIgUXhJ5bnj5i5orhdqqrVUh3TA.
		try {
			client.getData("https://graph.facebook.com/me?access_token=118528751499071|4d6f2914cdc4d0177cdb5a66-544232058|cIgUXhJ5bnj5i5orhdqqrVUh3TA.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	
	
	
}