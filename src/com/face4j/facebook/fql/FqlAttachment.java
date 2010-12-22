package com.face4j.facebook.fql;

import java.io.Serializable;
import java.util.List;

public class FqlAttachment implements Serializable {

	private static final long serialVersionUID = -7249990503411544573L;

	private List<FqlMedia> media;
	private String name;
	private String href;
	private String caption;
	private String description;
	private String icon;
	private List<FqlProperties> properties;
	private String fbObjectType;
	private String fbObjectId;

	public List<FqlMedia> getMedia() {
		return media;
	}

	public void setMedia(List<FqlMedia> media) {
		this.media = media;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
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

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public List<FqlProperties> getProperties() {
		return properties;
	}

	public void setProperties(List<FqlProperties> properties) {
		this.properties = properties;
	}

	public String getFbObjectType() {
		return fbObjectType;
	}

	public void setFbObjectType(String fbObjectType) {
		this.fbObjectType = fbObjectType;
	}

	public String getFbObjectId() {
		return fbObjectId;
	}

	public void setFbObjectId(String fbObjectId) {
		this.fbObjectId = fbObjectId;
	}

}
