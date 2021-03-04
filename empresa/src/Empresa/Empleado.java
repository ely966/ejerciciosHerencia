package Empresa;

public abstract class  Empleado {
	private String nombre;
	private int edad;
	private String nif;
	private double sueldo;
	
	
	
	
	public Empleado(String nombre, int edad, String nif, double sueldo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nif = nif;
		this.sueldo = sueldo;
	}
	
	
	
	public Empleado(String nombre, int edad, String nif) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nif = nif;
	}



	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public String getNif() {
		return nif;
	}
	
	public double calcularSaldo() throws ExceptionFechaEmpleadosTempo {
		this.sueldo = sueldo;
		return sueldo;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nif == null) ? 0 : nif.hashCode());
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
		Empleado other = (Empleado) obj;
		if (nif == null) {
			if (other.nif != null)
				return false;
		} else if (!nif.equals(other.nif))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
}
