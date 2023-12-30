package com.lcwd.user.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException() {
		super("Resource not found on Server !!");
	}
	
	public ResourceNotFoundException(String message) {
		super(message);
	}

}
