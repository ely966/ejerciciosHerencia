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
		Alquiler alq1= new Alquiler ("Maria", "98345212",LocalDate.parse("2021-10-01"),LocalDate.parse("2021-10-12"),23,v1);
		System.out.println(v1);
		System.out.println(y1);
		System.out.println(d1);
		try {
			System.out.println(alq1.Alquilerbarco());
		} catch (BarcoAlquilerException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		Alquiler alq2=new Alquiler("Pepe", "4324324", LocalDate.now(),null, 1, y1);
		
	}

}
