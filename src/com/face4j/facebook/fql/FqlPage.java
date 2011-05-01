package com.face4j.facebook.fql;

import java.io.Serializable;

public class FqlPage implements Serializable {

	private static final long serialVersionUID = -5981395931401518658L;

	private String pageId, name, picSmall, picBig, picSquare, pic, picLarge, pageUrl;
	long fanCount;
	private String type, website;
	private Boolean hasAddedApp;
	private String founded, companyOverview, mission, products, location, parking, publicTransit, hours;

	/**
	 * The ID of the Page being queried.
	 * 
	 * @return
	 */
	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	/**
	 * The name of the Page being queried.
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The URL to the small-sized picture for the Page being queried. The image can have a maximum
	 * width of 50px and a maximum height of 150px. This URL may be blank.
	 * 
	 * @return
	 */
	public String getPicSmall() {
		return picSmall;
	}

	public void setPicSmall(String picSmall) {
		this.picSmall = picSmall;
	}

	/**
	 * The URL to the large-sized profile picture for the Page being queried. The image can have a
	 * maximum width of 200px and a maximum height of 600px. This URL may be blank.
	 * 
	 * @return
	 */
	public String getPicBig() {
		return picBig;
	}

	public void setPicBig(String picBig) {
		this.picBig = picBig;
	}

	/**
	 * The URL to the square profile picture for the Page being queried. The image can have a maximum
	 * width and height of 50px. This URL may be blank.
	 * 
	 * @return
	 */
	public String getPicSquare() {
		return picSquare;
	}

	public void setPicSquare(String picSquare) {
		this.picSquare = picSquare;
	}

	/**
	 * The URL to the medium-sized profile picture for the Page being queried. The image can have a
	 * maximum width of 100px and a maximum height of 300px. This URL may be blank.
	 * 
	 * @return
	 */
	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	/**
	 * The URL to the largest-sized profile picture for the Page being queried. The image can have a
	 * maximum width of 396px and a maximum height of 1188px. This URL may be blank.
	 * 
	 * @return
	 */
	public String getPicLarge() {
		return picLarge;
	}

	public void setPicLarge(String picLarge) {
		this.picLarge = picLarge;
	}

	/**
	 * The profile URL for the Page being queried. If the Page admin specified a username for the
	 * Page, page_url contains the username.
	 * 
	 * @return
	 */
	public String getPageUrl() {
		return pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	/**
	 * The number of people who like the Page.
	 * 
	 * @return
	 */
	public long getFanCount() {
		return fanCount;
	}

	public void setFanCount(long fanCount) {
		this.fanCount = fanCount;
	}

	/**
	 * The type of Page being queried.
	 * 
	 * @return
	 */
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * The URL to the Web site of of the Page being queried.
	 * 
	 * @return
	 */
	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	/**
	 * Indicates whether a calling application has been added by the Page being queried.
	 * 
	 * @return
	 */
	public Boolean getHasAddedApp() {
		return hasAddedApp;
	}

	public void setHasAddedApp(Boolean hasAddedApp) {
		this.hasAddedApp = hasAddedApp;
	}

	/**
	 * The date when the subject of the Page being queried was founded. This field may be blank.
	 * 
	 * @return
	 */
	public String getFounded() {
		return founded;
	}

	public void setFounded(String founded) {
		this.founded = founded;
	}

	/**
	 * Summary of the subject of the Page being queried. This field may be blank.
	 * 
	 * @return
	 */
	public String getCompanyOverview() {
		return companyOverview;
	}

	public void setCompanyOverview(String companyOverview) {
		this.companyOverview = companyOverview;
	}

	/**
	 * The mission statement of the organization that is the subject of the Page being queried. This
	 * field may be blank.
	 * 
	 * @return
	 */
	public String getMission() {
		return mission;
	}

	public void setMission(String mission) {
		this.mission = mission;
	}

	/**
	 * The products offered by the company on the Page being queried. This field may be blank.
	 * 
	 * @return
	 */
	public String getProducts() {
		return products;
	}

	public void setProducts(String products) {
		this.products = products;
	}

	/**
	 * The location of the Page being queried, including the street, city, state, country and zip (or
	 * post code). Some of the fields may be blank.
	 * 
	 * @return
	 */
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * The type of parking available at the location of the Page being queried.
	 * 
	 * @return
	 */
	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	/**
	 * The type of public transportation available near the location of the Page being queried. This
	 * field may be blank.
	 * 
	 * @return
	 */
	public String getPublicTransit() {
		return publicTransit;
	}

	public void setPublicTransit(String publicTransit) {
		this.publicTransit = publicTransit;
	}

	/**
	 * The hours of operation for the Page being queried.
	 * 
	 * @return
	 */
	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

}