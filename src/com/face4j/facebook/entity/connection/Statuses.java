package com.face4j.facebook.entity.connection;

import java.io.Serializable;
import java.util.List;

import com.face4j.facebook.entity.StatusMessage;
import com.face4j.facebook.entity.paging.Paging;

/**
 * The user's status updates
 * 
 * @author nischal
 *
 */
public class Statuses implements Serializable {

	private static final long serialVersionUID = 38820141787516072L;

	private List<StatusMessage> data;
	private Paging paging;

	public List<StatusMessage> getData() {
		return data;
	}

	public void setData(List<StatusMessage> data) {
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
	/*public Statuses getPrevious(Facebook facebook) throws FacebookException {
		if (paging != null && paging.getPrevious() != null) {
			return facebook.pullData(this.paging.getPrevious(), Statuses.class, null);
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
	/*public Statuses getNext(Facebook facebook) throws FacebookException {
		if (paging != null && paging.getNext() != null) {
			return facebook.pullData(this.paging.getNext(), Statuses.class, null);
		}
		return null;
	}*/

}
