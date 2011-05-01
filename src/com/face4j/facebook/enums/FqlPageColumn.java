package com.face4j.facebook.enums;

public enum FqlPageColumn {

	/**
	 * The ID of the Page being queried.
	 */
	PAGE_ID("page_id"),

	/**
	 * The name of the Page being queried.
	 */
	NAME("name"),

	/**
	 * The URL to the small-sized picture for the Page being queried. The image can have a maximum
	 * width of 50px and a maximum height of 150px. This URL may be blank.
	 */
	PIC_SMALL("pic_small"),

	/**
	 * The URL to the large-sized profile picture for the Page being queried. The image can have a
	 * maximum width of 200px and a maximum height of 600px. This URL may be blank.
	 */
	PIC_BIG("pic_big"),

	/**
	 * The URL to the square profile picture for the Page being queried. The image can have a maximum
	 * width and height of 50px. This URL may be blank.
	 */
	PIC_SQUARE("pic_square"),

	/**
	 * The URL to the medium-sized profile picture for the Page being queried. The image can have a
	 * maximum width of 100px and a maximum height of 300px. This URL may be blank.
	 */
	PIC("pic"),

	/**
	 * The URL to the largest-sized profile picture for the Page being queried. The image can have a
	 * maximum width of 396px and a maximum height of 1188px. This URL may be blank.
	 */
	PIC_LARGE("pic_large"),

	/**
	 * The profile URL for the Page being queried. If the Page admin specified a username for the
	 * Page, page_url contains the username.
	 */
	PAGE_URL("page_url"),

	/**
	 * The number of people who like the Page.
	 */
	FAN_COUNT("fan_count"),

	/**
	 * The type of Page being queried.
	 */
	TYPE("type"),

	/**
	 * The URL to the Web site of of the Page being queried.
	 */
	WEBSITE("website"),

	/**
	 * Indicates whether a calling application has been added by the Page being queried.
	 */
	HAS_ADDED_APP("has_added_app"),

	/**
	 * The date when the subject of the Page being queried was founded. This field may be blank.
	 */
	FOUNDED("founded"),

	/**
	 * Summary of the subject of the Page being queried. This field may be blank.
	 */
	COMPANY_OVERVIEW("company_overview"),

	/**
	 * The mission statement of the organization that is the subject of the Page being queried. This
	 * field may be blank.
	 */
	MISSION("mission"),

	/**
	 * The products offered by the company on the Page being queried. This field may be blank.
	 */
	PRODUCTS("products"),

	/**
	 * The location of the Page being queried, including the street, city, state, country and zip (or
	 * post code). Some of the fields may be blank.
	 */
	LOCATION("location"),

	/**
	 * The type of parking available at the location of the Page being queried.
	 */
	PARKING("parking"),

	/**
	 * The type of public transportation available near the location of the Page being queried. This
	 * field may be blank.
	 */
	PUBLIC_TRANSIT("public_transit"),

	/**
	 * The hours of operation for the Page being queried.
	 */
	HOURS("hours");

	private String columnName;

	private FqlPageColumn(String columnName) {
		this.columnName = columnName;
	}

	@Override
	public String toString() {
		return this.columnName;
	}
	
}
