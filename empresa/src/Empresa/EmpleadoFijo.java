package Empresa;

import java.time.LocalDate;

	public class EmpleadoFijo extends Empleado{
		private int fechaAlta;
		private final static double COMPLEMENTARIO = 20.0;
	
	
		
		
	


	public EmpleadoFijo(String nombre, int edad, String nif, double sueldo, int fechaAlta) {
			super(nombre, edad, nif, sueldo);
			this.fechaAlta = fechaAlta;
		}

	public int getFechaAlta() {
			return fechaAlta;
		}

	public static double getComplementario() {
		return COMPLEMENTARIO;
	}
	
	@Override
	public double calcularSaldo() {
		int tiempoenlaEmpresa = LocalDate.now().getYear() -fechaAlta;
		double sueldo = (super.getSueldo() + (tiempoenlaEmpresa * COMPLEMENTARIO));
		return sueldo;
	}
	
	
	
	
	
	
}
