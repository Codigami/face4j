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
	LIKES("likes");

	private String type;

	private ConnectionType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}
}
