package Libreria;

import java.time.LocalDate;

public class LibroDigital extends Libro {
	protected double precio;
	private String formato;
	
	
	

	public LibroDigital(String titulo, String autor, String editorial, double precio,
			String formato) throws Excepcionformatodigital {
		super(titulo, autor, editorial);
		this.precio = precio;
		
		this.formato = formato;
		if (!formato.equals ("epub") && !formato.equals ("pdf") && !formato.equals ("mobi")) {}
		else {throw  new Excepcionformatodigital("Formato no valido"); }	

		
	}
	public LibroDigital(String titulo, String autor, double precio,
			String formato)throws Excepcionformatodigital {
		super(titulo, autor);
		this.precio = precio;
		this.formato = formato;
		if (formato.equals ("epub")|| formato.equals ("pdf") || formato.equals ("mobi")) {}
		else {throw  new Excepcionformatodigital("Formato no valido"); }	
	}
	//throws Excepcionformatodigital


	public Boolean comprobar() throws Excepcionformatodigital {
		if (formato != "epub" && formato != "mobi" && formato != "pdf") throw  new Excepcionformatodigital("Formato no valido");	
		return true;
	}

	public double getPrecio() {
		return precio;
	}

	public String getFormato() {
		
		return formato;
	}
	

	@Override
	public String toString() {
		return super.toString() + "precio : " + precio + " formato: " + formato + "]";
	}

	public boolean comprarprecio(String string, String string2, double d, double e) {
		if (precio > e) {
			return true;
		}else {
			return false;
		}
		
	}
	
	//Comparar el precio de un libro digital y el de un libro fisico
	public Boolean  compararprecio(LibroFisico lf1) {
		
		if (precio > lf1.precio) {
			return false;
		}else {
			return true;
		}
		
	}
	
	
	

}
