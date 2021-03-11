package Vehiculos;

public class Microbus extends Vehiculo{
	private int numplazas;
	private static int precioPorPlazas = 5;

	public Microbus(String matricula, String gama, int numplazas) throws ExcepcionGama {
		super(matricula, gama);
		this.numplazas = numplazas;
		
	}
	
	
	@Override
	public double CalcularPrecio( int dia) {
		
	double precio = 0;
	
	precio = precioPorPlazas *numplazas;
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
