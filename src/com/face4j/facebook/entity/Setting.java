package com.face4j.facebook.entity;

import java.io.Serializable;

public class Setting implements Serializable{

	private static final long serialVersionUID = -1389470198222379380L;
	
	public String setting;
	public String value;

	public String getSetting() {
		return setting;
	}

	public void setSetting(String setting) {
		this.setting = setting;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}