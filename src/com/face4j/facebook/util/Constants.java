package com.face4j.facebook.util;

public class Constants {

	/**
	 * The user would be redirected to this URL where access to the 3rd party application needs to be provided
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

	public static final String SELF_PROFILE_INFO = "me";

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

	public static final String ICON = "icon";

	/**
	 * This url is used for posting to the feed or wall of a user
	 */
	public static final String POST_LINK = "/me/feed";

	/**
	 * This parameter needs to be sent along with the picture url to indicate the size of the pic to be returned. Not mandatory
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

}