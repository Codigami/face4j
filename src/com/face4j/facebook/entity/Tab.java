package com.face4j.facebook.entity;

import java.io.Serializable;

import org.apache.commons.httpclient.NameValuePair;

import com.face4j.facebook.Facebook;
import com.face4j.facebook.exception.FacebookException;
import com.face4j.facebook.util.Constants;

public class Tab implements Serializable {

	private static final long serialVersionUID = -5637217913162746555L;

	private String id;
	private String name;
	private String link;
	private Application application;
	private String customName;
	private Boolean isPermanent;
	private Integer position;
	private Boolean isNonConnectionLandingTab;

	/**
	 * ID of the tab
	 * @return
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Name of the tab
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
	 * Link to the tab on Facebook
	 * 
	 * @return
	 */
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * The Application providing the tab
	 * @return
	 */
	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	/**
	 * The custom name of the tab. If this is not set, the name of the tab will be determined by the
	 * application.
	 * 
	 * @return
	 */
	public String getCustomName() {
		return customName;
	}

	public void setCustomName(String customName) {
		this.customName = customName;
	}

	/**
	 * Whether or not the tab is permanently installed
	 * 
	 * @return
	 */
	public Boolean getIsPermanent() {
		return isPermanent;
	}

	public void setIsPermanent(Boolean isPermanent) {
		this.isPermanent = isPermanent;
	}

	/**
	 * The order in which the tab appears on the Page's profile
	 * @return
	 */
	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	/**
	 * Whether this is the default landing tab for users who have not liked and are not admins of this
	 * Page
	 * 
	 * @return
	 */
	public Boolean getIsNonConnectionLandingTab() {
		return isNonConnectionLandingTab;
	}

	public void setIsNonConnectionLandingTab(Boolean isNonConnectionLandingTab) {
		this.isNonConnectionLandingTab = isNonConnectionLandingTab;
	}
	
	/**
	 * You can read the tabs for a Page by issuing an HTTP GET to /PAGE_ID/tabs with a Page Access
	 * Token.
	 * 
	 * You can also retrieve specific tabs by issuing an HTTP GET to /PAGE_ID/tabs/TAB_ID. For certain
	 * common tabs, TAB_ID is a plain text string such as events, info, notes, photos, reviews, wall.
	 * 
	 * @param pageId
	 * @param tabId
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Tab getTab(String pageId, String tabId, Facebook facebook) throws FacebookException {
		NameValuePair[] nameValuePairs = { new NameValuePair(Constants.PARAM_ACCESS_TOKEN, facebook.getAuthAccessToken().getAccessToken()) };
		return facebook.pullData(Constants.FACEBOOK_GRAPH_URL + "/" + pageId + "/tabs/"+tabId, Tab.class, nameValuePairs);
	}

}