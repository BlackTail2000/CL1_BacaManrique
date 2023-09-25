package com.baca.model;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Empleado {

	@Id
	@Column(columnDefinition = "CHAR(7)", name = "Id_Empleado")
	private String IdEmpleado;
	@Column(length = 45)
	private String Apellidos;
	@Column(length = 45)
	private String Nombres;
	private int Edad;
	@Column(columnDefinition = "CHAR(1)")
	private char Sexo;
	@Column(columnDefinition = "DECIMAL(8,2)")
	private BigDecimal Salario;
}
