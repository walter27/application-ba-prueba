package com.banco.austro.prueba.infraestructure.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {

	private String street;
	private String suite;
	private String oity;
	private String zipcode;
	private GeoDto geo;

}
