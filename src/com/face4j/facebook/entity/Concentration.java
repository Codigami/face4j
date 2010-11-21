package com.face4j.facebook.entity;

import java.io.Serializable;

public class Concentration implements Serializable{
	
	private static final long serialVersionUID = -8571562108296652573L;

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
