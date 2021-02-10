package pruebaCASA;

import java.util.Scanner;

public class cuenta_PRINCIPAL {

	public final static String MENU="1. Hacer un reintegro. \n2. Hacer un ingreso. \n3. Consulta de saldo y número de reintegros e ingresos.\n4. Salir del menú \n";

	
	public static void main(String[] args) {
		int menu =0;
		double cantidad;
		char respuesta = 'N';
		
		Scanner teclado = new Scanner(System.in);
		
		cuenta Estefania = new cuenta(50.0);
		
		 		 
		 while(respuesta!='S' && respuesta!='s') {
			 System.out.println(MENU);
			 menu=Integer.parseInt(teclado.nextLine());
			 
			 switch (menu) {
			case 1:
				System.out.println("Introduzca la cantidad a retirar ");
				cantidad=Double.parseDouble(teclado.nextLine());
				try {
					Estefania.reintegro(cantidad);
				} catch (Exception e) {
					System.out.println("Se ha producido un error. El valor ingresado no es correcto");
				}
				break;
				
			case 2:
				System.out.println("Introduzca la cantidad a ingresar ");
				cantidad=Double.parseDouble(teclado.nextLine());
				try {
					Estefania.ingreso(cantidad);
				} catch (Exception e) {
					System.out.println("Se ha producido un error. El valor ingresado no es correcto");
				}
				break;

			case 3:
				System.out.println(Estefania.toString());
				break;

			case 4:
				System.out.println("¿Está seguro que desea salir? (S/N) ");
				respuesta = teclado.nextLine().charAt(0);
				
				break;

			default:
				System.out.println("Ha ocurrido un error");
				break;
			}
		 }
		
		teclado.close();
		

	}

}
