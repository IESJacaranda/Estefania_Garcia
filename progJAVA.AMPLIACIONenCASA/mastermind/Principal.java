package mastermind;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		interfaz();
		


	}
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void interfaz() {
		
		Mastermind juego = new Mastermind();
		
		String claveSecreta = juego.generarClave();		
		
		String clave = "";
		
		System.out.println(claveSecreta);
		
	
		int a = 0;
		int intentos = 0;
		
		while (a==0) {
			
			try {
				System.out.println("Introduce una clave de cuatro dígitos: ");
				clave = teclado.nextLine();
				juego.comprobarClaveUsuario(clave);
				System.out.println(juego.compararClaves(claveSecreta, clave));
				intentos++;
				if(clave.equals(claveSecreta)||intentos==10) {
					a=1;
					
				}
				
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
		
		}
	
	}

}
