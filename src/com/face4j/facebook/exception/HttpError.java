package com.face4j.facebook.exception;

import java.io.Serializable;

public class HttpError implements Serializable{

	private static final long serialVersionUID = 9049536955072324924L;
	
	private GenericError error;

	public GenericError getError() {
		return error;
	}
	
}
