package com.face4j.facebook.exception;

public class FacebookException extends Exception {

	private static final long serialVersionUID = -3433466538055836949L;
	
 // private int statusCode;
  private FacebookError error;

  public FacebookException(String msg) {
      super(msg);
  }

  public FacebookException(Exception exception) {
      super(exception);
  }

 /* public FacebookException(String msg, int statusCode) {
      super(msg);
      this.statusCode = statusCode;
  }*/

  public FacebookException(String msg, Exception exception) {
      super(msg, exception);
  }

 /* public FacebookException(String msg, Exception exception, int statusCode) {
      super(msg, exception);
      this.statusCode = statusCode;

  }*/

  public FacebookException(FacebookError error) {
		super();
		this.error = error;
	}

/*	public int getStatusCode() {
      return this.statusCode;
  }*/

	public FacebookError getError() {
		return error;
	}

	public void setError(FacebookError error) {
		this.error = error;
	}
	
	


}
