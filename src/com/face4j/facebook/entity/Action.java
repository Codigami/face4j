package com.face4j.facebook.entity;

import java.io.Serializable;

public class Action implements Serializable{
	
	private static final long serialVersionUID = -5020763289760250506L;
	
	private String name;
	private String link;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	
	
	
}
