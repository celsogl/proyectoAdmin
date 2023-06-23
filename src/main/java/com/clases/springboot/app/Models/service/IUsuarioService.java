package com.clases.springboot.app.Models.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.clases.springboot.app.Models.Entity.Usuario;
import com.clases.springboot.app.dto.UsuarioRegistroDTO;

public interface IUsuarioService extends UserDetailsService{

	public Usuario save(UsuarioRegistroDTO registroDTO);
	
	public List<Usuario> findAll();

	//public void save(Cliente cliente); // Guardar un Cliente

	//public Cliente findById(Long id); // buscar un Administrador

	//public void deleteById(Long id);
	
}
