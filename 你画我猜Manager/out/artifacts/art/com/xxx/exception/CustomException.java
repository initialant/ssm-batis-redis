package com.xxx.exception;

/*
 * 1.����ʱ�쳣
 * 2.����ʱ�쳣
 * 
 */
public class CustomException extends Exception {

	public String message;

	public CustomException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
