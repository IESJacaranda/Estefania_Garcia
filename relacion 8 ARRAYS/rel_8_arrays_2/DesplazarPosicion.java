package rel_8_arrays_2;

import java.util.Scanner;

import pruebaMATRIZ.Matriz;

public class DesplazarPosicion {

	public static void main(String[] args) {
		
		
		//System.out.println(Matriz.imprimirEnString2(pedirNumeros()));
		
		System.out.println(Matriz.imprimirEnString2(desplazarPosicion(pedirNumeros())));
		
	}

	/**
	 * pide por teclado una lista de 10 numeros enteros
	 * @return lista
	 */
    public static int [] pedirNumeros() { //falta comprobar números
    	
    	Scanner teclado = new Scanner(System.in);
		int[] listaNumeros = new int[10];
    	
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.print("Introduce un número entero: ");
            listaNumeros[i] = Integer.parseInt(teclado.nextLine());
        }
        teclado.close();
        return listaNumeros;
    }
	
	
	public static int [] desplazarPosicion(int [] listaNumeros) { //sin acabar
		
		int ultimo;
        
        ultimo=listaNumeros[listaNumeros.length-1]; //guardo el último elemento del vector
        
        //for(){
            
        //}
        //pongo en primera pos la variable ultimo
        listaNumeros[0]=ultimo;
        
        return listaNumeros;
        
        
    }
		

	
}
