package com.face4j.facebook.entity;

import java.io.Serializable;

import com.face4j.facebook.Facebook;
import com.face4j.facebook.entity.connection.Comments;
import com.face4j.facebook.entity.connection.Likes;
import com.face4j.facebook.entity.paging.Paging;
import com.face4j.facebook.enums.ConnectionType;
import com.face4j.facebook.exception.FacebookException;

/**
 * An individual entry in a profile's feed. The read_stream extended permission is required to
 * access any information in a profile's feed that is not shared with everyone.
 * 
 * @author nischal
 * 
 */
public class Post implements Serializable {

	private static final long serialVersionUID = -6841667779712886659L;

	private String id;
	private From from;
	private To to;
	private String message;
	private String picture;
	private String link;
	private String name;
	private String caption;
	private String description;
	private String source;
	private Property[] properties;
	private String icon;
	private Action[] actions;
	private Privacy privacy;
	private String type;
	private Likes likes;
	private Comments comments;
	private String objectId;
	private Application application;
	private String createdTime;
	private String updatedTime;
	private Targeting targeting;

	/** For gson */
	private Post() {
		super();
	}
	
	public Post(String id){
		this.id = id;
	}

	/**
	 * The post ID
	 * 
	 * PERMISSION: Requires access_token
	 * 
	 * @return
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Information about the user who posted the message
	 * 
	 * PERMISSION: Requires access_token
	 * 
	 * @return
	 */
	public From getFrom() {
		return from;
	}

	public void setFrom(From from) {
		this.from = from;
	}

	/**
	 * Profiles mentioned or targeted in this post
	 * 
	 * PERMISSION: Requires access_token
	 * 
	 * @return
	 */
	public To getTo() {
		return to;
	}

	public void setTo(To to) {
		this.to = to;
	}

	/**
	 * The message
	 * PERMISSION: Requires access_token
	 * 
	 * @return
	 */
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * If available, a link to the picture included with this post
	 * PERMISSION: Requires access_token
	 * 
	 * @return
	 */
	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	/**
	 * The link attached to this post
	 * PERMISSION: Requires access_token
	 * @return
	 */
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * The name of the link
	 * PERMISSION: Requires access_token
	 * @return
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The caption of the link (appears beneath the link name)
	 * PERMISSION: Requires access_token
	 * @return
	 */
	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	/**
	 * A description of the link (appears beneath the link caption)
	 * PERMISSION: Requires access_token
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * A URL to a Flash movie or video file to be embedded within the post
	 * PERMISSION: Requires access_token
	 * @return
	 */
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * A link to an icon representing the type of this post
	 * PERMISSION: Requires access_token
	 * @return
	 */
	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * A list of available actions on the post (including commenting, liking, and an optional
	 * app-specified action)
	 * PERMISSION: Requires access_token
	 * @return
	 */
	public Action[] getActions() {
		return actions;
	}

	public void setActions(Action[] actions) {
		this.actions = actions;
	}

	/**
	 * The privacy settings of the Post
	 * PERMISSION: read_stream
	 * @return
	 */
	public Privacy getPrivacy() {
		return privacy;
	}

	public void setPrivacy(Privacy privacy) {
		this.privacy = privacy;
	}

	/**
	 * The time the post was initially published
	 * PERMISSION: read_stream
	 * @return
	 */
	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * The time of the last comment on this post
	 * PERMISSION: read_stream
	 * @return
	 */
	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	/**
	 * Location and language restrictions for Page posts only Object containing comma separated lists
	 * of valid country , city , region and locale
	 * PERMISSION: manage_pages
	 * @return
	 */
	public Targeting getTargeting() {
		return targeting;
	}

	public void setTargeting(Targeting targeting) {
		this.targeting = targeting;
	}

	/**
	 * Returns the likes on this post. Pagination present, only a limited number of likes returned,
	 * use pagination method to retrieve more. <br>
	 * 
	 * There will be a new http request in order to retrieve the "Likes" tied to this post. You need
	 * to take care of caching the response if needed.
	 * 
	 * @param facebook
	 * @param pagingCriteria
	 * @return
	 * @throws FacebookException
	 */
	public Likes getConnectionLikes(Facebook facebook, com.face4j.facebook.entity.paging.Paging paging) throws FacebookException {
		return facebook.getConnections(this.id, ConnectionType.LIKES, Likes.class, paging);
	}

	/**
	 * All of the comments on this post
	 * 
	 * @param facebook
	 * @param pagingCriteria
	 * @return
	 * @throws FacebookException
	 */
	public Comments getConnectionsComments(Facebook facebook, Paging paging) throws FacebookException {
		return facebook.getConnections(this.id, ConnectionType.COMMENTS, Comments.class, paging);
	}

	/**
	 * A list of properties for an uploaded video, for example, the length of the video
	 * 
	 * PERMISSION: Requires access_token
	 * @return
	 */
	public Property[] getProperties() {
		return properties;
	}

	public void setProperties(Property[] properties) {
		this.properties = properties;
	}

	/**
	 * A string indicating the type for this post (including link, photo, video)
	 * 
	 * PERMISSION: Requires access_token
	 * 
	 * @return
	 */
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Likes for this post
	 * 
	 * PERMISSION: Requires access_token
	 * 
	 * @return
	 */
	public Likes getLikes() {
		return likes;
	}

	public void setLikes(Likes likes) {
		this.likes = likes;
	}

	/**
	 * Comments for this post
	 * 
	 * PERMISSION: read_stream
	 * 
	 * @return
	 */
	public Comments getComments() {
		return comments;
	}

	public void setComments(Comments comments) {
		this.comments = comments;
	}

	/**
	 * The Facebook object id for an uploaded photo or video
	 * 
	 * PERMISSION: read_stream
	 * 
	 * @return
	 */
	public String getObjectId() {
		return objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	/**
	 * Information about the application this post came from
	 * 
	 * PERMISSION: read_stream
	 * 
	 * @return
	 */
	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

}