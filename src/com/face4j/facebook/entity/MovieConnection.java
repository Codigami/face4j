package com.face4j.facebook.entity;

import java.io.Serializable;

public class MovieConnection implements Serializable {

	private static final long serialVersionUID = -2418404685552260360L;

	private String id;
	private String name;
	private String category;
	private String createTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}