package com.clases.springboot.app.Models.service;

import java.util.List;

import com.clases.springboot.app.Models.Entity.Productos;

public interface IProductosService {
	public List<Productos> findAll();

	public Productos save(Productos productos); // Guardar una Persona

	public Productos findById(Long id); // buscar una Persona

	public void deleteById(Long id);
}
