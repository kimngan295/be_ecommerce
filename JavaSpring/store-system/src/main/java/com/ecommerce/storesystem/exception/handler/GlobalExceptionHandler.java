package com.ecommerce.storesystem.exception.handler;

import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ecommerce.storesystem.dto.DataResponse;
import com.ecommerce.storesystem.exception.AccountException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public DataResponse handleRuntimeException(RuntimeException e) {
		return new DataResponse("400", e.getMessage());
	}

	@ExceptionHandler(AccountException.class)
	@ResponseBody
	public DataResponse handleAccountException(AccountException e) {
		return new DataResponse("400", e.getMessage());
	}
	
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	@ResponseBody
	public DataResponse handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
		return new DataResponse("404","Please change method type");
	}


}