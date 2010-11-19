package com.face4j.facebook.entity;

import java.io.Serializable;

public class Education implements Serializable{
	
	private static final long serialVersionUID = -3907283366668849023L;

	private School school;
	
	private Degree degree;
	
	private Year year;
	
	private Concentration[] concentrations;

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Degree getDegree() {
		return degree;
	}

	public void setDegree(Degree degree) {
		this.degree = degree;
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public Concentration[] getConcentrations() {
		return concentrations;
	}

	public void setConcentrations(Concentration[] concentrations) {
		this.concentrations = concentrations;
	}
	
}