package com.banco.austro.prueba.infraestructure;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.banco.austro.prueba.application.services.UserService;
import com.banco.austro.prueba.domain.models.User;
import com.banco.austro.prueba.infraestructure.controllers.UserControllerAtapter;

@ExtendWith(MockitoExtension.class)
class UserControllerAtapterTest {

	@Mock
	private UserService userService;

	@InjectMocks
	private UserControllerAtapter userController;

	@Test
	void findAllTest() {

		List<User> users = List.of(new User(1L, "Juan", "juan@test.com", null, null, null, null, null),
				new User(2L, "Ana", "ana@test.com", null, null, null, null, null));

		when(userService.findAll()).thenReturn(users);

		List<User> result = userController.findAll();

		assertNotNull(result);
	}
}
