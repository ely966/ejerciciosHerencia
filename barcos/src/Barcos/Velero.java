package Barcos;

import java.time.LocalDate;

import Barcos.Barco;

public class Velero extends Barco{
	private int numMastiles;

	
	public Velero(String matricula, double eslora, LocalDate anofabricacion, double valor, int numMastiles) {
		super(matricula, eslora, anofabricacion, valor);
		this.matricula = matricula;
		this.eslora = eslora;
		this.anofabricacion = anofabricacion;
		this.valor = valor * eslora;
		this.numMastiles = numMastiles;
	}


	public int getNumMastiles() {
		return numMastiles;
	}


	public void setNumMastiles(int numMastiles) {
		this.numMastiles = numMastiles;
	}
	
	
	



}
