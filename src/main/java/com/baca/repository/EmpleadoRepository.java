package com.baca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.baca.model.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, String>{

}
