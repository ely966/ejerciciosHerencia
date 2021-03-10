package Elementos;

public abstract class Elemento {
	protected char simbolo;

	public Elemento(char simbolo) {
		super();
		this.simbolo = simbolo;
	}

	public Elemento() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Elemento [simbolo=" + simbolo + "]";
	}
	
	
	
	
}
