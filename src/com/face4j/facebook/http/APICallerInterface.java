package com.face4j.facebook.http;


import com.face4j.facebook.exception.FacebookException;
import org.apache.http.NameValuePair;

public interface APICallerInterface {
	
	public String getData(String url, NameValuePair[] nameValuePairs) throws FacebookException;

  public String postData(String url, NameValuePair[] nameValuePairs) throws FacebookException;
  
  public String deleteData(String url, NameValuePair[] nameValuePairs) throws FacebookException;
}
