
package com.banco.austro.prueba.infraestructure.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.banco.austro.prueba.application.repositories.PostRepository;
import com.banco.austro.prueba.domain.models.Post;
import com.banco.austro.prueba.infraestructure.clients.ApiClient;
import com.banco.austro.prueba.infraestructure.models.PostDto;
import com.banco.austro.prueba.infraestructure.persistence.entities.PostEntity;
import com.banco.austro.prueba.infraestructure.persistence.mappers.PostPersistenceMapper;
import com.banco.austro.prueba.infraestructure.persistence.respositories.PostEntityRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@Transactional
public class PostPersistenceAtapter implements PostRepository {

	private final ApiClient ApiClient;
	private final PostEntityRepository repository;
	private final PostPersistenceMapper mapper;

	@Override
	public void savePost() {
		List<PostDto> users = ApiClient.getPost();
		users.forEach(userResponse -> {
			Post user = mapper.toPost(userResponse);
			Optional<PostEntity> entity = repository.findById(user.getId());
			if (entity.isEmpty()) {
				PostEntity userEntity = mapper.toPostEntity(user);
				userEntity.setId(null);
				repository.save(userEntity);
			}
		});
	}

	@Override
	public List<String> findTitleByUserId(Long userId) {
		return repository.findTitleByUserId(userId);
	}

}
