package com.app.Exception;

public class VaccineNotFoundException extends RuntimeException {
    
	String message;
	
	public VaccineNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	
	public VaccineNotFoundException(String message) {
        super(message);
    }
}

