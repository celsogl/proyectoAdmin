package com.clases.springboot.app.Controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.clases.springboot.app.Models.service.IUsuarioService;


@Controller
public class AdminController {

	@Autowired
	private IUsuarioService servicio;
	

	@GetMapping("/admin")
	public String Inicio() {
		return "/Administrador/menuAdmin";

	}

	@GetMapping("/listuser")
	public String listUser(Model model) {
		model.addAttribute("usuario", servicio.findAll());
		return "/Usuario/listUsuario";

	}
}