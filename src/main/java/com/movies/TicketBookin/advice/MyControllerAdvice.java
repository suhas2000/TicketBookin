package com.movies.TicketBookin.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyControllerAdvice {

	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity<String> handleEmptyInput(MethodArgumentNotValidException e) {
		return new ResponseEntity<String>("There is an error in a field,Check the error in Console", HttpStatus.BAD_REQUEST);

	}

}
