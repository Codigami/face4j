package com.face4j.facebook.enums;

public enum TargetType {
	
	USER("user"), PAGE("page");
	
	private String targetName;
	
	private TargetType(String targetName){
		this.targetName = targetName;
	}
	
	@Override
	public String toString() {
		return this.targetName;
	}

}
