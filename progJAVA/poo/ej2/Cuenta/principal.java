package poo.ej2.Cuenta;

import java.util.Scanner;

public class principal {
	
	public final static String MENU="1. Retirada de efectivo. \n2. Ingreso de efectivo. \n3. Consulta de saldo y número de retiradas e ingresos.\n4. Salir del menú \n";

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		Scanner teclado = new Scanner(System.in);
		boolean finalizar = false;
		
		while (!finalizar) {
			mostrarMenu();
			int opcion = Integer.parseInt(teclado.nextLine());
			
			switch(opcion) {
			case 1:
				try {
					System.out.println("Qué cantidad quiere retirar?");
					double cantidadARetirar = Double.parseDouble(teclado.nextLine());
					cuenta.hacerReintegro(cantidadARetirar);
				} catch (Exception e) {
					System.out.println("Se ha producido una excepción. El valor ingresado no es correcto");
				}	
				break;
			case 2:
				try {
					System.out.println("Qué cantidad quiere ingresar?");
					double cantidadAIngresar = Double.parseDouble(teclado.nextLine());
					cuenta.hacerIngreso(cantidadAIngresar);
				} catch (Exception e) {
					System.out.println("Se ha producido una excepción. El valor ingresado no es correcto");
				}	
				break;
			case 3:
				System.out.println(cuenta.getStatus());
				break;
			case 4:
				System.out.println(cuenta.getSaldoFinal());
				System.out.println("¿Quiere finalizar (s/n)?");
				if(teclado.nextLine()=="s" || teclado.nextLine()=="S") {
					finalizar = true;
				}
				break;
			}
	
		}teclado.close();
	}	
	
	

	private static void mostrarMenu() {
		System.out.println(MENU);
	}
}