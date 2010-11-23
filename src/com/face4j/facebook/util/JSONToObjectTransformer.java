package com.face4j.facebook.util;

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

	public static <E> E getObject(String json, Class<E> e) {
		return gson.fromJson(json, e);
	}
	/*
	 * public static Album getAlbum(String albumJSON){ return gson.fromJson(albumJSON, Album.class); }
	 */

}
