package com.ipop;

public class InSufficientFundException extends RuntimeException {
	private String message;
	public InSufficientFundException(String message)
	{
		super(message);
	}
	

}
