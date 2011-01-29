package com.face4j.facebook.entity;

import java.io.Serializable;

public class Video implements Serializable{

	private static final long serialVersionUID = 1049597554515895302L;
	
	private String id;
	
	private From from;
	
	private Tag[] tags;
	
	private String name;
	
	private String embedHtml;
	
	private String icon;
	
	private String source;
	
	private String createdTime;
	
	private String updatedTime;
	
	private Comment[] comments;
	
	private String picture;

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

	public Tag[] getTags() {
		return tags;
	}

	public void setTags(Tag[] tags) {
		this.tags = tags;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmbedHtml() {
		return embedHtml;
	}

	public void setEmbedHtml(String embedHtml) {
		this.embedHtml = embedHtml;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	public Comment[] getComments() {
		//TODO implement
		return comments;
	}

	public String getPicture() {
		//TODO implement
		return picture;
	}
	
	

}
