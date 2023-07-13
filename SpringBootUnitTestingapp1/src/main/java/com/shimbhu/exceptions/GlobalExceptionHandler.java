package com.shimbhu.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(StudentException.class)
	public ResponseEntity<MyErrorDetails> myExceptionHandler(StudentException ce, WebRequest req)
	{
		MyErrorDetails err = new MyErrorDetails();
		err.setMessage(ce.getMessage());
		err.setDescription(req.getDescription(false));
		err.setTimeStamp(LocalDateTime.now());
		
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> myExceptionHandler(MethodArgumentNotValidException ce)
	{
		MyErrorDetails err = new MyErrorDetails();
		err.setMessage(ce.getFieldError().getDefaultMessage());
		err.setDescription(ce.getFieldError().getDefaultMessage());
		err.setTimeStamp(LocalDateTime.now());
		
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}

}
