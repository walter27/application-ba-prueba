package com.banco.austro.prueba.infraestructure.controllers;

import java.time.LocalDateTime;
import java.util.Collections;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;
import com.banco.austro.prueba.domain.exeptions.PostNotFoundException;
import com.banco.austro.prueba.domain.exeptions.UserNotFoundExepxtion;
import com.banco.austro.prueba.infraestructure.models.ErrorDto;

import static com.banco.austro.prueba.utils.ErrorCatalog.*;

@RestControllerAdvice
public class GlobalControlAdvice {

	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(PostNotFoundException.class)
	public ErrorDto handlePostNotFoundException() {
		return ErrorDto.builder().code(POST_NOT_FOUND.getCode()).message(POST_NOT_FOUND.getMessage())
				.timestamp(LocalDateTime.now()).build();
	}

	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(UserNotFoundExepxtion.class)
	public ErrorDto handleUserNotFoundException() {
		return ErrorDto.builder().code(USER_NOT_FOUND.getCode()).message(USER_NOT_FOUND.getMessage())
				.timestamp(LocalDateTime.now()).build();
	}

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public ErrorDto handleGenericError(Exception exception) {
		return ErrorDto.builder().code(GENERIC_ERROR.getCode()).message(GENERIC_ERROR.getMessage())
				.details(Collections.singletonList(exception.getMessage())).timestamp(LocalDateTime.now()).build();
	}

}
