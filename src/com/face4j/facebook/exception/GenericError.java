package com.face4j.facebook.exception;

import java.io.Serializable;

public class GenericError implements Serializable {

	private static final long serialVersionUID = -2035588433968167176L;

	private String type;
	private String message;

	public String getType() {
		return type;
	}

	public String getMessage() {
		return message;
	}

}
