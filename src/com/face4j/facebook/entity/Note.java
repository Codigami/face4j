package com.face4j.facebook.entity;

import java.io.Serializable;
import java.util.Date;


public class Note implements Serializable{

	private static final long serialVersionUID = 1464671903847677807L;
	
	private String id;
	
	private From from;
	
	private String subject;
	
	private String message;
	
	private Date createdTime;
	
	private Date updatedTime;
	
	private String icon;
	
	private Comment[] comments;
	
	/**
	 * The note ID
	 * Available to everyone on Facebook by default
	 * @return
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The profile that created the note
	 * Available to everyone on Facebook by default
	 * @return
	 */
	public From getFrom() {
		return from;
	}

	public void setFrom(From from) {
		this.from = from;
	}

	/**
	 * The title of the note
	 * Available to everyone on Facebook by default
	 * @return
	 */
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * The content of the note
	 * Available to everyone on Facebook by default
	 * @return
	 */
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * The time the note was initially published
	 * Available to everyone on Facebook by default
	 * @return
	 */
	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * The time the note was last updated
	 * Available to everyone on Facebook by default
	 * @return
	 */
	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	/**
	 * The icon that Facebook displays with notes
	 * Available to everyone on Facebook by default
	 * @return
	 */
	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * All of the comments on this note
	 * Available to everyone on Facebook by default
	 * @return
	 */
	public Comment[] getComments() {
		return comments;
	}
	
	//TODO: Connection - Comments
	//TODO: Connection - Likes

	

}
