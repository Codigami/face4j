package com.face4j.facebook.entity;

import com.face4j.facebook.OAuthAccessToken;
import com.face4j.facebook.http.APICallerInterface;

public interface Entity {

	/**
	 * Needed in order to pull in any connections of an object
	 * @param oAuthAccessToken
	 * @return
	 */
	public void setOAuthAccessToken(OAuthAccessToken oAuthAccessToken);
	
	public void setApiCallerInterface(APICallerInterface apiCallerInterface);

}
