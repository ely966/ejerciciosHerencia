package Libreria;

import java.time.LocalDate;

public class LibroDigital extends Libro {
	private double precio;
	private String formato;
	
	
	

	public LibroDigital(String titulo, String autor, String editorial, double precio,
			String formato) {
		super(titulo, autor, editorial);
		this.precio = precio;
		this.formato = formato;
	}

	public LibroDigital(String titulo, String autor, double precio,
			String formato) {
		super(titulo, autor);
		this.precio = precio;
		this.formato = formato;
	}
	
//	public Boolean compararprecio (String titulo, String autor, String editorial, LocalDate fechaedicion, double peso,double preciofisico) {
//		if (precio > preciofisico) {
//			return true;
//		}else {
//			return false;
//		}
//	
//	}

	public Boolean comprobar() throws Excepcionformatodigital {
		if (formato != "epub" && formato != "mobi" && formato != "pdf") throw  new Excepcionformatodigital("Formato no valido");	
		return true;
	}

	public double getPrecio() {
		return precio;
	}

	public String getFormato() throws Excepcionformatodigital {
		
		return formato;
	}
	

	@Override
	public String toString() {
		return "Libro:" + super.getTitulo() + "Autor" + super.getAutor() + "ISBN" + super.getIsbn() + "Codigo : " + super.getCodigo() + "precio :" + precio + " formato:" + formato + "]";
	}

	public boolean comprarprecio(String string, String string2, double d, double e) {
		if (precio > e) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	

}
