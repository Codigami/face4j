package com.face4j.facebook.exception;

public class FacebookException extends Exception {

	private static final long serialVersionUID = -3433466538055836949L;
  private FacebookError error;

  public FacebookException(String msg, Exception exception) {
      super(msg, exception);
  }

  public FacebookException(FacebookError error) {
		super();
		this.error = error;
	}

	public FacebookError getError() {
		return error;
	}

	public void setError(FacebookError error) {
		this.error = error;
	}
	
	@Override
	public String getMessage() {
		return (this.getError() == null) ? super.getMessage() : this.getError().getErrorMsg();
	}
	
	@Override
	public String getLocalizedMessage() {
		return this.getMessage();
	}

}