package com.ecommerce.storesystem.exception;

public class AccountException  extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public AccountException(String errorMessage) {
		super(errorMessage);
	}
	
}
