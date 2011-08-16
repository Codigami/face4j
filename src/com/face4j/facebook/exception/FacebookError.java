package com.face4j.facebook.exception;

import java.io.Serializable;

public class FacebookError implements Serializable {

	private static final long serialVersionUID = -1069090066662240990L;

	private int errorCode;
	private String errorMsg;
	private RequestArg[] requestArgs;

	/* Keeping a no args constructor*/
	private FacebookError() {
		super();
	}

	public FacebookError(int errorCode, String errorMsg, RequestArg[] requestArgs) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.requestArgs = requestArgs;
	}



	public int getErrorCode() {
		return errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public RequestArg[] getRequestArgs() {
		return requestArgs;
	}

}
