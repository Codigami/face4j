package com.face4j.facebook.fql;

import java.io.Serializable;

public class FqlActionLink implements Serializable {

	private static final long serialVersionUID = -7866665872301140264L;

	private String text;
	private String href;

	/**
	 * Text of a link
	 * 
	 * @return
	 */
	public String getText() {
		return text;
	}

	/**
	 * Text of a link
	 * 
	 * @param text
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * URL
	 * 
	 * @return
	 */
	public String getHref() {
		return href;
	}

	/**
	 * URL
	 * 
	 * @param href
	 */
	public void setHref(String href) {
		this.href = href;
	}

}
