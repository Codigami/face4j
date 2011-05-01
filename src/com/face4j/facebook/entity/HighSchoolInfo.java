package com.face4j.facebook.entity;

import java.io.Serializable;

/**
 * The users high school name
 * @author nischal
 *
 */
public class HighSchoolInfo implements Serializable{

	private static final long serialVersionUID = 8475787099273936725L;
	
	private String hs1Name;
  private String hs2Name;
	
  public String getHs1Name() {
		return hs1Name;
	}
	public void setHs1Name(String hs1Name) {
		this.hs1Name = hs1Name;
	}
	public String getHs2Name() {
		return hs2Name;
	}
	public void setHs2Name(String hs2Name) {
		this.hs2Name = hs2Name;
	} 

  
  
  
}
