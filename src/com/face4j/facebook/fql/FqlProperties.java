package com.face4j.facebook.fql;

import java.io.Serializable;

public class FqlProperties implements Serializable {

	private static final long serialVersionUID = 4642223364862839320L;

	private String name;
	private String text;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
