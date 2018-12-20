package com.example.demo.springretry.exception;

public class RemoteServiceNotAvailableException extends RuntimeException{

	public RemoteServiceNotAvailableException(String string) {
		super(string);
	}

}
