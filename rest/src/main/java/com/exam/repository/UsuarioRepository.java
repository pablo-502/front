package com.exam.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exam.dto.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
	List<Usuario> findByIdUser(String id);
}
