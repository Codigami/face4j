package com.face4j.facebook.http;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

import org.apache.commons.httpclient.Credentials;
import org.apache.commons.httpclient.HostConfiguration;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
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
			
			String username = null;
			String password = null;
			String host = null;
			int port = -1;
			Credentials credentials = null;
			
			//Check if username and password exists in any resource file
			try {
				InputStream inputStream = ClassLoader.getSystemResourceAsStream("face4j.properties");
                                if(inputStream != null) {
                                        Properties properties = new Properties();
                                        properties.load(inputStream);
                                        inputStream.close();

                                        username = properties.getProperty("client.proxy.username");
                                        password = properties.getProperty("client.proxy.password");
                                        host = properties.getProperty("client.proxy.host");
                                        if(properties.getProperty("client.proxy.port") != null){
                                                port = Integer.parseInt(properties.getProperty("client.proxy.port"));
                                        }
                                }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			if(username != null || password != null){
				credentials = new UsernamePasswordCredentials(username, password);
				httpClient.getState().setCredentials(AuthScope.ANY, credentials);
			}
			
			if(username != null || password != null || host != null || port > -1){
				try {
					httpClient.getState().setCredentials( new AuthScope(host, port), credentials);
	      } finally {
	      }
			}
			
		}
		return httpClient;
	}
	
	/*public static void main(String[] args) {
	 InputStream inputStream = ClassLoader.getSystemResourceAsStream("face4j.properties");
	 
	 try {
			Properties properties = new Properties();
			properties.load(inputStream);
			inputStream.close();

			Enumeration enuKeys = properties.keys();
			while (enuKeys.hasMoreElements()) {
				String key = (String) enuKeys.nextElement();
				String value = properties.getProperty(key);
				System.out.println(key + " : " + value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	 
	}*/
	
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
