package com.face4j.facebook;

import java.io.Serializable;

public class OAuthAccessToken implements Serializable {
	
	private static final long serialVersionUID = 8716928752207365362L;
	
	private String accessToken;
	private Long expires;
	
	public OAuthAccessToken(String accessToken){
		this.accessToken = accessToken;
	}

	/**
	 * The access token as obtained from facebook. 
	 * @return
	 */
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * Returns the expires time. null value represents the token doesn't expire meaning its long-lived
	 * @return
	 */
	public Long getExpires() {
		return expires;
	}

	/**
	 * Set the expires time. In case the token is long-lived set null
	 * @param expires
	 */
	public void setExpires(Long expires) {
		this.expires = expires;
	}

}
