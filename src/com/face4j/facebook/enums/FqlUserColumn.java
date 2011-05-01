package com.face4j.facebook.enums;


public enum FqlUserColumn {

	/**
	 * The user ID of the user being queried.
	 */
	UID("uid"),

	/**
	 * The first name of the user being queried.
	 * 
	 * 
	 */
	FIRST_NAME("first_name"),

	/**
	 * The middle name of the user being queried.
	 * 
	 */
	MIDDLE_NAME("middle_name"),

	/**
	 * The last name of the user being queried.
	 * 
	 */
	LAST_NAME("last_name"),

	/**
	 * The full name of the user being queried.
	 * 
	 */
	NAME("name"),

	/**
	 * The URL to the small-sized profile picture for the user being queried. The image can have a
	 * maximum width of 50px and a maximum height of 150px. This URL may be blank.
	 * 
	 * 
	 */
	PIC_SMALL("pic_small"),

	/**
	 * The URL to the largest-sized profile picture for the user being queried. The image can have a
	 * maximum width of 200px and a maximum height of 600px. This URL may be blank.
	 * 
	 * 
	 */
	PIC_BIG("pic_big"),

	/**
	 * The URL to the square profile picture for the user being queried. The image can have a maximum
	 * width and height of 50px. This URL may be blank.
	 * 
	 * 
	 */
	PIC_SQUARE("pic_square"),

	/**
	 * The URL to the medium-sized profile picture for the user being queried. The image can have a
	 * maximum width of 100px and a maximum height of 300px. This URL may be blank.
	 * 
	 * 
	 */
	PIC("pic"),

	/**
	 * The networks to which the user being queried belongs. The status field within this field will
	 * only return results in English.
	 * 
	 * 
	 */
	AFFILIATIONS("affiliations"),

	/**
	 * The time the profile of the user being queried was most recently updated. If the user's profile
	 * has not been updated in the past three days, this value will be 0.
	 * 
	 * 
	 */
	PROFILE_UPDATE_TIME("profile_update_time"),

	/**
	 * The time zone where the user being queried is located.
	 * 
	 */
	TIME_ZONE("timezone"),

	/**
	 * The religion of the user being queried.
	 * 
	 */
	RELIGION("religion"),

	/**
	 * The birthday of the user being queried. The format of this date varies based on the user's
	 * locale.
	 * 
	 * 
	 */
	BIRTHDAY("birthday"),

	/**
	 * The birthday of the user being queried, rendered as a machine-readable string. The format of
	 * this date never changes.
	 * 
	 * 
	 */
	BIRTHDAY_DATE("birthday_date"),

	/**
	 * The gender of the user being queried. This field will only return results in English.
	 * 
	 */
	SEX("sex"),

	/**
	 * The home town (and state) of the user being queried.
	 * 
	 */
	HOMETOWN_LOCATION("hometown_location"),

	/**
	 * A list of the genders the person the user being queried wants to meet.
	 * 
	 */
	MEETING_SEX("meeting_sex"),

	/**
	 * A list of the reasons the user being queried wants to meet someone.
	 * 
	 */
	MEETING_FOR("meeting_for"),

	/**
	 * The type of relationship for the user being queried. This field will only return results in
	 * English.
	 * 
	 */
	RELATIONSHIP_STATUS("relationship_status"),

	/**
	 * The user ID of the partner (for example, husband, wife, boyfriend, girlfriend) of the user
	 * being queried.
	 * 
	 */
	SIGNIFICANT_OTHER_ID("significant_other_id"),

	/**
	 * The political views of the user being queried.
	 * 
	 */
	POLITICAL("political"),

	/**
	 * The current location of the user being queried.
	 * 
	 */
	CURRENT_LOCATION("current_location"),

	/**
	 * The activities of the user being queried.
	 * 
	 */
	ACTIVITIES("activities"),

	/**
	 * The interests of the user being queried.
	 * 
	 */
	INTERESTS("interests"),

	/**
	 * Indicates whether the user being queried has logged in to the current application.
	 * 
	 */
	IS_APP_USER("is_app_user"),

	/**
	 * The favorite music of the user being queried.
	 * 
	 */
	MUSIC("music"),

	/**
	 * The favorite television shows of the user being queried.
	 * 
	 */
	TV("tv"),

	/**
	 * The favorite movies of the user being queried.
	 * 
	 */
	MOVIES("movies"),

	/**
	 * The favorite books of the user being queried.
	 * 
	 */
	BOOKS("books"),

	/**
	 * The favorite quotes of the user being queried.
	 * 
	 */
	QUOTES("quotes"),

	/**
	 * More information about the user being queried.
	 * 
	 */
	ABOUTME("about_me"),

	/**
	 * Information about high school of the user being queried.
	 * 
	 */
	HS_INFO("hs_info"),

	/**
	 * Post-high school information for the user being queried.
	 * 
	 */
	EDUCATION_HISTORY("education_history"),

	/**
	 * The work history of the user being queried.
	 * 
	 */
	WORK_HISTORY("work_history"),

	/**
	 * The number of notes created by the user being queried.
	 * 
	 */
	NOTES_COUNT("notes_count"),

	/**
	 * The number of Wall posts for the user being queried.
	 * 
	 */
	WALL_COUNT("wall_count"),

	/**
	 * The current status of the user being queried.
	 * 
	 */
	STATUS("status"),

	/**
	 * Deprecated. This value is now equivalent to is_app_user.
	 * 
	 */
	@Deprecated
	HAS_ADDED_APP("has_added_app"),

	/**
	 * The user's Facebook Chat status. Returns a string, one of active, idle, offline, or error (when
	 * Facebook can't determine presence information on the server side). The query does not return
	 * the user's Facebook Chat status when that information is restricted for privacy reasons.
	 * 
	 * 
	 */
	ONLINE_PRESENCE("online_presence"),

	/**
	 * The two-letter language code and the two-letter country code representing the user's locale.
	 * Country codes are taken from the <a href=
	 * "http://www.iso.org/iso/country_codes/iso_3166_code_lists/english_country_names_and_code_elements.htm"
	 * >ISO 3166 alpha 2 code</a> list.
	 * 
	 * 
	 */
	LOCALE("locale"),

	/**
	 * The proxied wrapper for a user's email address. If the user shared a proxied email address
	 * instead of his or her primary email address with you, this address also appears in the email
	 * field (see above). Facebook recommends you query the email field to get the email address
	 * shared with your application.
	 * 
	 * 
	 */
	PROXIED_EMAIL("proxied_email"),

	/**
	 * The URL to a user's profile. If the user specified a username for his or her profile,
	 * profile_url contains the username.
	 * 
	 * 
	 */
	PROFILE_URL("profile_url"),

	/**
	 * An array containing a set of confirmed email hashes for the user. Emails are registered via the
	 * <a href="http://developers.facebook.com/docs/reference/fql/rest/connect.registerUsers">connect.
	 * registerUsers</a> API call and are only confirmed when the user adds your application. The
	 * format of each email hash is the crc32 and md5 hashes of the email address combined with an
	 * underscore (_).
	 * 
	 * 
	 */
	EMAIL_HASHES("email_hashes"),

	/**
	 * The URL to the small-sized profile picture for the user being queried. The image can have a
	 * maximum width of 50px and a maximum height of 150px, and is overlaid with the Facebook favicon.
	 * This URL may be blank.
	 * 
	 * 
	 */
	PIC_SMALL_WITH_LOGO("pic_small_with_logo"),

	/**
	 * The URL to the largest-sized profile picture for the user being queried. The image can have a
	 * maximum width of 200px and a maximum height of 600px, and is overlaid with the Facebook
	 * favicon. This URL may be blank.
	 * 
	 * 
	 */
	PIC_BIG_WITH_LOGO("pic_big_with_logo"),

	/**
	 * The URL to the square profile picture for the user being queried. The image can have a maximum
	 * width and height of 50px, and is overlaid with the Facebook favicon. This URL may be blank.
	 * 
	 * 
	 */
	PIC_SQUARE_WITH_LOGO("pic_square_with_logo"),

	/**
	 * The URL to the medium-sized profile picture for the user being queried. The image can have a
	 * maximum width of 100px and a maximum height of 300px, and is overlaid with the Facebook
	 * favicon. This URL may be blank.
	 * 
	 * 
	 */
	PIC_WITH_LOGO("pic_with_logo"),

	/**
	 * A comma-delimited list of <a
	 * href="http://developers.facebook.com/docs/reference/rest/admin.setRestrictionInfo">Demographic
	 * Restrictions</a> types a user is allowed to access. Currently, alcohol is the only type that
	 * can get returned.
	 * 
	 * 
	 */
	ALLOWED_RESTRICTIONS("allowed_restrictions"),

	/**
	 * Indicates whether or not Facebook has verified the user.
	 * 
	 */
	VERIFIED("verified"),

	/**
	 * This string contains the contents of the text box under a user's profile picture.
	 * 
	 */
	PROFILE_BLURB("profile_blurb"),

	/**
	 * <b>Note:</b> For family information, you should query the <a
	 * href="http://developers.facebook.com/docs/reference/fql/user/family">family</a> FQL table
	 * instead.
	 * 
	 * This array contains a series of entries for the immediate relatives of the user being queried.
	 * Each entry is also an array containing the following fields:
	 * <ul>
	 * <li>relationship -- A string describing the type of relationship. Can be one of parent, mother,
	 * father, sibling, sister, brother, child, son, daughter.</li>
	 * <li>uid (optional) -- The user ID of the relative, which gets displayed if the account is
	 * linked to (confirmed by) another account. If the relative did not confirm the relationship, the
	 * name appears instead.</li>
	 * <li>name (optional) -- The name of the relative, which could be text the user entered. If the
	 * relative confirmed the relationship, the uid appears instead.</li>
	 * <li>birthday -- If the relative is a child, this is the birthday the user entered.</li>
	 * </ul>
	 * 
	 * <b>Note:</b> At this time, you cannot query for a specific relationship (like SELECT family
	 * FROM user WHERE family.relationship = 'daughter' AND uid = '$x'); you'll have to query on the
	 * family field and filter the results yourself.
	 * 
	 * 
	 */
	FAMILY("family"),

	/**
	 * The username of the user being queried.
	 * 
	 */
	USERNAME("username"),

	/**
	 * The website of the user being queried.
	 * 
	 */
	WEBSITE("website"),

	/**
	 * Returns true if the user is blocked to the viewer/logged in user.
	 * 
	 */
	IS_BLOCKED("is_blocked"),

	/**
	 * A string containing the user's primary Facebook email address. If the user shared his or her
	 * primary email address with you, this address also appears in the email field (see below).
	 * Facebook recommends you query the email field to get the email address shared with your
	 * application.
	 * 
	 * 
	 */
	CONTACT_EMAIL("contact_email"),

	/**
	 * A string containing the user's primary Facebook email address or the user's proxied email
	 * address, whichever address the user granted your application. Facebook recommends you query
	 * this field to get the email address shared with your application.
	 * 
	 * 
	 */
	EMAIL("email"),

	/**
	 * A string containing an anonymous, but unique identifier for the user. You can use this
	 * identifier with third-parties.
	 * 
	 * 
	 */
	THIRD_PARTY_ID("third_party_id");

	private String columnName;

	private FqlUserColumn(String columnName) {
		this.columnName = columnName;
	}

	@Override
	public String toString() {
		return this.columnName;
	}

}