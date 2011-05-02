package com.face4j.facebook.entity;

import java.io.Serializable;
import java.util.List;

public class PermissionCheckData implements Serializable{
	
	private static final long serialVersionUID = -2752773701654243547L;
	
	private List<PermissionCheck> data;

	public List<PermissionCheck> getPermissions() {
		return data;
	}

	public void setPermissions(List<PermissionCheck> data) {
		this.data = data;
	}
	
	

}
