package com.face4j.facebook.entity;

import java.io.Serializable;

public class Participant implements Serializable {

	private static final long serialVersionUID = -5756586840758170491L;

	private String name;
	private String email;
	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Id may or may not be available
	 * 
	 * @return
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
