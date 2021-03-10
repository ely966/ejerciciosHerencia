package Vehiculos;

public abstract class Vehiculo {
	private String matricula;
	protected String gama;
	
	
	
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
