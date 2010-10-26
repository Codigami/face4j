package com.face4j.facebook.http;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;

import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;

import com.face4j.facebook.exception.FacebookException;
import com.google.appengine.api.urlfetch.HTTPResponse;
import com.google.appengine.api.urlfetch.URLFetchService;
import com.google.appengine.api.urlfetch.URLFetchServiceFactory;
import com.sun.org.apache.xerces.internal.util.URI;

public class URLFetchAPICaller implements APICallerInterface{
	
	@Override
	public String getData(String url, NameValuePair[] nameValuePairs)
			throws FacebookException {
		
		URLFetchService fetchService = URLFetchServiceFactory.getURLFetchService();
		URL fetchURL = null;
		
		HTTPResponse response = null;
		String responseString = null;
		String constructedParams = null; 
		
		try{
			
			constructedParams = constructParams(nameValuePairs);
			
			if(url.contains("?")){
				url = url.concat("&"+constructedParams);
			} else {
				url = url.concat("?"+constructedParams);
			}
			
			fetchURL = new URL(url);
			response = fetchService.fetch(fetchURL);
			
			int statusCode = response.getResponseCode();
			if (statusCode != HttpStatus.SC_OK) {
				throw new FacebookException ("I guess you are not permitted to access this url. HTTP status code:"  + statusCode,statusCode);
			}
			responseString =  new String(response.getContent());
			} catch (HttpException e) {
				throw new FacebookException("Http Exception while calling facebook!",e);
			} catch (IOException e) {
				throw new FacebookException("IO Exception while calling facebook!",e);
			}
			
		return responseString;
	}
	
	private String constructParams(NameValuePair[] nameValuePairs){
		
		StringBuilder builder = null;
		String constructedParams = null;
		
		for(NameValuePair nameValuePair : nameValuePairs){
			if(builder!=null){
				try {
					builder.append("&"+nameValuePair.getName()+"="+URLEncoder.encode(nameValuePair.getValue(),"UTF-8"));
				} catch (UnsupportedEncodingException e) {
					//TODO: Catch error
				}
			} else {
				builder = new StringBuilder();
				try {
					builder.append(nameValuePair.getName()+"="+URLEncoder.encode(nameValuePair.getValue(),"UTF-8"));
				} catch (UnsupportedEncodingException e) {
					//TODO: Catch error
				}	
			}
		}
		
		if(builder!=null){
			constructedParams = builder.toString();
		}
		
		return constructedParams;
	}
	
	
}