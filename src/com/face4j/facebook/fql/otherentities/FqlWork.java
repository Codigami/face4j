package com.face4j.facebook.fql.otherentities;

import java.io.Serializable;

import com.face4j.facebook.entity.Location;

public class FqlWork implements Serializable{
	
	private static final long serialVersionUID = -6005677063075759971L;
	
	private Location location;
	private String companyName;
	private String position;
	private String description;
	private String startDate;
	private String endDate;
	
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	
	

}
