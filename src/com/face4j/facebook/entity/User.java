package com.face4j.facebook.entity;

import java.io.Serializable;

import com.face4j.facebook.Facebook;
import com.face4j.facebook.entity.connection.*;
import com.face4j.facebook.entity.paging.Paging;
import com.face4j.facebook.enums.ConnectionType;
import com.face4j.facebook.enums.PictureType;
import com.face4j.facebook.exception.FacebookException;
import com.face4j.facebook.util.Constants;
import com.face4j.facebook.util.URLMaker;

/**
 * A user profile as represented in the Graph API.
 * 
 * Real-Time Subscriptions The User object supports Real-Time Updates for all fields except the
 * verified property.
 * 
 * The User object supports Real-Time Updates for the following connections: feed, friends, activities,
 * interests, music, books, movies, television, likes, checkins.
 * 
 * @author nischal
 * 
 */
public class User implements Serializable {

	private static final long serialVersionUID = -7351804744720611823L;

	private String id;

	private String firstName;

	private String middleName;

	private String lastName;

	private String name;

	private String gender;

	private String locale;

	private Language[] languages;

	private String link;

	private String username;

	private String thirdPartyId;

	private Double timezone;

	private String updatedTime;

	private Boolean verified;

	private String bio;

	private String[] interestedIn;

	private Location location;

	private String political;

	private String quotes;

	private String relationshipStatus;

	private String religion;

	private GenericEntity SignificantOther;

	private VideoUploadLimit videoUploadLimits;

	private String birthday;

	private Work[] work;

	private Education[] education;

	private String email;

	private String website;

	private Hometown hometown;
	
	/**For Gson*/
	@SuppressWarnings("unused")
	private User(){}
	
	public User(String id){
		this.id = id;
	}

	/**
	 * The user's Facebook ID
	 * 
	 * PERMISSION: No access_token required
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The user's first name PERMISSION: No access_token required
	 */
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * The user's last name PERMISSION: No access_token required
	 */
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * The user's full name PERMISSION: No access_token required
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The URL of the profile for the user on Facebook
	 * 
	 * PERMISSION: No access_token required
	 */
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * The user's birthday. Format is MM/dd/yyyy . Can also be MM/dd (facebook let's users decide
	 * whether they want to display the date or no). Users can also opt to keep their birthday
	 * private. In this case, even if you have access to a users birthday, you will not be able to
	 * access it.
	 * 
	 * PERMISSION: user_birthday or friends_birthday
	 */
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * The proxied or contact email address granted by the user
	 * 
	 * PERMISSION: email
	 */
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * A link to the user's personal website
	 * 
	 * PERMISSION: user_website or friends_website
	 */
	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	/**
	 * The user's hometown
	 * 
	 * PERMISSION: user_hometown or friends_hometown
	 * 
	 * @return
	 */
	public Hometown getHometown() {
		return hometown;
	}

	public void setHometown(Hometown hometown) {
		this.hometown = hometown;
	}

	/**
	 * A list of the work history from the user's profile
	 * 
	 * PERMISSION: user_work_history or friends_work_history
	 */
	public Work[] getWork() {
		return work;
	}

	public void setWork(Work[] work) {
		this.work = work;
	}

	/**
	 * A list of the education history from the user's profile
	 * 
	 * PERMISSION: user_education_history or friends_education_history
	 */
	public Education[] getEducation() {
		return education;
	}

	public void setEducation(Education[] education) {
		this.education = education;
	}

	/**
	 * Returns the default image profile pic url of a user PERMISSION:
	 * 
	 * @return
	 */
	public String getPictureURL() {
		return URLMaker.getImageURL(this.id);
	}

	/**
	 * The user's middle name PERMISSION:
	 * 
	 * @return
	 */
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * The user's gender: female or male
	 * 
	 * PERMISSION: No access_token required
	 * 
	 * @return
	 */
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * The user's locale
	 * 
	 * PERMISSION: No access_token required
	 * 
	 * @return
	 */
	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	/**
	 * The user's languages
	 * 
	 * PERMISSION: user_likes
	 * 
	 * @return
	 */
	public Language[] getLanguages() {
		return languages;
	}

	public void setLanguages(Language[] languages) {
		this.languages = languages;
	}

	/**
	 * The user's Facebook username
	 * 
	 * PERMISSION: No access_token required
	 * 
	 * @return
	 */
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * An anonymous, but unique identifier for the user; only returned if specifically requested via
	 * the fields URL parameter
	 * 
	 * PERMISSION: Requires access_token
	 * 
	 * @return
	 */
	public String getThirdPartyId() {
		return thirdPartyId;
	}

	public void setThirdPartyId(String thirdPartyId) {
		this.thirdPartyId = thirdPartyId;
	}

	/**
	 * The user's timezone offset from UTC
	 * 
	 * PERMISSION: Available only for the current user
	 * 
	 * @return
	 */
	public Double getTimezone() {
		return timezone;
	}

	public void setTimezone(Double timezone) {
		this.timezone = timezone;
	}

	/**
	 * The last time the user's profile was updated; changes to the languages, link, timezone,
	 * verified, interested_in, favorite_athletes, favorite_teams, and video_upload_limits are not not
	 * reflected in this value
	 * 
	 * PERMISSION: Requires access_token
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
	 * The user's account verification status, either true or false (see below) A user is considered
	 * verified if she takes any of the following actions:
	 * <ul>
	 * <li>Registers for mobile</li>
	 * <li>Confirms her account via SMS</li>
	 * <li>Enters a valid credit card</li>
	 * </ul>
	 * 
	 * PERMISSION: Requires access_token
	 * 
	 * @return
	 */
	public Boolean getVerified() {
		return verified;
	}

	public void setVerified(Boolean verified) {
		this.verified = verified;
	}

	/**
	 * The user's biography
	 * 
	 * PERMISSION: user_about_me or friends_about_me
	 * 
	 * @return
	 */
	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	/**
	 * The genders the user is interested in
	 * 
	 * PERMISSION: user_relationship_details or friends_relationship_details
	 * 
	 * @return
	 */
	public String[] getInterestedIn() {
		return interestedIn;
	}

	public void setInterestedIn(String[] interestedIn) {
		this.interestedIn = interestedIn;
	}

	/**
	 * The user's current city
	 * 
	 * PERMISSION: user_location or friends_location
	 * 
	 * @return
	 */
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	/**
	 * The user's political view
	 * 
	 * PERMISSION: user_religion_politics or friends_religion_politics
	 * 
	 * @return
	 */
	public String getPolitical() {
		return political;
	}

	public void setPolitical(String political) {
		this.political = political;
	}

	/**
	 * The user's favorite quotes
	 * 
	 * PERMISSION: user_about_me or friends_about_me
	 * 
	 * @return
	 */
	public String getQuotes() {
		return quotes;
	}

	public void setQuotes(String quotes) {
		this.quotes = quotes;
	}

	/**
	 * The user's relationship status: Single, In a relationship, Engaged, Married, It's complicated,
	 * In an open relationship, Widowed, Separated, Divorced, In a civil union, In a domestic
	 * partnership
	 * 
	 * PERMISSION: user_relationships or friends_relationships
	 * 
	 * @return
	 */
	public String getRelationshipStatus() {
		return relationshipStatus;
	}

	public void setRelationshipStatus(String relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}

	/**
	 * The user's religion
	 * 
	 * PERMISSION: user_religion_politics or friends_religion_politics
	 * 
	 * @return
	 */
	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	/**
	 * The user's significant other
	 * 
	 * PERMISSION: user_relationship_details or friends_relationship_details
	 * 
	 * @return
	 */
	public GenericEntity getSignificantOther() {
		return SignificantOther;
	}

	public void setSignificantOther(GenericEntity significantOther) {
		SignificantOther = significantOther;
	}

	/**
	 * The size of the video file and the length of the video that a user can upload; only returned if
	 * specifically requested via the fields URL parameter
	 * PERMISSION: Requires access_token
	 * 
	 * @return
	 */
	public VideoUploadLimit getVideoUploadLimits() {
		return videoUploadLimits;
	}

	public void setVideoUploadLimits(VideoUploadLimit videoUploadLimits) {
		this.videoUploadLimits = videoUploadLimits;
	}

	/**
	 * The Facebook apps and pages owned by the current user
	 * 
	 * PERMISSION: If manage_pages permission has been granted, yields access_tokens that can be used
	 * to query the Graph API on behalf of the app/page; manage_pages required for all access to this
	 * field after September 22, 2011
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Accounts accounts(Facebook facebook) throws FacebookException {
		return this.accounts(facebook, null);
	}
	
	public Accounts accounts(Facebook facebook, Paging paging) throws FacebookException {
		return facebook.getConnections(this.id, ConnectionType.ACCOUNTS, Accounts.class, paging);
	}

	/**
	 * The activities listed on the user's profile
	 * PERMISSION: user_activities or friends_activities
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Activities activities(Facebook facebook) throws FacebookException {
		return activities(facebook, null);
	}
	
	public Activities activities(Facebook facebook, Paging paging) throws FacebookException {
		return facebook.getConnections(this.id, ConnectionType.ACTIVITIES, Activities.class, paging);
	}

	/**
	 * The photo albums this user has created
	 * PERMISSION: user_photos or friends_photos
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Albums albums(Facebook facebook) throws FacebookException {
		return albums(facebook, null);
	}
	
	/**
	 * The photo albums this user has created
	 * PERMISSION: user_photos or friends_photos
	 * 
	 * @param facebook
	 * @param paging
	 * @return
	 * @throws FacebookException
	 */
	public Albums albums(Facebook facebook, Paging paging) throws FacebookException {
		return facebook.getConnections(this.id, ConnectionType.ALBUMS, Albums.class, paging);
	}

	//TODO: Connections apprequests
	
	/**
	 * The books listed on the user's profile
	 * PERMISSION: user_likes or friends_likes
	 *  
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Books books(Facebook facebook) throws FacebookException{
		return books(facebook, null);
	}
	
	/**
	 * The books listed on the user's profile
	 * PERMISSION: user_likes or friends_likes
	 *  
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Books books(Facebook facebook, Paging paging) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.BOOKS, Books.class, paging);
	}
	
	/**
	 * The places that the user has checked-into
	 * PERMISSION: user_checkins or friends_checkins
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Checkins checkins(Facebook facebook) throws FacebookException{
		return checkins(facebook, null);
	}
	
	/**
	 * The places that the user has checked-into
	 * PERMISSION: user_checkins or friends_checkins
	 * 
	 * @param facebook
	 * @param paging
	 * 
	 * @return
	 * @throws FacebookException
	 */
	public Checkins checkins(Facebook facebook, Paging paging) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.CHECKINS, Checkins.class, paging);
	}

	/**
	 * The events this user is attending
	 * PERMISSION: user_events or friends_events
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Events events(Facebook facebook) throws FacebookException{
		return events(facebook, null);
	}
	
	/**
	 * The events this user is attending
	 * PERMISSION: user_events or friends_events
	 * 
	 * @param facebook
	 * @param paging
	 * 
	 * @return
	 * @throws FacebookException
	 */
	public Events events(Facebook facebook, Paging paging) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.EVENTS, Events.class, paging);
	}
	
	/**
	 * The user's wall
	 * PERMISSION: Requires access_token or read_stream to see non-public posts
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Feed feed(Facebook facebook) throws FacebookException{
		return feed(facebook, null);
	}
	
	/**
	 * The user's wall
	 * PERMISSION: Requires access_token or read_stream to see non-public posts
	 * 
	 * @param facebook
	 * @param paging
	 * 
	 * @return
	 * @throws FacebookException
	 */
	public Feed feed(Facebook facebook, Paging paging) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.FEED, Feed.class, paging);
	}
	
	/**
	 * The user's friend lists
	 * PERMISSION: read_friendlists
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public FriendLists friendLists(Facebook facebook) throws FacebookException{
		return friendLists(facebook, null);
	}
	
	/**
	 * The user's friend lists
	 * PERMISSION: read_friendlists
	 * 
	 * @param facebook
	 * @param paging
	 * 
	 * @return
	 * @throws FacebookException
	 */
	public FriendLists friendLists(Facebook facebook, Paging paging) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.FRIENDLISTS, FriendLists.class, paging);
	}
	
	/**
	 * The user's friends
	 * PERMISSION: Requires access_token
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Friends friends(Facebook facebook) throws FacebookException{
		return friends(facebook, null);
	}
	
	/**
	 * The user's friends
	 * PERMISSION: Requires access_token
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Friends friends(Facebook facebook, Paging paging) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.FRIENDS, Friends.class, paging);
	}
	
	/**
	 * The Groups that the user belongs to
	 * PERMISSION: user_groups or friends_groups
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Groups groups(Facebook facebook) throws FacebookException{
		return groups(facebook, null);
	}
	
	/**
	 * The Groups that the user belongs to
	 * PERMISSION: user_groups or friends_groups
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Groups groups(Facebook facebook, Paging paging) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.GROUPS, Groups.class, paging);
	}
	
	/**
	 * The user's news feed
	 * PERMISSION: read_stream
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Home home(Facebook facebook) throws FacebookException{
		return home(facebook, null);
	}
	
	/**
	 * The user's news feed
	 * PERMISSION: read_stream
	 * 
	 * @param facebook
	 * @param paging
	 * @return
	 * @throws FacebookException
	 */
	public Home home(Facebook facebook, Paging paging) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.HOME, Home.class, paging);
	}
	
	/**
	 * The Threads in this user's inbox
	 * PERMISSION: read_mailbox
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Inbox inbox(Facebook facebook) throws FacebookException{
		return inbox(facebook, null);
	}
	
	/**
	 * The Threads in this user's inbox
	 * PERMISSION: read_mailbox
	 * 
	 * @param facebook
	 * @param paging
	 * 
	 * @return
	 * @throws FacebookException
	 */
	public Inbox inbox(Facebook facebook, Paging paging) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.INBOX, Inbox.class, paging);
	}
	
	/**
	 * The interests listed on the user's profile
	 * PERMISSION: user_interests or friends_interests
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Interests interests(Facebook facebook) throws FacebookException{
		return interests(facebook, null);
	}
	
	/**
	 * The interests listed on the user's profile
	 * PERMISSION: user_interests or friends_interests
	 * 
	 * @param facebook
	 * @param paging
	 * 
	 * @return
	 * @throws FacebookException
	 */
	public Interests interests(Facebook facebook, Paging paging) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.INTERESTS, Interests.class, paging);
	}
	
	/**
	 * All the pages this user has liked
	 * PERMISSION: user_likes or friends_likes
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Likes likes(Facebook facebook) throws FacebookException{
		return likes(facebook, null);
	}
	
	/**
	 * All the pages this user has liked
	 * PERMISSION: user_likes or friends_likes
	 * 
	 * @param facebook
	 * @param paging
	 * 
	 * @return
	 * @throws FacebookException
	 */
	public Likes likes(Facebook facebook, Paging paging) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.LIKES, Likes.class, paging);
	}
	
	/**
	 * The user's posted links
	 * PERMISSION: read_stream
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Links links(Facebook facebook) throws FacebookException{
		return links(facebook, null);
	}
	
	/**
	 * The user's posted links
	 * PERMISSION: read_stream
	 * 
	 * @param facebook
	 * @param paging
	 * 
	 * @return
	 * @throws FacebookException
	 */
	public Links links(Facebook facebook, Paging paging) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.LINKS, Links.class, paging);
	}
	
	/**
	 * The movies listed on the user's profile
	 * PERMISSION: user_likes or friends_likes
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Movies movies(Facebook facebook) throws FacebookException{
		return movies(facebook, null);
	}
	
	/**
	 * The movies listed on the user's profile
	 * PERMISSION: user_likes or friends_likes
	 * 
	 * @param facebook
	 * @param paging
	 * 
	 * @return
	 * @throws FacebookException
	 */
	public Movies movies(Facebook facebook, Paging paging) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.MOVIES, Movies.class, paging);
	}
	
	/**
	 * The music listed on the user's profile
	 * PERMISSION: user_likes or friends_likes
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Music music(Facebook facebook) throws FacebookException{
		return music(facebook, null);
	}
	
	/**
	 * The music listed on the user's profile
	 * PERMISSION: user_likes or friends_likes
	 * 
	 * @param facebook
	 * @param paging
	 * 
	 * @return
	 * @throws FacebookException
	 */
	public Music music(Facebook facebook, Paging paging) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.MUSIC, Music.class, paging);
	}
	
	/**
	 * The user's notes
	 * PERMISSION: read_stream
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Notes notes(Facebook facebook) throws FacebookException{
		return notes(facebook, null);
	}
	
	/**
	 * The user's notes
	 * PERMISSION: read_stream
	 * 
	 * @param facebook
	 * @param paging
	 * 
	 * @return
	 * @throws FacebookException
	 */
	public Notes notes(Facebook facebook, Paging paging) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.NOTES, Notes.class, paging);
	}
	
	/**
	 * The messages in this user's outbox
	 * PERMISSION: read_mailbox
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Outbox outbox(Facebook facebook) throws FacebookException{
		return outbox(facebook, null);
	}
	
	/**
	 * The messages in this user's outbox
	 * PERMISSION: read_mailbox
	 * 
	 * @param facebook
	 * @param paging
	 * 
	 * @return
	 * @throws FacebookException
	 */
	public Outbox outbox(Facebook facebook, Paging paging) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.OUTBOX, Outbox.class, paging);
	}
	
	/**
	 * Returns the permission of the user whose auth code is present in the "facebook" object
	 * PERMISSION: None 
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public PermissionCheck permissions(Facebook facebook) throws FacebookException {
		PermissionCheckData permissionCheckData = facebook.getConnections("me", ConnectionType.PERMISSIONS,
				PermissionCheckData.class, null);
		PermissionCheck permissionCheck = null;

		if (permissionCheckData != null && permissionCheckData.getPermissions() != null
				&& permissionCheckData.getPermissions().size() > 0) {
			permissionCheck = permissionCheckData.getPermissions().get(0);
		}

		return permissionCheck;
	}
	
	/**
	 * Photos the user (or friend) is tagged in
	 * PERMISSION: user_photo_video_tags or friends_photo_video_tags
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Photos photos(Facebook facebook) throws FacebookException{
		return photos(facebook, null);
	}
	
	/**
	 * Photos the user (or friend) is tagged in
	 * PERMISSION: user_photo_video_tags or friends_photo_video_tags
	 * 
	 * @param facebook
	 * @param paging
	 * 
	 * @return
	 * @throws FacebookException
	 */
	public Photos photos(Facebook facebook, Paging paging) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.PHOTOS, Photos.class, paging);
	}
	
	/**
	 * The user's profile picture
	 * PERMISSION: No access_token required
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
	 * TODO: The user's pokes
	 * PERMISSION: read_mailbox
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
/*	public Pokes pokes(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.POKES, Pokes.class, null);
	}*/
	
	/**
	 * The user's own posts
	 * PERMISSION: Any valid access_token or read_stream to see non-public posts
	 * 
	 * @param facebook
	 * @return Posts that contains list of Post objects along with pagination for obtaining next and previous posts
	 * @throws FacebookException
	 */
	public Posts posts(Facebook facebook) throws FacebookException {
		return posts(facebook, null);
	}
	
	/**
	 * The user's own posts
	 * PERMISSION: Any valid access_token or read_stream to see non-public posts
	 * 
	 * @param facebook
	 * @return Posts that contains list of Post objects along with pagination for obtaining next and previous posts
	 * @throws FacebookException
	 */
	public Posts posts(Facebook facebook, Paging paging) throws FacebookException {
		return facebook.getConnections(this.id, ConnectionType.POSTS, Posts.class, paging);
	}
	
	/**
	 * The user's status updates
	 * PERMISSION: read_stream
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Statuses statuses(Facebook facebook) throws FacebookException{
		return statuses(facebook, null);
	}
	
	/**
	 * The user's status updates
	 * PERMISSION: read_stream
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Statuses statuses(Facebook facebook, Paging paging) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.STATUSES, Statuses.class, paging);
	}

	/**
	 * The television listed on the user's profile
	 * PERMISSION: user_likes or friends_likes
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Television television(Facebook facebook) throws FacebookException{
		return television(facebook, null);
	}
	
	/**
	 * The television listed on the user's profile
	 * PERMISSION: user_likes or friends_likes
	 * 
	 * @param facebook
	 * @param paging
	 * 
	 * @return
	 * @throws FacebookException
	 */
	public Television television(Facebook facebook, Paging paging) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.TELEVISION, Television.class, paging);
	}
	
	/**
	 * The updates in this user's inbox
	 * PERMISSION: read_mailbox
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Updates updates(Facebook facebook) throws FacebookException{
		return updates(facebook, null);
	}
	
	/**
	 * The updates in this user's inbox
	 * PERMISSION: read_mailbox
	 * 
	 * @param facebook
	 * @param paging
	 * 
	 * @return
	 * @throws FacebookException
	 */
	public Updates updates(Facebook facebook, Paging paging) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.UPDATES, Updates.class, paging);
	}
	
	/**
	 * The videos this user has been tagged in
	 * PERMISSION: user_videos or friends_videos
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Videos videos(Facebook facebook) throws FacebookException{
		return videos(facebook, null);
	}
	
	/**
	 * The videos this user has been tagged in
	 * PERMISSION: user_videos or friends_videos
	 * 
	 * @param facebook
	 * @param paging
	 * 
	 * @return
	 * @throws FacebookException
	 */
	public Videos videos(Facebook facebook, Paging paging) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.VIDEOS, Videos.class, paging);
	}
	 
}