package com.face4j.facebook.entity;

import java.io.Serializable;

/**
 * Information about the application that made the checkin
 * Object that contains the name and id of the application
 * @author nischal
 *
 */
public class Application implements Serializable {

	private static final long serialVersionUID = 3164719670660515147L;
	
	private String id;
	
	private String name;

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
	
	

}
