package com.clases.springboot.app.Models.Dao;


import org.springframework.data.repository.CrudRepository;

import com.clases.springboot.app.Models.Entity.Usuario;


public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

	public Usuario findByUser(String user);
	
}
