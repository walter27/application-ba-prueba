
package com.banco.austro.prueba.infraestructure.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.austro.prueba.application.services.UserService;
import com.banco.austro.prueba.domain.models.User;


import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserControllerAtapter {

	private final UserService userService;

	@GetMapping
	public List<User> findAll() {
		return userService.findAll();
	}

}
