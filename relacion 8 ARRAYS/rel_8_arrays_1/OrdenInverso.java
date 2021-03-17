package rel_8_arrays_1;

import java.util.Scanner;

import pruebaMATRIZ.Matriz;


public class OrdenInverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ordenarInverso();
		
		//System.out.println(Matriz.imprimirEnString2(pedirNumeros()));
		
		System.out.println(Matriz.imprimirEnString2(ordenarEnInverso(pedirNumeros())));
		

	}

		/* primera prueba del ejercicio menos optima porque pide los numeros dentro del mismo metodo
		 
		 
	public static void ordenarInverso() {
		
		Scanner teclado = new Scanner(System.in);
		int[] listaNumeros = new int[10];
	    
	    System.out.println("Introduzca 10 números enteros:");
	    System.out.println("(Recuerde pulsar la tecla 'INTRO' después de introducir cada número)");

	    for (int i = 0; i < listaNumeros.length; i++) {
	      listaNumeros[i] = Integer.parseInt(teclado.nextLine());
	    }
	    
	    System.out.println("Los números introducidos, en orden inverso, son: ");
	    for (int i = 9; i >= 0; i--) { //empiezo con la i=9 y con i-- para que recorra hacia atrás
	      System.out.println(listaNumeros[i]);
	    }
	    teclado.close();
	  }*/
	
	
	
	public static int [] pedirNumeros() { 
    	
    	Scanner teclado = new Scanner(System.in);
		int[] listaNumeros = new int[10];
    	
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.print("Introduce un número entero: ");
            listaNumeros[i] = Integer.parseInt(teclado.nextLine());
        }
        teclado.close();
        return listaNumeros;
    }
	/**
	 * invierte el orden de un vector que recibe como parametro
	 * @param vector de enteros
	 * @return vector de enteros igual que el original pero en orden inverso
	 */
	public static int [] ordenarEnInverso(int [] vector) {
		
		int [] inverso = new int [vector.length];
		
		for (int i=0; i<vector.length; i++) {
			inverso[vector.length-1-i] = vector[i];
		}
		
		return inverso;
	}
	

	
}
