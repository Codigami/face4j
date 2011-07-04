package com.face4j.facebook.entity;

import java.io.Serializable;

/**
 *
 * @author nischal
 *
 */
public class Property implements Serializable {

	private static final long serialVersionUID = -4891060452168176993L;

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
