package pruebaCASA;

import java.util.Scanner;

public class Complejo_Main {

	public final static String MENU = "\nSeleccione la opción que desea:\n1. Sumar Complejos \n2. Restar Complejos \n3. Consultar si son iguales \n4. Salir";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int menu=0;
		
		System.out.println("Introduzca los valores del Complejo A");
		Complejo complejoA= new Complejo(Double.parseDouble(teclado.nextLine()), 
				Double.parseDouble(teclado.nextLine()));
		
		System.out.println("Introduzca los valores del Complejo B");
		Complejo complejoB= new Complejo(Double.parseDouble(teclado.nextLine()), 
				Double.parseDouble(teclado.nextLine()));
		
		//System.out.println(complejoA);
		//System.out.println(complejoB);
		
			while(menu!=4) {
				
			System.out.println(MENU);
			menu = Integer.parseInt(teclado.nextLine());
			
			switch (menu) {
			case 1:
				System.out.println(complejoA.sumaComplejo(complejoB));
				break;
				
			case 2:
				System.out.println(complejoA.restaComplejo(complejoB));
				break;
				
			case 3:
				System.out.println("Complejo A: "+ complejoA.toString());
				System.out.println("Complejo B: "+ complejoB.toString());
				System.out.println(complejoA.equals(complejoB));
				break;
				
			case 4:
				System.out.println("Programa Finalizado");
				break;
			default:
				break;
			}
		}
		teclado.close();
		
	}

}
