package com.xxx.exception;

/*
 * 1.编译时异常
 * 2.运行时异常
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
