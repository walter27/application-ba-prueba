package com.banco.austro.prueba.application;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.banco.austro.prueba.application.repositories.UserRepository;
import com.banco.austro.prueba.domain.models.Address;
import com.banco.austro.prueba.domain.models.Company;
import com.banco.austro.prueba.domain.models.Geo;
import com.banco.austro.prueba.domain.models.User;

@ExtendWith(MockitoExtension.class)
public class UserApplicationAdapterTest {

	@InjectMocks
	private UserApplicationAdapter application;

	@Mock
	private UserRepository repository;

	@Test
	public void findAllTest() {

		List<User> users = new ArrayList<>();

		User user = new User((long) 1, "Leanne Graham", "Bret", "Sincere@april.biz",
				new Address("Kulas Light", "Apt. 556", null, "92998-3874", new Geo("-37.3159", "81.1496")),
				"1-770-736-8031 x56442", "hildegard.org", new Company("Romaguera-Crona",
						"Multi-layered client-server neural-net", "harness real-time e-markets"));

		User user2 = new User((long) 2, "Ervin Howell", "Antonette", "Shanna@melissa.tv",
				new Address("Victor Plains", "Suite 879", null, "90566-7771", new Geo("-43.9509", "-34.4618")),
				"010-692-6593 x09125", "anastasia.net",
				new Company("Deckow-Crist", "Proactive didactic contingency", "synergize scalable supply-chains"));

		users.add(user);
		users.add(user2);

		when(repository.findAll()).thenReturn(users);

		List<User> result = application.findAll();

		assertNotNull(result);

	}

}
