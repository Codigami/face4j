package com.face4j.facebook.entity;

import java.io.Serializable;

public class Comment implements Serializable{

	private static final long serialVersionUID = -8695663867766108720L;
	
	private String id;
	private From from;
	private String message;
	private String createdTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public From getFrom() {
		return from;
	}
	public void setFrom(From from) {
		this.from = from;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}
	
	

}
