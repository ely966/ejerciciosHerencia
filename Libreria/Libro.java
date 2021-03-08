package Libreria;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Libro {
	//public static final String LocalDate = null;
	private String titulo;
	private String editorial;
	private String isbn;
	private LocalDate fechaedicion;
	private int codigo;
	private static int CODIGOSIG=1;
	private String autor;
	
	
	
	public Libro(String titulo, String autor, String editorial) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.codigo = CODIGOSIG;
		this.CODIGOSIG=CODIGOSIG+1;
		
	}

	public Libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.codigo = CODIGOSIG;
		this.CODIGOSIG=CODIGOSIG+1;
		
	}
	
	
	public int comprobarDias (Libro l3) {
		long dias = ChronoUnit.DAYS.between(fechaedicion, l3.fechaedicion);
		if (dias < 0) {
			dias= -(dias);
			
		}
		return (int) dias;
	}

	

	public Libro() {
		super();
	}

	public String getAutor() {
		return autor;
	}

	public String calcularIsbn() {
		//super();
		
		//primero quito todos lso espacios en blanco
		//titulo.replace(" ", "");
		//recoger los 3 primeros caracteres de titulo
		titulo.substring(0, 3);
		StringBuilder isbnnew= new StringBuilder();
	isbnnew.append(String.valueOf(titulo.replace(" ", "").substring(0, 3)));
		isbnnew.append(String.valueOf(titulo.length()));
		//añadir 3 ultimas caracter del autor y longitud
		
		isbnnew.append(String.valueOf(autor.substring(autor.replace(" ", "").length()-3, autor.replace(" ", "").length())));
		isbnnew.append(String.valueOf(autor.length()));
	
		isbn =isbnnew.toString();
	
		return isbn;
	}








	public String getEditorial() {
		return editorial;
	}




	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}



	public LocalDate getFechaedicion() {
		return fechaedicion;
	}



	//LocalDate.parse("2002-04-07")
	public void setFechaedicion(LocalDate fechaedicion) {
		this.fechaedicion = fechaedicion;
	}

	public String getTitulo() {
		return titulo;
	}


	



	public String getIsbn() {
		return isbn;
	}



	public int getCodigo() {
		return codigo;
	}



	public int getCODIGOSIG() {
		return CODIGOSIG;
	}



	public String masCaro (LibroFisico lf1, LibroFisico lf2, LibroDigital ld1, LibroDigital ld2) {
		double mascaro = lf1.getPrecio();
		String resultado = null;
		if (mascaro < lf2.getPrecio() ) {
			mascaro = lf2.getPrecio();
		}
		if (mascaro < ld1.getPrecio()) {
			mascaro = ld1.getPrecio();
		}
		if (mascaro < ld2.getPrecio()) {
			mascaro= ld2.getPrecio();
		}
		if (mascaro == lf1.getPrecio()) {
			resultado = "El primer libro es el mas caro";
		}
		else if (mascaro == lf2.getPrecio()) {
			resultado = "El segundo libro es el mas caro";
		}else if (mascaro == ld1.getPrecio()) {
			resultado = "El tercer libro es el mas caro";
		}
		else if (mascaro == ld2.getPrecio()){
			resultado = "El cuarto libro es el mas caro";
		}
		return resultado;
	}











	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Libro: Titulo:" + titulo + "autor:" + autor + " Isbn=" + isbn + " codigo:" + codigo ;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
