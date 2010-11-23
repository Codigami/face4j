package com.face4j.facebook;

import java.io.Serializable;
import java.util.logging.Logger;

import org.apache.commons.httpclient.NameValuePair;

import com.face4j.facebook.entity.User;
import com.face4j.facebook.enums.HttpClientType;
import com.face4j.facebook.exception.FacebookException;
import com.face4j.facebook.fql.FQL_Post;
import com.face4j.facebook.http.APICallerFactory;
import com.face4j.facebook.http.APICallerInterface;
import com.face4j.facebook.util.Constants;
import com.face4j.facebook.util.JSONToObjectTransformer;

/**
 * This is the main facebook class that will have methods which return facebook data as well as publish data to facebook
 * This is a work in progress.
 * 
 * @author Nischal Shetty - nischalshetty85 at gmail
 * 
 */
public class Facebook implements Serializable {

	private static final long serialVersionUID = 350726728289608542L;

	Logger logger = Logger.getLogger(Facebook.class.getName());

	// private Client client;
	private OAuthAccessToken authAccessToken;

	private APICallerInterface caller = null;

	/**
	 * @param authAccessToken
	 */
	public Facebook(OAuthAccessToken authAccessToken) {
		// apache http client is the default client type
		this(authAccessToken, HttpClientType.APACHE_HTTP_CLIENT);
	}

	public Facebook(OAuthAccessToken authAccessToken, HttpClientType clientType) {
		this.authAccessToken = authAccessToken;
		caller = APICallerFactory.getAPICallerInstance(clientType);
	}

	/**
	 * Returns the current user (for whom the client has been set).
	 * 
	 * @return
	 * @throws Exception
	 */
	public User getCurrentUser() throws FacebookException {
		return getUser(Constants.SELF_PROFILE_INFO);
	}

	/**
	 * Returns a facebook users available info.
	 * 
	 * @param username
	 * @return
	 * @throws FacebookException
	 */
	public User getUser(String username) throws FacebookException {

		// APICaller would retrieve the json string object from facebook by
		// making a https call
		String userJson = null;

		NameValuePair[] nameValuePairs = { new NameValuePair(Constants.PARAM_ACCESS_TOKEN,
				this.authAccessToken.getAccessToken()) };

		userJson = caller.getData(Constants.FACEBOOK_GRAPH_URL + "/" + username, nameValuePairs);

		// Once the json string object is obtaind, it is passed to obj
		// transformer and the right object is retrieved
		User user = JSONToObjectTransformer.getUser(userJson);

		return user;
	}

	/**
	 * Returns a facebook users available info.
	 * 
	 * @param username
	 * @return
	 * @throws FacebookException
	 */
	public User getUser(long id) throws FacebookException {
		return getUser("" + id);
	}

	/*
	 * public Album getAlbum(long id) throws FacebookException{ NameValuePair[] nameValuePairs =
	 * {getNameValuePairAccessToken()}; String albumJson = caller.getData(Constants.FACEBOOK_GRAPH_URL+"/"+id,
	 * nameValuePairs); //System.out.println(albumJson); return JSONToObjectTransformer.getAlbum(albumJson); }
	 */

	public OAuthAccessToken getAuthAccessToken() {
		return authAccessToken;
	}

	private NameValuePair getNameValuePairAccessToken() {
		return new NameValuePair(Constants.PARAM_ACCESS_TOKEN, this.authAccessToken.getAccessToken());
	}

	public FQL_Post[] wallPosts() throws FacebookException {

		NameValuePair[] nameValuePairs = {
				getNameValuePairAccessToken(),
				new NameValuePair(
						"query",
						"SELECT post_id, actor_id, target_id, viewer_id, message, attachment, updated_time, created_time, attribution, comments, likes, permalink "
								+ "FROM stream WHERE source_id in (SELECT target_id FROM connection WHERE source_id=me() AND is_following=1) AND is_hidden = 0"),
				new NameValuePair("format", "JSON") };

		// all irrespective of friendship
		// SELECT post_id, actor_id, target_id, message FROM stream WHERE source_id in (SELECT target_id FROM connection
		// WHERE source_id=me()) AND is_hidden = 0

		// SELECT post_id, actor_id, target_id, message FROM stream WHERE source_id in (SELECT target_id FROM connection
		// WHERE source_id=<uid> AND is_following=1) AND is_hidden = 0

		String jsonResponse = caller.getData("https://api.facebook.com/method/fql.query", nameValuePairs);

		jsonResponse = jsonResponse.replaceAll("\"sample\":\\{\\}", "\"sample\":[]"); // long array
		jsonResponse = jsonResponse.replaceAll("\"friends\":\\{\\}", "\"friends\":[]"); // long array
		jsonResponse = jsonResponse.replaceAll("\\{\\}", "[{}]");

		FQL_Post[] fql_Posts = JSONToObjectTransformer.getObject(jsonResponse, FQL_Post[].class);

		/*
		 * if (fql_Posts != null && fql_Posts.length > 0) { for (FQL_Post fql_Post : fql_Posts) { if
		 * (fql_Post.getAttachment() != null) { System.out.println("message is: " + fql_Post.getAttachment().getHref() +
		 * " type:" + fql_Post.getAttachment().getMedia()); System.out.println("Permalink is " + fql_Post.getPermalink()); }
		 * } }
		 */

		return fql_Posts;
	}
}