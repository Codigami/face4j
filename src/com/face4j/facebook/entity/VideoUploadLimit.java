package com.face4j.facebook.entity;

import java.io.Serializable;

public class VideoUploadLimit implements Serializable{

	private static final long serialVersionUID = -3830911234954455780L;
	
	private Integer length;
	
	private Integer size;

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}
	
}