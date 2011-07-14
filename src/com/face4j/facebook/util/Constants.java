package com.face4j.facebook.util;

public class Constants {

	/**
	 * The user would be redirected to this URL where access to the 3rd party application needs to be
	 * provided
	 */
	public static final String AUTHORIZE_URL = Constants.FACEBOOK_GRAPH_URL + "/oauth/authorize";

	/**
	 * This URL will return the access token
	 */
	public static final String ACCESS_TOKEN_URL = Constants.FACEBOOK_GRAPH_URL + "/oauth/access_token";

	/**
	 * With the access token, FACEBOOK_GRAPH_URL is used to make calls for appropriate data
	 */
	public static final String FACEBOOK_GRAPH_URL = "https://graph.facebook.com";

	public static final String ME = "me";

	public static final String PARAM_CLIENT_ID = "client_id";

	public static final String PARAM_CLIENT_SECRET = "client_secret";

	public static final String PARAM_REDIRECT_URI = "redirect_uri";

	public static final String PARAM_ACCESS_TOKEN = "access_token";

	public static final String PARAM_CODE = "code";

	public static final String PARAM_PERMISSION = "scope";

	public static final String PARAM_DISPLAY = "display";

	/**
	 * To get the image pic for any facebook object, the graph url should end with /picture
	 */
	public static final String PICTURE = "picture";

	public static final String PRIVACY = "privacy";

	public static final String SOURCE = "source";

	public static final String TARGETING = "targeting";

	/**
	 * A URL to the link icon that Facebook displays in the news feed
	 */
	public static final String ICON = "icon";

	public static final String ACTIONS = "actions";

	/**
	 * This url is used for posting to the feed or wall of a user
	 */
	public static final String POST_LINK = "/PROFILE_ID/links";
	
	/**
	 * Publish a new post on the given profile's feed/wall
	 */
	public static final String POST_FEED = "/PROFILE_ID/feed";
	
	/**
	 * Comment on the given object (if it has a /comments connection)
	 */
	public static final String POST_COMMENTS = "/OBJECT_ID/comments";
	
	/**
	 * Like the given object (if it has a /likes connection)
	 */
	public static final String POST_LIKES = "/OBJECT_ID/likes";
	
	/**
	 * Publish a note on the given profile
	 */
	public static final String POST_NOTES = "/PROFILE_ID/notes";
	
	/**
	 * Create an event
	 */
	public static final String POST_EVENTS = "/PROFILE_ID/events";
	
	/**
	 * RSVP "attending" to the given event
	 */
	public static final String POST_ATTENDING = "/EVENT_ID/attending";
	
	/**
	 * RSVP "maybe" to the given event
	 */
	public static final String POST_MAYBE = "/EVENT_ID/maybe";
	
	/**
	 * RSVP "declined" to the given event
	 */
	public static final String POST_DECLINED = "/EVENT_ID/declined";
	
	/**
	 * Create an album
	 */
	public static final String POST_ALBUMS = "/PROFILE_ID/albums";
	
	/**
	 * Upload a photo to an album
	 */
	public static final String POST_PHOTOS = "/ALBUM_ID/photos";
	
	/**
	 * Create a checkin at a location represented by a Page
	 */
	public static final String POST_CHECKINS = "/PROFILE_ID/checkins";
	
	
	
	/**
	 * To be replaced for POST_
	 */
	public static final String REPLACE_OBJECT_ID = "OBJECT_ID";
	
	public static final String REPLACE_PROFILE_ID = "PROFILE_ID";
	
	public static final String REPLACE_EVENT_ID = "EVENT_ID";

	/**
	 * This parameter needs to be sent along with the picture url to indicate the size of the pic to
	 * be returned. Not mandatory
	 */
	public static final String PARAM_PICTURE_TYPE = "type";

	/**
	 * A URL to be shared
	 */
	public static final String LINK = "link";

	/**
	 * The name of the "link"
	 */
	public static final String NAME = "name";

	/**
	 * The caption of the "link"
	 */
	public static final String CAPTION = "caption";

	/**
	 * A description of the "link"
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * The optional message of the user about the "link"
	 */
	public static final String MESSAGE = "message";
	
	public static final String SUBJECT = "subject";
	
	public static final String START_TIME = "startTime";
	
	public static final String END_TIME = "endTime";

}