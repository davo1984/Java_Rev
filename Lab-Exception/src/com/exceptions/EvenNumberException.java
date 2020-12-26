package com.exceptions;

public class EvenNumberException extends Exception {
	
	@Override
	public String getMessage() {
		return "You aren't allowed to input an even number.\nWe just don't like them.";
	}
}
