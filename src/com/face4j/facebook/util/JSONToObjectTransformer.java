package com.face4j.facebook.util;

import java.lang.reflect.Type;

import com.face4j.facebook.entity.Post;
import com.face4j.facebook.entity.User;
import com.face4j.facebook.exception.FacebookError;
import com.face4j.facebook.exception.FacebookException;
import com.face4j.facebook.exception.HttpError;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Convert JSON to appropriate objects
 * 
 * @author nischal.shetty
 * 
 */
public class JSONToObjectTransformer {

	/**
	 * Gson would be singleton. Please take care not to include rules in the builder that aren't common for the entire
	 * API.
	 */
	private static final Gson gson = new GsonBuilder()
			.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

	public static User getUser(String userJSON) throws FacebookException {
		//If facebook returns an error then throw the error
		errorCheck(userJSON);
		return gson.fromJson(userJSON, User.class);
	}
	
	public static Post getPost(String postJson) throws FacebookException{
		//If facebook returns an error then throw the error
		errorCheck(postJson);
		return gson.fromJson(postJson, Post.class);
	}

	public static <E> E getObject(String json, Class<E> e) throws FacebookException {
		//If facebook returns an error then throw the error
		errorCheck(json);
		return gson.fromJson(json, e);
	}

	public static <E> E getObject(String json, Type type) throws FacebookException {
		//If facebook returns an error then throw the error
		errorCheck(json);
		return gson.<E>fromJson(json, type);
	}

	private static void errorCheck(String json) throws FacebookException {
		if(json.contains("error_code")){
			
			FacebookError error = null;
			try {
				error = gson.fromJson(json, FacebookError.class);
			} catch(Exception exception){
				throw new FacebookException("Error in converting facebook error to FacebookError object! Facebook data is: "+json,exception);
			}
			
			throw new FacebookException(error);
		}
	}
	
	public static FacebookError getError(String response, int statusCode) {
  	HttpError httpError =  gson.fromJson(response, HttpError.class);
  	return new FacebookError(statusCode, "Exception Type: "+httpError.getError().getType()+ " " + httpError.getError().getMessage(), null);
	}
	
	/*public static void main(String[] args) {
		Type type = new TypeToken<Map<String, User>>(){}.getType();
		Map<String, User> map = gson.fromJson("{'100000763980384':{'id':'100000763980384','name':'Manav Mehta','first_name':'Manav','last_name':'Mehta','link':'','gender':'male','locale':'en_US','updated_time':'2011-04-03T07:44:21+0000'},'1326276311':{'id':'1326276311','name':'Rupesh Chodankar','first_name':'Rupesh','last_name':'Chodankar','link':'','username':'rupesh.chodankar','gender':'male','locale':'en_GB','updated_time':'2011-04-02T12:13:04+0000'},'100000700842623':{'id':'100000700842623','name':'Prashant Dotiya','first_name':'Prashant','last_name':'Dotiya','link':'','gender':'male','locale':'en_US','updated_time':'2011-04-03T07:17:24+0000'}}", type);
		for (String key : map.keySet()) {
			System.out.println("map.get = " + map.get(key));
		}
	}*/

}