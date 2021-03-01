package Barcos;

import java.time.LocalDate;

public class Barco {
	protected String matricula;
	protected double eslora;
	protected int anofabricacion;
	protected static final double valor =20.0;
	protected static final int valorfijo =10;
	
	public Barco(String matricula, double eslora, int anofabricacion) {
		super();
		this.matricula = matricula;
		this.eslora = eslora;
		this.anofabricacion = anofabricacion;
		
	}


	public Barco(double valor2, int valorfijo2) {
		// TODO Auto-generated constructor stub
	}


	public String getMatricula() {
		return matricula;
	}


	public double getEslora() {
		double resultado=eslora*valorfijo;
		return resultado;
	}


	public int getAnofabricacion() {
		return anofabricacion;
	}


	public double getValor() {
		double resultado =valor*eslora;
		return resultado;
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
