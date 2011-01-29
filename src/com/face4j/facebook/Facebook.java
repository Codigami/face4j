package com.face4j.facebook;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.commons.httpclient.NameValuePair;

import com.face4j.facebook.criteria.ConnectionColumnCriteria;
import com.face4j.facebook.entity.Post;
import com.face4j.facebook.entity.User;
import com.face4j.facebook.enums.ConnectionColumn;
import com.face4j.facebook.enums.ConnectionType;
import com.face4j.facebook.enums.HttpClientType;
import com.face4j.facebook.enums.Paging;
import com.face4j.facebook.enums.Permission;
import com.face4j.facebook.enums.StreamColumn;
import com.face4j.facebook.exception.FacebookException;
import com.face4j.facebook.fql.FqlConnection;
import com.face4j.facebook.fql.FqlPost;
import com.face4j.facebook.http.APICallerFactory;
import com.face4j.facebook.http.APICallerInterface;
import com.face4j.facebook.util.Constants;
import com.face4j.facebook.util.JSONToObjectTransformer;
import com.face4j.facebook.wrapper.StreamColumnCriteria;

/**
 * This is the main facebook class that will have methods which return facebook data as well as
 * publish data to facebook.
 * 
 * @author Nischal Shetty - nischalshetty85@gmail.com
 */
public class Facebook implements Serializable {

	private static final long serialVersionUID = 350726728289608542L;
	private static final String isHidden = "is_hidden";

	Logger logger = Logger.getLogger(Facebook.class.getName());

	private OAuthAccessToken authAccessToken;

	private APICallerInterface caller = null;

	/**
	 * If only the access token is passed, then the Apache Http Client library is used for making http
	 * requests
	 * 
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
	 * @param fbId
	 * @return
	 * @throws FacebookException
	 */
	public User getUser(String fbId) throws FacebookException {

//		// APICaller would retrieve the json string object from facebook by making a https call
//		String userJson = null;
//
//		NameValuePair[] nameValuePairs = { new NameValuePair(Constants.PARAM_ACCESS_TOKEN,
//				this.authAccessToken.getAccessToken()) };
//
//		userJson = caller.getData(Constants.FACEBOOK_GRAPH_URL + "/" + fbId, nameValuePairs);
//
//		// Once the json string object is obtaind, it is passed to obj
//		// transformer and the right object is retrieved
//		User user = JSONToObjectTransformer.getUser(userJson);
//
//		return user;
		
		NameValuePair[] nameValuePairs = { new NameValuePair(Constants.PARAM_ACCESS_TOKEN, this.authAccessToken.getAccessToken()) };
		return pullData(Constants.FACEBOOK_GRAPH_URL + "/" + fbId, User.class, nameValuePairs);
	}

	/*
	 * public Album getAlbum(long id) throws FacebookException{ NameValuePair[] nameValuePairs =
	 * {getNameValuePairAccessToken()}; String albumJson =
	 * caller.getData(Constants.FACEBOOK_GRAPH_URL+"/"+id, nameValuePairs);
	 * //System.out.println(albumJson); return JSONToObjectTransformer.getAlbum(albumJson); }
	 */

	/*
	 * public Album getAlbum(long id) throws FacebookException{ NameValuePair[] nameValuePairs =
	 * {getNameValuePairAccessToken()}; String albumJson =
	 * caller.getData(Constants.FACEBOOK_GRAPH_URL+"/"+id, nameValuePairs);
	 * //System.out.println(albumJson); return JSONToObjectTransformer.getAlbum(albumJson); }
	 */

	/**
	 * Posts a link on the user's/page's wall <br>
	 * Requires the {@link Permission#PUBLISH_STREAM} permission
	 * 
	 * @param link The URL to share 
	 * @param name The name of the link (optional)
	 * @param caption The caption of the link, appears beneath the link name (optional)
	 * @param description A description of the link, appears beneath the link caption (optional)
	 * @param message The message from the user about this link(optional)
	 * @throws FacebookException
	 */
	public void postLink(String link, String name, String caption, String description, String message)
			throws FacebookException {
		NameValuePair[] nameValuePairs = new NameValuePair[6];

		nameValuePairs[0] = new NameValuePair(Constants.PARAM_ACCESS_TOKEN, this.authAccessToken.getAccessToken());
		nameValuePairs[1] = new NameValuePair(Constants.LINK, link);

		if (name != null) {
			nameValuePairs[2] = new NameValuePair(Constants.NAME, name);
		}
		if (caption != null) {
			nameValuePairs[3] = new NameValuePair(Constants.CAPTION, caption);
		}
		if (description != null) {
			nameValuePairs[4] = new NameValuePair(Constants.DESCRIPTION, description);
		}
		if (message != null) {
			nameValuePairs[5] = new NameValuePair(Constants.MESSAGE, message);
		}

		caller.postData(Constants.FACEBOOK_GRAPH_URL + Constants.POST_LINK, nameValuePairs);
	}

	/**
	 * Posts the given url on facebook <br>
	 * Internally calls {@link Facebook#postLink(String, String, String, String, String)} with other
	 * params null. If you want more control call that method
	 * 
	 * @param link The URL to share 
	 * @throws FacebookException
	 */
	public void postLink(String link) throws FacebookException {
		postLink(link, null, null, null, null);
	}

	public OAuthAccessToken getAuthAccessToken() {
		return authAccessToken;
	}

	private NameValuePair getNameValuePairAccessToken() {
		return new NameValuePair(Constants.PARAM_ACCESS_TOKEN, this.authAccessToken.getAccessToken());
	}

	public FqlPost[] newsFeed() throws FacebookException {

		List<StreamColumn> columnNames = new ArrayList<StreamColumn>();

		columnNames.add(StreamColumn.POST_ID);
		columnNames.add(StreamColumn.ACTOR_ID);
		columnNames.add(StreamColumn.TARGET_ID);
		columnNames.add(StreamColumn.VIEWER_ID);
		columnNames.add(StreamColumn.MESSAGE);
		columnNames.add(StreamColumn.ATTACHMENT);
		columnNames.add(StreamColumn.UPDATED_TIME);
		columnNames.add(StreamColumn.CREATED_TIME);
		columnNames.add(StreamColumn.ATTRIBUTION);
		columnNames.add(StreamColumn.COMMENTS);
		columnNames.add(StreamColumn.LIKES);
		columnNames.add(StreamColumn.PERMALINK);

		return newsFeed(columnNames, null);
	}

	public FqlPost[] newsFeed(List<StreamColumn> columnNames, StreamColumnCriteria columnCriteria)
			throws FacebookException {

		StringBuilder criteria = constructCriteria(columnCriteria);
		StringBuilder columnName = appendColumns(columnNames);

		String fqlQuery = "SELECT "
				+ columnName.toString()
				+ " FROM stream WHERE filter_key in (SELECT filter_key FROM stream_filter WHERE uid=me() AND type='newsfeed') AND is_hidden = 0	 "
				+ criteria.toString();

		NameValuePair[] nameValuePairs = { getNameValuePairAccessToken(), new NameValuePair("query", fqlQuery),
				new NameValuePair("format", "JSON") };

		String jsonResponse = caller.getData("https://api.facebook.com/method/fql.query", nameValuePairs);

		// fql currently sends empty arrays with {} but we need []
		jsonResponse = jsonResponse.replaceAll("\\{\\}", "[]");

		FqlPost[] fql_Posts = JSONToObjectTransformer.getObject(jsonResponse, FqlPost[].class);

		return fql_Posts;
	}

	private StringBuilder appendColumns(List<StreamColumn> columnNames) {
		StringBuilder columnName = null;
		for (StreamColumn column : columnNames) {
			if (columnName != null) {
				columnName.append(", " + column.toString());
			} else {
				columnName = new StringBuilder();
				columnName.append(column.toString());
			}
		}
		return columnName;
	}

	private StringBuilder constructCriteria(StreamColumnCriteria columnCriteria) {

		StringBuilder criteria = new StringBuilder();

		if (columnCriteria != null) {

			if (columnCriteria.isDefaultXid()) {
				criteria.append(" AND " + StreamColumn.XID.toString() + " = 'default'");
			} else if (columnCriteria.getXid() != null) {
				criteria.append(" AND " + StreamColumn.XID.toString() + " = " + columnCriteria.getXid());
			}

			if (columnCriteria.getActorId() != null) {
				criteria.append(" AND " + StreamColumn.ACTOR_ID.toString() + " = '" + columnCriteria.getActorId() + "'");
			}

			if (columnCriteria.getAppId() != null) {
				criteria.append(" AND " + StreamColumn.APP_ID.toString() + " = " + columnCriteria.getAppId());
			}

			if (columnCriteria.getAttribution() != null) {
				criteria.append(" AND " + StreamColumn.ATTRIBUTION.toString() + " = '" + columnCriteria.getAttribution() + "'");
			}

			if (columnCriteria.getCreatedTimeGreaterThan() != null) {
				criteria.append(" AND " + StreamColumn.CREATED_TIME.toString() + " > "
						+ columnCriteria.getCreatedTimeGreaterThan());
			}

			if (columnCriteria.getCreatedTimeLessThan() != null) {
				criteria.append(" AND " + StreamColumn.CREATED_TIME.toString() + " < "
						+ columnCriteria.getCreatedTimeLessThan());
			}

			if (columnCriteria.getFilterKey() != null) {
				criteria.append(" AND " + StreamColumn.FILTER_KEY.toString() + " = '" + columnCriteria.getFilterKey() + "'");
			}

			if (columnCriteria.getPostId() != null) {
				criteria.append(" AND " + StreamColumn.POST_ID.toString() + " = '" + columnCriteria.getPostId() + "'");
			}

			if (columnCriteria.getSourceId() != null) {
				criteria.append(" AND " + StreamColumn.SOURCE_ID.toString() + " = " + columnCriteria.getSourceId());
			}

			if (columnCriteria.getTargetId() != null) {
				criteria.append(" AND " + StreamColumn.TARGET_ID.toString() + " = '" + columnCriteria.getTargetId() + "'");
			}

			if (columnCriteria.getUpdatedTimeGreaterThan() != null) {
				criteria.append(" AND " + StreamColumn.UPDATED_TIME.toString() + " > "
						+ columnCriteria.getUpdatedTimeGreaterThan());
			}

			if (columnCriteria.getUpdatedTimeLessThan() != null) {
				criteria.append(" AND " + StreamColumn.UPDATED_TIME.toString() + " < "
						+ columnCriteria.getUpdatedTimeLessThan());
			}

			if (columnCriteria.getViewerId() != null) {
				criteria.append(" AND " + StreamColumn.VIEWER_ID.toString() + " = " + columnCriteria.getViewerId());
			}

			// We will always be passing this param
			// TODO: Do we need to always set this?
			if (columnCriteria.isShowHidden()) {
				criteria.append(" AND " + isHidden + " = 0 ");
			} else {
				// criteria.append(" AND " + isHidden + " = 1 ");
			}

			// This should be in the end
			if (columnCriteria.getLimit() != null) {
				criteria.append(" LIMIT " + columnCriteria.getLimit());
			}

		}

		return criteria;
	}
	
	public FqlConnection[] getConnection(List<ConnectionColumn> columnNames, ConnectionColumnCriteria columnCriteria)throws FacebookException {

		StringBuilder criteria = constructCriteria(columnCriteria);
		StringBuilder columnName = appendConnectionColumns(columnNames);

		String fqlQuery = "SELECT "
				+ columnName.toString()
				+ " FROM connection WHERE source_id = me() AND "
				+ criteria.toString();

		NameValuePair[] nameValuePairs = { getNameValuePairAccessToken(), new NameValuePair("query", fqlQuery),
				new NameValuePair("format", "JSON") };

		String jsonResponse = caller.getData("https://api.facebook.com/method/fql.query", nameValuePairs);

		// fql currently sends empty arrays with {} but we need []
		jsonResponse = jsonResponse.replaceAll("\\{\\}", "[]");

		FqlConnection[] fqlConnection = JSONToObjectTransformer.getObject(jsonResponse, FqlConnection[].class);

		return fqlConnection;
	}
	
	private StringBuilder constructCriteria(ConnectionColumnCriteria columnCriteria) {
		StringBuilder criteria = new StringBuilder();

		if (columnCriteria != null) {
			if (columnCriteria.getTargetType() != null) {
				criteria.append(ConnectionColumn.TARGET_TYPE.toString() + " = '" + columnCriteria.getTargetType() + "'");
			}

			if (columnCriteria.getLimit() != null) {
				criteria.append(" LIMIT " + columnCriteria.getLimit());
			}
			
			if (columnCriteria.getOffset() != null){
				criteria.append(" OFFSET " + columnCriteria.getOffset());
			}
		}
		return criteria;
	}
	
	private StringBuilder appendConnectionColumns(List<ConnectionColumn> columnNames) {
		StringBuilder columnName = null;
		for (ConnectionColumn column : columnNames) {
			if (columnName != null) {
				columnName.append(", " + column.toString());
			} else {
				columnName = new StringBuilder();
				columnName.append(column.toString());
			}
		}
		return columnName;
	}

	/**
	 * Returns a Post object containing all the details of a post. <br>
	 * <b>Post</b> = An individual entry in a profile's feed. The read_stream extended permission is
	 * required to access any information in a profile's feed that is not shared with everyone.
	 * 
	 * @param postId
	 * @return
	 * @throws FacebookException
	 */
	public Post getPost(String postId) throws FacebookException{
		
//		// APICaller would retrieve the json string object from facebook by making a https call
//		String postJson = null;
//
//		NameValuePair[] nameValuePairs = { new NameValuePair(Constants.PARAM_ACCESS_TOKEN,
//				this.authAccessToken.getAccessToken()) };
//
//		postJson = caller.getData(Constants.FACEBOOK_GRAPH_URL + "/" + postId, nameValuePairs);
//
//		// Once the json string object is obtaind, it is passed to obj
//		// transformer and the right object is retrieved
//		return JSONToObjectTransformer.getPost(postJson);
		
		NameValuePair[] nameValuePairs = { new NameValuePair(Constants.PARAM_ACCESS_TOKEN, this.authAccessToken.getAccessToken()) };
		return pullData(Constants.FACEBOOK_GRAPH_URL + "/" + postId, Post.class, nameValuePairs);
	}

	/**
	 * Returns the appropriate object for the given connection type. Facebook objects, apart from
	 * their fields have connections such as likes, comments etc. This method will return the
	 * connections corresponding to the type that you specify
	 * 
	 * @param <E>
	 * @param id The facebook object id
	 * @param connectionType Enum, send in what the type of the connection is
	 * @param e
	 * @param pagingCriteria
	 * @return
	 * @throws FacebookException
	 */
	public <E> E getConnections(String id, ConnectionType connectionType, Class<E> e, Map<Paging, String> pagingCriteria)
			throws FacebookException {

		// // APICaller would retrieve the json string object from facebook by making a https call
		// String postJson = null;
		//
		// NameValuePair[] nameValuePairs = { new NameValuePair(Constants.PARAM_ACCESS_TOKEN,
		// this.authAccessToken.getAccessToken()) };
		//
		// postJson = caller.getData(Constants.FACEBOOK_GRAPH_URL + "/" + id + "/" +
		// connectionType.getType(), nameValuePairs);
		//
		// // Once the json string object is obtaind, it is passed to obj
		// // transformer and the right object is retrieved
		// return JSONToObjectTransformer.getObject(postJson, e);
		int i = 1;
		NameValuePair[] nameValuePairs = null;
		
		if (pagingCriteria != null) {
			i += pagingCriteria.size();
			nameValuePairs = new NameValuePair[i];

			Paging paging = null;
			String value = null;
			Iterator<Paging> iter = pagingCriteria.keySet().iterator(); 
			
			for (int j = 0; iter.hasNext(); j++) {
				paging = iter.next();
				value = pagingCriteria.get(paging);
				nameValuePairs[j] = new NameValuePair(paging.toString(), value);
			}
			
		} else {
			nameValuePairs = new NameValuePair[i];
		}

		nameValuePairs[i - 1] = new NameValuePair(Constants.PARAM_ACCESS_TOKEN, this.authAccessToken.getAccessToken());
		
		return pullData(Constants.FACEBOOK_GRAPH_URL + "/" + id + "/" + connectionType.getType(), e, nameValuePairs);
		
	}

	/**
	 * Raw API method to pull any data in json form and transform it into the right object <br>
	 * An HTTP GET method is used here
	 * 
	 * @param <E>
	 * @param url
	 * @param e The class into which the json object returned by the url fetch needs to be cast
	 * @param nameValuePairs Pass parameters that need to accompany the call
	 * @return
	 * @throws FacebookException
	 */
	public <E> E pullData(String url, Class<E> e, NameValuePair[] nameValuePairs) throws FacebookException {
		// APICaller would retrieve the json string object from facebook by making a https call
		// Once the json string object is obtaind, it is passed to obj transformer and the right object
		// is retrieved
		return JSONToObjectTransformer.getObject(caller.getData(url, nameValuePairs), e);
	}

}