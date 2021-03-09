package Empresa;

import java.time.LocalDate;

public class  EmpleadoTemporal extends Empleado{
	
	private LocalDate fechaAlta;
	private LocalDate fechaBaja;
	


	public EmpleadoTemporal(String nombre, int edad, String nif, double sueldo, LocalDate fechaAlta,
			LocalDate fechaBaja) throws ExceptionFechaEmpleadosTempo {
		super(nombre, edad, nif, sueldo);
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		if (fechaBaja.isBefore(fechaAlta))throw new ExceptionFechaEmpleadosTempo("Fecha de alta debe ser antes que la fecha de baja");
		
	}




	public LocalDate getFechaAlta() {
		return fechaAlta;
	}



	public LocalDate getFechaBaja() {
		return fechaBaja;
	}

	

	@Override
	public double calcularSalario() throws ExceptionFechaEmpleadosTempo {
		if (fechaBaja.isBefore(fechaAlta))throw new ExceptionFechaEmpleadosTempo("Fecha de alta debe ser antes que la fecha de baja");
		
		
		double sueldo = super.getSueldo();
		return sueldo;
	}




	@Override
	public String toString() {
		return "EmpleadoTemporal. Nombre: " + getNombre() + " edad : " + getEdad() + " nif  :" + getNif() + " fechaAlta=" + fechaAlta + ", fechaBaja=" + fechaBaja ;
	}



	
	
	
	
	
	
	
	
	
	
	
}
