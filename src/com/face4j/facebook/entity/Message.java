package com.face4j.facebook.entity;

import java.io.Serializable;

/**
 * An individual message in the new Facebook messaging system. Every message has a message ID that
 * represents an object in the Graph.
 * 
 * @author nischal
 * 
 */
public class Message implements Serializable {

	private static final long serialVersionUID = -3979627216960739088L;

	private String id;
	private String createdTime;
	private Participant from;
	private Participant to;
	private String message;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public Participant getFrom() {
		return from;
	}

	public void setFrom(Participant from) {
		this.from = from;
	}

	public Participant getTo() {
		return to;
	}

	public void setTo(Participant to) {
		this.to = to;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	//TODO: Connections: tags
	//TODO: Connections: attachments
	//TODO: Connections: shares
	
}
