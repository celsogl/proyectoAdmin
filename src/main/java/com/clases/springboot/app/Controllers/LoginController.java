package com.clases.springboot.app.Controllers;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {
	 @GetMapping("/login")
	    public String login(@RequestParam(value="error", required=false) String error,
	    @RequestParam(value="logout",required = false) String logout,Model model, Principal principal, RedirectAttributes retorno){
	        if(principal!=null){
	            retorno.addFlashAttribute("info","Ya ha iniciado sesión");
	            return "redirect:/";
	        }
	        if(error!=null)
	        model.addAttribute("error","Error al iniciar sesión");

	        if(logout!=null)
	        model.addAttribute("success", "Ha cerrado sesión con éxito");
	        return "login";
	    }
	
}
