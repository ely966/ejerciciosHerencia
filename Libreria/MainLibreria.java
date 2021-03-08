package Libreria;

import java.time.LocalDate;
import java.util.Scanner;

import Libreria.LibroDigital;;
public class MainLibreria {
	public static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fisico.String titulo, String autor, String editorial, LocalDate fechaedicion, double peso,double precio
		LibroFisico lf1 = new LibroFisico ("Harry Potter y la camasa de los secretos", "J.K. Rowling",2.0, 14.40);
		LibroFisico lf2 = new LibroFisico ("Harry Potter y la piedra filosofal", "J.K. Rowling","Salamandra",2.0, 11.40);
		System.out.println(lf1);
		System.out.println(lf2);
		//digital
		//String titulo, String autor, String editorial, LocalDate fechaedicion, double precio,String formato
		
		//muestre informacion
		//libro String titulo, String autor, String editorial, LocalDate fechaedicion
		Libro l1= new Libro ("Las maravillas", "Pedro");
		Libro l3= new Libro ("Las maravillas2", "Sandra");
		System.out.println(l1);
		
		
		
		
		LibroDigital ld1 = new LibroDigital ("Las aventuras de nona", "Felipa Paredes", 12.50, "pdf");
		
		System.out.println(ld1);
		
		LibroDigital ld2 = new LibroDigital ("Las aventuras de luna", "Felipa Paredes", 12.50, "dvd");


		
		try {
			System.out.println(ld2.comprobar());
		}catch (Excepcionformatodigital e) {
			e.getMessage();
		}
	
		//Introducir las fechas  las fechas
		LocalDate fecha= LocalDate.parse("2002-04-07");
		l1.setFechaedicion(fecha);
		LocalDate fechas= LocalDate.parse("2002-04-17");
		l3.setFechaedicion(fechas);
		
		
		//comprobar diferencias de dias
		System.out.println(l1.comprobarDias(l3));
				

	
		

		
		//calcular cual libro de lso 4 es mas caro
		
		//Crear dos libros fisicos
		//Fisico.String titulo, String autor, String editorial, LocalDate fechaedicion, double peso,double precio
				LibroFisico lf4 = new LibroFisico ("Las nubes", "Maria Dolores",2.0, 11.40);
				LibroFisico lf5 = new LibroFisico ("Las nubes 2", "Maria Dolores","Salamandra",2.0, 11.80);
		//Dos libros digitales
				LibroDigital ld3 = new LibroDigital ("Las aventuras de luna", "Felipa Paredes", 12.50, "dvd");
				LibroDigital ld4 = new LibroDigital ("Las aventuras de nona", "Felipa Paredes",12.53, "pdf");
	
				
		Libro l2 = new Libro();
		System.out.println(l2.masCaro(lf4,lf5,ld3, ld4));
		
	}

}
