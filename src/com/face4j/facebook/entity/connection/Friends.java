package com.face4j.facebook.entity.connection;

import java.io.Serializable;
import java.util.List;

import com.face4j.facebook.Facebook;
import com.face4j.facebook.entity.Friend;
import com.face4j.facebook.entity.paging.Paging;
import com.face4j.facebook.exception.FacebookException;

public class Friends implements Serializable {

	private static final long serialVersionUID = 3632989220535898299L;

	private List<Friend> data;
	private Paging paging;

	public List<Friend> getData() {
		return data;
	}

	public void setData(List<Friend> data) {
		this.data = data;
	}

	public Paging getPaging() {
		return paging;
	}

	public void setPaging(Paging paging) {
		this.paging = paging;
	}
	
	/**
	 * Returns paginated records. This will be a fresh http request to facebook.
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Friends getPrevious(Facebook facebook) throws FacebookException {
		if (paging != null && paging.getPrevious() != null) {
			return facebook.pullData(this.paging.getPrevious(), Friends.class, null);
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
	public Friends getNext(Facebook facebook) throws FacebookException {
		if (paging != null && paging.getNext() != null) {
			return facebook.pullData(this.paging.getNext(), Friends.class, null);
		}
		return null;
	}

}
