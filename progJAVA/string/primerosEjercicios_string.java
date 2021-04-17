package string;

import java.util.Scanner;

public class primerosEjercicios_string {

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	
		
//		String nombre;
//		char cBuscado, cReemplazo;
//		
//		
//		System.out.println("Introduce tu nombre: ");
//		nombre = teclado.nextLine();
//		
//		System.out.println("Introduce el caracter a buscar: ");
//		cBuscado = teclado.nextLine().charAt(0);
//				
//		System.out.println("Introduce el caracter a reemplazar: ");
//		cReemplazo = teclado.nextLine().charAt(0);
//		
//		nombre = nombre.replace(cBuscado, cReemplazo);
//		
//		if (Character.isUpperCase(cBuscado)) {
//			nombre = nombre.replace(Character.toLowerCase(cBuscado), cReemplazo);
//		}
//		else {
//			nombre = nombre.replace(Character.toUpperCase(cBuscado), cReemplazo);
//		}
//		
//		System.out.println(nombre);
//	}
		
		
		
		String cadena, cadena2;
		
		
		System.out.println("Escribe la primera cadena: ");
		cadena = teclado.nextLine();
		System.out.println("Escribe la segunda cadena: ");
		cadena2 = teclado.nextLine();
		
		System.out.println(cadena.equals(cadena2));
	}
		
}
