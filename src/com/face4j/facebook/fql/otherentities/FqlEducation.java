package com.face4j.facebook.fql.otherentities;

import java.io.Serializable;

public class FqlEducation implements Serializable{

	private static final long serialVersionUID = -4898735344887552625L;
	
	private String name;
	private String year;
	private String[] concentrations;
	private String degree;
	private String schoolType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String[] getConcentrations() {
		return concentrations;
	}
	public void setConcentrations(String[] concentrations) {
		this.concentrations = concentrations;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getSchoolType() {
		return schoolType;
	}
	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}
	
	
	

}
