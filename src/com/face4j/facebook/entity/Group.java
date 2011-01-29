package com.face4j.facebook.entity;

import java.io.Serializable;

import com.face4j.facebook.OAuthAccessToken;
import com.face4j.facebook.http.APICallerInterface;

public class Group implements Entity, Serializable { 

	private static final long serialVersionUID = 6988890966587453286L;
	
	private String id;
	
	private String icon;
	
	private Owner owner;
	
	private String name;
	
	private String description;
	
	private String link;
	
	private String privacy;
	
	private String updatedTime;
	
	private Post[] feed;
	
	private Member[] members;
	
	private String picture;

	@Override
	public void setOAuthAccessToken(OAuthAccessToken oAuthAccessToken) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setApiCallerInterface(APICallerInterface apiCallerInterface) {
		// TODO Auto-generated method stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getPrivacy() {
		return privacy;
	}

	public void setPrivacy(String privacy) {
		this.privacy = privacy;
	}

	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getPicture() {
		//TODO: Pull this connection
		return null;
	}

	public Post[] getFeed() {
		//TODO: Pull this connection
		return null;
	}

	public Member[] getMembers() {
		//TODO: Pull this connection
		return null;
	}
	
	

}
