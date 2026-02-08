package com.banco.austro.prueba.application;

import java.util.List;

import org.springframework.stereotype.Component;

import com.banco.austro.prueba.application.repositories.UserRepository;
import com.banco.austro.prueba.application.services.UserService;
import com.banco.austro.prueba.domain.models.User;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UserApplicationAdapter implements UserService {

	private final UserRepository userRepository;

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

}
