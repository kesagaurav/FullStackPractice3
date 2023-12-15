package com.gaurav.exception;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ErrorMessage {

	private String message;
	private int errorCode;
	private LocalDateTime date;
}
