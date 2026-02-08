package com.banco.austro.prueba.utils;

import lombok.Getter;

@Getter
public enum ErrorCatalog {

	POST_NOT_FOUND("ERR_POST_001", "Post not found."), 
	INVALID_POST("ERR_POST_002", "Invalid user parameters."),
	
	USER_NOT_FOUND("ERR_USR_001", "User not found."), 
	INVALID_USER("ERR_USR_002", "Invalid user parameters."),
	
	GENERIC_ERROR("ERR_GEN_001", "An unexpected error occurred.");

	private final String code;
	private final String message;

	ErrorCatalog(String code, String message) {
		this.code = code;
		this.message = message;
	}

}
