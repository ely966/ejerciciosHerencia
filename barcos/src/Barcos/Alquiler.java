package Barcos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler{
	private String nombre;
	private String dni;
	private LocalDate fechainicial; 
	private LocalDate fechafinal;
	private int posicionAmarrre;
	private Barco barcoo;
	
	public Alquiler(String nombre, String dni, LocalDate fechainicial, LocalDate fechafinal, int posicionAmarrre, Barco barcoo) {
		//super(valor,valorfijo);
		this.nombre = nombre;
		this.dni = dni;
		this.fechainicial = fechainicial;
		this.fechafinal = fechafinal;
		this.posicionAmarrre = posicionAmarrre;
		this.barcoo = barcoo;
	}


	public double Alquilerbarco(double eslora) throws BarcoAlquilerException {
		if (fechafinal.isAfter(fechainicial)) throw new BarcoAlquilerException("Fecha inicial debe ser ante sque la fecha final") ;
			
		
			long dias = ChronoUnit.DAYS.between(fechainicial, fechafinal);
			double resultado= barcoo.Calcularalquiler()* dias ;
			resultado=resultado+Barco.valor;
			return resultado;
		
	}


	public String getNombre() {
		return nombre;
	}


	public String getDni() {
		return dni;
	}


	public LocalDate getFechainicial() {
		return fechainicial;
	}


	public LocalDate getFechafinal() {
		return fechafinal;
	}


	public int getPosicionAmarrre() {
		return posicionAmarrre;
	}

	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
		Alquiler other = (Alquiler) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Alquiler [nombre=" + nombre + ", dni=" + dni + ", fechainicial=" + fechainicial + ", fechafinal="
				+ fechafinal + ", posicionAmarrre=" + posicionAmarrre + "]";
	}

	
	



}
