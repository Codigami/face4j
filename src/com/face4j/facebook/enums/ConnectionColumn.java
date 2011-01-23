package com.face4j.facebook.enums;

public enum ConnectionColumn {
	
	/**
	 * The ID of the user, the source of the connection.
	 */
	SOURCE_ID("source_id"),
	
	/**
	 * The target(s) of the connection. 
	 * The ID of the friend or Facebook Page with whom the specified user is either a friend or fan/supporter.
	 */
	TARGET_ID("target_id"),
	
	/**
	 * Indicates whether the target is a user or a page. 
	 */
	TARGET_TYPE("target_type"),
	
	/**
	 * Indicates whether the source is connected to the target Page (for example, if the source is a supporter or fan).
	 */
	IS_FOLLOWING("is_following"),
	
	/**
	 * The most recent time the connection was updated.
	 */
	UPDATED_TIME("updated_time"),
	
	/**
	 * Indicates whether the source severed the connection.
	 */
	IS_DELETED("is_deleted");
	
	private String columnName;
	
	private ConnectionColumn(String columnName){
		this.columnName = columnName;
	}
	
	@Override
	public String toString() {
		return this.columnName;
	}

}
