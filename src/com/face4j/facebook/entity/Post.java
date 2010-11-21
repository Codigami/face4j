package com.face4j.facebook.entity;

import java.io.Serializable;
import java.util.List;

public class Post implements Serializable {
	
	private static final long serialVersionUID = -6841667779712886659L;
	
	private String id;
	private int likes;
	private From from;
	private List<From> to;
	private String message;
	private String picture;
	private String link;
	private String name;
	private String caption;
	private String description;
	private String source;
	private String icon;
	private String attribution;
	private Privacy privacy;
	private String createdTime;
	private String updatedTime;
	
	private List<From> connections_likes;
	private List<Comment> connections_comments;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public From getFrom() {
		return from;
	}
	public void setFrom(From from) {
		this.from = from;
	}
	public List<From> getTo() {
		return to;
	}
	public void setTo(List<From> to) {
		this.to = to;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getAttribution() {
		return attribution;
	}
	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}
	public Privacy getPrivacy() {
		return privacy;
	}
	public void setPrivacy(Privacy privacy) {
		this.privacy = privacy;
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
	public List<From> getConnections_likes() {
		return connections_likes;
	}
	public void setConnections_likes(List<From> connections_likes) {
		this.connections_likes = connections_likes;
	}
	public List<Comment> getConnections_comments() {
		return connections_comments;
	}
	public void setConnections_comments(List<Comment> connections_comments) {
		this.connections_comments = connections_comments;
	}
	

}
