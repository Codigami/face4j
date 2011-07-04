package com.face4j.facebook.entity;

import java.io.Serializable;

import com.face4j.facebook.enums.Privacy;

public class Event implements Serializable{

	private static final long serialVersionUID = 2969910873119178011L;
	
	private String id;
	
	private Owner owner;
	
	private String name;
	
	private String description;
	
	private String startTime;
	
	private String endTime;
	
	private String location;
	
	private Venue[] venue;
	
	private Privacy privacy;
	
	private String updatedTime;
	
	private Post[] feed;
	
	private EventReply[] noReply;
	
	private EventReply[] mayBe;
	
	private EventReply[] invited;
	
	private EventReply[] attending;
	
	private EventReply[] declined;
	
	private String picture;
	
	private String rsvpStatus;

	/**
	 * The event ID
	 * @return
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The profile that created the event
	 * @return
	 */
	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	/**
	 * The event title
	 * @return
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The long-form HTML description of the event
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * The start time of the event, as you want it to be displayed on facebook
	 * @return
	 */
	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * The end time of the event, as you want it to be displayed on facebook
	 * @return
	 */
	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * The location for this event
	 * @return
	 */
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * The location of this event
	 * @return
	 */
	public Venue[] getVenue() {
		return venue;
	}

	public void setVenue(Venue[] venue) {
		this.venue = venue;
	}

	/**
	 * The visibility of this event
	 * @return
	 */
	public Privacy getPrivacy() {
		return privacy;
	}

	public void setPrivacy(Privacy privacy) {
		this.privacy = privacy;
	}

	/**
	 * The last time the event was updated
	 * @return
	 */
	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	/**
	 * This event's wall
	 * @return
	 */
	public Post[] getFeed() {
		//TODO implement
		return feed;
	}

	/**
	 * All of the users who have been not yet responded to their invitation to this event
	 * @return
	 */
	public EventReply[] getNoReply() {
		//TODO implement
		return noReply;
	}

	/**
	 * All of the users who have been responded "Maybe" to their invitation to this event
	 * @return
	 */
	public EventReply[] getMayBe() {
		//TODO implement
		return mayBe;
	}

	/**
	 * All of the users who have been invited to this event
	 * @return
	 */
	public EventReply[] getInvited() {
		//TODO implement
		return invited;
	}

	/**
	 * All of the users who are attending this event
	 * @return
	 */
	public EventReply[] getAttending() {
		//TODO implement
		return attending;
	}

	/**
	 * All of the users who declined their invitation to this event
	 * @return
	 */
	public EventReply[] getDeclined() {
		//TODO implement
		return declined;
	}

	/**
	 * The event's profile picture
	 * @return
	 */
	public String getPicture() {
		//TODO implement
		return picture;
	}

	/**
	 * Usually obtained as part of "events" connection for a User 
	 * @return
	 */
	public String getRsvpStatus() {
		return rsvpStatus;
	}

	public void setRsvpStatus(String rsvpStatus) {
		this.rsvpStatus = rsvpStatus;
	}
	
	
}