package com.banco.austro.prueba.infraestructure.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@ConfigurationProperties
@Component
public class AppProperties {

	private String baseUrlPost;

}
