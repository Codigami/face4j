package com.face4j.facebook.util;

import java.lang.reflect.Type;

import com.face4j.facebook.entity.Post;
import com.face4j.facebook.entity.User;
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

	public static User getUser(String userJSON) {
		return gson.fromJson(userJSON, User.class);
	}
	
	public static Post getPost(String postJson){
		return gson.fromJson(postJson, Post.class);
	}

	public static <E> E getObject(String json, Class<E> e) {
		return gson.fromJson(json, e);
	}

	public static <E> E getObject(String json, Type type) {
		return gson.<E>fromJson(json, type);
	}
	
	/*public static void main(String[] args) {
		Type type = new TypeToken<Map<String, User>>(){}.getType();
		Map<String, User> map = gson.fromJson("{'100000763980384':{'id':'100000763980384','name':'Manav Mehta','first_name':'Manav','last_name':'Mehta','link':'','gender':'male','locale':'en_US','updated_time':'2011-04-03T07:44:21+0000'},'1326276311':{'id':'1326276311','name':'Rupesh Chodankar','first_name':'Rupesh','last_name':'Chodankar','link':'','username':'rupesh.chodankar','gender':'male','locale':'en_GB','updated_time':'2011-04-02T12:13:04+0000'},'100000700842623':{'id':'100000700842623','name':'Prashant Dotiya','first_name':'Prashant','last_name':'Dotiya','link':'','gender':'male','locale':'en_US','updated_time':'2011-04-03T07:17:24+0000'}}", type);
		for (String key : map.keySet()) {
			System.out.println("map.get = " + map.get(key));
		}
	}*/

}