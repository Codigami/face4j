package com.face4j.facebook.entity.connection;

import java.io.Serializable;
import java.util.List;

import com.face4j.facebook.Facebook;
import com.face4j.facebook.entity.Comment;
import com.face4j.facebook.entity.paging.Paging;
import com.face4j.facebook.exception.FacebookException;

public class Comments implements Serializable {

	private static final long serialVersionUID = 6159141573480261518L;

	private List<Comment> data;
	
	private Paging paging;

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

	/**
	 * Returns paginated records. This will be a fresh http request to facebook.
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Comments getPrevious(Facebook facebook) throws FacebookException {
		if (paging != null && paging.getPrevious() != null) {
			return facebook.pullData(this.paging.getPrevious(), Comments.class, null);
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
	public Comments getNext(Facebook facebook) throws FacebookException {
		if (paging != null && paging.getNext() != null) {
			return facebook.pullData(this.paging.getNext(), Comments.class, null);
		}
		return null;
	}


}