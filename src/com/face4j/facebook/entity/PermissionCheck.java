package com.face4j.facebook.entity;

import java.io.Serializable;

/**
 * When permission is accessible then usually "1" is sent. If the getters return null it means permission is not available
 * 
 * @author nischal
 *
 */
public class PermissionCheck implements Serializable {
	
	private static final long serialVersionUID = 5639790284593333735L;
	
	
	/**
	 * Enables your application to post content, comments, and likes to a user's stream and to the streams of the user's friends, 
	 * without prompting the user each time.
	 */
	private String publishStream, 
	
	/**
	 * Enables your application to create and modify events on the user's behalf
	 */
	createEvent , 
	
	/**
	 * Enables your application to RSVP to events on the user's behalf
	 */
	rsvpEvent, 
	
	/**
	 * Enables your application to send messages to the user and respond to messages from the user via text message
	 */
	sms, 
	
	/**
	 * Enables your application to perform authorized requests on behalf of the user at any time. 
	 * By default, most access tokens expire after a short time period to ensure applications only make requests on behalf of the user 
	 * when the are actively using the application. This permission makes the access token returned by our OAuth endpoint long-lived.
	 */
	offlineAccess,
	
	/**
	 * Enables your app to perform checkins on behalf of the user.
	 */
	publishCheckins,
	
	/**
	 * Enables your app to create and edit the user's friend lists.
	 */
	manageFriendlists,
	
	/**
	 * Provides access to the user's primary email address in the email property. Do not spam users. 
	 * Your use of email must comply both with Facebook policies and with the CAN-SPAM Act.
	 */
	email, 
	
	/**
	 * Provides access to the "About Me" section of the profile in the about property
	 */
	userAboutMe, 
	
	/**
	 * Provides access to the user's list of activities as the activities connection
	 */
	userActivities, 
	
	/**
	 * Provides access to the full birthday with year as the birthdayDate property
	 */
	userBirthday, 
	
	/**
	 * Provides read access to the authorized user's check-ins or a friend's check-ins that the user can see.
	 */
	userCheckins,
	
	/**
	 * Provides access to education history as the education property
	 */
	userEducationHistory, 
	
	/**
	 * Provides access to the list of events the user is attending as the events connection
	 */
	userEvents, 
	
	/**
	 * Provides access to the list of groups the user is a member of as the groups connection
	 */
	userGroups, 
	
	/**
	 * Provides access to the user's hometown in the hometown property
	 */
	userHometown,
	
	/**
	 * Provides access to the user's list of interests as the interests connection
	 */
	userInterests, 
	
	/**
	 * Provides access to the list of all of the pages the user has liked as the likes connection
	 */
	userLikes, 
	
	/**
	 * Provides access to the user's current location as the currentLocation property
	 */
	userLocation, 
	
	/**
	 * Provides access to the user's notes as the notes connection
	 */
	userNotes, 
	
	/**
	 * Provides access to the user's online/offline presence
	 */
	userOnlinePresence, 
	
	/**
	 * Provides access to the photos the user has been tagged in as the photos connection
	 */
	userPhotoVideoTags, 
	
	/**
	 *  	Provides access to the photos the user has uploaded
	 */
	userPhotos, 
	
	/**
	 * Provides access to the user's family and personal relationships and relationship status
	 */
	userRelationships, 
	
	/**
	 * Provides access to the user's relationship preferences
	 */
	userRelationshipDetails,
	
	/**
	 * Provides access to the user's religious and political affiliations
	 */
	userReligionPolitics, 
	
	/**
	 * Provides access to the user's most recent status message
	 */
	userStatus, 
	
	/**
	 * Provides access to the videos the user has uploaded
	 */
	userVideos, 
	
	/**
	 * Provides access to the user's web site URL
	 */
	userWebsite, 
	
	/**
	 * Provides access to work history as the work propertyProvides access to work history as the work property
	 */
	userWorkHistory, 
	
	/**
	 * Provides read access to the user's friend lists
	 */
	readFriendlists,
	
	/**
	 * Provides read access to the Insights data for pages, applications, and domains the user owns.
	 */
	readInsights, 
	
	/**
	 * Provides the ability to read from a user's Facebook Inbox.
	 */
	readMailbox,
	
	/**
	 * Provides read access to the user's friend requests
	 */
	readRequests,
	
	/**
	 * Provides access to all the posts in the user's News Feed and enables your application to perform searches against the user's News Feed
	 */
	readStream, 
	
	/**
	 * Provides applications that integrate with Facebook Chat the ability to log in users.
	 */
	xmppLogin,
	
	/**
	 * Provides the ability to manage ads and call the Facebook Ads API on behalf of a user.
	 */
	adsManagements,
	
	friendsAboutMe, friendsActivities, friendsBirthday, friendsCheckins, friendsEducationHistory, friendsEvents, friendsGroups, friendsHometown, friendsInterests, 
	friendsLikes, friendsLocation, friendsNotes, friendsOnlinePresence, friendsPhotoVideoTags, friendsPhotos, friendsRelationships, friendsRelationshipDetails, friendsReligionPolitics, 
	friendsStatus, friendsVideos, friendsWebsite, friendsWorkHistory,
	
	/**
	 * Enables your application to retrieve access_tokens for pages the user administrates. The
	 * access tokens can be queried using the "accounts" connection in the Graph API. This
	 * permission is only compatible with the Graph API.
	 */
	managePages;

	public String getPublishStream() {
		return publishStream;
	}

	public void setPublishStream(String publishStream) {
		this.publishStream = publishStream;
	}

	public String getCreateEvent() {
		return createEvent;
	}

	public void setCreateEvent(String createEvent) {
		this.createEvent = createEvent;
	}

	public String getRsvpEvent() {
		return rsvpEvent;
	}

	public void setRsvpEvent(String rsvpEvent) {
		this.rsvpEvent = rsvpEvent;
	}

	public String getSms() {
		return sms;
	}

	public void setSms(String sms) {
		this.sms = sms;
	}

	public String getOfflineAccess() {
		return offlineAccess;
	}

	public void setOfflineAccess(String offlineAccess) {
		this.offlineAccess = offlineAccess;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReadInsights() {
		return readInsights;
	}

	public void setReadInsights(String readInsights) {
		this.readInsights = readInsights;
	}

	public String getReadStream() {
		return readStream;
	}

	public void setReadStream(String readStream) {
		this.readStream = readStream;
	}

	public String getUserAboutMe() {
		return userAboutMe;
	}

	public void setUserAboutMe(String userAboutMe) {
		this.userAboutMe = userAboutMe;
	}

	public String getUserActivities() {
		return userActivities;
	}

	public void setUserActivities(String userActivities) {
		this.userActivities = userActivities;
	}

	public String getUserBirthday() {
		return userBirthday;
	}

	public void setUserBirthday(String userBirthday) {
		this.userBirthday = userBirthday;
	}

	public String getUserEducationHistory() {
		return userEducationHistory;
	}

	public void setUserEducationHistory(String userEducationHistory) {
		this.userEducationHistory = userEducationHistory;
	}

	public String getUserEvents() {
		return userEvents;
	}

	public void setUserEvents(String userEvents) {
		this.userEvents = userEvents;
	}

	public String getUserGroups() {
		return userGroups;
	}

	public void setUserGroups(String userGroups) {
		this.userGroups = userGroups;
	}

	public String getUserHometown() {
		return userHometown;
	}

	public void setUserHometown(String userHometown) {
		this.userHometown = userHometown;
	}

	public String getUserInterests() {
		return userInterests;
	}

	public void setUserInterests(String userInterests) {
		this.userInterests = userInterests;
	}

	public String getUserLikes() {
		return userLikes;
	}

	public void setUserLikes(String userLikes) {
		this.userLikes = userLikes;
	}

	public String getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}

	public String getUserNotes() {
		return userNotes;
	}

	public void setUserNotes(String userNotes) {
		this.userNotes = userNotes;
	}

	public String getUserOnlinePresence() {
		return userOnlinePresence;
	}

	public void setUserOnlinePresence(String userOnlinePresence) {
		this.userOnlinePresence = userOnlinePresence;
	}

	public String getUserPhotoVideoTags() {
		return userPhotoVideoTags;
	}

	public void setUserPhotoVideoTags(String userPhotoVideoTags) {
		this.userPhotoVideoTags = userPhotoVideoTags;
	}

	public String getUserPhotos() {
		return userPhotos;
	}

	public void setUserPhotos(String userPhotos) {
		this.userPhotos = userPhotos;
	}

	public String getUserRelationships() {
		return userRelationships;
	}

	public void setUserRelationships(String userRelationships) {
		this.userRelationships = userRelationships;
	}

	public String getUserReligionPolitics() {
		return userReligionPolitics;
	}

	public void setUserReligionPolitics(String userReligionPolitics) {
		this.userReligionPolitics = userReligionPolitics;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserVideos() {
		return userVideos;
	}

	public void setUserVideos(String userVideos) {
		this.userVideos = userVideos;
	}

	public String getUserWebsite() {
		return userWebsite;
	}

	public void setUserWebsite(String userWebsite) {
		this.userWebsite = userWebsite;
	}

	public String getUserWorkHistory() {
		return userWorkHistory;
	}

	public void setUserWorkHistory(String userWorkHistory) {
		this.userWorkHistory = userWorkHistory;
	}

	public String getReadFriendlists() {
		return readFriendlists;
	}

	public void setReadFriendlists(String readFriendlists) {
		this.readFriendlists = readFriendlists;
	}

	public String getReadRequests() {
		return readRequests;
	}

	public void setReadRequests(String readRequests) {
		this.readRequests = readRequests;
	}

	public String getFriendsAboutMe() {
		return friendsAboutMe;
	}

	public void setFriendsAboutMe(String friendsAboutMe) {
		this.friendsAboutMe = friendsAboutMe;
	}

	public String getFriendsActivities() {
		return friendsActivities;
	}

	public void setFriendsActivities(String friendsActivities) {
		this.friendsActivities = friendsActivities;
	}

	public String getFriendsBirthday() {
		return friendsBirthday;
	}

	public void setFriendsBirthday(String friendsBirthday) {
		this.friendsBirthday = friendsBirthday;
	}

	public String getFriendsEducationHistory() {
		return friendsEducationHistory;
	}

	public void setFriendsEducationHistory(String friendsEducationHistory) {
		this.friendsEducationHistory = friendsEducationHistory;
	}

	public String getFriendsEvents() {
		return friendsEvents;
	}

	public void setFriendsEvents(String friendsEvents) {
		this.friendsEvents = friendsEvents;
	}

	public String getFriendsGroups() {
		return friendsGroups;
	}

	public void setFriendsGroups(String friendsGroups) {
		this.friendsGroups = friendsGroups;
	}

	public String getFriendsHometown() {
		return friendsHometown;
	}

	public void setFriendsHometown(String friendsHometown) {
		this.friendsHometown = friendsHometown;
	}

	public String getFriendsInterests() {
		return friendsInterests;
	}

	public void setFriendsInterests(String friendsInterests) {
		this.friendsInterests = friendsInterests;
	}

	public String getFriendsLikes() {
		return friendsLikes;
	}

	public void setFriendsLikes(String friendsLikes) {
		this.friendsLikes = friendsLikes;
	}

	public String getFriendsLocation() {
		return friendsLocation;
	}

	public void setFriendsLocation(String friendsLocation) {
		this.friendsLocation = friendsLocation;
	}

	public String getFriendsNotes() {
		return friendsNotes;
	}

	public void setFriendsNotes(String friendsNotes) {
		this.friendsNotes = friendsNotes;
	}

	public String getFriendsOnlinePresence() {
		return friendsOnlinePresence;
	}

	public void setFriendsOnlinePresence(String friendsOnlinePresence) {
		this.friendsOnlinePresence = friendsOnlinePresence;
	}

	public String getFriendsPhotoVideoTags() {
		return friendsPhotoVideoTags;
	}

	public void setFriendsPhotoVideoTags(String friendsPhotoVideoTags) {
		this.friendsPhotoVideoTags = friendsPhotoVideoTags;
	}

	public String getFriendsPhotos() {
		return friendsPhotos;
	}

	public void setFriendsPhotos(String friendsPhotos) {
		this.friendsPhotos = friendsPhotos;
	}

	public String getFriendsRelationships() {
		return friendsRelationships;
	}

	public void setFriendsRelationships(String friendsRelationships) {
		this.friendsRelationships = friendsRelationships;
	}

	public String getFriendsReligionPolitics() {
		return friendsReligionPolitics;
	}

	public void setFriendsReligionPolitics(String friendsReligionPolitics) {
		this.friendsReligionPolitics = friendsReligionPolitics;
	}

	public String getFriendsStatus() {
		return friendsStatus;
	}

	public void setFriendsStatus(String friendsStatus) {
		this.friendsStatus = friendsStatus;
	}

	public String getFriendsVideos() {
		return friendsVideos;
	}

	public void setFriendsVideos(String friendsVideos) {
		this.friendsVideos = friendsVideos;
	}

	public String getFriendsWebsite() {
		return friendsWebsite;
	}

	public void setFriendsWebsite(String friendsWebsite) {
		this.friendsWebsite = friendsWebsite;
	}

	public String getFriendsWorkHistory() {
		return friendsWorkHistory;
	}

	public void setFriendsWorkHistory(String friendsWorkHistory) {
		this.friendsWorkHistory = friendsWorkHistory;
	}

	public String getPublishCheckins() {
		return publishCheckins;
	}

	public void setPublishCheckins(String publishCheckins) {
		this.publishCheckins = publishCheckins;
	}

	public String getManageFriendlists() {
		return manageFriendlists;
	}

	public void setManageFriendlists(String manageFriendlists) {
		this.manageFriendlists = manageFriendlists;
	}

	public String getUserCheckins() {
		return userCheckins;
	}

	public void setUserCheckins(String userCheckins) {
		this.userCheckins = userCheckins;
	}

	public String getUserRelationshipDetails() {
		return userRelationshipDetails;
	}

	public void setUserRelationshipDetails(String userRelationshipDetails) {
		this.userRelationshipDetails = userRelationshipDetails;
	}

	public String getReadMailbox() {
		return readMailbox;
	}

	public void setReadMailbox(String readMailbox) {
		this.readMailbox = readMailbox;
	}

	public String getXmppLogin() {
		return xmppLogin;
	}

	public void setXmppLogin(String xmppLogin) {
		this.xmppLogin = xmppLogin;
	}

	public String getAdsManagements() {
		return adsManagements;
	}

	public void setAdsManagements(String adsManagements) {
		this.adsManagements = adsManagements;
	}

	public String getFriendsCheckins() {
		return friendsCheckins;
	}

	public void setFriendsCheckins(String friendsCheckins) {
		this.friendsCheckins = friendsCheckins;
	}

	public String getFriendsRelationshipDetails() {
		return friendsRelationshipDetails;
	}

	public void setFriendsRelationshipDetails(String friendsRelationshipDetails) {
		this.friendsRelationshipDetails = friendsRelationshipDetails;
	}

	public String getManagePages() {
		return managePages;
	}

	public void setManagePages(String managePages) {
		this.managePages = managePages;
	}
	
}