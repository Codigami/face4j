package com.face4j.facebook.enums;

public enum ConnectionType {

	/**
	 * Would be a part of the graph API URL to retrieve all the "Comment" details of an object
	 * Example: http://graph.facebook.com/<id>/comments
	 */
	COMMENTS("comments"),

	/**
	 * Would be a part of the graph API URL to retrieve all the "Like" details of an object Example:
	 * http://graph.facebook.com/<id>/likes
	 */
	LIKES("likes"), 
	
	PERMISSIONS("permissions"),
	
	ACCOUNTS("accounts"),
	
	ACTIVITIES("activities"),
	
	ALBUMS("albums"),
	
	BOOKS("books"),
	
	CHECKINS("checkins"),
	
	EVENTS("events"),
	
	FEED("feed"),
	
	FRIENDLISTS("friendlists"),
	
	FRIENDS("friends"),
	
	GROUPS("groups"),
	
	HOME("home"),
	
	INBOX("inbox"),
	
	INTERESTS("interests"),
	
	LINKS("links"),
	
	MOVIES("movies"),
	
	MUSIC("music"),
	
	NOTES("notes"),
	
	OUTBOX("outbox"),
	
	PHOTOS("photos"),
	
	POKES("pokes"), 
	
	POSTS("posts"),
	
	STATUSES("statuses"),
	
	TELEVISION("television"),
	
	UPDATES("updates"),
	
	VIDEOS("videos"),
	
	PICTURE("picture"),
	
	SETTINGS("settings"),
	
	TABS("tabs");

	private String type;

	private ConnectionType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}
}
