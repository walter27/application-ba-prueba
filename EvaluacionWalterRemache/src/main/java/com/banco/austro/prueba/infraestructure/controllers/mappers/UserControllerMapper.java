package com.banco.austro.prueba.infraestructure.controllers.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.banco.austro.prueba.domain.models.User;
import com.banco.austro.prueba.infraestructure.models.UserDto;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserControllerMapper {

	List<User> toUserDtoList(List<UserDto> users);
	
}
