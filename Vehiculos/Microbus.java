package Vehiculos;

public class Microbus extends Vehiculo{
	private int numplazas;

	public Microbus(String matricula, String gama, int numplazas) throws ExcepcionGama {
		super(matricula, gama);
		this.numplazas = numplazas;
	}
	
	public double CalcularPrecioextra (int dias) {
		
	double precio = 0;
	
	precio = 5*numplazas;
	return precio;
	}
	
	
	
	public int getNumplazas() {
		return numplazas;
	}

	@Override
	public String toString() {
		return "Microbus : " + super.toString() +  " numplazas=" + numplazas;
	}
	
	
	
}
