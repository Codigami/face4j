package com.face4j.facebook.entity;

import java.io.Serializable;

public class PokeConnection implements Serializable {

	private static final long serialVersionUID = 4177972402521151176L;

	private String to;
	private String from;
	private String createdTime;
	private String type;

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
