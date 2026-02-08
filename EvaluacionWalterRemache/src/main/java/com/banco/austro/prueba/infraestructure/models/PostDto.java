package com.banco.austro.prueba.infraestructure.models;

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
public class PostDto {

	private Long id;
	private Long userId;
	private String title;
	private String body;

}
