package com.carapp.exeptions;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.carapp.model.ApiErrors;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message=ex.getMessage();
		List<Object> error=Arrays.asList("This method is not supported",ex.getMessage());
		
		headers.add("info", "Invalid method");
		ApiErrors errors=new ApiErrors(LocalDateTime.now(),message,status,status.value(),error);
		return ResponseEntity.status(status).headers(headers).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message=ex.getMessage();
		List<Object> error=Arrays.asList("this is not supported",ex.getContentType()+"not suported",ex.getSupportedMediaTypes());
		
		headers.add("info", "Invalid method");
		ApiErrors errors=new ApiErrors(LocalDateTime.now(),message,status,status.value(),error);
		return ResponseEntity.status(status).headers(headers).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		String message=ex.getMessage();
		List<Object> error=Arrays.asList("this is not supported missing path",ex.getParameter()+"not suported");
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "Invalid method");
		ApiErrors errors=new ApiErrors(LocalDateTime.now(),message,status,status.value(),error);
		return ResponseEntity.status(status).headers(httpHeaders).body(errors);
		
	}

	@Override
	protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		String message=ex.getMessage();
		List<Object> error=Arrays.asList("this requestparam is missing",ex.getParameterName()+"is missing" ,ex.getParameterType()+"is expected");
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "Invalid requestparam");
		ApiErrors errors=new ApiErrors(LocalDateTime.now(),message,status,status.value(),error);
		return ResponseEntity.status(status).headers(httpHeaders).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		
		String message=ex.getMessage();
		List<Object> error=Arrays.asList("type mismatch",ex.getRequiredType()+"is missing");
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "Invalid method");
		ApiErrors errors=new ApiErrors(LocalDateTime.now(),message,status,status.value(),error);
		return ResponseEntity.status(status).headers(httpHeaders).body(errors);
	}
	@ExceptionHandler(CarNotFoundException.class)
	public ResponseEntity<Object> handleCarNotFound(CarNotFoundException ex){
		String message=ex.getMessage();
		List<Object> error=Arrays.asList("car not available");
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "car not found");
		ApiErrors errors=
				new ApiErrors(LocalDateTime.now(), message,HttpStatus.INTERNAL_SERVER_ERROR,HttpStatus.INTERNAL_SERVER_ERROR.value(), error);
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(httpHeaders).body(errors);
	}
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> handleUserNotFound(UserNotFoundException ex){
		String message=ex.getMessage();
		List<Object> error=Arrays.asList("user not available");
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "user not found");
		ApiErrors errors=
				new ApiErrors(LocalDateTime.now(), message,HttpStatus.INTERNAL_SERVER_ERROR,HttpStatus.INTERNAL_SERVER_ERROR.value(), error);
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(httpHeaders).body(errors);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleException(Exception ex){
		String message=ex.getMessage();
		List<Object> error=Arrays.asList("other");
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "other");
		ApiErrors errors=
				new ApiErrors(LocalDateTime.now(), message,HttpStatus.INTERNAL_SERVER_ERROR,HttpStatus.INTERNAL_SERVER_ERROR.value(), error);
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(httpHeaders).body(errors);
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

