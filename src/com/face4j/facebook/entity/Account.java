package com.face4j.facebook.entity;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = -1879529230536226563L;
	
	private String id;
	
	private String name;
	
	private String category;
	
	private String accessToken;

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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Available if the 'manage_pages' permission has been granted
	 * 
	 * @return
	 */
	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	
}