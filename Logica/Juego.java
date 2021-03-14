package Logica;



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
	
public String  moverJugador(char direc, Jugador jugad) {
	String mov = null ;
	
	if (direc == 'N') {
		jugad.nextCol('n');
		mov="Se ha movido al norte";
	}else if (direc == 'S') {
		jugad.nextCol('s');
		mov="Se ha movido al sur";
	}else if (direc == 'E') {
		jugad.nextFil('e');
		mov="Se ha movido al este";
	}else if (direc == 'O') {
		jugad.nextFil('0');
		mov="Se ha movido al oeste";
	
}
	return mov;//debo poner el resultado del movimiento pero si se encentra con otro jugador debe ser lucha
	}	
	
}
