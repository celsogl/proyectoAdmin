package com.clases.springboot.app.Models.service;

import java.util.List;

import com.clases.springboot.app.Models.Entity.Delivery;


public interface IDeliveryService {
    public List<Delivery> findAll();

	public Delivery save(Delivery delivery); // Guardar una Persona

	public Delivery findById(Long id); // buscar una Persona

	public void deleteById(Long id);
}
