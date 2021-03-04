package Empresa;

public class EmpleadoPorHoras extends Empleado{
	private double precioPorHora;
	private int numHoras;
	
	
	public EmpleadoPorHoras(String nombre, int edad, String nif, double sueldo, double precioPorHora, int numHoras) {
		super(nombre, edad, nif, sueldo);
		this.precioPorHora = precioPorHora;
		this.numHoras = numHoras;
	}

	private double calcularSueldo() {
		double sueldo = precioPorHora * numHoras;
		return sueldo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
