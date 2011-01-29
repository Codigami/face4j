package com.face4j.facebook.entity.connection;

import java.io.Serializable;
import java.util.List;

import com.face4j.facebook.Facebook;
import com.face4j.facebook.entity.Data;
import com.face4j.facebook.entity.paging.Paging;
import com.face4j.facebook.exception.FacebookException;

public class Likes implements Serializable {
	
	private static final long serialVersionUID = -6153401161460620827L;

	private List<Data> data;
	private Paging paging;

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

	/**
	 * Returns paginated records. This will be a fresh http request to facebook.
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Likes getNext(Facebook facebook) throws FacebookException {
		if (paging != null && paging.getNext() != null) {
			Likes likes = facebook.pullData(this.paging.getNext(), Likes.class, null);

			return likes;
		}
		return null;
	}

	/**
	 * Returns paginated records. This will be a fresh http request to facebook.
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Likes getPrevious(Facebook facebook) throws FacebookException {
		if (paging != null && paging.getPrevious() != null) {
			return facebook.pullData(this.paging.getPrevious(), Likes.class, null);
		}
		return null;
	}
	
}