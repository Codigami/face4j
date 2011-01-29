package com.face4j.facebook.entity;

import java.io.Serializable;

import com.face4j.facebook.OAuthAccessToken;
import com.face4j.facebook.http.APICallerInterface;

public class Photo implements Entity, Serializable {
	
	private static final long serialVersionUID = -3246090635982437261L;
	
	private String id;
	
	private From from;
	
	private Tag tags;
	
	private String name;
	
	private String icon;
	
	private String source;
	
	private Integer height;
	
	private Integer width;
	
	private String link;
	
	private String createdTime;
	
	private String updatedTime;

	private Comment[] comments;
	
	private Like[] likes;
	
	private String picture;
	
	@Override
	public void setOAuthAccessToken(OAuthAccessToken oAuthAccessToken) {
		//TODO: implement
	}

	@Override
	public void setApiCallerInterface(APICallerInterface apiCallerInterface) {
		//TODO: Implement
	}

	/**
	 * The photo ID
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 * The photo ID
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The profile (user or page) that posted this photo
	 * @return
	 */
	public From getFrom() {
		return from;
	}

	/**
	 * The profile (user or page) that posted this photo
	 * @param from
	 */
	public void setFrom(From from) {
		this.from = from;
	}

	/**
	 * The tagged users and their positions in this photo
	 * @return
	 */
	public Tag getTags() {
		return tags;
	}

	/**
	 * The tagged users and their positions in this photo
	 * @param tags
	 */
	public void setTags(Tag tags) {
		this.tags = tags;
	}

	/**
	 * The caption given to this photo
	 * @return
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The icon that Facebook displays when photos are published to the Feed
	 * @return
	 */
	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * The full-sized source of the photo
	 * @return
	 */
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * The height of the photo in pixels
	 * @return
	 */
	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	/**
	 * The width of the photo in pixels
	 * @return
	 */
	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	/**
	 * A link to the photo on Facebook
	 * @return
	 */
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * The time the photo was initially published
	 * @return
	 */
	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * The last time the photo or its caption was updated
	 * @return
	 */
	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	/**
	 * All of the comments on this photo
	 * @return
	 */
	//TODO: implement
	public Comment[] getComments() {
		return comments;
	}


	/**
	 * Users who like the photo
	 * @return
	 */
	//TODO: implement
	public Like[] getLikes() {
		return likes;
	}

	/**
	 * The album-sized view of the photo
	 * @return
	 */
	//TODO: implement
	public String getPicture() {
		return picture;
	}

}