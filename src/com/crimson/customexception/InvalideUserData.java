package com.crimson.customexception;

public class InvalideUserData extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3911931819925757506L;
	
	public InvalideUserData(String msg){
		super(msg);
	}
}
