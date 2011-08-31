package com.face4j.facebook.http;

import java.io.IOException;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.DeleteMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;

import com.face4j.facebook.exception.FacebookException;
import com.face4j.facebook.util.JSONToObjectTransformer;

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
		
		//This part is when the nameValuePairs is null indicating the params are most probably in the url
		String urlSplit[] = null;
		if(nameValuePairs==null){
			urlSplit = url.split("\\?");
			url = urlSplit[0];
			
			if(urlSplit.length > 1){
				nameValuePairs = getNameValuePairs(urlSplit[1]);
			}
		}
		
		GetMethod getMethod = null;
		try{
		 getMethod = new GetMethod(url);
		 
		 if(nameValuePairs!=null){
			 getMethod.setQueryString(nameValuePairs);
		 }
		 
		 int statusCode = client.executeMethod(getMethod);
			if (statusCode != HttpStatus.SC_OK) {
				//FacebookError error = new FacebookError(statusCode, "I guess you are not permitted to access this url. HTTP status code:"+statusCode, null);
				response = getMethod.getResponseBodyAsString();
				throw new FacebookException(JSONToObjectTransformer.getError(response, statusCode));
	    }
			response = getMethod.getResponseBodyAsString();
		} catch (HttpException e) {
			throw new FacebookException("Http Exception while calling facebook!",e);
		} catch (IOException e) {
			throw new FacebookException("IO Exception while calling facebook!",e);
		}	finally {
	  		getMethod.releaseConnection();
	  }
		
		//if response string contains accessToken=xxx remove it!
		//response = Util.replaceAccessToken(response, nameValuePairs);
		
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
            	//FacebookError error = new FacebookError(statusCode, "I guess you are not permitted to access this url. HTTP status code:"+statusCode, null);
            	response = postMethod.getResponseBodyAsString();
      				throw new FacebookException(JSONToObjectTransformer.getError(response, statusCode));
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
   
    public String deleteData(String url, NameValuePair[] nameValuePairs) throws FacebookException {

      HttpClient client = APICaller.getHttpClient();
      String response = null;

      DeleteMethod deleteMethod = null;
      try {
          deleteMethod = new DeleteMethod(url);

          if (nameValuePairs != null) {
              deleteMethod.setQueryString(nameValuePairs);
          }

          int statusCode = client.executeMethod(deleteMethod);
          if (statusCode != HttpStatus.SC_OK) {
          	response = deleteMethod.getResponseBodyAsString();
    				throw new FacebookException(JSONToObjectTransformer.getError(response, statusCode));
          }
          response = deleteMethod.getResponseBodyAsString();
      } catch (HttpException e) {
          throw new FacebookException("Http Exception while calling facebook!", e);
      } catch (IOException e) {
          throw new FacebookException("IO Exception while calling facebook!", e);
      } finally {
          deleteMethod.releaseConnection();
      }

      return response;
  } 
    
    
    private NameValuePair[] getNameValuePairs(String urlParams){
    	
    	String[] params = urlParams.split("&");
    	NameValuePair[] nameValuePair = new NameValuePair[params.length];
    	NameValuePair valuePair = null;
    	
    	String[] tempParamPair = null;
    	
    	for(int i=0;i <params.length;i++){
    		tempParamPair = params[i].split("=");
    		valuePair = new NameValuePair(tempParamPair[0], tempParamPair[1]);
    		nameValuePair[i] = valuePair;
    	}
    	
    	return nameValuePair;
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