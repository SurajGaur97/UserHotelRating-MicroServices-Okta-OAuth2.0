package com.lcwd.rating.exception;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException() {
		super("Resourse not found !!");
	}

	public ResourceNotFoundException(String message) {
		super(message);
	}

}
