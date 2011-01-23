package com.face4j.facebook.fql;

import java.io.Serializable;
import java.util.Date;

public class FqlConnection implements Serializable {

	private static final long serialVersionUID = -8839423043672880179L;
	
	private Long sourceId;
	private Long targetId;
	private String targetType;
	private Boolean isFollowing;
	private Date updatedTime;
	private Boolean isDeleted;
	
	
	
	/**
	 * @return The ID of the user, the source of the connection.
	 */
	public Long getSourceId() {
		return sourceId;
	}
	
	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
	}
	
	/**
	 * 
	 * @return The target(s) of the connection. 
	 * The ID of the friend or Facebook Page with whom the specified user is either a friend or fan/supporter.
	 */
	public Long getTargetId() {
		return targetId;
	}
	public void setTargetId(Long targetId) {
		this.targetId = targetId;
	}
	
	/**
	 * @return Indicates whether the target is a user or a page.
	 */
	public String getTargetType() {
		return targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}
	
	/**
	 * @return Indicates whether the source is connected to the target Page (for example, if the source is a supporter or fan).
	 */
	public Boolean getIsFollowing() {
		return isFollowing;
	}
	public void setIsFollowing(Boolean isFollowing) {
		this.isFollowing = isFollowing;
	}
	
	/**
	 * @return The most recent time the connection was updated.
	 */
	public Date getUpdatedTime() {
		return updatedTime;
	}
	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}
	
	/**
	 * @return Indicates whether the source severed the connection.
	 */
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
}