package com.face4j.facebook.wrapper;

import org.apache.commons.lang.StringUtils;

public class FqlUserColumnCriteria {
	
	private String[] uids;

	public String[] getUids() {
		return uids;
	}

	public void setUids(String[] uids) {
		this.uids = uids;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		if(this.uids!=null){
			sb.append("uid in ("+StringUtils.join(this.uids, ",")+")");
		}
		
		return sb.toString();
	}
	
	

}
