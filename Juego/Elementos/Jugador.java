package Elementos;

public class Jugador extends Elemento{
	protected char caracter;
	protected int fil;
	protected int col;
	protected int dinero;
	protected int pociones;
	protected int gemas;
	protected int fuerza;
	protected int magia;
	protected int veocidad;
	



	public Jugador(char caracter, int fil, int col) {
		
		this.caracter = caracter;
		this.fil = fil;
		this.col = col;
	}




	public int getFil() {
		return fil;
	}




	public void setFil(int fil) {
		this.fil = fil;
	}




	public int getCol() {
		return col;
	}




	public void setCol(int col) {
		this.col = col;
	}




	public int getDinero() {
		return dinero;
	}




	public void setDinero(int dinero) {
		this.dinero = dinero;
	}




	public int getPociones() {
		return pociones;
	}




	public void setPociones(int pociones) {
		this.pociones = pociones;
	}




	public int getGemas() {
		return gemas;
	}




	public void setGemas(int gemas) {
		this.gemas = gemas;
	}




	public int getFuerza() {
		return fuerza;
	}




	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}




	public int getMagia() {
		return magia;
	}




	public void setMagia(int magia) {
		this.magia = magia;
	}




	public int getVeocidad() {
		return veocidad;
	}




	public void setVeocidad(int veocidad) {
		this.veocidad = veocidad;
	}




//	public String resumen () {
//		return "aa";
//	}
//
//	public  nextCol(char) {
//		return int
//	}
//	
//	public nextFil(char) {
//		return int;
//	}
	
	
	
	

	@Override
	public String toString() {
		return "Jugador [caracter=" + caracter + ", fil=" + fil + ", col=" + col + ", dinero=" + dinero + ", pociones="
				+ pociones + ", gemas=" + gemas + ", fuerza=" + fuerza + ", magia=" + magia + ", veocidad=" + veocidad
				+ "]";
	}
	
	
	
	
	
	
	
	
}
