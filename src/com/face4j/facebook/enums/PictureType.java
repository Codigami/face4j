package com.face4j.facebook.enums;

public enum PictureType {
	
	/**
	 * The url would return a 50X50 image
	 */
	SQUARE("square"), 
	
	/**
	 * The url would return an image 50 pixels wide and of variable height
	 */
	SMALL("small"),
	
	NORMAL("normal"), 
	
	/**
	 * The url would return an image 200 pixels wide and of variable height
	 */
	LARGE("large");

	private String type;
	
	private PictureType(String type){
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
	
	
}
