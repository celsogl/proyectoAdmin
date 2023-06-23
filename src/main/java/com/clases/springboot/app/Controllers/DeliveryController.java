package com.clases.springboot.app.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.clases.springboot.app.Models.service.IDeliveryService;

@Controller
@SessionAttributes("delivery")
public class DeliveryController {
    
    @Autowired
    private IDeliveryService deliveryService;

     @RequestMapping(value = "/listadelivery", method = RequestMethod.GET)
	public String listarDelivery(Model model) {
		model.addAttribute("delivery", deliveryService.findAll());
		return "/Delivery/listarDelivery";
	}
}
