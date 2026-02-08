package com.banco.austro.prueba;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.banco.austro.prueba.application.services.PostService;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class BancoAustroWsApplication implements CommandLineRunner {

	private final PostService postService;

	public static void main(String[] args) {
		SpringApplication.run(BancoAustroWsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		postService.saveUser();

	}

}
