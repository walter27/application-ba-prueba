package com.banco.austro.prueba.application.services;

import java.util.List;

public interface PostService {

	void saveUser();

	List<String> findTitleByUserId(Long userId);

}
