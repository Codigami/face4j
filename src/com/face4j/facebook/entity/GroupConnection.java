package com.face4j.facebook.entity;

import java.io.Serializable;

/**
 * Used mostly as part of the data obtained from "groups" connection
 * @author nischal
 *
 */
public class GroupConnection implements Serializable {

	private static final long serialVersionUID = 658460804944644185L;

	private Integer version;
	private String name;
	private String id;
	private Boolean administrator;
	private Long bookmarkOrder;

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Boolean getAdministrator() {
		return administrator;
	}

	public void setAdministrator(Boolean administrator) {
		this.administrator = administrator;
	}

	public Long getBookmarkOrder() {
		return bookmarkOrder;
	}

	public void setBookmarkOrder(Long bookmarkOrder) {
		this.bookmarkOrder = bookmarkOrder;
	}

}
