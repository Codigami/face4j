package com.face4j.facebook.fql;

import java.io.Serializable;
import java.util.Date;

public class FQL_Comment implements Serializable {

	private static final long serialVersionUID = 383394113986607215L;

	private String id;
	private Long fromId;
	private Date time;
	private String text;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getFromId() {
		return fromId;
	}

	public void setFromId(Long fromId) {
		this.fromId = fromId;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
