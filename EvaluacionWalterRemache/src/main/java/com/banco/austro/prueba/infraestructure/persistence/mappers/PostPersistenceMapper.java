package com.banco.austro.prueba.infraestructure.persistence.mappers;

import com.banco.austro.prueba.domain.models.Post;
import com.banco.austro.prueba.infraestructure.models.PostDto;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.banco.austro.prueba.infraestructure.persistence.entities.PostEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PostPersistenceMapper {

	Post toPost(PostDto postDto);

	PostEntity toPostEntity(Post post);

	List<Post> toPostList(List<PostEntity> entityList);

}
