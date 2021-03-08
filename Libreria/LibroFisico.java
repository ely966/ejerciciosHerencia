package Libreria;

import java.time.LocalDate;

public class LibroFisico extends Libro {
	private double peso;
	protected double precio;
	
	
	public LibroFisico(String titulo, String autor, String editorial, double peso,
			double precio) {
		super(titulo, autor, editorial);
		this.peso = peso;
		this.precio = precio;
	}
	
	public LibroFisico(String titulo, String autor, double peso,
			double precio) {
		super(titulo, autor);
		this.peso = peso;
		this.precio = precio;
	}

	public double getPeso() {
		return peso;
	}

	public double getPrecio() {
		return precio;
	}
	
	//Comparar el precio de un libro digital y el de un libro fisico
		public Boolean  compararprecio(LibroDigital ld1) {
			
			if (precio > ld1.precio) {
				return false;
			}else {
				return true;
			}
			
		}
	
	
	
	@Override
	public String toString() {
		return "Auto " + super.getAutor() + "ISBN " + super.getIsbn() + " Codigo :  " +super.getCodigo() + " Precio: " + precio + "  Peso : " + peso + "Libro: " + super.getTitulo();
	}

	public Boolean  comprarprecio(String string, String string2, double d, String string3) {
		if (precio > d) {
			return true;
		}else {
			return false;
		}
	}


	
	
	
	
}
