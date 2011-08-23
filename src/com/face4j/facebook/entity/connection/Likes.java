package com.face4j.facebook.entity.connection;

import java.io.Serializable;
import java.util.List;

import com.face4j.facebook.entity.Data;
import com.face4j.facebook.entity.paging.Paging;

public class Likes implements Serializable {
	
	private static final long serialVersionUID = -6153401161460620827L;

	private List<Data> data;
	private Paging paging;
	private int count;
	
	/**
	 * Returns the id and name of users who have liked the object
	 * @return
	 */
	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}