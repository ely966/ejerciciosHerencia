package Barcos;
import java.time.LocalDate;

import Barcos.Barco;

public class Deportivos extends Barco{

	private double  potenciaCV; 

		
	public Deportivos(String matricula, double eslora, LocalDate anofabricacion, double valor, double potenciaCV) {
		super(matricula, eslora, anofabricacion, valor);
		this.matricula = matricula;
		this.eslora = eslora;
		this.anofabricacion = anofabricacion;
		this.valor = valor * eslora;
		this.potenciaCV = potenciaCV;
	}


	public double getPotenciaCV() {
		return potenciaCV;
	}


	public void setPotenciaCV(double potenciaCV) {
		this.potenciaCV = potenciaCV;
	}
	
	
	
	
	
	
	
	
	
	
}
