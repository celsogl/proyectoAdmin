package com.clases.springboot.app.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clases.springboot.app.Models.service.IProductosService;


@Controller
public class OrdenaController {
    
	@Autowired
	private IProductosService productosService;
	/* 
	@GetMapping("/ordena")
	public String InicioOrdena() {
		return "ordena";
	}*/

	@RequestMapping(value = "/ordena", method = RequestMethod.GET)
	public String listarOrdena(Model model) {
		model.addAttribute("productos", productosService.findAll());
		return "ordena";
	}
}
