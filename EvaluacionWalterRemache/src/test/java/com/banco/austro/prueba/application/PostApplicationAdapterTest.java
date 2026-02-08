package com.banco.austro.prueba.application;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.banco.austro.prueba.application.repositories.PostRepository;

@ExtendWith(MockitoExtension.class)
public class PostApplicationAdapterTest {

	@InjectMocks
	private PostApplicationAtapter application;

	@Mock
	private PostRepository repository;

	@Test
	public void findTitleByUserId() {
		List<String> title = Arrays.asList("test", "test 2", "tets 3", "test 4");
		when(repository.findTitleByUserId(anyLong())).thenReturn(title);
		List<String> result = application.findTitleByUserId(anyLong());
		assertNotNull(result);
	}

}
