package Elementos;

import java.util.Random;


import Vehiculos.Vehiculo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int[4][4];
		
////	int matriz[][] = new int[4][4];
		//for (int i=0; i<2; i++) {
//		for (int j=0; j<4 ; j++) {
//			matriz[i][j] = (int) (Math.random()*10);
//		}
//	}
//	System.out.println();
//	for (int i=0; i<2; i=i+1) {
//		for (int j=0; j< 4 ; j=j+1) {
//			System.out.print("|" + matriz[i][j] + "|");
//		}
//		System.out.println("");
////			
////		
////			
////		}
		//poner en un array los elementos y de manera random ir colocando los elemntos
		
		Elementos[] element = new Elementos[5];
		for (int i=0; i<2; i++) {
			int posx,posy;
			do  {
				
				posx= (int)(Math.random()*5);
				posy= (int) (Math.random()*5);
				
			}while (matriz[posx][posy] != 0);
			matriz[posx][posy] = Elemento.Arbol;
		}
		System.out.println();
		for (int i=0; i<2; i=i+1) {
			for (int j=0; j< 4 ; j=j+1) {
				System.out.print("|" + matriz[i][j] + "|");
			}
			System.out.println("");
		}
		
		//dado random.nextInt(11));
	}

}
