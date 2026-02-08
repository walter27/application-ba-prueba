package com.banco.austro.prueba.infraestructure.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.austro.prueba.application.services.PostService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/posts")
public class PostControllerAdapter {

	private final PostService postService;

	@GetMapping("/title/{idUser}")
	public List<String> findAll(@PathVariable Long idUser) {
		return postService.findTitleByUserId(idUser);
	}

}
