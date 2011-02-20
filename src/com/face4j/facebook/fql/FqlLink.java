package com.face4j.facebook.fql;

import java.io.Serializable;

public class FqlLink implements Serializable {

	private static final long serialVersionUID = -1839804026627098560L;

	private long linkId;
	private long owner;
	private String ownerComment;
	private String createdTime;
	private String title;
	private String summary;
	private String url;
	private String[] imageUrls;

	/**
	 * The unique identifier for the link.
	 * 
	 * @return
	 */
	public long getLinkId() {
		return linkId;
	}

	/**
	 * The unique identifier for the link.
	 * 
	 * @param linkId
	 */
	public void setLinkId(long linkId) {
		this.linkId = linkId;
	}

	/**
	 * The user ID for the user who posted the link.
	 * 
	 * @return
	 */
	public long getOwner() {
		return owner;
	}

	/**
	 * The user ID for the user who posted the link.
	 * 
	 * @param owner
	 */
	public void setOwner(long owner) {
		this.owner = owner;
	}

	/**
	 * The comment the owner made about the link.
	 * 
	 * @return
	 */
	public String getOwnerComment() {
		return ownerComment;
	}

	/**
	 * The comment the owner made about the link.
	 * 
	 * @param ownerComment
	 */
	public void setOwnerComment(String ownerComment) {
		this.ownerComment = ownerComment;
	}

	/**
	 * The time the user posted the link.
	 * 
	 * @return
	 */
	public String getCreatedTime() {
		return createdTime;
	}

	/**
	 * The time the user posted the link.
	 * 
	 * @param createdTime
	 */
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * The title of the link, as taken from the site's title meta tag.
	 * 
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * The title of the link, as taken from the site's title meta tag.
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * A summary of the link, as taken from the site's description meta tag.
	 * 
	 * @return
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * A summary of the link, as taken from the site's description meta tag.
	 * 
	 * @param summary
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

	/**
	 * The actual URL for the link.
	 * 
	 * @return
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * The actual URL for the link.
	 * 
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * The URLs to the images associated with the link, as taken from the site's link tag.
	 * 
	 * @return
	 */
	public String[] getImageUrls() {
		return imageUrls;
	}

	/**
	 * The URLs to the images associated with the link, as taken from the site's link tag.
	 * 
	 * @param imageUrls
	 */
	public void setImageUrls(String[] imageUrls) {
		this.imageUrls = imageUrls;
	}

}
