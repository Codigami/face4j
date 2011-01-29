package com.face4j.facebook.entity;

import java.io.Serializable;

/**
 * Location and language restrictions for Page posts only
 * Object containing comma separated lists of valid country , city , region and locale
 * @author nischal
 *
 */
public class Targeting implements Serializable {

	private static final long serialVersionUID = -627945174221808274L;
	
	private String locale;
	
	private String region;
	
	private String city;
	
	private String country;

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}