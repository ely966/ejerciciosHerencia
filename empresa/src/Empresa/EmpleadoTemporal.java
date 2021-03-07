package Empresa;

import java.time.LocalDate;

public class  EmpleadoTemporal extends Empleado{
	
	private LocalDate fechaAlta;
	private LocalDate fechaBaja;
	


	public EmpleadoTemporal(String nombre, int edad, String nif, double sueldo, LocalDate fechaAlta,
			LocalDate fechaBaja) {
		super(nombre, edad, nif, sueldo);
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
	}




	public LocalDate getFechaAlta() {
		return fechaAlta;
	}



	public LocalDate getFechaBaja() {
		return fechaBaja;
	}

	

	@Override
	public double calcularSaldo() throws ExceptionFechaEmpleadosTempo {
		if (fechaBaja.isBefore(fechaAlta))throw new ExceptionFechaEmpleadosTempo("Fecha de alta debe ser antes que la fecha de baja");
		
		
		double sueldo = super.getSueldo();
		return sueldo;
	}




	@Override
	public String toString() {
		return "EmpleadoTemporal [fechaAlta=" + fechaAlta + ", fechaBaja=" + fechaBaja + "]";
	}



	
	
	
	
	
	
	
	
	
	
	
}
