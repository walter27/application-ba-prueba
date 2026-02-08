package com.banco.austro.prueba.infraestructure.models;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDto {

	private String code;
	private String message;
	private List<String> details;
	private LocalDateTime timestamp;

}
