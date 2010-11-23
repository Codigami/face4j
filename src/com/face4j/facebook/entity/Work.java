package com.face4j.facebook.entity;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Work implements Serializable{

	private static final long serialVersionUID = -2524534086097442175L;
	
	private Employer employer;
	
	private Location location;
	
	private Position position; 
	
	private String startDate; //date format returned by facebook is yyyy-MM
	
	private String endDate; //date format returned by facebook is yyyy-MM

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public Date getStartDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
		Date date = null;
		if(this.startDate!=null){
			try {
				date = dateFormat.parse(this.startDate);
			} catch (ParseException e) {
			}
		}
		return date;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
		Date date = null;
		if(this.endDate!=null){
			try {
				date = dateFormat.parse(this.endDate);
			} catch (ParseException e) {
			}
		}
		return date;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	

}
