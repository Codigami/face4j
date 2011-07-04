package com.face4j.facebook.entity;

import java.io.Serializable;

/**
 * A status message on a user's wall as represented in the Graph API.
 * 
 * @author nischal
 *
 */
public class StatusMessage implements Serializable {

	private static final long serialVersionUID = -3087803112563817851L;

	private String id;
	private From from;
	private String message;
	private String updatedTime;
	private String type;

	/**
	 * The status message ID
	 * PERMISSION: Requires access_token 
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 * The user who posted the message
	 * PERMISSION: Requires access_token
	 * @return
	 */
	public From getFrom() {
		return from;
	}

	/**
	 * The status message content
	 * PERMISSION: Requires access_token
	 * @return
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * The time the message was published
	 * PERMISSION: Requires access_token
	 * @return string containing an IETF RFC 3339 datetime
	 */
	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setFrom(From from) {
		this.from = from;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	/**
	 * The object type which is set to status
	 * PERMISSION: Requires access_token
	 * @return
	 */
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}