package com.face4j.facebook.entity;

import java.io.Serializable;
import java.util.Map;

import com.face4j.facebook.Facebook;
import com.face4j.facebook.entity.connection.Comments;
import com.face4j.facebook.entity.connection.Likes;
import com.face4j.facebook.enums.ConnectionType;
import com.face4j.facebook.enums.Paging;
import com.face4j.facebook.exception.FacebookException;

/**
 * An individual entry in a profile's feed. 
 * The read_stream extended permission is required to access any information in a profile's feed that is not shared with everyone.
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
	private String icon;
	private String attribution;
	private Action[] actions;
	private Privacy privacy;
	private String createdTime;
	private String updatedTime;
	private Targeting targeting;
	
	
	
	public Post() {
		super();
	}
	/**
	 * The post ID
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
	 * @return
	 */
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	/**
	 * A string indicating which application was used to create this post
	 * @return
	 */
	public String getAttribution() {
		return attribution;
	}
	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}

	/**
	 * A list of available actions on the post (including commenting, liking, and an optional app-specified action)
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
	 * @return
	 */
	public String getUpdatedTime() {
		return updatedTime;
	}
	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}
	
	/**
	 * Location and language restrictions for Page posts only
	 * Object containing comma separated lists of valid country , city , region and locale
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
	public Likes getConnectionLikes(Facebook facebook, Map<Paging, String> pagingCriteria) throws FacebookException {
		return facebook.getConnections(this.id, ConnectionType.LIKES, Likes.class, pagingCriteria);
	}

	/**
	 * All of the comments on this post
	 * 
	 * @param facebook
	 * @param pagingCriteria
	 * @return
	 * @throws FacebookException
	 */
	public Comments getConnectionsComments(Facebook facebook, Map<Paging, String> pagingCriteria) throws FacebookException {
		return facebook.getConnections(this.id, ConnectionType.COMMENTS, Comments.class, pagingCriteria);
	}

}
