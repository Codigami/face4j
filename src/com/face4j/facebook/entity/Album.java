package com.face4j.facebook.entity;

import java.io.Serializable;

import com.face4j.facebook.Facebook;
import com.face4j.facebook.entity.connection.Comments;
import com.face4j.facebook.entity.connection.Likes;
import com.face4j.facebook.entity.connection.Photos;
import com.face4j.facebook.entity.paging.Paging;
import com.face4j.facebook.enums.ConnectionType;
import com.face4j.facebook.exception.FacebookException;

/**
 * A Photo album on facebook
 * 
 * @author Nischal Shetty
 */
public class Album implements Serializable {

	private static final long serialVersionUID = 1805429103365132266L;

	/**
	 * The photo album ID
	 */
	private String id;

	/**
	 * An object containing the ID and name of the profile who posted this album
	 */
	private From from;

	/**
	 * The title of the album
	 */
	private String name;

	/**
	 * The description of the album
	 */
	private String description;

	/**
	 * The location of the album
	 */
	private String location;

	/**
	 * A link to this album on Facebook
	 */
	private String link;

	/**
	 * The number of photos in this album
	 */
	private long count;

	/**
	 * The time the photo album was initially created
	 */
	private String createdTime;

	/**
	 * The last time the photo album was updated
	 * 
	 */
	private String updatedTime;
	
	/**
	 * The type of the album: profile, mobile, wall, normal or album
	 */
	private String type;
	
	/**
	 * The album cover photo ID
	 */
	private String coverPhoto;
	
	/**
	 * The privacy settings for the album
	 */
	private String privacy;
	
	

	/**
	 * The album ID
	 * Permissions: generic access_token or user_photos or friend_photos
	 * @return
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The profile that created this album
	 * Permissions: generic access_token
	 * @return
	 */
	public From getFrom() {
		return from;
	}

	public void setFrom(From from) {
		this.from = from;
	}

	/**
	 * The title of the album
	 * Permissions: generic access_token or user_photos or friend_photos 
	 * @return
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The description of the album
	 * Permissions: generic access_token or user_photos or friend_photos
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * A link to this album on Facebook
	 * Permission: generic access_token or user_photos or friend_photos
	 * @return
	 */
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * The number of photos in this album
	 * Permissions: generic access_token or user_photos or friend_photos
	 * @return
	 */
	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	/**
	 * The time the photo album was initially created
	 * Permissions: generic access_token or user_photos or friend_photos
	 * @return
	 */
	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * The last time the photo album was updated
	 * Permissions: generic access_token or user_photos or friend_photos
	 * @return
	 */
	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	/**
	 * The location of the album
	 * Permissions: generic access_token or user_photos or friend_photos
	 * @return
	 */
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * The type of the album: profile, mobile, wall, normal or album
	 * Permissions: generic access_token or user_photos or friend_photos
	 * @return
	 */
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * The album cover photo ID
	 * Permissions: generic access_token or user_photos or friend_photos
	 * @return
	 */
	public String getCoverPhoto() {
		return coverPhoto;
	}

	public void setCoverPhoto(String coverPhoto) {
		this.coverPhoto = coverPhoto;
	}

	/**
	 * The privacy settings for the album
	 * Permissions: generic access_token or user_photos or friend_photos
	 * @return
	 */
	public String getPrivacy() {
		return privacy;
	}

	public void setPrivacy(String privacy) {
		this.privacy = privacy;
	}
	
	
	/**
	 * The photos contained in this album
	 * PERMISSION: generic access_token or user_photos or friend_photos
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Photos photos(Facebook facebook) throws FacebookException {
		return photos(facebook, null);
	}
	
	/**
	 * The photos contained in this album
	 * PERMISSION: generic access_token or user_photos or friend_photos
	 * 
	 * @param facebook
	 * @param paging
	 * 
	 * @return
	 * @throws FacebookException
	 */
	public Photos photos(Facebook facebook, Paging paging) throws FacebookException {
		return facebook.getConnections(this.id, ConnectionType.PHOTOS, Photos.class, paging);
	}
	
	/**
	 * The likes made on this album
	 * PERMISSION: generic access_token or user_photos or friend_photos
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Likes likes(Facebook facebook) throws FacebookException {
		return likes(facebook, null);
	}
	
	/**
	 * The likes made on this album
	 * PERMISSION: generic access_token or user_photos or friend_photos
	 * 
	 * @param facebook
	 * @param paging
	 * 
	 * @return
	 * @throws FacebookException
	 */
	public Likes likes(Facebook facebook, Paging paging) throws FacebookException {
		return facebook.getConnections(this.id, ConnectionType.LIKES, Likes.class, paging);
	}
	
	/**
	 * The comments made on this album
	 * PERMISSION: generic access_token or user_photos or friend_photos
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Comments comments(Facebook facebook) throws FacebookException {
		return comments(facebook, null);
	}
	
	/**
	 * The comments made on this album
	 * PERMISSION: generic access_token or user_photos or friend_photos
	 * 
	 * @param facebook
	 * @param paging
	 * 
	 * @return
	 * @throws FacebookException
	 */
	public Comments comments(Facebook facebook, Paging paging) throws FacebookException {
		return facebook.getConnections(this.id, ConnectionType.COMMENTS, Comments.class, paging);
	}
	
	//TODO: implement picture connections
	/*public String picture(Facebook facebook) throws FacebookException {
		return facebook.getConnections(this.id, ConnectionType.PICTURE, String.class, null);
	}*/
	
	
	
	
}