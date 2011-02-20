package com.face4j.facebook.fql;

import java.io.Serializable;

public class FqlPhoto implements Serializable {

	private static final long serialVersionUID = 437573063304055381L;

	private String aid;
	private String pid;
	private String fbid;
	private long owner;
	private long index;
	private int width;
	private int height;
	private String srcSmall;
	private String srcSmallHeight;
	private String srcSmallWidth;
	private String srcBig;
	private String srcBigHeight;
	private String srcBigWidth;
	private String src;
	private String srcHeight;
	private String srcWidth;
	private String link;
	private String caption;
	private String created;
	private String modified;
	private long objectId;

	/**
	 * The ID of the album containing the photo being queried. The aid cannot be longer than 50 characters. <br>
	 * Note: Because the aid is a string, you should always wrap the aid in quotes when referenced in a query. The aid is
	 * unique only for a given user.
	 * 
	 * @return
	 */
	public String getAid() {
		return aid;
	}

	/**
	 * The ID of the album containing the photo being queried. The aid cannot be longer than 50 characters. <br>
	 * Note: Because the aid is a string, you should always wrap the aid in quotes when referenced in a query. The aid is
	 * unique only for a given user.
	 * 
	 * @param aid
	 */
	public void setAid(String aid) {
		this.aid = aid;
	}

	/**
	 * The ID of the photo being queried. The pid cannot be longer than 50 characters. <br>
	 * Note: Because the pid is a string, you should always wrap the pid in quotes when referenced in a query. The pid is
	 * unique only for a given user.
	 * 
	 * @return
	 */
	public String getPid() {
		return pid;
	}

	/**
	 * The ID of the photo being queried. The pid cannot be longer than 50 characters. <br>
	 * Note: Because the pid is a string, you should always wrap the pid in quotes when referenced in a query. The pid is
	 * unique only for a given user.
	 * 
	 * @param pid
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getFbid() {
		return fbid;
	}

	public void setFbid(String fbid) {
		this.fbid = fbid;
	}

	/**
	 * The user ID of the owner of the photo being queried.
	 * 
	 * @return
	 */
	public long getOwner() {
		return owner;
	}

	/**
	 * The user ID of the owner of the photo being queried.
	 * 
	 * @param owner
	 */
	public void setOwner(long owner) {
		this.owner = owner;
	}

	public long getIndex() {
		return index;
	}

	public void setIndex(long index) {
		this.index = index;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * The URL to the thumbnail version of the photo being queried. The image can have a maximum width of 75px and a
	 * maximum height of 225px. This URL may be blank.
	 * 
	 * @return
	 */
	public String getSrcSmall() {
		return srcSmall;
	}

	/**
	 * The URL to the thumbnail version of the photo being queried. The image can have a maximum width of 75px and a
	 * maximum height of 225px. This URL may be blank.
	 * 
	 * @param srcSmall
	 */
	public void setSrcSmall(String srcSmall) {
		this.srcSmall = srcSmall;
	}

	/**
	 * Height of the thumbnail version, in px. This field may be blank.
	 * 
	 * @return
	 */
	public String getSrcSmallHeight() {
		return srcSmallHeight;
	}

	/**
	 * Height of the thumbnail version, in px. This field may be blank.
	 * 
	 * @param srcSmallHeight
	 */
	public void setSrcSmallHeight(String srcSmallHeight) {
		this.srcSmallHeight = srcSmallHeight;
	}

	/**
	 * Width of the thumbnail version, in px. This field may be blank.
	 * 
	 * @return
	 */
	public String getSrcSmallWidth() {
		return srcSmallWidth;
	}

	/**
	 * Width of the thumbnail version, in px. This field may be blank.
	 * 
	 * @param srcSmallWidth
	 */
	public void setSrcSmallWidth(String srcSmallWidth) {
		this.srcSmallWidth = srcSmallWidth;
	}

	/**
	 * The URL to the full-sized version of the photo being queried. The image can have a maximum width or height of
	 * 720px. This URL may be blank.
	 * 
	 * @return
	 */
	public String getSrcBig() {
		return srcBig;
	}

	/**
	 * The URL to the full-sized version of the photo being queried. The image can have a maximum width or height of
	 * 720px. This URL may be blank.
	 * 
	 * @param srcBig
	 */
	public void setSrcBig(String srcBig) {
		this.srcBig = srcBig;
	}

	/**
	 * Height of the full-sized version, in px. This field may be blank.
	 * 
	 * @return
	 */
	public String getSrcBigHeight() {
		return srcBigHeight;
	}

	/**
	 * Height of the full-sized version, in px. This field may be blank.
	 * 
	 * @param srcBigHeight
	 */
	public void setSrcBigHeight(String srcBigHeight) {
		this.srcBigHeight = srcBigHeight;
	}

	/**
	 * Width of the full-sized version, in px. This field may be blank.
	 * 
	 * @return
	 */
	public String getSrcBigWidth() {
		return srcBigWidth;
	}

	/**
	 * Width of the full-sized version, in px. This field may be blank.
	 * 
	 * @param srcBigWidth
	 */
	public void setSrcBigWidth(String srcBigWidth) {
		this.srcBigWidth = srcBigWidth;
	}

	/**
	 * The URL to the album view version of the photo being queried. The image can have a maximum width or height of
	 * 130px. This URL may be blank.
	 * 
	 * @return
	 */
	public String getSrc() {
		return src;
	}

	/**
	 * The URL to the album view version of the photo being queried. The image can have a maximum width or height of
	 * 130px. This URL may be blank.
	 * 
	 * @param src
	 */
	public void setSrc(String src) {
		this.src = src;
	}

	/**
	 * Height of the album view version, in px. This field may be blank.
	 * 
	 * @return
	 */
	public String getSrcHeight() {
		return srcHeight;
	}

	/**
	 * Height of the album view version, in px. This field may be blank.
	 * 
	 * @param srcHeight
	 */
	public void setSrcHeight(String srcHeight) {
		this.srcHeight = srcHeight;
	}

	/**
	 * Width of the album view version, in px. This field may be blank.
	 * 
	 * @return
	 */
	public String getSrcWidth() {
		return srcWidth;
	}

	/**
	 * Width of the album view version, in px. This field may be blank.
	 * 
	 * @param srcWidth
	 */
	public void setSrcWidth(String srcWidth) {
		this.srcWidth = srcWidth;
	}

	/**
	 * The URL to the page containing the photo being queried.
	 * 
	 * @return
	 */
	public String getLink() {
		return link;
	}

	/**
	 * The URL to the page containing the photo being queried.
	 * 
	 * @param link
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * The caption for the photo being queried.
	 * 
	 * @return
	 */
	public String getCaption() {
		return caption;
	}

	/**
	 * The caption for the photo being queried.
	 * 
	 * @param caption
	 */
	public void setCaption(String caption) {
		this.caption = caption;
	}

	/**
	 * The date when the photo being queried was added.
	 * 
	 * @return
	 */
	public String getCreated() {
		return created;
	}

	/**
	 * The date when the photo being queried was added.
	 * 
	 * @param created
	 */
	public void setCreated(String created) {
		this.created = created;
	}

	/**
	 * The date when the photo being queried was last modified.
	 * 
	 * @return
	 */
	public String getModified() {
		return modified;
	}

	/**
	 * The date when the photo being queried was last modified.
	 * 
	 * @param modified
	 */
	public void setModified(String modified) {
		this.modified = modified;
	}

	/**
	 * The object_id of a photo on Facebook. Use the object_id to let users comment on a photo with the Comments API.
	 * 
	 * @return
	 */
	public long getObjectId() {
		return objectId;
	}

	/**
	 * The object_id of a photo on Facebook. Use the object_id to let users comment on a photo with the Comments API.
	 * 
	 * @param objectId
	 */
	public void setObjectId(long objectId) {
		this.objectId = objectId;
	}

}