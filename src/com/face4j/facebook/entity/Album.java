package com.face4j.facebook.entity;

import java.io.Serializable;

/**
 * A Photo album on facebook
 * 
 * @author Nischal Shetty
 */
public class Album implements Serializable {

	private static final long serialVersionUID = 1805429103365132266L;

	/**
	 * The photo album ID
	 */
	private String id;

	/**
	 * An object containing the ID and name of the profile who posted this album
	 */
	private From from;

	/**
	 * The title of the album
	 */
	private String name;

	/**
	 * The description of the album
	 */
	private String description;

	/**
	 * The location of the album
	 */
	private Location location;

	/**
	 * A link to this album on Facebook
	 */
	private String link;

	/**
	 * The number of photos in this album
	 */
	private long count;

	/**
	 * The time the photo album was initially created
	 */
	private String createdTime;

	/**
	 * The last time the photo album was updated
	 */
	private String updatedTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public From getFrom() {
		return from;
	}

	public void setFrom(From from) {
		this.from = from;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}