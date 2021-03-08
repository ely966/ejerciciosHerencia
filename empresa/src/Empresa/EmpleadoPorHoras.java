package Empresa;

public class EmpleadoPorHoras extends Empleado{
	private double precioPorHora;
	private int numHoras;
	
	
	public EmpleadoPorHoras(String nombre, int edad, String nif, Double saldo, double precioPorHora, int numHoras) {
		super(nombre, edad, nif, saldo );
		this.precioPorHora = precioPorHora;
		this.numHoras = numHoras;
	}
	@Override
	public double calcularSalario() {
		double sueldo = precioPorHora * numHoras;
		return sueldo;
	}

	@Override
	public String toString() {
		return "EmpleadoPorHoras.Nombre: " + getNombre() + " edad : " + getEdad() + " nif  :" + getNif() + " precioPorHora=" + precioPorHora + ", numHoras=" + numHoras ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
