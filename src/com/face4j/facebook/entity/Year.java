package com.face4j.facebook.entity;

import java.io.Serializable;

public class Year implements Serializable{
	
	private static final long serialVersionUID = -1878949062349966955L;

	private long id;
	
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
