package com.face4j.facebook.entity;

import java.io.Serializable;

public class StatusMessage implements Serializable {

	private static final long serialVersionUID = -3087803112563817851L;
	
	private long id;
	
	private From from;
	
	private String message;
	
	private String updatedTime;
	
	private Comment[] comments;
	
	private Like[] likes;
	
	public StatusMessage(long id, From from, String message, String updatedTime) {
		super();
		this.id = id;
		this.from = from;
		this.message = message;
		this.updatedTime = updatedTime;
	}

	public long getId() {
		return id;
	}

	public From getFrom() {
		return from;
	}

	public String getMessage() {
		return message;
	}

	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setFrom(From from) {
		this.from = from;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	public Comment[] getComments() {
		//TODO implement
		return comments;
	}

	public Like[] getLikes() {
		//TODO implement
		return likes;
	}
	
	
	
	

}
