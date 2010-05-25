package com.face4j.facebook.exception;

public class FacebookException extends Exception {

	private static final long serialVersionUID = -3433466538055836949L;
	
  private int statusCode;

  public FacebookException(String msg) {
      super(msg);
  }

  public FacebookException(Exception exception) {
      super(exception);
  }

  public FacebookException(String msg, int statusCode) {
      super(msg);
      this.statusCode = statusCode;
  }

  public FacebookException(String msg, Exception exception) {
      super(msg, exception);
  }

  public FacebookException(String msg, Exception exception, int statusCode) {
      super(msg, exception);
      this.statusCode = statusCode;

  }

  public int getStatusCode() {
      return this.statusCode;
  }


}
