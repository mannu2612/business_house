package com.thoughtworks.business_house.exception;

public class InsufficientAmountException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientAmountException() {
		super("Insufficient Amount in wallet");
	}
	public InsufficientAmountException(int balance ) {
		super("Insufficient Amount in wallet. You have: "+balance+"Rs");
	}

}
