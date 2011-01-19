package com.face4j.facebook.criteria;

import com.face4j.facebook.enums.TargetType;

public class ConnectionColumnCriteria {
	
	private TargetType targetType;
	private Integer limit;
	private Integer offset;
	
	public TargetType getTargetType() {
		return targetType;
	}

	public void setTargetType(TargetType targetType) {
		this.targetType = targetType;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	
}