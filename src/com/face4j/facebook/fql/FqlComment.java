package com.face4j.facebook.fql;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class FqlComment implements Serializable {

	private static final long serialVersionUID = 383394113986607215L;

	private String id;
	@SerializedName("fromid")	private Long fromId;
	private Long time;
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

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
