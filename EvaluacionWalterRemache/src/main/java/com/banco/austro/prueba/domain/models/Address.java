package com.banco.austro.prueba.domain.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

	private String street;
	private String suite;
	private String oity;
	private String zipcode;
	private Geo geo;

}
