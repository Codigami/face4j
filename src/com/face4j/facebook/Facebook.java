package com.face4j.facebook;

import java.io.Serializable;
import java.util.logging.Logger;

import org.apache.commons.httpclient.NameValuePair;

import com.face4j.facebook.entity.User;
import com.face4j.facebook.exception.FacebookException;
import com.face4j.facebook.http.APICaller;
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
	
	
	/**
	 * @param authAccessToken
	 */
	public Facebook(OAuthAccessToken authAccessToken){
		this.authAccessToken = authAccessToken;
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
		APICaller caller = APICaller.getInstance();
		String userJson = null;
			
		NameValuePair[] nameValuePairs = {new NameValuePair(Constants.PARAM_ACCESS_TOKEN,this.authAccessToken.getAccessToken())};
			
		//userJson = caller.getData(Constants.FACEBOOK_GRAPH_URL+"/"+username+"?"+Constants.PARAM_ACCESS_TOKEN+"="+URLEncoder.encode(this.authAccessToken.getAccessToken(),"UTF-8"));
		userJson = caller.getData(Constants.FACEBOOK_GRAPH_URL+"/"+username,nameValuePairs);

		//Once the json string object is obtaind, it is passed to obj transformer and the right object is retrieved
		User user = JSONToObjectTransformer.getUser(userJson);
		
		return user;
	}
	
	/**
	 * Returns a facebook users available info.
	 * @param username
	 * @return
	 * @throws FacebookException 
	 */
	public User getUser(long id) throws FacebookException{
		return getUser(""+id);
	}
	
	
	
	public OAuthAccessToken getAuthAccessToken() {
		return authAccessToken;
	}


}
