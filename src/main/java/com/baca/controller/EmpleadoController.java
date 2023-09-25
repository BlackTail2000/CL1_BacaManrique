package com.baca.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.baca.model.Empleado;
import com.baca.service.IEmpleadoService;

@Controller
public class EmpleadoController {
	
	@Autowired
	private IEmpleadoService empleadoService;

	@GetMapping("/Empleado/Listado")
	public String Listar(Model model) {
		List<Empleado> empleados = empleadoService.findAllEmpleados();
		model.addAttribute("empleados", empleados);
		
		return "ListadoEmpleados";
	}
	
	@GetMapping("/Empleado/Registro")
	public String Registro(Model model) {
		Empleado empleado = new Empleado();
		empleado.setEdad(18);
		empleado.setSalario(new BigDecimal(1500));
		model.addAttribute("empleado", empleado);
		return "RegistrarEmpleado";
	}
	
	@PostMapping("/Empleado/Registrar")
	public String Registrar(@ModelAttribute("empleado") Empleado empleado) {
		empleadoService.saveEmpleado(empleado);
		return "redirect:/Empleado/Listado";
	}
	
	@GetMapping("/Empleado/Eliminar")
	public String Eliminar(@RequestParam("id") String IdEmpleado) {
		Empleado empleado = empleadoService.findEmpleadoById(IdEmpleado);
		empleadoService.removeEmpleado(empleado);
		
		return "redirect:/Empleado/Listado";
	}
	
	@GetMapping("/Empleado/Actualizacion")
	public String Actualizacion(@RequestParam("id") String IdEmpleado, Model model) {
		Empleado empleado = empleadoService.findEmpleadoById(IdEmpleado);
		model.addAttribute("empleado", empleado);
		return "ActualizarEmpleado";
	}
	
	@PostMapping("/Empleado/Actualizar")
	public String Actualizar(@ModelAttribute("empleado") Empleado empleado) {
		empleadoService.saveEmpleado(empleado);
		return "redirect:/Empleado/Listado";
	}
}
