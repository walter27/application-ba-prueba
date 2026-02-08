package com.banco.austro.prueba.infraestructure;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.banco.austro.prueba.application.services.PostService;
import com.banco.austro.prueba.infraestructure.controllers.PostControllerAdapter;

@ExtendWith(MockitoExtension.class)
class PostControllerAdapterTest {

	@Mock
	private PostService postService;

	@InjectMocks
	private PostControllerAdapter postController;

	@Test
	void findAllTest() {
		Long idUser = 1L;
		List<String> titles = List.of("Post 1", "Post 2", "Post 3");

		when(postService.findTitleByUserId(idUser)).thenReturn(titles);

		List<String> result = postController.findAll(idUser);

		assertNotNull(result);
	}
}
