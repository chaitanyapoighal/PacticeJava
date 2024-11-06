package com.anudip.adv;

public class InsufficientFundException extends Exception {
	String msg;

	public InsufficientFundException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	

}
