package Cuentas;


	import java.time.LocalDate;
import java.util.Scanner;
import Cuentas.CuentaJoven;

	public class MainCuentas {
		
		public static Scanner teclado = new Scanner(System.in);

		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			
			double cant;
			Cuenta c1 = new Cuenta("1",10);
			try {
				System.out.println(c1);
				
				System.out.println("Introduce la cantidad a reintegrar");
				cant = Double.parseDouble(teclado.nextLine());
				c1.reintegro(cant);
				System.out.println(c1);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			CuentaCredito c2 = new CuentaCredito(10,"1");
			try {
				System.out.println(c2);
				
				System.out.println("Introduce la cantidad a reintegrar");
				cant = Double.parseDouble(teclado.nextLine());
				c2.reintegro(cant);
				System.out.println(c2);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			LocalDate fecha = LocalDate.of(2001, 10, 30);

			CuentaJoven c3 = new CuentaJoven ("2234",20.0,"Eli", fecha);
			try {
				if (c3.esTitularValido() == true) {
					
					System.out.println("tu bonificacion consiste en : " + c3.getBonificacion());
					System.out.println("Introduce la cantidad a reintegrar");
					cant = Double.parseDouble(teclado.nextLine());
					c3.reintegro(cant);
					System.out.println("Tu saldo es ahora " + c3.getSaldo() );
					
					
					
				}else {
					System.out.println("Edad insuficiente");
				}
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

