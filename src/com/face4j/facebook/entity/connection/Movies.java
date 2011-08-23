package com.face4j.facebook.entity.connection;

import java.io.Serializable;
import java.util.List;

import com.face4j.facebook.entity.MovieConnection;
import com.face4j.facebook.entity.paging.Paging;

public class Movies implements Serializable {

	private static final long serialVersionUID = 919725428342498775L;

	private List<MovieConnection> data;
	private Paging paging;

	public List<MovieConnection> getData() {
		return data;
	}

	public void setData(List<MovieConnection> data) {
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
	/*public Movies getPrevious(Facebook facebook) throws FacebookException {
		if (paging != null && paging.getPrevious() != null) {
			return facebook.pullData(this.paging.getPrevious(), Movies.class, null);
		}
		return null;
	}*/

	/**
	 * Returns paginated records. This will be a fresh http request to facebook.
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	/*public Movies getNext(Facebook facebook) throws FacebookException {
		if (paging != null && paging.getNext() != null) {
			return facebook.pullData(this.paging.getNext(), Movies.class, null);
		}
		return null;
	}*/

}
