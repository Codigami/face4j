package com.face4j.facebook.entity;

import java.io.Serializable;
import java.util.List;

public class To implements Serializable {

	private static final long serialVersionUID = 4127098602589435476L;
	
	private List<Data> data;

	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}
	
}