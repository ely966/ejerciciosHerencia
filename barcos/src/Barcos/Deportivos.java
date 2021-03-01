package Barcos;
import java.time.LocalDate;

import Barcos.Barco;

public class Deportivos extends Barco{

	private double  potenciaCV; 

		
	public Deportivos(String matricula, double eslora, int anofabricacion, double potenciaCV) {
		super(matricula, eslora, anofabricacion);
	//	this.matricula = matricula;
	//	this.eslora = eslora;
	//	this.anofabricacion = anofabricacion;
		this.potenciaCV = potenciaCV;
	}


	public double getPotenciaCV() {
		return potenciaCV;
	}


	public void setPotenciaCV(double potenciaCV) {
		this.potenciaCV = potenciaCV;
	}
	
	
	
	
	
	
	
	
	
	
}
