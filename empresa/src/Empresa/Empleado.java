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
	


	public double getSueldo() {
		return sueldo;
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
	
	public double calcularSalario() throws ExceptionFechaEmpleadosTempo {
		this.sueldo = sueldo;
		return sueldo;
	}


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", nif=" + nif + ", sueldo=" + sueldo + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
