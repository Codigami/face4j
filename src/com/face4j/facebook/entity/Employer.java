package com.face4j.facebook.entity;

import java.io.Serializable;

public class Employer implements Serializable {

	private static final long serialVersionUID = 7073751319710108889L;
	
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
