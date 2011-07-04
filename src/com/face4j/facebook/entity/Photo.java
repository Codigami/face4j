package com.face4j.facebook.entity;

import java.io.Serializable;

/**
 * 
 * An individual photo as represented in the Graph API.
 * 
 * To read the 'photo' object you need
 * 
 * A generic access_token if it is public user_photos permission to access photos and albums
 * uploaded by the user user_photo_video_tags permission to access photos in which the user has been
 * tagged friends_photos permission to access friends' photos friends_photo_video_tags permission to
 * access photos in which the user's friends have been tagged
 * 
 * @author nischal
 * 
 */
public class Photo implements Serializable {

	private static final long serialVersionUID = -3246090635982437261L;

	private String id;
	private From from;
	private Tag tags;
	private String name;
	private String icon;
	private String picture;
	private String source;
	private Integer height;
	private Integer width;
	private Image[] images;
	private String link;
	private String createdTime;
	private String updatedTime;
	private Integer position;

	/**
	 * The photo ID
	 * 
	 * PERMISSION: generic access_token or user_photos or friend_photos or user_photo_video_tags or friends_photo_video_tags
	 * @return
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The profile (user or page) that posted this photo
	 *
	 * PERMISSION: generic access_token or user_photos or friend_photos or user_photo_video_tags or friends_photo_video_tags
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
	 * The tagged users and their positions in this photo
	 *
	 * PERMISSION: generic access_token or user_photos or friend_photos or user_photo_video_tags or friends_photo_video_tags
	 * 
	 * @return
	 */
	public Tag getTags() {
		return tags;
	}

	public void setTags(Tag tags) {
		this.tags = tags;
	}

	/**
	 * The caption given to this photo
	 * 
	 * PERMISSION: generic access_token or user_photos or friend_photos or user_photo_video_tags or friends_photo_video_tags
	 *  
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
	 * 
	 * PERMISSION: generic access_token or user_photos or friend_photos or user_photo_video_tags or friends_photo_video_tags
	 * 
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
	 * 
	 * PERMISSION: generic access_token or user_photos or friend_photos or user_photo_video_tags or friends_photo_video_tags
	 * 
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
	 * 
	 * PERMISSION: generic access_token or user_photos or friend_photos or user_photo_video_tags or friends_photo_video_tags
	 * 
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
	 * 
	 * PERMISSION: generic access_token or user_photos or friend_photos or user_photo_video_tags or friends_photo_video_tags
	 * 
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
	 * 
	 * PERMISSION: generic access_token or user_photos or friend_photos or user_photo_video_tags or friends_photo_video_tags
	 * 
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
	 * 
	 * PERMISSION: generic access_token or user_photos or friend_photos or user_photo_video_tags or friends_photo_video_tags
	 * 
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
	 * 
	 * PERMISSION: generic access_token or user_photos or friend_photos or user_photo_video_tags or friends_photo_video_tags
	 * 
	 * @return
	 */
	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	/**
	 * The album-sized view of the photo
	 * 
	 * PERMISSION: generic access_token or user_photos or friend_photos or user_photo_video_tags or friends_photo_video_tags
	 * 
	 * @return
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * The 4 different stored representations of the photo
	 * 
	 *  PERMISSION: Requires access_token
	 *  
	 * @return
	 */
	public Image[] getImages() {
		return images;
	}

	public void setImages(Image[] images) {
		this.images = images;
	}

	/**
	 * The position of this photo in the album
	 * 
	 * PERMISSION: generic access_token or user_photos or friend_photos or user_photo_video_tags or friends_photo_video_tags
	 * 
	 * @return
	 */
	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	//TODO: Connection - comments
	//TODO: Connection - likes
	//TODO: Connection - picture
	//TODO: Connection - tags
	
	

}