package com.banco.austro.prueba.infraestructure.persistence.respositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.banco.austro.prueba.infraestructure.persistence.entities.PostEntity;

@Repository
public interface PostEntityRepository extends JpaRepository<PostEntity, Long> {

	@Query("SELECT t.title FROM PostEntity t WHERE t.userId = :userId")
	List<String> findTitleByUserId(@Param("userId") Long userId);

}
