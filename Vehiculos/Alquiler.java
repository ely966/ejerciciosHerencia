package Vehiculos;
import Vehiculos.MainVehiculos;
public class Alquiler {
	
	protected int diasalquiler;
	
	
	private Vehiculo automovil;
	
	public Alquiler(int diasalquiler,Vehiculo automovil) {
		super();
		this.diasalquiler = diasalquiler;
		this.automovil = automovil;
		
	}
	
	
	
	public Alquiler(int diasalquiler) {
		super();
		this.diasalquiler = diasalquiler;
	}



	public double calcularPrecio () {
		return automovil.CalcularPrecio(diasalquiler);
	}
	
	
	


	public int getDiasalquiler() {
		return diasalquiler;
	}

	

	@Override
	public String toString() {
		return "Alquiler : " + calcularPrecio() + "  y diasalquiler=" + diasalquiler + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
