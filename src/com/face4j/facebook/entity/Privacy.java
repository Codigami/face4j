package com.face4j.facebook.entity;

import java.io.Serializable;

import com.face4j.facebook.enums.Friends;
import com.face4j.facebook.enums.Value;

public class Privacy implements Serializable{

	private static final long serialVersionUID = 7258483404711070333L;
	
	private Value value;
	private Friends friends;
	private String networks;
	private String allow;
	private String deny;

}
