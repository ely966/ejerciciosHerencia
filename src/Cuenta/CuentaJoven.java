package Cuentas;
import java.time.temporal.ChronoUnit;

import java.time.LocalDate;

public class CuentaJoven extends Cuenta {
	private String titular;
	private static final double bonificacion = 0.20;
	private LocalDate fechanacimiento;
	
	public CuentaJoven(String numCuenta, double saldo, String titular, LocalDate fechanacimiento) throws Exception {
		super(numCuenta, saldo);
		this.titular = titular;
		this.fechanacimiento = fechanacimiento;
	}

	public CuentaJoven(String numCuenta, String titular, LocalDate fechanacimiento) throws Exception {
		super(numCuenta);
		this.titular = titular;
		this.fechanacimiento = fechanacimiento;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public LocalDate getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(LocalDate fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public static double getBonificacion() {
		return bonificacion;
	}

	public CuentaJoven(String numCuenta, LocalDate fechanacimiento, String titular) throws Exception {
		super(numCuenta);
		this.titular = titular;
	}

	
	

	public Boolean esTitularValido() {
		//LocalDate fecha = LocalDate.of(this.fechanacimiento);
		LocalDate hoy = LocalDate.now();
		long edad= ChronoUnit.YEARS.between(fechanacimiento, hoy);
		
		if (edad > 18 && edad < 25) {
		//getFechaNacimiento().isAfter(fecha)
			return true;
		}else
		{
			return false;
		}
	}
	
	
	public void reintegro (double cantidad) throws Exception{
		if (this.esTitularValido() == true) {
			double resto;
			resto= super.getSaldo();
			resto-=cantidad;
		} else {
			throw new Exception ("El titular no es valido, pr lo tango no puede sacar dinero ");
		}
	}
	
	
	
	
	@Override
	public String toString() {
		return "CuentaJoven [titular=" + titular + ", fechanacimiento=" + fechanacimiento + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
