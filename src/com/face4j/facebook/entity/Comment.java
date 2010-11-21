package com.face4j.facebook.entity;

import java.io.Serializable;

public class Comment implements Serializable{

	private static final long serialVersionUID = -8695663867766108720L;
	
	private String id;
	private From from;
	private String message;
	private String createdTime;

}
