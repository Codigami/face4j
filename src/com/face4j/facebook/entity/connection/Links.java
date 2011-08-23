package com.face4j.facebook.entity.connection;

import java.io.Serializable;
import java.util.List;

import com.face4j.facebook.entity.Link;
import com.face4j.facebook.entity.paging.Paging;

public class Links implements Serializable {

	private static final long serialVersionUID = -6640984586358978758L;

	private List<Link> data;
	private Paging paging;

	public List<Link> getData() {
		return data;
	}

	public void setData(List<Link> data) {
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
	/*public Links getPrevious(Facebook facebook) throws FacebookException {
		if (paging != null && paging.getPrevious() != null) {
			return facebook.pullData(this.paging.getPrevious(), Links.class, null);
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
	/*public Links getNext(Facebook facebook) throws FacebookException {
		if (paging != null && paging.getNext() != null) {
			return facebook.pullData(this.paging.getNext(), Links.class, null);
		}
		return null;
	}*/

}