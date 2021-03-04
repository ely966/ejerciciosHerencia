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

	@Override
	public double calcularAlquiler() {
		double resultadoaql=super.calcularAlquiler() +potenciaCV;
		return resultadoaql;
	}
	
	public double getPotenciaCV() {
		return potenciaCV;
	}


	public void setPotenciaCV(double potenciaCV) {
		this.potenciaCV = potenciaCV;
	}
	
	
	
	
	
	
	
	
	
	
}
