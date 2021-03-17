package rel_8_arrays_2;

import java.util.Scanner;

import pruebaMATRIZ.Matriz;

public class DesplazoPosicionVector {

	public static void main(String[] args) {
		
		
		//System.out.println(Matriz.imprimirEnString2(pedirNumeros()));
		
		System.out.println(Matriz.imprimirEnString2(desplazarPosicionDerecha(pedirNumeros())));
		
	}

	/**
	 * pide por teclado una lista de 10 numeros enteros
	 * @return lista
	 */
    public static int [] pedirNumeros() { //hacer interfaz como pone en el ejercicio
    	
    	Scanner teclado = new Scanner(System.in);
		int[] listaNumeros = new int[10];
    	
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.print("Introduce un número entero: ");
            listaNumeros[i] = Integer.parseInt(teclado.nextLine());
        }
        teclado.close();
        return listaNumeros;
    }
	
	
	public static int [] desplazarPosicionDerecha(int [] listaNumeros) { //falta comprobar excepciones (null...)
		
		int ultimo;
        
        ultimo=listaNumeros[listaNumeros.length-1]; //guardo el último elemento del vector
        
        for(int i=listaNumeros.length-1; i>0; i--){
        	listaNumeros[i]=listaNumeros[i-1]; //la ultima pos sea igual que la anterior menos 1
        	}
        
        //pongo en primera pos la variable ultimo
        listaNumeros[0]=ultimo;
        		
		return listaNumeros;
        
    }
	
	
	public static int [] desplazarPosicionIzq(int [] vector) {
		
		
		
		return vector;
	}
		

	
}






