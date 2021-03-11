package Vehiculos;

public class Furgonetas extends Vehiculo {
	private double pesoQueSoporta;
	private static final double  preciofurgo= 0.5;

	public Furgonetas(String matricula, String gama, double pesoQueSoporta) throws ExcepcionGama {
		super(matricula, gama);
		this.pesoQueSoporta = pesoQueSoporta;
	}
	
	
	@Override
	public double CalcularPrecio( int dia) {
		double precio = 0;
		precio = preciofurgo * pesoQueSoporta;
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
