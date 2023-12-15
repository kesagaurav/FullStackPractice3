package com.gaurav.exception;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@Autowired
	private Environment enviroment;
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessage> generalException(Exception e){
		ErrorMessage er=new ErrorMessage();
		er.setMessage(enviroment.getProperty("General.EXCEPTION_MESSAGE"));
		er.setErrorCode(HttpStatus.BAD_REQUEST.value());
		er.setDate(LocalDateTime.now());
		return new ResponseEntity<ErrorMessage>(er, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(HotelNotFoundException.class)
	public ResponseEntity<ErrorMessage> hotelNotFoundException(HotelNotFoundException e){
		ErrorMessage er=new ErrorMessage();
		er.setMessage(e.getMessage());
		er.setErrorCode(HttpStatus.BAD_REQUEST.value());
		er.setDate(LocalDateTime.now());
		return new ResponseEntity<ErrorMessage>(er, HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorMessage> messageNotFoundException(MethodArgumentNotValidException ex){
		ErrorMessage er=new ErrorMessage();
		String collect = ex.getBindingResult().getAllErrors().stream().map(x->x.getDefaultMessage()).collect(Collectors.joining(","));
		er.setErrorCode(HttpStatus.BAD_REQUEST.value());
		er.setMessage(collect);
		er.setDate(LocalDateTime.now());
		return new ResponseEntity<ErrorMessage>(er, HttpStatus.BAD_REQUEST);
		
	}

}
