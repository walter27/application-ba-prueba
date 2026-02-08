package com.banco.austro.prueba.domain.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Post {

	private Long id;
	private Long userId;
	private String title;
	private String body;

}
