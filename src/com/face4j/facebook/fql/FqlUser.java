package com.face4j.facebook.fql;

import java.io.Serializable;

import com.face4j.facebook.entity.HighSchoolInfo;
import com.face4j.facebook.entity.Location;
import com.face4j.facebook.fql.otherentities.FqlEducation;
import com.face4j.facebook.fql.otherentities.FqlWork;

/**
 * Query this table to return detailed information from a user's profile. If you need user
 * information for analytic purposes, query the <b>standard_user_info</b> table instead.
 * 
 * <b>Note:</b> You can cache this data and subscribe to <a href="http://developers.facebook.com/docs/api/realtime"> real time updates</a> 
 * on any of its fields which are also fields in the corresponding <a href="http://developers.facebook.com/docs/reference/api/user">Graph API version</a>.
 * 
 * Note: Facebook user information that the user selects from a combo box (for example, ''sex'' or ''relationship_status'') 
 * may get returned as a localized string.
 * 
 * @author nischal
 * 
 */
public class FqlUser implements Serializable{

	private static final long serialVersionUID = -2950810037827498463L;
	
	private String uid, firstName, middleName, lastName, name, picSmall, picBig, picSquare, pic;
	private String[] affiliations;
	private long profileUpdateTime;
	private String timeZone, religion, birthday, birthdayDate, sex;
	private Location[] hometownLocation;
	private String[] meetingSex;
	private String[] meetingFor;
	private String relationshipStatus, significantOtherId, political;
	private Location[] currentLocation;
	private String activities, interests;
	private Boolean isAppUser;
	private String music, tv, movies, books, quotes, aboutMe;
	private HighSchoolInfo[] hs_info;
	private FqlEducation[] educationHistory;
	private FqlWork[] workHistory;
	private Integer notesCount;
	private Integer wallCount;
	private String status;
	private Boolean hasAddedApp;
	private String onlinePresence, locale, proxiedEmail, profileUrl;
	private String[] emailHashes;
	private String picSmallWithLogo, picBigWithLogo, picSquareWithLogo, picWithLogo, allowedRestrictions;
	private Boolean verified;
	private String profileBlurb;
	//private String[] family;
	private String username, website;
	private Boolean isBlocked;
	private String contactEmail, email, thirdPartyId;
	
	/**
	 * The user ID of the user being queried.
	 * @return
	 */
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	/**
	 * The first name of the user being queried.
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * The middle name of the user being queried.
	 * @return
	 */
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	/**
	 * The last name of the user being queried.
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * The full name of the user being queried.
	 * @return
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * The URL to the small-sized profile picture for the user being queried. The image can have a
	 * maximum width of 50px and a maximum height of 150px. This URL may be blank.
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
	 * The URL to the largest-sized profile picture for the user being queried. The image can have a
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
	 * The URL to the square profile picture for the user being queried. The image can have a maximum
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
	 * The URL to the medium-sized profile picture for the user being queried. The image can have a
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
	 * The networks to which the user being queried belongs. The status field within this field will
	 * only return results in English.
	 * 
	 * @return
	 */
	public String[] getAffiliations() {
		return affiliations;
	}
	public void setAffiliations(String[] affiliations) {
		this.affiliations = affiliations;
	}
	
	/**
	 * The time the profile of the user being queried was most recently updated. If the user's profile
	 * has not been updated in the past three days, this value will be 0.
	 * 
	 * @return
	 */
	public long getProfileUpdateTime() {
		return profileUpdateTime;
	}
	public void setProfileUpdateTime(long profileUpdateTime) {
		this.profileUpdateTime = profileUpdateTime;
	}
	
	/**
	 * The time zone where the user being queried is located.
	 * @return
	 */
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	
	/**
	 * The religion of the user being queried.
	 * @return
	 */
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	
	/**
	 * The birthday of the user being queried. The format of this date varies based on the user's
	 * locale.
	 * 
	 * @return
	 */
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	/**
	 * The birthday of the user being queried, rendered as a machine-readable string. The format of
	 * this date never changes.
	 * 
	 * @return
	 */
	public String getBirthdayDate() {
		return birthdayDate;
	}
	public void setBirthdayDate(String birthdayDate) {
		this.birthdayDate = birthdayDate;
	}
	
	/**
	 * The gender of the user being queried. This field will only return results in English.
	 * @return
	 */
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	/**
	 * The home town (and state) of the user being queried.
	 * @return
	 */
	public Location[] getHometownLocation() {
		return hometownLocation;
	}
	public void setHometownLocation(Location[] hometownLocation) {
		this.hometownLocation = hometownLocation;
	}
	
	/**
	 * A list of the genders the person the user being queried wants to meet.
	 * @return
	 */
	public String[] getMeetingSex() {
		return meetingSex;
	}
	public void setMeetingSex(String[] meetingSex) {
		this.meetingSex = meetingSex;
	}
	
	/**
	 * A list of the reasons the user being queried wants to meet someone.
	 * @return
	 */
	public String[] getMeetingFor() {
		return meetingFor;
	}
	public void setMeetingFor(String[] meetingFor) {
		this.meetingFor = meetingFor;
	}
	
	/**
	 * The type of relationship for the user being queried. This field will only return results in English.
	 * @return
	 */
	public String getRelationshipStatus() {
		return relationshipStatus;
	}
	public void setRelationshipStatus(String relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}
	
	/**
	 * The user ID of the partner (for example, husband, wife, boyfriend, girlfriend) of the user being queried.
	 * @return
	 */
	public String getSignificantOtherId() {
		return significantOtherId;
	}
	public void setSignificantOtherId(String significantOtherId) {
		this.significantOtherId = significantOtherId;
	}
	
	/**
	 * The political views of the user being queried.
	 * @return
	 */
	public String getPolitical() {
		return political;
	}
	public void setPolitical(String political) {
		this.political = political;
	}
	
	/**
	 * The current location of the user being queried.
	 * @return
	 */
	public Location[] getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(Location[] currentLocation) {
		this.currentLocation = currentLocation;
	}
	
	/**
	 * The activities of the user being queried.
	 * @return
	 */
	public String getActivities() {
		return activities;
	}
	public void setActivities(String activities) {
		this.activities = activities;
	}
	
	/**
	 * The interests of the user being queried.
	 * @return
	 */
	public String getInterests() {
		return interests;
	}
	public void setInterests(String interests) {
		this.interests = interests;
	}
	
	/**
	 * Indicates whether the user being queried has logged in to the current application.
	 * @return
	 */
	public Boolean getIsAppUser() {
		return isAppUser;
	}
	public void setIsAppUser(Boolean isAppUser) {
		this.isAppUser = isAppUser;
	}
	
	/**
	 * The favorite music of the user being queried.
	 * @return
	 */
	public String getMusic() {
		return music;
	}
	public void setMusic(String music) {
		this.music = music;
	}
	
	/**
	 * The favorite television shows of the user being queried.
	 * @return
	 */
	public String getTv() {
		return tv;
	}
	public void setTv(String tv) {
		this.tv = tv;
	}
	
	/**
	 * The favorite movies of the user being queried.
	 * @return
	 */
	public String getMovies() {
		return movies;
	}
	public void setMovies(String movies) {
		this.movies = movies;
	}
	
	/**
	 * The favorite books of the user being queried.
	 * @return
	 */
	public String getBooks() {
		return books;
	}
	public void setBooks(String books) {
		this.books = books;
	}
	
	/**
	 * The favorite quotes of the user being queried.
	 * @return
	 */
	public String getQuotes() {
		return quotes;
	}
	public void setQuotes(String quotes) {
		this.quotes = quotes;
	}
	
	/**
	 * More information about the user being queried.
	 * @return
	 */
	public String getAboutMe() {
		return aboutMe;
	}
	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
	
	/**
	 * Information about high school of the user being queried.
	 * @return
	 */
	public HighSchoolInfo[] getHs_info() {
		return hs_info;
	}
	public void setHs_info(HighSchoolInfo[] hs_info) {
		this.hs_info = hs_info;
	}
	
	/**
	 * Post-high school information for the user being queried.
	 * @return
	 */
	public FqlEducation[] getEducationHistory() {
		return educationHistory;
	}
	public void setEducationHistory(FqlEducation[] educationHistory) {
		this.educationHistory = educationHistory;
	}
	
	/**
	 * The work history of the user being queried.
	 * @return
	 */
	public FqlWork[] getWorkHistory() {
		return workHistory;
	}
	public void setWorkHistory(FqlWork[] workHistory) {
		this.workHistory = workHistory;
	}
	
	/**
	 * The number of notes created by the user being queried.
	 * @return
	 */
	public Integer getNotesCount() {
		return notesCount;
	}
	public void setNotesCount(Integer notesCount) {
		this.notesCount = notesCount;
	}
	
	/**
	 * The number of Wall posts for the user being queried.
	 * @return
	 */
	public Integer getWallCount() {
		return wallCount;
	}
	public void setWallCount(Integer wallCount) {
		this.wallCount = wallCount;
	}
	
	/**
	 * The current status of the user being queried.
	 * @return
	 */
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 * Deprecated. This value is now equivalent to is_app_user.
	 * @return
	 */
	@Deprecated
	public Boolean getHasAddedApp() {
		return hasAddedApp;
	}
	
	@Deprecated
	public void setHasAddedApp(Boolean hasAddedApp) {
		this.hasAddedApp = hasAddedApp;
	}
	
	/**
	 * The user's Facebook Chat status. Returns a string, one of active, idle, offline, or error (when
	 * Facebook can't determine presence information on the server side). The query does not return
	 * the user's Facebook Chat status when that information is restricted for privacy reasons.
	 * 
	 * @return
	 */
	public String getOnlinePresence() {
		return onlinePresence;
	}
	public void setOnlinePresence(String onlinePresence) {
		this.onlinePresence = onlinePresence;
	}
	
	/**
	 * The two-letter language code and the two-letter country code representing the user's locale.
	 * Country codes are taken from the <a href=
	 * "http://www.iso.org/iso/country_codes/iso_3166_code_lists/english_country_names_and_code_elements.htm"
	 * >ISO 3166 alpha 2 code</a> list.
	 * 
	 * @return
	 */
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	
	/**
	 * The proxied wrapper for a user's email address. If the user shared a proxied email address
	 * instead of his or her primary email address with you, this address also appears in the email
	 * field (see above). Facebook recommends you query the email field to get the email address
	 * shared with your application.
	 * 
	 * @return
	 */
	public String getProxiedEmail() {
		return proxiedEmail;
	}
	public void setProxiedEmail(String proxiedEmail) {
		this.proxiedEmail = proxiedEmail;
	}
	
	/**
	 * The URL to a user's profile. If the user specified a username for his or her profile,
	 * profile_url contains the username.
	 * 
	 * @return
	 */
	public String getProfileUrl() {
		return profileUrl;
	}
	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}
	
	/**
	 * An array containing a set of confirmed email hashes for the user. Emails are registered via the
	 * <a href="http://developers.facebook.com/docs/reference/fql/rest/connect.registerUsers">connect.
	 * registerUsers</a> API call and are only confirmed when the user adds your application. The
	 * format of each email hash is the crc32 and md5 hashes of the email address combined with an
	 * underscore (_).
	 * 
	 * @return
	 */
	public String[] getEmailHashes() {
		return emailHashes;
	}
	public void setEmailHashes(String[] emailHashes) {
		this.emailHashes = emailHashes;
	}
	
	/**
	 * The URL to the small-sized profile picture for the user being queried. The image can have a
	 * maximum width of 50px and a maximum height of 150px, and is overlaid with the Facebook favicon.
	 * This URL may be blank.
	 * 
	 * @return
	 */
	public String getPicSmallWithLogo() {
		return picSmallWithLogo;
	}
	public void setPicSmallWithLogo(String picSmallWithLogo) {
		this.picSmallWithLogo = picSmallWithLogo;
	}
	
	/**
	 * The URL to the largest-sized profile picture for the user being queried. The image can have a
	 * maximum width of 200px and a maximum height of 600px, and is overlaid with the Facebook
	 * favicon. This URL may be blank.
	 * 
	 * @return
	 */
	public String getPicBigWithLogo() {
		return picBigWithLogo;
	}
	public void setPicBigWithLogo(String picBigWithLogo) {
		this.picBigWithLogo = picBigWithLogo;
	}
	
	/**
	 * The URL to the square profile picture for the user being queried. The image can have a maximum
	 * width and height of 50px, and is overlaid with the Facebook favicon. This URL may be blank.
	 * 
	 * @return
	 */
	public String getPicSquareWithLogo() {
		return picSquareWithLogo;
	}
	public void setPicSquareWithLogo(String picSquareWithLogo) {
		this.picSquareWithLogo = picSquareWithLogo;
	}
	
	/**
	 * The URL to the medium-sized profile picture for the user being queried. The image can have a
	 * maximum width of 100px and a maximum height of 300px, and is overlaid with the Facebook
	 * favicon. This URL may be blank.
	 * 
	 * @return
	 */
	public String getPicWithLogo() {
		return picWithLogo;
	}
	public void setPicWithLogo(String picWithLogo) {
		this.picWithLogo = picWithLogo;
	}
	
	/**
	 * A comma-delimited list of <a
	 * href="http://developers.facebook.com/docs/reference/rest/admin.setRestrictionInfo">Demographic
	 * Restrictions</a> types a user is allowed to access. Currently, alcohol is the only type that
	 * can get returned.
	 * 
	 * @return
	 */
	public String getAllowedRestrictions() {
		return allowedRestrictions;
	}
	public void setAllowedRestrictions(String allowedRestrictions) {
		this.allowedRestrictions = allowedRestrictions;
	}
	
	/**
	 * Indicates whether or not Facebook has verified the user.
	 * @return
	 */
	public Boolean getVerified() {
		return verified;
	}
	public void setVerified(Boolean verified) {
		this.verified = verified;
	}
	
	/**
	 * This string contains the contents of the text box under a user's profile picture.
	 * @return
	 */
	public String getProfileBlurb() {
		return profileBlurb;
	}
	public void setProfileBlurb(String profileBlurb) {
		this.profileBlurb = profileBlurb;
	}
	
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
	 * @return
	 */
	/*public String[] getFamily() {
		return family;
	}
	public void setFamily(String[] family) {
		this.family = family;
	}*/
	
	/**
	 * The username of the user being queried.
	 * @return
	 */
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * The website of the user being queried.
	 * @return
	 */
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
	/**
	 * Returns true if the user is blocked to the viewer/logged in user.
	 * @return
	 */
	public Boolean getIsBlocked() {
		return isBlocked;
	}
	public void setIsBlocked(Boolean isBlocked) {
		this.isBlocked = isBlocked;
	}
	
	/**
	 * A string containing the user's primary Facebook email address. If the user shared his or her
	 * primary email address with you, this address also appears in the email field (see below).
	 * Facebook recommends you query the email field to get the email address shared with your
	 * application.
	 * 
	 * @return
	 */
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	
	/**
	 * A string containing the user's primary Facebook email address or the user's proxied email
	 * address, whichever address the user granted your application. Facebook recommends you query
	 * this field to get the email address shared with your application.
	 * 
	 * @return
	 */
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * A string containing an anonymous, but unique identifier for the user. You can use this
	 * identifier with third-parties.
	 * 
	 * @return
	 */
	public String getThirdPartyId() {
		return thirdPartyId;
	}
	public void setThirdPartyId(String thirdPartyId) {
		this.thirdPartyId = thirdPartyId;
	}
	
}