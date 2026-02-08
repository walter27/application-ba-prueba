
package com.banco.austro.prueba.application;

import java.util.List;

import org.springframework.stereotype.Component;

import com.banco.austro.prueba.application.repositories.PostRepository;
import com.banco.austro.prueba.application.services.PostService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PostApplicationAtapter implements PostService {

	private final PostRepository postRespository;

	@Override
	public void saveUser() {
		postRespository.savePost();
	}

	@Override
	public List<String> findTitleByUserId(Long userId) {
		return postRespository.findTitleByUserId(userId);
	}

}
