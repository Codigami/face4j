package com.face4j.facebook.entity;

import java.io.Serializable;

public class Language implements Serializable{

	private static final long serialVersionUID = -8824159487413332236L;
	
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
