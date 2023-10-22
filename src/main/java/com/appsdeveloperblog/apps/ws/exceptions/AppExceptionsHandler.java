package com.appsdeveloperblog.apps.ws.exceptions;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.appsdeveloperblog.apps.ws.ui.model.response.ErrorMessage;

@ControllerAdvice
public class AppExceptionsHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = { Exception.class })
	public ResponseEntity<Object> handleAnyException(Exception exception, WebRequest request) {
		String errorMessageDescription = exception.getLocalizedMessage();
		if (errorMessageDescription == null)
			errorMessageDescription = exception.toString();

		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setMessage(errorMessageDescription);
		errorMessage.setTimestamp(new Date());
		return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = { NullPointerException.class })
	public ResponseEntity<Object> handleNullPointerException(NullPointerException exception, WebRequest request) {
		String errorMessageDescription = exception.getLocalizedMessage();
		if (errorMessageDescription == null)
			errorMessageDescription = exception.toString();

		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setMessage(errorMessageDescription);
		errorMessage.setTimestamp(new Date());
		return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = { UserServiceException.class })
	public ResponseEntity<Object> handleUserServiceException(UserServiceException exception, WebRequest request) {
		String errorMessageDescription = exception.getLocalizedMessage();
		if (errorMessageDescription == null)
			errorMessageDescription = exception.toString();

		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setMessage(errorMessageDescription);
		errorMessage.setTimestamp(new Date());
		return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
