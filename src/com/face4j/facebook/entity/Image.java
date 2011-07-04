package com.face4j.facebook.entity;

import java.io.Serializable;

public class Image implements Serializable {

	private static final long serialVersionUID = 8456306042397497668L;

	private Integer height;
	private Integer width;
	private String source;

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

}
