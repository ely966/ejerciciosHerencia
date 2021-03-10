package Vehiculos;

public class Furgonetas extends Vehiculo {
	private double pesoQueSoporta;

	public Furgonetas(String matricula, String gama, double pesoQueSoporta) throws ExcepcionGama {
		super(matricula, gama);
		this.pesoQueSoporta = pesoQueSoporta;
	}
	
	
	
	public double CalcularPrecioextra (int dias) {
		double precio = 0;
		precio = 0.5 * pesoQueSoporta;
		return precio;
		
	}

	public double getPesoQueSoporta() {
		return pesoQueSoporta;
	}

	@Override
	public String toString() {
		return "Furgonetas :  " + super.toString() +  " pesoQueSoporta=" + pesoQueSoporta + "]";
	}
	
	
	
	
}
