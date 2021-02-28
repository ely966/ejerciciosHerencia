package Barcos;
import java.time.LocalDate;
import Barcos.Barco;


public class Yates extends Barco {

private double potenciaCVyates ;
private int num_camarotes;


public Yates (String matricula, double eslora, LocalDate anofabricacion, double valor, double potenciaCVyates, int num_camarotes) {
	super(matricula, eslora, anofabricacion, valor);
	this.matricula = matricula;
	this.eslora = eslora;
	this.anofabricacion = anofabricacion;
	this.valor = valor * eslora;
	this.potenciaCVyates = potenciaCVyates;
	this.num_camarotes = num_camarotes;
}


public double getPotenciaCVyates() {
	return potenciaCVyates;
}


public void setPotenciaCVyates(double potenciaCVyates) {
	this.potenciaCVyates = potenciaCVyates;
}


public int getNum_camarotes() {
	return num_camarotes;
}


public void setNum_camarotes(int num_camarotes) {
	this.num_camarotes = num_camarotes;
}




}
