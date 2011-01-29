package com.face4j.facebook.entity;

import java.io.Serializable;

/**
 * Used to specify user's response to an Event
 * @author nischal
 *
 */
public class EventReply implements Serializable{

	private static final long serialVersionUID = 5842401777809883937L;
	
	private String id;
	
	private String name;
	
	private String rsvpStatus;

	/**
	 * Id of the user
	 * @return
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Name of the user
	 * @return
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Various status of users for a event. Status can be "not_replied", "unsure", "attending", "declined".
	 * @return
	 */
	public String getRsvpStatus() {
		return rsvpStatus;
	}

	public void setRsvpStatus(String rsvpStatus) {
		this.rsvpStatus = rsvpStatus;
	}

	
	
}
