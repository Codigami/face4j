package com.face4j.facebook;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.httpclient.NameValuePair;

import com.face4j.facebook.entity.User;
import com.face4j.facebook.enums.HttpClientType;
import com.face4j.facebook.enums.StreamColumn;
import com.face4j.facebook.exception.FacebookException;
import com.face4j.facebook.fql.FqlPost;
import com.face4j.facebook.http.APICallerFactory;
import com.face4j.facebook.http.APICallerInterface;
import com.face4j.facebook.util.Constants;
import com.face4j.facebook.util.JSONToObjectTransformer;
import com.face4j.facebook.wrapper.StreamColumnCriteria;

/**
 * This is the main facebook class that will have methods which return facebook data as well as publish data to facebook
 * This is a work in progress.
 * 
 * @author Nischal Shetty - nischalshetty85 at gmail
 */
public class Facebook implements Serializable {

	private static final long serialVersionUID = 350726728289608542L;
	private static final String isHidden = "is_hidden";

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

		// APICaller would retrieve the json string object from facebook by making a https call
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
	 * @param id
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

	/*
	 * public Album getAlbum(long id) throws FacebookException{ NameValuePair[] nameValuePairs =
	 * {getNameValuePairAccessToken()}; String albumJson = caller.getData(Constants.FACEBOOK_GRAPH_URL+"/"+id,
	 * nameValuePairs); //System.out.println(albumJson); return JSONToObjectTransformer.getAlbum(albumJson); }
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
}