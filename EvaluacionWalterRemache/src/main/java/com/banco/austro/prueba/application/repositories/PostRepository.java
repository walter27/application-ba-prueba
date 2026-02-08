package com.banco.austro.prueba.application.repositories;

import java.util.List;

public interface PostRepository {

	void savePost();

	List<String> findTitleByUserId(Long userId);

}
