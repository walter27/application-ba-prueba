package com.banco.austro.prueba.infraestructure.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class AppConfiguration {

	private final AppProperties properties;

	@Bean
	public WebClient.Builder webClientBuilder() {
		return WebClient.builder();
	}

	/*
	 * Configuracion para el consumo de la api de post
	 */
	@Bean
	public WebClient webClient(WebClient.Builder builder) {
		return builder.baseUrl(properties.getBaseUrlPost())
				.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE).build();
	}

}
