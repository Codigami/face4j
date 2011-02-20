package com.face4j.facebook.fql;

import java.io.Serializable;

public class FqlMedia implements Serializable {

	private static final long serialVersionUID = -1520632457634666566L;

	private String href;
	private String alt;
	private String type;
	private String src;
	private FqlVideo video;
	private FqlPhoto photo;

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getAlt() {
		return alt;
	}

	public void setAlt(String alt) {
		this.alt = alt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public FqlVideo getVideo() {
		return video;
	}

	public void setVideo(FqlVideo video) {
		this.video = video;
	}

	public FqlPhoto getPhoto() {
		return photo;
	}

	public void setPhoto(FqlPhoto photo) {
		this.photo = photo;
	}

}
