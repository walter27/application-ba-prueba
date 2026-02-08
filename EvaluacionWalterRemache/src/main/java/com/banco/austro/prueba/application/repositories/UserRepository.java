package com.banco.austro.prueba.application.repositories;

import java.util.List;

import com.banco.austro.prueba.domain.models.User;

public interface UserRepository {
	
	List<User> findAll();

}
