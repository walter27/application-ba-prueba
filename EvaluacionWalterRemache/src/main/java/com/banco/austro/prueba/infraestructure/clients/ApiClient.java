package com.banco.austro.prueba.infraestructure.clients;

import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.banco.austro.prueba.domain.exeptions.PostNotFoundException;
import com.banco.austro.prueba.domain.exeptions.UserNotFoundExepxtion;
import com.banco.austro.prueba.infraestructure.models.PostDto;
import com.banco.austro.prueba.infraestructure.models.UserDto;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class ApiClient {

	private final WebClient webClient;

	public List<PostDto> getPost() {
		return ( webClient.get().uri("/posts").retrieve()
				.onStatus(HttpStatusCode::is4xxClientError, response -> Mono.error(new PostNotFoundException()))
				.onStatus(HttpStatusCode::is5xxServerError, response -> Mono.error(new PostNotFoundException()))
				.bodyToFlux(PostDto.class)).collectList() 
				.block();
		
	}
	
	public List<UserDto> getUser() {
		return ( webClient.get().uri("/users").retrieve()
				.onStatus(HttpStatusCode::is4xxClientError, response -> Mono.error(new UserNotFoundExepxtion()))
				.onStatus(HttpStatusCode::is5xxServerError, response -> Mono.error(new UserNotFoundExepxtion()))
				.bodyToFlux(UserDto.class)).collectList() 
				.block();
		
	}

}
