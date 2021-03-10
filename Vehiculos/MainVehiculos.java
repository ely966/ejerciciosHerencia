package Vehiculos;

import java.util.Scanner;

import Libreria.Libro;

public class MainVehiculos {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String matricula;
		String gama;
		Vehiculo[] vehiculos = new Vehiculo[200];
		Alquiler[] alquileres = new Alquiler[200];
		
		String opc= "0";
		int i =0;
		while (!opc.equals("3")) {
			System.out.println("1. Alta de vehiculo ");
			System.out.println("2. Calculo de precio de alquiler");
			System.out.println("3. Salir");
			
			System.out.println("Elige una opcion :");
			opc= teclado.nextLine();
			
			switch (opc) {
			case "1" :
				System.out.println("¿Que tipo de vehiculo quieres dar de alta ? ");
				String tipo= teclado.nextLine();
				
				switch (tipo) {
				case "coche":
					System.out.println("Introduce los datos del vehiculo que desea introducir");
					//String matricula, String gama, String tipocombustible)
					System.out.println("Introduce la matricula");
					matricula= teclado.nextLine();
					System.out.println("Introduce la gama");
					gama= teclado.nextLine();
					System.out.println("Introduce el tipo de combustible");
					String tipocombus= teclado.nextLine();

					try {
						Coche c1= new Coche (matricula,gama,tipocombus);
						System.out.println(c1);
						vehiculos[i]=c1;
						
						
					} catch (ExcepcionGama e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					
					
					
					
					
				case "microbus" :
					
					System.out.println("Introduce los datos del vehiculo que desea introducir");
					System.out.println("");
					System.out.println("Introduce la matricula");
					matricula= teclado.nextLine();
					System.out.println("Introduce la gama");
					gama= teclado.nextLine();
					System.out.println("Introduce numero de plazas");
					int numplazas= Integer.parseInt(teclado.nextLine());
					//this.numplazas = numplazas;
					
					try {
						Microbus m1 = new Microbus (matricula, gama, numplazas);
						vehiculos[i]=m1;
						
						
					} catch (ExcepcionGama e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						
					}
					System.out.println("");
					break;
					
					
					
				case "furgoneta":
					System.out.println("Introduce los datos del vehiculo que desea introducir");
					System.out.println("");
					
					//this.pesoQueSoporta = pesoQueSoporta;
					System.out.println("Introduce la matricula");
					matricula= teclado.nextLine();
					System.out.println("Introduce la gama");
					gama= teclado.nextLine();
					System.out.println("Introduce el peso maximo");
					Double pesomax = Double.parseDouble(teclado.nextLine());
					
					try {
						Furgonetas f1= new Furgonetas (matricula,gama,pesomax);
						vehiculos[i]=f1;
						
					} catch (ExcepcionGama e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					
					break;
					
				
				}
				
				break;
			case "2" :
				System.out.println(vehiculos[0]);
				System.out.println(vehiculos[1]);
				
				System.out.println("Introduce la Matricula");
				matricula= teclado.nextLine();
				System.out.println("Introduce numero dias que etsara alquilado el coche");
				int dias= Integer.parseInt(teclado.nextLine());
				
				Alquiler a1= new Alquiler(dias);
				a1.calcularPrecioAlquiler(matricula,dias);
				
				
				int a=0;
				
				while (!(vehiculos[a].getMatricula()).equals(matricula)) {
					a=a+1;
				}
				double alquiler=0;
				if ((vehiculos[a].gama).equals ("baja")) {
					alquiler = 30 * dias;
					
				}else if ((vehiculos[a].gama).equals ("media")) {
					alquiler = 40 * dias;
				}else if ((vehiculos[a].gama).equals ("alta")) {
					alquiler = 50 * dias;
				}
				
				System.out.println("¿Que tipo de vehiculo quieres dar de alta ? ");
				tipo= teclado.nextLine();
				Vehiculo co = vehiculos[a];
				if (tipo.equals ("coche")) {
					
					 co.CalcularPrecioextra ( dias);
					alquiler = alquiler + 30 * dias;
					
				}else if (tipo.equals ("furgoneta")) {
					alquiler = 40 * dias;
				}else if ((vehiculos[a].gama).equals ("alta")) {
					alquiler = 50 * dias;
				}
				
					
				break;
			case "3": 
				break;
			}
			i=i+1; //contar en el array u guardar el siguiente 
		}
		
		
		
	}

}
