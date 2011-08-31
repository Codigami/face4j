package com.face4j.facebook.entity.paging;

import java.io.Serializable;

import org.apache.commons.httpclient.NameValuePair;

public class Paging implements Serializable {

	private static final long serialVersionUID = -651546762478603035L;

	private String next;
	private String previous;
	private int limit = -1;
	private String until;
	private String since;
	private int offset = -1;
	
	
	public enum PagingParam {

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

		private PagingParam(String param) {
			this.type = param;
		}

		@Override
		public String toString() {
			return this.type;
		}

	}
	

	public int getLimit() {
		// Please note that this method is being used as part of reflection. If you rename this method
		// be sure to do a string search for "getLimit" and replace with the new name accordingly
		extractValue();
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	/**
	 * Use this to receive older updates.
	 * @return
	 */
	public String getUntil() {
		extractValue();
		return until;
	}

	public void setUntil(String until) {
		this.until = until;
	}

	/**
	 * Use this to get new updates. Updates after the ones you have already pulled
	 * @return
	 */
	public String getSince() {
		extractValue();
		return since;
	}

	public void setSince(String since) {
		this.since = since;
	}
	
	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public static int pagingElementCount(Paging paging){
			int size = 0;
			if(paging.getLimit() > -1){
				size++;
			}
			
			if(paging.getSince() != null){
				size++;
			}
			
			if(paging.getUntil() != null){
				size++;
			}
			
			if(paging.getOffset() > -1){
				size++;
			}
			
			return size;
	}
	
	public static void addNameValuePairs(Paging paging, NameValuePair[] nameValuePairs){
		int i = 0;
		
		if(paging.getLimit() > -1){
			nameValuePairs[i] = new NameValuePair(Paging.PagingParam.LIMIT.toString(),""+paging.getLimit());
			i++;
		}
		
		if(paging.getSince() != null){
			nameValuePairs[i] = new NameValuePair(Paging.PagingParam.SINCE.toString(),""+paging.getSince());
			i++;
		}
		
		if(paging.getUntil() != null){
			nameValuePairs[i] = new NameValuePair(Paging.PagingParam.UNTIL.toString(),""+paging.getUntil());
			i++;
		}
		
		if(paging.getOffset() > -1){
			nameValuePairs[i] = new NameValuePair(Paging.PagingParam.OFFSET.toString(),""+paging.getOffset());
			i++;
		}
	}
	
	/**
	 * We extract paging params from the next and previous URLs sent by facebook
	 */
	private void extractValue(){
		String[] tempSlit = null;
		String[] paramSplit = null;
		
		if(next!= null){
			tempSlit = next.split("\\?");
			paramSplit = null;
			if(tempSlit.length > 1){
				paramSplit = tempSlit[1].split("\\&");
			}
			
			for(String string : paramSplit){
				if(string.contains(PagingParam.LIMIT.toString()) && string.length() > 1){
					limit = Integer.parseInt(string.split("=")[1]);
				}
				if(string.contains(PagingParam.UNTIL.toString()) && string.length() > 1){
					until = string.split("=")[1];
				}
				if(string.contains(PagingParam.OFFSET.toString()) && string.length() > 1){
					offset = Integer.parseInt(string.split("=")[1]);
				}
			}
			next = null;
		}
		
		if(previous != null){
			tempSlit = previous.split("\\?");
			paramSplit = null;
			
			if(tempSlit.length > 1){
				paramSplit = tempSlit[1].split("\\&");
			}
			
			for(String string : paramSplit){
				if(string.contains(PagingParam.SINCE.toString()) && string.length() > 1){
					since = string.split("=")[1];
				}
			}
			
			previous = null;
		}
		
	}

}