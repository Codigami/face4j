package com.face4j.facebook.entity.connection;

import java.io.Serializable;
import java.util.List;

import com.face4j.facebook.entity.Comment;
import com.face4j.facebook.entity.paging.Paging;

public class Comments implements Serializable {

	private static final long serialVersionUID = 6159141573480261518L;

	private List<Comment> data;
	
	private Paging paging;
	
	private int count;

	public List<Comment> getComments() {
		return data;
	}

	public void setComments(List<Comment> comments) {
		this.data = comments;
	}

	public Paging getPaging() {
		return paging;
	}

	public void setPaging(Paging paging) {
		this.paging = paging;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}