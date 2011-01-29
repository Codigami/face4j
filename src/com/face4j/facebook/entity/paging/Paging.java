package com.face4j.facebook.entity.paging;

import java.io.Serializable;

public class Paging implements Serializable {

	private static final long serialVersionUID = -651546762478603035L;

	private String previous;
	private String next;

	/**
	 * URL that would fetch the previous records
	 * @return
	 */
	public String getPrevious() {
		return previous;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	/**
	 * URL that would fetch the next records
	 * @return
	 */
	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}



}