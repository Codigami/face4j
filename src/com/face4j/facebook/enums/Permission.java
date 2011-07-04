package com.face4j.facebook.enums;

public enum Permission {
	
	/**
	 * Enables your application to post content, comments, and likes to a user's stream and to the streams of the user's friends, 
	 * without prompting the user each time.
	 */
	PUBLISH_STREAM, 
	
	/**
	 * Enables your application to create and modify events on the user's behalf
	 */
	CREATE_EVENT , 
	
	/**
	 * Enables your application to RSVP to events on the user's behalf
	 */
	RSVP_EVENT, 
	
	/**
	 * Enables your application to send messages to the user and respond to messages from the user via text message
	 */
	SMS, 
	
	/**
	 * Enables your application to perform authorized requests on behalf of the user at any time. 
	 * By default, most access tokens expire after a short time period to ensure applications only make requests on behalf of the user 
	 * when the are actively using the application. This permission makes the access token returned by our OAuth endpoint long-lived.
	 */
	OFFLINE_ACCESS,
	
	/**
	 * Enables your app to perform checkins on behalf of the user.
	 */
	PUBLISH_CHECKINS,
	
	/**
	 * Enables your app to create and edit the user's friend lists.
	 */
	MANAGE_FRIENDLISTS,
	
	/**
	 * Provides access to the user's primary email address in the email property. Do not spam users. 
	 * Your use of email must comply both with Facebook policies and with the CAN-SPAM Act.
	 */
	EMAIL, 
	
	/**
	 * Provides access to the "About Me" section of the profile in the about property
	 */
	USER_ABOUT_ME, 
	
	/**
	 * Provides access to the user's list of activities as the activities connection
	 */
	USER_ACTIVITIES, 
	
	/**
	 * Provides access to the full birthday with year as the birthday_date property
	 */
	USER_BIRTHDAY, 
	
	/**
	 * Provides read access to the authorized user's check-ins or a friend's check-ins that the user can see.
	 */
	USER_CHECKINS,
	
	/**
	 * Provides access to education history as the education property
	 */
	USER_EDUCATION_HISTORY, 
	
	/**
	 * Provides access to the list of events the user is attending as the events connection
	 */
	USER_EVENTS, 
	
	/**
	 * Provides access to the list of groups the user is a member of as the groups connection
	 */
	USER_GROUPS, 
	
	/**
	 * Provides access to the user's hometown in the hometown property
	 */
	USER_HOMETOWN,
	
	/**
	 * Provides access to the user's list of interests as the interests connection
	 */
	USER_INTERESTS, 
	
	/**
	 * Provides access to the list of all of the pages the user has liked as the likes connection
	 */
	USER_LIKES, 
	
	/**
	 * Provides access to the user's current location as the current_location property
	 */
	USER_LOCATION, 
	
	/**
	 * Provides access to the user's notes as the notes connection
	 */
	USER_NOTES, 
	
	/**
	 * Provides access to the user's online/offline presence
	 */
	USER_ONLINE_PRESENCE, 
	
	/**
	 * Provides access to the photos the user has been tagged in as the photos connection
	 */
	USER_PHOTO_VIDEO_TAGS, 
	
	/**
	 *  	Provides access to the photos the user has uploaded
	 */
	USER_PHOTOS, 
	
	/**
	 * Provides access to the user's family and personal relationships and relationship status
	 */
	USER_RELATIONSHIPS, 
	
	/**
	 * Provides access to the user's relationship preferences
	 */
	USER_RELATIONSHIP_DETAILS,
	
	/**
	 * Provides access to the user's religious and political affiliations
	 */
	USER_RELIGION_POLITICS, 
	
	/**
	 * Provides access to the user's most recent status message
	 */
	USER_STATUS, 
	
	/**
	 * Provides access to the videos the user has uploaded
	 */
	USER_VIDEOS, 
	
	/**
	 * Provides access to the user's web site URL
	 */
	USER_WEBSITE, 
	
	/**
	 * Provides access to work history as the work propertyProvides access to work history as the work property
	 */
	USER_WORK_HISTORY, 
	
	/**
	 * Provides read access to the user's friend lists
	 */
	READ_FRIENDLISTS, 
	
	/**
	 * Provides read access to the Insights data for pages, applications, and domains the user owns.
	 */
	READ_INSIGHTS,
	
	/**
	 * Provides the ability to read from a user's Facebook Inbox.
	 */
	READ_MAILBOX,
	
	/**
	 * Provides read access to the user's friend requests
	 */
	READ_REQUESTS,
	
	/**
	 * Provides access to all the posts in the user's News Feed and enables your application to perform searches against the user's News Feed
	 */
	READ_STREAM,
	
	/**
	 * Provides applications that integrate with Facebook Chat the ability to log in users.
	 */
	XMPP_LOGIN,
	
	/**
	 * Provides the ability to manage ads and call the Facebook Ads API on behalf of a user.
	 */
	ADS_MANAGEMENT,

	/**
	 * Enables your application to retrieve access_tokens for pages the user administrates. The access
	 * tokens can be queried using the "accounts" connection in the Graph API. This permission is only
	 * compatible with the Graph API.
	 * 
	 * An access_token used to manage a page. This is used when you want to perform an operation
	 * acting as a `Page` instead of the logged in user. This access token is retrieved by issuing an
	 * HTTP GET to /USER_ID/accounts with the manage_pages permission. This operation will return a
	 * list of `Page`s (including application profile pages) to which the user has access, along with
	 * `access_tokens` for those `Page`s to which the user has administrative rights. See the
	 * documentation for the User object for more information.
	 */
	MANAGE_PAGES,
	
	FRIENDS_ABOUT_ME, FRIENDS_ACTIVITIES, FRIENDS_BIRTHDAY, FRIENDS_CHECKINS, FRIENDS_EDUCATION_HISTORY, FRIENDS_EVENTS, FRIENDS_GROUPS, FRIENDS_HOMETOWN, FRIENDS_INTERESTS, 
	FRIENDS_LIKES, FRIENDS_LOCATION, FRIENDS_NOTES, FRIENDS_ONLINE_PRESENCE, FRIENDS_PHOTO_VIDEO_TAGS, FRIENDS_PHOTOS, FRIENDS_RELATIONSHIPS,
	FRIENDS_RELATIONSHIP_DETAILS, FRIENDS_RELIGION_POLITICS, 
	FRIENDS_STATUS, FRIENDS_VIDEOS, FRIENDS_WEBSITE, FRIENDS_WORK_HISTORY;

}
