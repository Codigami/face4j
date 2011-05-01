package com.face4j.facebook.wrapper;

import org.apache.commons.lang.StringUtils;

public class FqlPageColumnCriteria {
	
	private String[] pageIds;
	

	public String[] getPageIds() {
		return pageIds;
	}

	public void setPageIds(String[] pageIds) {
		this.pageIds = pageIds;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		if(this.pageIds!=null){
			sb.append("page_id in ("+StringUtils.join(this.pageIds, ",")+")");
		}
		
		return sb.toString();
	}
	
}