package com.face4j.facebook.entity;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = -1879529230536226563L;
	
	private String id;
	
	private String name;
	
	private String category;

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
	
	

}
