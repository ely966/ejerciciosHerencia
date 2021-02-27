package Barcos;

import java.time.LocalDate;

public class Barco {
	protected String matricula;
	protected double eslora;
	protected LocalDate anofabricacion;
	protected double valor =20.0;
	
	
	public Barco(String matricula, double eslora, LocalDate anofabricacion, double valor) {
		super();
		this.matricula = matricula;
		this.eslora = eslora;
		this.anofabricacion = anofabricacion;
		this.valor = valor * eslora;
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
		Barco other = (Barco) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}
	
	
}
