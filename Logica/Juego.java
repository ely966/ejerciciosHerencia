package Logica;

import javax.swing.Spring;

import Elementos.Elemento;
import Elementos.Jugador;

public class Juego {
	
	protected Jugador jugadores [];
	protected Elemento tablero [][];
	protected int alto;
	protected int ancho;
	protected int  numJugadores ;
	protected boolean finished =false;
	protected int jugadoJuega ;
	
	
	public void isTerminado() {
		
	}
	
	public String imprimeNombreJugadores() {
		
		StringBuilder nombres = new StringBuilder();
		//vehiculos[a].getMatricula()
		for (int i = 0; i < jugadores.length; ++i) {
			 nombres.append(jugadores[i].getCaracter());
		
		}
		String nombress =nombres.toString();
		return nombress;
	}
	
	public String imprimeValoresJugadores() {
		String valores =jugadores.toString(); 
		return valores;
	}
	
	
	
public void proximoJugador() {
		
	}
	
public void  moverJugador(char direc) {
	
	if (direc == 'N') {
		Elementos.Jugador.nextCol('n');
	}else if (direc == 'S') {
		Elementos.Jugador.nextCol('s');
	}else if (direc == 'E') {
		Elementos.Jugador.nextFil('e');
	}else if (direc == 'O') {
		Elementos.Jugador.nextFil('0');
	
}}	
	
}
