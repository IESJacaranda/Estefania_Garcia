package poo.ej4.Complejo;

import java.util.Scanner;

public class Main {
	
	public final static String MENU = "\n Escoge una opción del menú:\n 1. Sumar Complejos\n 2. Restar Complejos\n 3. Consultar si son iguales\n 4. Salir";

	public static void main(String[] args) {
		
		interfaz();
		
		}
	
	static Scanner teclado = new Scanner(System.in); //para poder llamarlo en más de un método
	
		public static void interfaz() {
		
			int opcion = 0;
				
		while (opcion!=4) {
			
			System.out.println(MENU);
			opcion = Integer.parseInt(teclado.nextLine());
			
			try {
				switch (opcion) {
			case 1:
				Complejo c1 = pedirComplejos();
				Complejo c2 = pedirComplejos();
				System.out.println(c1.suma(c2));
				break;
			case 2:
				c1 = pedirComplejos();
				c2 = pedirComplejos();
				System.out.println(c1.resta(c2));
				break;
			case 3:
				c1 = pedirComplejos();
				c2 = pedirComplejos();
				if (c1.equals(c2)) {
					System.out.println("Los números son iguales");
				}else {
					System.out.println("Los números son diferentes");
				}
				break;
			case 4:
				System.out.println("Salir del programa");
				break;
			default:
				break;
			}
			}catch (Exception ex) {
				System.out.println(ex.getMessage());
			}

		}

		}
		/**
		 * Este método pide números para formar un complejo
		 * @return número complejo
		 * @throws Exception
		 */
		public static Complejo pedirComplejos() throws Exception{
			Complejo numero = new Complejo();
			
			try {
				System.out.println("Introduzca la parte real del número complejo");
			numero.setReal(Double.parseDouble(teclado.nextLine()));
			
			System.out.println("Introduzca la parte imaginaria del número complejo");
			numero.setImaginaria(Double.parseDouble(teclado.nextLine()));
			}catch (Exception ex) {
				throw new Exception("El valor introducido no es correcto");
			}
						
			return numero;
		
	}

}
