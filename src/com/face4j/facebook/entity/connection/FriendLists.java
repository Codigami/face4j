package com.face4j.facebook.entity.connection;

import java.io.Serializable;
import java.util.List;

import com.face4j.facebook.entity.GenericEntity;
import com.face4j.facebook.entity.paging.Paging;

public class FriendLists implements Serializable {

	private static final long serialVersionUID = 3632989220535898299L;

	private List<GenericEntity> data;
	private Paging paging;

	public List<GenericEntity> getData() {
		return data;
	}

	public void setData(List<GenericEntity> data) {
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
	/*public FriendLists getPrevious(Facebook facebook) throws FacebookException {
		if (paging != null && paging.getPrevious() != null) {
			return facebook.pullData(this.paging.getPrevious(), FriendLists.class, null);
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
	/*public FriendLists getNext(Facebook facebook) throws FacebookException {
		if (paging != null && paging.getNext() != null) {
			return facebook.pullData(this.paging.getNext(), FriendLists.class, null);
		}
		return null;
	}*/

}
