package com.face4j.facebook;

import java.io.Serializable;
import java.util.logging.Logger;

import org.apache.commons.httpclient.NameValuePair;

import com.face4j.facebook.entity.User;
import com.face4j.facebook.enums.HttpClientType;
import com.face4j.facebook.exception.FacebookException;
import com.face4j.facebook.http.APICallerFactory;
import com.face4j.facebook.http.APICallerInterface;
import com.face4j.facebook.util.Constants;
import com.face4j.facebook.util.JSONToObjectTransformer;

/**
 * This is the main facebook class that will have methods which return facebook data as well as publish data to facebook
 * This is a work in progress.
 * @author Nischal Shetty - nischalshetty85 at gmail
 *
 */
public class Facebook implements Serializable {
	
	private static final long serialVersionUID = 350726728289608542L;
	
	Logger logger = Logger.getLogger(Facebook.class.getName());
	
	//private Client client;
	private OAuthAccessToken authAccessToken;
	
	private APICallerInterface caller = null;
	
	
	/**
	 * @param authAccessToken
	 */
	public Facebook(OAuthAccessToken authAccessToken){
		this(authAccessToken,HttpClientType.APACHE_HTTP_CLIENT); //apache http client is the default client type
	}

	public Facebook(OAuthAccessToken authAccessToken, HttpClientType clientType){
		this.authAccessToken = authAccessToken;
		caller = APICallerFactory.getAPICallerInstance(clientType);
	}

	
	/**
	 * Returns the current user (for whom the client has been set). 
	 * @return
	 * @throws Exception 
	 */
	public User getCurrentUser() throws FacebookException{
		return getUser(Constants.SELF_PROFILE_INFO);
	}
	
	
	/**
	 * Returns a facebook users available info.
	 * @param username
	 * @return
	 * @throws FacebookException 
	 */
	public User getUser(String username) throws FacebookException{
		
		//APICaller would retrieve the json string object from facebook by making a https call
		String userJson = null;
			
		NameValuePair[] nameValuePairs = {new NameValuePair(Constants.PARAM_ACCESS_TOKEN,this.authAccessToken.getAccessToken())};
			
		userJson = caller.getData(Constants.FACEBOOK_GRAPH_URL+"/"+username,nameValuePairs);

		//Once the json string object is obtaind, it is passed to obj transformer and the right object is retrieved
		User user = JSONToObjectTransformer.getUser(userJson);
		
		return user;
	}
	
	/**
	 * Returns a facebook users available info.
     * @param id
	 * @return
	 * @throws FacebookException 
	 */
	public User getUser(long id) throws FacebookException{
		return getUser(""+id);
	}
	
	
	/*public Album getAlbum(long id) throws FacebookException{
		NameValuePair[] nameValuePairs = {getNameValuePairAccessToken()};
		String albumJson = caller.getData(Constants.FACEBOOK_GRAPH_URL+"/"+id, nameValuePairs);
		//System.out.println(albumJson);
		
		return JSONToObjectTransformer.getAlbum(albumJson);
	}*/

    public void postLink(String link, String name, String caption, String description, String message) throws FacebookException {
        NameValuePair[] nameValuePairs = new NameValuePair[6];

        nameValuePairs[0] = new NameValuePair(Constants.PARAM_ACCESS_TOKEN,this.authAccessToken.getAccessToken());
        nameValuePairs[1] = new NameValuePair(Constants.LINK,link);

        if(name!=null){
            nameValuePairs[2] = new NameValuePair(Constants.NAME,name);
        }
        if(caption != null){
            nameValuePairs[3] = new NameValuePair(Constants.CAPTION, caption);
        }
        if(description != null){
            nameValuePairs[4] = new NameValuePair(Constants.DESCRIPTION, description);
        }
        if(message != null){
            nameValuePairs[5] = new NameValuePair(Constants.MESSAGE, message);
        }

       caller.postData(Constants.FACEBOOK_GRAPH_URL+Constants.POST_LINK, nameValuePairs);
    }

    public void postLink(String link) throws FacebookException {
        postLink(link, null, null, null, null);        
    }

	public OAuthAccessToken getAuthAccessToken() {
		return authAccessToken;
	}
	
	private NameValuePair getNameValuePairAccessToken(){
		return new NameValuePair(Constants.PARAM_ACCESS_TOKEN,this.authAccessToken.getAccessToken());
	}


}