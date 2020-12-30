package com.zup_it.zup_bank.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Recurso com "+ id +" não encontrado!!");
	}
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
