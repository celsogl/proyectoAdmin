package com.clases.springboot.app.Controllers;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.SessionAttributes;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.clases.springboot.app.Models.Entity.Productos;

import com.clases.springboot.app.Models.service.IProductosService;



@Controller
@SessionAttributes("productos")
public class ProductosController{
	
	@Autowired
	private IProductosService productosService;
	
	@RequestMapping(value = "/listaproductos", method = RequestMethod.GET)
	public String listarProductos(Model model) {
		model.addAttribute("productos", productosService.findAll());
		return "/Productos/listProductos";
	}

	@RequestMapping(value = "/createproductos")
	public String crearProducto(Map<String, Object> model) {
		Productos productos = new Productos();
		model.put("productos", productos);
		return "/Productos/registrarProductos";
	}

	@RequestMapping(value = "/createproductos", method = RequestMethod.POST)
	public String guardar(Productos productos) {
		productosService.save(productos);
		return "redirect:listaproductos";
	}

	@GetMapping("/detalle/{id}")
	public String detallePersona(@PathVariable("id") Long id, Model model, RedirectAttributes attribute) {

		Productos productos = null;

		if (id > 0) {
			productos = productosService.findById(id);

			if (productos == null) {
				attribute.addFlashAttribute("Error", "El ID del Producto no existe!");
				return "redirect:/listaproductos";
			}
		} else {
			attribute.addFlashAttribute("Error", "Error con el ID del Producto!");
			return "redirect:/listaproductos";
		}

		model.addAttribute("productos", productos);
		return "/Productos/detalleProductos";
	}

	@RequestMapping(value = "/formproductos/{id}")
	public String editarProducto(@PathVariable(value = "id") Long id, Map<String, Object> model) {
		Productos productos = null;

		if (id > 0) {
			productos = productosService.findById(id);
		}
		else {
			return "redirect:/listaproductos";
		}
		model.put("productos", productos);

		return "/Productos/registrarProductos";
	}
	
	@RequestMapping(value="/eliminar/{id}")
	public String eliminarProducto(@PathVariable(value="id")Long id) {
		if(id>0)
			productosService.deleteById(id);
		
		return "redirect:/listaproductos";
	}
	
}
