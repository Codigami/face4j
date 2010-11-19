package com.face4j.facebook.entity;

import java.io.Serializable;

import com.face4j.facebook.enums.PictureType;
import com.face4j.facebook.util.URLMaker;

public class User implements Serializable{
	
	private static final long serialVersionUID = -7351804744720611823L;

	private long id;	

	private String firstName;	

	private String lastName;	

	private String name;	

	private String link;	

	private String about;	

	private String birthday;	

	private Work[] work;	

	private Education[] education;	

	private String email;	

	private String website;
	
	private Hometown hometown;
	
	/**
	 * The user's ID
	 */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	/**
	 * The user's first name
	 */
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * The user's last name
	 */
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * The user's full name
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * A link to the user's profile
	 */
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	/**
	 * The user's birthday. Format is MM/dd/yyyy . Can also be MM/dd (facebook let's users decide whether they want to display the date or no).
	 * Users can also opt to keep their birthday private. In this case, even if you have access to a users birthday, you will not be able to access it.
	 */
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	/**
	 * The proxied or contact email address granted by the user
	 */
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * A link to the user's personal website
	 */
	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Hometown getHometown() {
		return hometown;
	}

	public void setHometown(Hometown hometown) {
		this.hometown = hometown;
	}


	/**
	 * A list of the work history from the user's profile
	 */
	public Work[] getWork() {
		return work;
	}

	public void setWork(Work[] work) {
		this.work = work;
	}

	/**
	 * A list of the education history from the user's profile
	 */
	public Education[] getEducation() {
		return education;
	}

	public void setEducation(Education[] education) {
		this.education = education;
	}

	/**
	 * Returns the default image profile pic url of a user
	 * @return
	 */
	public String getPictureURL() {
		return URLMaker.getImageURL(this.id);
	}
	
	/**
	 * Returns the url along with a param that indicates the size of the pic
	 * @param pictureType
	 * @return
	 */
	public String getPictureURL(PictureType pictureType) {
		return URLMaker.getImageURL(this.id, pictureType);
	}

	
}