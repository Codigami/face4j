package com.face4j.facebook.entity;

import java.io.Serializable;

public class Tag implements Serializable{

	private static final long serialVersionUID = -3068313933507191893L;
	
	/**
	 * Id of the user tagged
	 */
	private String id;
	
	/**
	 * Name of the tagged user
	 */
	private String name;
	
	/**
	 *  the x coordinate is the percentage from the left of the photo
	 */
	private Float x;
	
	/**
	 *  the y coordinate is the percentage from the top edge of the photo
	 */
	private Float y;
	
	private String createdTime;

	/**
	 * Id of the user tagged
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 * Id of the user tagged
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Name of the tagged user
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Name of the tagged user
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * the x coordinate is the percentage from the left of the photo
	 * @return
	 */
	public Float getX() {
		return x;
	}

	/**
	 * the x coordinate is the percentage from the left of the photo
	 * @param x
	 */
	public void setX(Float x) {
		this.x = x;
	}

	/**
	 * the y coordinate is the percentage from the top edge of the photo
	 * @return
	 */
	public Float getY() {
		return y;
	}

	/**
	 * the y coordinate is the percentage from the top edge of the photo
	 * @param y
	 */
	public void setY(Float y) {
		this.y = y;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}
}