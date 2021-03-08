package Empresa;

import java.time.LocalDate;

public class MainEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String nombre, int edad, String nif, double sueldo, LocalDate fechaAlta,LocalDate fechaBaja
		EmpleadoTemporal et1 = new EmpleadoTemporal("Antonio", 27,"23456783X",900.0,LocalDate.parse("2019-02-10"), LocalDate.parse("2022-04-09"));
		System.out.println(et1);
		try {
			System.out.println(et1.calcularSalario());
		} catch (ExceptionFechaEmpleadosTempo e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		//empleado fijo
		//String nombre, int edad, String nif, double sueldo, int fechaAlta
		EmpleadoFijo ef1 = new EmpleadoFijo("Lucia", 22, "76534521A", 1000, 2015);
		System.out.println(ef1);
		
		System.out.println(ef1.calcularSalario());
		
		
		
		//Empleado por hora
		//String nombre, int edad, String nif, Double saldo, double precioPorHora, int numHoras
		EmpleadoPorHoras eh1 = new EmpleadoPorHoras("Felipe", 34,"34216722X",0.0, 5.0,5);
		System.out.println(eh1);
		
		System.out.println(eh1.calcularSalario());
		
	

}}
