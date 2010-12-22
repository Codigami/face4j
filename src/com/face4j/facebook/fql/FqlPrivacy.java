package com.face4j.facebook.fql;

import java.io.Serializable;

public class FqlPrivacy implements Serializable {

	private static final long serialVersionUID = -6179566609517252393L;

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
