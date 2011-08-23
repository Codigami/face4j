package com.face4j.facebook.entity.connection;

import java.io.Serializable;
import java.util.List;

import com.face4j.facebook.entity.Album;
import com.face4j.facebook.entity.paging.Paging;

/**
 * The photo albums the user has created
 * 
 * @author nischal
 *
 */
public class Albums implements Serializable {

	private static final long serialVersionUID = 8762761271222848428L;

	private List<Album> data;
	private Paging paging;

	public List<Album> getData() {
		return data;
	}

	public void setData(List<Album> data) {
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
/*	public Albums getPrevious(Facebook facebook) throws FacebookException {
		if (paging != null && paging.getPrevious() != null) {
			return facebook.pullData(this.paging.getPrevious(), Albums.class, null);
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
/*	public Albums getNext(Facebook facebook) throws FacebookException {
		if (paging != null && paging.getNext() != null) {
			return facebook.pullData(this.paging.getNext(), Albums.class, null);
		}
		return null;
	}*/

}
