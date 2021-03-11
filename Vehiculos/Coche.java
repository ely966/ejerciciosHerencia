package Vehiculos;

public class Coche extends Vehiculo{
	private String tipocombustible;
	private static double pagoPorGasolina = 3.50;
	private static double pagoPorDiesel = 2.00;
	
	
	public Coche(String matricula, String gama, String tipocombustible) throws ExcepcionGama {
		super(matricula, gama);
		this.tipocombustible = tipocombustible;
	}

	public String getTipocombustible() {
		return tipocombustible;
	}
	
	public double CalcularPrecio (int dias){
		double precio = 0;
		if (tipocombustible.equals ("diesel") || tipocombustible.equals("Diesel")) {
			
			precio= dias * 2;
			
		} 
		else if (tipocombustible.equals("gasolina") || tipocombustible.equals("Gasolina")){
			precio = dias * 3.5;
		}
		return precio;
	}
	
	public String toString() {
		return "Coche : "  + super.toString()  +" tipocombustible=" + tipocombustible + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
