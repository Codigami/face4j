package com.face4j.facebook.entity;

import java.io.Serializable;

import com.face4j.facebook.Facebook;
import com.face4j.facebook.entity.connection.*;
import com.face4j.facebook.enums.ConnectionType;
import com.face4j.facebook.enums.PictureType;
import com.face4j.facebook.exception.FacebookException;
import com.face4j.facebook.util.Constants;

/**
 * A Page in the Graph API.
 * 
 * The fields shown below are some of the common fields of Facebook Pages. Pages may also contain
 * other (or additional) category-specific fields. Access to certain Pages may be restricted based
 * on demographic information such as the current user's age or location. Access may also be
 * restricted to only a Page's administrators.
 * 
 * To read a Page you need:
 * <ul>
 * <li>no access token for public and non-demographically restricted pages</li>
 * <li>a user access_token for restricted pages that the current user is able to view (no special
 * permissions required)</li>
 * </ul>
 * 
 * @author nischal
 * 
 */
public class Page implements Serializable {

	private static final long serialVersionUID = 600638905020497907L;

	private String id;
	private String name;
	private String link;
	private String category;
	private int likes;
	private String phone;
	private int checkins;
	private String accessToken;
	
	/**For Gson */
	@SuppressWarnings("unused")
	private Page(){}
	
	public Page(String id){
		this.id = id;
	}
	
	/**
	 * The Page's ID
	 * Permission: No access token or user access_token
	 * @return
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The Page's name
	 * Permission: No access token or user access_token
	 * @return
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Link to the page on Facebook
	 * Permission: No access token or user access_token
	 * @return
	 */
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * The Page's category
	 * Permission: No access token or user access_token
	 * @return
	 */
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * The number of users who like the Page
	 * Permission: No access token or user access_token
	 * @return
	 */
	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	/**
	 * The phone number (not always normalized for country code) for the Page
	 * Permission: No access token or user access_token
	 * @return
	 */
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * The total number of users who have checked in to the Page
	 * Permission: No access token or user access_token
	 * @return
	 */
	public int getCheckins() {
		return checkins;
	}

	public void setCheckins(int checkins) {
		this.checkins = checkins;
	}

	/**
	 * A Page admin access_token for this page; The current user must be an administrator of this
	 * page; only returned if specifically requested via the fields URL parameter Permission:
	 * 
	 * Permission: manage_pages
	 * 
	 * @return
	 */
	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * The Page's wall.
	 * Permission: any valid access_token or user access_token
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Feed feed(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.FEED, Feed.class, null);
	} 
	
	/**
	 * The Page's profile picture.
	 * PERMISSION: No access token or user access_token
	 * 
	 * @param facebook
	 * @param pictureType
	 * @return string representing URL of the user's profile picture (use PictureType = square | small | normal | large to request a different photo)
	 * @throws FacebookException
	 */
	public String picture(Facebook facebook, PictureType pictureType) throws FacebookException{
		
			String url = Constants.FACEBOOK_GRAPH_URL + "/" + this.id + "/" + ConnectionType.PICTURE.getType();
			
			if(pictureType!=null){
				url += "?"+Constants.PARAM_PICTURE_TYPE+"="+pictureType.getType();
			}
		
			return url;
	}
	
	/**
	 * The settings for this page.
	 * Permission: page access_token
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	//TODO: implement
	/*public Settings settings(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.SETTINGS, Settings.class, null);
	}*/
	
	//TODO: tagges connections
	
	/**
	 * The Page's posted links.
	 * Permission: any valid access_token or user access_token
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Links links(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.LINKS, Links.class, null);
	}
	
	/**
	 * The Page's uploaded photos.
	 * Permission: No access token or user access_token
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Photos photos(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.PHOTOS, Photos.class, null);
	}
	
	/**
	 * Groups to which the Page belongs.
	 * Permission: any valid access_token or user access_token
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Groups groups(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.GROUPS, Groups.class, null);
	}

	/**
	 * The photo albums the Page has uploaded.
	 * Permission: No access token or user access_token
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Albums albums(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.ALBUMS, Albums.class, null);
	}
	
	/**
	 * The Page's status updates.
	 * Permission: any valid access_token or user access_token
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Statuses statuses(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.STATUSES, Statuses.class, null);
	}
	
	/**
	 * The videos the Page has uploaded.
	 * Permission: any valid access_token or user access_token
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Videos videos(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.VIDEOS, Videos.class, null);
	}

	/**
	 * The Page's notes.
	 * Permission: any valid access_token or user access_token
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Notes notes(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.NOTES, Notes.class, null);
	}
	
	/**
	 * The Page's own posts.
	 * Permission: any valid access_token or user access_token
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Posts posts(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.POSTS, Posts.class, null);
	}
	
	/**
	 * The events the Page is attending.
	 * Permission: any valid access_token or user access_token
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Events events(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.EVENTS, Events.class, null);
	}
	
	/**
	 * Checkins made to this Place Page by the current user, and friends of the current user.
	 * Permission: user_checkins or friends_checkins
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Checkins checkins(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.CHECKINS, Checkins.class, null);
	}
	
	/**
	 * The Page's profile tabs. You can read the tabs for a Page with a Page Access Token. 
	 * Permission: Page admin access_token
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Tabs tabs(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.TABS, Tabs.class, null);
	}
	
}