package org.bhagya.mart.service.impl;

public class InvalidInputException  extends Exception
{
	private String errordetails;
	
	public InvalidInputException(String reason, String errorDetails) {
		super(reason);
		this.errordetails = errorDetails;
	}
}
