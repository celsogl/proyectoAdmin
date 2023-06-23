package com.clases.springboot.app.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping({"/home","/"})
	public String Home() {
		return "home";
	}
	
	@GetMapping("/nosotros")
	public String Nosotros() {
		return "nosotros";
	}
	
	@GetMapping("/contacto")
	public String Contacto() {
		return "contacto";
	}
}
