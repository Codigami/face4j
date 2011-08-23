package com.face4j.facebook.entity.connection;

import java.io.Serializable;
import java.util.List;

import com.face4j.facebook.entity.PokeConnection;
import com.face4j.facebook.entity.paging.Paging;

/**
 * The user's pokes
 * PERMISSION: read_mailbox
 * @author nischal
 *
 */
public class Pokes implements Serializable {

	private static final long serialVersionUID = -1932910578269111300L;

	private List<PokeConnection> data;
	private Paging paging;

	public List<PokeConnection> getData() {
		return data;
	}

	public void setData(List<PokeConnection> data) {
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
	/*public Pokes getPrevious(Facebook facebook) throws FacebookException {
		if (paging != null && paging.getPrevious() != null) {
			return facebook.pullData(this.paging.getPrevious(), Pokes.class, null);
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
	/*public Pokes getNext(Facebook facebook) throws FacebookException {
		if (paging != null && paging.getNext() != null) {
			return facebook.pullData(this.paging.getNext(), Pokes.class, null);
		}
		return null;
	}*/

}
