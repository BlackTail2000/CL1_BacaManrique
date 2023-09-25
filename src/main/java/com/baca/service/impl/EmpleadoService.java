package com.baca.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baca.model.Empleado;
import com.baca.repository.EmpleadoRepository;
import com.baca.service.IEmpleadoService;

@Service
public class EmpleadoService implements IEmpleadoService {

	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Override
	public List<Empleado> findAllEmpleados() {
		return empleadoRepository.findAll();
	}

	@Override
	public Empleado findEmpleadoById(String IdEmpleado) {
		Empleado empleado = null;
		Optional<Empleado> optional = empleadoRepository.findById(IdEmpleado);
		if(optional.isPresent())
			empleado = optional.get();
		
		return empleado;
	}

	@Override
	public void saveEmpleado(Empleado empleado) {
		empleadoRepository.save(empleado);
	}

	@Override
	public void removeEmpleado(Empleado empleado) {
		empleadoRepository.delete(empleado);
	}

}
