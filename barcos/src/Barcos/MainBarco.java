package Barcos;

import java.time.LocalDate;
import java.util.Scanner;

public class MainBarco {
	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Barcos b1 = new Barcos ();
		
		Velero v1= new Velero ("ADFER34",12.5,1997,3);
		
		
		
		//yates
		
		Yates y1= new Yates ("DFG34",14.2,2004,80.0, 200); 
		
		
		
		//Deportivos(String matricula, double eslora, LocalDate anofabricacion, double valor, double potenciaCV)
		
		Deportivos d1= new Deportivos ("QWER78",21.0,2003, 50.0);
		
		
		
		
		
	}

}
