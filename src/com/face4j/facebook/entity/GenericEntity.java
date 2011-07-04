package com.face4j.facebook.entity;

import java.io.Serializable;

public class GenericEntity implements Serializable{

	private static final long serialVersionUID = 4789849498699789988L;
	
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