package com.baca.service;

import java.util.List;

import com.baca.model.Empleado;

public interface IEmpleadoService {

	List<Empleado> findAllEmpleados();
	Empleado findEmpleadoById(String IdEmpleado);
	void saveEmpleado(Empleado empleado);
	void removeEmpleado(Empleado empleado);
}
