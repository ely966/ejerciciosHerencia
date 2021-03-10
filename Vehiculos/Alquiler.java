package Vehiculos;

public class Alquiler {
	private static double preciodiagBaja= 30.0;
	private static double preciodiaMedia = 40.0;
	private static double preciodiaAlta = 50.0;
	protected int diasalquiler;
	private static double pagoPorGasolina = 3.50;
	private static double pagoPorDiesel = 2.00;
	private static double precioPorPlazas = 5.00;
	private static double preciofurgo= 0.5;
	private Vehiculo automovil;
	public Alquiler(int diasalquiler,Vehiculo automovil) {
		super();
		this.diasalquiler = diasalquiler;
		this.automovil = automovil;
		
	}
	
	
	public double calcularPrecioAlquiler (String matricula, int dia ) {
		
		double alquiler = 0;
		if (Vehiculo.gama.equals ("baja")) {}else if (tpo.equals ("media")) {}
		
	}
	
	
	

	public static double getPreciodiagBaja() {
		return preciodiagBaja;
	}

	public static double getPreciodiaMedia() {
		return preciodiaMedia;
	}

	public static double getPreciodiaAlta() {
		return preciodiaAlta;
	}

	public int getDiasalquiler() {
		return diasalquiler;
	}

	public static double getPagoPorGasolina() {
		return pagoPorGasolina;
	}

	public static double getPagoPorDiesel() {
		return pagoPorDiesel;
	}

	public static double getPrecioPorPlazas() {
		return precioPorPlazas;
	}

	public static double getPreciofurgo() {
		return preciofurgo;
	}

	@Override
	public String toString() {
		return "Alquiler [diasalquiler=" + diasalquiler + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
