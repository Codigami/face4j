package com.face4j.facebook.entity;

import java.io.Serializable;

import com.face4j.facebook.OAuthAccessToken;
import com.face4j.facebook.http.APICallerInterface;

public class Link implements Serializable, Entity{

	private static final long serialVersionUID = 7654183822088338794L;
	
	private OAuthAccessToken authAccessToken;

	private APICallerInterface caller;
	
	/**
	 * The link ID
	 */
	private String id;
	
	private From from;
	
	private String link;
	
	private String name;
	
	private String caption;
	
	private String description;
	
	private String icon;
	
	private String picture;
	
	private String message;
	
	private String createdTime;
	
	private Comment[] comments;
	
	private String type;

	/**
	 * The link ID
	 * @return
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The user that created the link
	 * @return object containing the id and name field
	 */
	public From getFrom() {
		return from;
	}

	public void setFrom(From from) {
		this.from = from;
	}

	/**
	 * The URL that was shared
	 * @return
	 */
	public String getLink() {
		return link;
	}

	/**
	 * The URL that was shared
	 * @param link
	 */
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

	/**
	 * The name of the link
	 * @param name
	 */
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

	/**
	 * The caption of the link (appears beneath the link name)
	 * @param caption
	 */
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

	/**
	 * A description of the link (appears beneath the link caption)
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * A URL to the link icon that Facebook displays in the news feed
	 * @return
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * A URL to the link icon that Facebook displays in the news feed
	 * @param icon
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * A URL to the thumbnail image used in the link post
	 * @return
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * A URL to the thumbnail image used in the link post
	 * @param picture
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}

	/**
	 * The optional message from the user about this link
	 * @return
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * The optional message from the user about this link
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * The time the message was published
	 * @return
	 */
	public String getCreatedTime() {
		return createdTime;
	}

	/**
	 * The time the message was published
	 * @param createdTime
	 */
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}
	
	/**
	 * All of the comments on this link
	 * @return
	 */
	public Comment[] getComments() {
		//TODO: implement getcomments
		return comments;
	}

	@Override
	public void setOAuthAccessToken(OAuthAccessToken oAuthAccessToken) {
		this.authAccessToken = oAuthAccessToken;
	}

	@Override
	public void setApiCallerInterface(APICallerInterface apiCallerInterface) {
		this.caller = apiCallerInterface;
	}

	/**
	 * The type of this object; always returns link
	 * 
	 * PERMISSION: generic access_token or read_stream
	 * @return
	 */
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	//TODO: Connection - comments
	//TODO: Connection - likes
	
}