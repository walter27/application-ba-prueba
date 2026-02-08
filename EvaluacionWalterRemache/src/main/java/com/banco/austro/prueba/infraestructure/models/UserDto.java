package com.banco.austro.prueba.infraestructure.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	
	private Long id;
	private String name;
	private String username;
	private String email;
	private AddressDto address;
	private String phone;
	private String website;
	private CompanyDto company;

}
