package com.face4j.facebook.entity;

import java.io.Serializable;

import com.face4j.facebook.Note;
import com.face4j.facebook.OAuthAccessToken;
import com.face4j.facebook.http.APICallerInterface;

/**
 * A Facebook Page. This object supports Real-Time Updates for all properties except the ones marked with a ***. 
 * Also note that the properties below show the common properties of all Pages. 
 * Pages in specific categories have additional fields depending on category.
 * @author nischal
 *
 */
public class Page implements Serializable{

	private static final long serialVersionUID = 600638905020497907L;
	
	/**
	 * Accesstoken would be used in methods where authntication is required
	 */
	private OAuthAccessToken authAccessToken;

	private APICallerInterface caller;
	
	/**
	 * The Page's ID
	 */
	private String id;
	
	/**
	 * The Page's name
	 */
	private String name;
	
	/**
	 * The Page's category
	 */
	private String category;
	
	/**
	 * The number of users who like the Page***
	 */
	private Long likes;
	
	/**
	 * The Page's wall
	 */
	private Post[] feed;
	
	/**
	 * The Page's profile picture
	 */
	private String picture;
	
	private Object[] tagged;
	
	private Link[] links;
	
	private Photo[] photos;
	
	private Group[] groups;
	
	private Album[] albums;
	
	private StatusMessage[] statuses;
	
	private Video[] videos;
	
	private Note[] notes;
	
	private Post[] posts;
	
	private Event[] events;
	
	private Checkin[] checkins;

	public OAuthAccessToken getAuthAccessToken() {
		return authAccessToken;
	}

	public void setAuthAccessToken(OAuthAccessToken authAccessToken) {
		this.authAccessToken = authAccessToken;
	}

	public APICallerInterface getCaller() {
		return caller;
	}

	public void setCaller(APICallerInterface caller) {
		this.caller = caller;
	}

	/**
	 * The Page's ID
	 * @return
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The Page's category
	 * @return
	 */
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * The number of users who like the Page***
	 * @return
	 */
	public Long getLikes() {
		return likes;
	}

	public void setLikes(Long likes) {
		this.likes = likes;
	}

	/**
	 * The Page's name
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * The Page's wall
	 * @return
	 */
	public Post[] getFeed() {
		//TODO implement this
		return feed;
	}

	/**
	 * The Page's profile picture
	 * @return
	 */
	public String getPicture() {
		//TODO implement this
		return picture;
	}

	/**
	 * The photos, videos, and posts in which this Page has been tagged
	 * @return
	 */
	public Object[] getTagged() {
		//TODO implement this
		return tagged;
	}

	/**
	 * The Page's posted links***
	 * @return
	 */
	public Link[] getLinks() {
		//TODO implement this
		return links;
	}

	/**
	 * The photos this Page has uploaded***
	 * @return
	 */
	public Photo[] getPhotos() {
		//TODO implement this
		return photos;
	}

	/**
	 * The groups this Page is a member of
	 * @return
	 */
	public Group[] getGroups() {
		//TODO implement this
		return groups;
	}

	/**
	 * The photo albums this Page has created
	 * @return
	 */
	public Album[] getAlbums() {
		//TODO implement this
		return albums;
	}

	/**
	 * The Page's status updates
	 * @return
	 */
	public StatusMessage[] getStatuses() {
		//TODO implement this
		return statuses;
	}

	/**
	 * The videos this Page has created
	 * @return
	 */
	public Video[] getVideos() {
		//TODO implement this
		return videos;
	}

	/**
	 * The Page's notes
	 * @return
	 */
	public Note[] getNotes() {
		//TODO implement this
		return notes;
	}

	/**
	 *  The Page's own posts
	 * @return
	 */
	public Post[] getPosts() {
		//TODO implement this
		return posts;
	}

	/**
	 * The events this Page is attending
	 * @return
	 */
	public Event[] getEvents() {
		//TODO implement this
		return events;
	}

	/**
	 * Checkins made by friends of the current session user
	 * @return
	 */
	public Checkin[] getCheckins() {
		//TODO implement this
		return checkins;
	}
}