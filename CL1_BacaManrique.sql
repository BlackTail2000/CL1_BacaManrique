Create Database CL1_BacaManrique;
Use CL1_BacaManrique;

Create Table Empleado(
Id_Empleado Char(7) Primary Key,
Apellidos Varchar(45),
Nombres Varchar(45),
Edad Int,
Sexo Char(1),
Salario Decimal(8,2));

INSERT INTO Empleado
VALUES
    ('EMP0001', 'TORRES', 'JOSE', 22, 'M', 1500),
    ('EMP0002', 'GARCIA', 'MARIA', 21, 'F', 1750),
    ('EMP0003', 'FLORES', 'JUAN', 22, 'M', 1850),
    ('EMP0004', 'CASAS', 'ANA', 23, 'F', 2000);
       
Select * From Empleado;