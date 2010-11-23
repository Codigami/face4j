package com.face4j.facebook.fql;

import java.io.Serializable;
import java.util.List;

public class FQL_Attachment implements Serializable {

	private static final long serialVersionUID = -7249990503411544573L;

	private List<FQL_Media> media;
	private String name;
	private String href;
	private String caption;
	private String description;
	private String icon;
	private List<FQL_Properties> properties;
	private String fbObjectType;
	private String fbObjectId;

	public List<FQL_Media> getMedia() {
		return media;
	}

	public void setMedia(List<FQL_Media> media) {
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

	public List<FQL_Properties> getProperties() {
		return properties;
	}

	public void setProperties(List<FQL_Properties> properties) {
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
