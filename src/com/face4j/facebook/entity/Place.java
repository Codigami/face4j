package com.face4j.facebook.entity;

import java.io.Serializable;

/**
 * Information about the Facebook Page that represents the location of the checkin
 * Object contains the {@link Page} id, name, and location
 * @author nischal
 *
 */
public class Place implements Serializable {

	private static final long serialVersionUID = 8713282510149898618L;
	
	private String id;
	
	private String name;
	
	private String location;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
