package rel_8_arrays_1;

import java.util.Scanner;

public class OrdenInverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ordenInverso();

	}

	public static void ordenInverso() {
		
		Scanner teclado = new Scanner(System.in);
		int[] listaNumeros = new int[10];
	    
	    System.out.println("Introduzca 10 números enteros:");
	    System.out.println("(Recuerde pulsar la tecla 'INTRO' después de introducir cada número)");

	    for (int i = 0; i < listaNumeros.length; i++) {
	      listaNumeros[i] = Integer.parseInt(teclado.nextLine());
	    }
	    
	    System.out.println("\nLos números introducidos, en orden inverso, son:");
	    for (int i = 9; i >= 0; i--) {
	      System.out.println(listaNumeros[i]);
	    }
	    teclado.close();
	  }
	

	
}
