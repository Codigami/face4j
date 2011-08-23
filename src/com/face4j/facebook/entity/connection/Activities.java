package com.face4j.facebook.entity.connection;

import java.io.Serializable;
import java.util.List;

import com.face4j.facebook.Facebook;
import com.face4j.facebook.entity.Activity;
import com.face4j.facebook.entity.paging.Paging;
import com.face4j.facebook.exception.FacebookException;

public class Activities implements Serializable {

	private static final long serialVersionUID = 3254351243791870237L;

	private List<Activity> data;
	private Paging paging;

	public List<Activity> getData() {
		return data;
	}

	public void setData(List<Activity> data) {
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
	/*public Activities getPrevious(Facebook facebook) throws FacebookException {
		if (paging != null && paging.getPrevious() != null) {
			return facebook.pullData(this.paging.getPrevious(), Activities.class, null);
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
	/*public Activities getNext(Facebook facebook) throws FacebookException {
		if (paging != null && paging.getNext() != null) {
			return facebook.pullData(this.paging.getNext(), Activities.class, null);
		}
		return null;
	}*/

	
}
