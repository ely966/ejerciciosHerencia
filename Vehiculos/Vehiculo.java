package Vehiculos;

public abstract class Vehiculo {
	private String matricula;
	protected String gama;
	private static double preciodiagBaja= 30.0;
	private static double preciodiaMedia = 40.0;
	private static double preciodiaAlta = 50.0;
	
	
	public Vehiculo(String matricula, String gama) throws ExcepcionGama{
		super();
		this.matricula = matricula;
		this.gama = gama;
	
		if (!gama.equals("alta")  && !gama.equals("baja") && !gama.equals("media") ) 
		{throw new ExcepcionGama ("Gama solo puede ser alta,media o baja");}
		
	}
	
	
	
	
	public String getMatricula() {
		return matricula;
	}




	public String getGama() {
		return gama;
	}


	public double CalcularPrecio( int dia) {
		double alquiler=0;
		if (gama.equals ("baja")) {
			alquiler = preciodiagBaja * dia;
			
		}else if (gama.equals ("media")) {
			alquiler = preciodiaMedia * dia;
		}else if (gama.equals ("baja")) {
			alquiler = preciodiaAlta * dia;
		}
		return alquiler;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}









	
	
	
	
	
}
