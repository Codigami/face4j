package com.face4j.facebook.enums;

public enum Paging {

	/**
	 * The number of records you want to receive
	 */
	LIMIT("limit"),

	/**
	 * The position where to start retrieving records from
	 */
	OFFSET("offset"),

	/**
	 * a unix timestamp or any date accepted by 
	 * <a href="http://php.net/manual/en/function.strtotime.php">strtotime</a>
	 */
	UNTIL("until"),

	/**
	 * a unix timestamp or any date accepted by 
	 * <a href="http://php.net/manual/en/function.strtotime.php">strtotime</a>
	 */
	SINCE("since");

	private String type;

	private Paging(String param) {
		this.type = param;
	}

	@Override
	public String toString() {
		return this.type;
	}

}
