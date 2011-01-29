package com.face4j.facebook.entity;

import java.io.Serializable;

/**
 * You can search, read and publish checkins. 
 * Every checkin is associated with a checkin ID that represents an object in the graph. 
 * These checkins are then associated with locations represented by Facebook Pages or Open Graph protocol pages.
 * To get a user's checkins, request the <b>user_checkins extended permission</b>. 
 * To see the user's friends' checkins, request the <b>friends_checkins extended permission</b>.
 * @author nischal
 *
 */
public class Checkin implements Serializable {

	private static final long serialVersionUID = -4002183287188194903L;
	
	private String id;
	
	private From from;
	
	private Tag[] tags;
	
	private Place place;
	
	private String message;
	
	private Application application;
	
	private String createdTime;

	/**
	 * The checkin ID
	 * Permission: user_checkins
	 * @return
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The ID and name of the user who made the checkin
	 * Permission: user_checkins
	 * @return
	 */
	public From getFrom() {
		return from;
	}

	public void setFrom(From from) {
		this.from = from;
	}

	/**
	 * The users the author tagged in the checkin
	 * Permission: user_checkins
	 * @return
	 */
	public Tag[] getTags() {
		return tags;
	}

	public void setTags(Tag[] tags) {
		this.tags = tags;
	}

	/**
	 * Information about the Facebook Page that represents the location of the checkin
	 * Permission: user_checkins
	 * @return
	 */
	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	/**
	 * The message the user added to the checkin
	 * Permission: user_checkins
	 * @return
	 */
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Information about the application that made the checkin
	 * Permission: user_checkins
	 * @return
	 */
	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	/**
	 * The time the checkin was created
	 * Permission: user_checkins
	 * @return
	 */
	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}
}