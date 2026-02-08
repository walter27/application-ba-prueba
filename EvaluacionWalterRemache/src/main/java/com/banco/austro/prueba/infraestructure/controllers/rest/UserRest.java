package com.banco.austro.prueba.infraestructure.controllers.rest;

import java.util.List;

import org.springframework.stereotype.Component;

import com.banco.austro.prueba.application.repositories.UserRepository;
import com.banco.austro.prueba.domain.models.User;
import com.banco.austro.prueba.infraestructure.clients.ApiClient;
import com.banco.austro.prueba.infraestructure.controllers.mappers.UserControllerMapper;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UserRest implements UserRepository {

	private final ApiClient apiClient;
	private final UserControllerMapper mapper;

	@Override
	public List<User> findAll() {
		return mapper.toUserDtoList(apiClient.getUser());
	}

}
