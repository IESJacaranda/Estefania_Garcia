package rel_8_arrays_2;

import java.util.Scanner;

import pruebaMATRIZ.Matriz;

public class DesplazoPosicionVector {

	public static void main(String[] args) {
		/*
		int [] vector = {5, 10, 2, 30, 4, 15, 6, 88, 3, 9};
			  //derecha {9, 5, 10, 2, 30, 4, 15, 6, 88, 3}; 
			  //izquier {10, 2, 30, 4, 15, 6, 88, 3, 9, 5}
		
		System.out.println(Matriz.imprimirEnString2(vector));
		//int [] v1 = {1};
		try {
			System.out.println((Matriz.imprimirEnString2(desplazarPosicionDerecha(vector))));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println((Matriz.imprimirEnString2(desplazarPosicionIzq(vector))));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		//System.out.println(Matriz.imprimirEnString2(pedirNumeros()));
		
		//System.out.println(Matriz.imprimirEnString2(desplazarPosicionDerecha(pedirNumeros())));
		*/
		interfaz();
	}


	
	/**
	 * este metodo desplaza los elementos de un vector hacia la derecha
	 * @param vector []
	 * @return vector con los elementos desplazados una posicion a la derecha
	 * @throws Exception 
	 */
	public static int [] desplazarPosicionDerecha(int [] listaNumeros) throws Exception { 
		
		if (listaNumeros!=null && listaNumeros.length>=2) {
			
			int ultimo;
       
	        ultimo=listaNumeros[listaNumeros.length-1]; //guardo el último elemento del vector
	        
	        for(int i=listaNumeros.length-1; i>0; i--){
	        	listaNumeros[i]=listaNumeros[i-1]; //la ultima pos sea igual que la anterior menos 1
	        	}
	        
	        //pongo en primera pos la variable ultimo
	        listaNumeros[0]=ultimo;
        
		}else {
			throw new Exception("No se puede desplazar este vector.");
		}
			
		return listaNumeros;
        
    }
	
	/**
	 * este metodo desplaza los elementos de un vector hacia la izquierda
	 * @param vector []
	 * @return vector con los elementos desplazados una posicion a la izquierda
	 * @throws Exception 
	 */
	public static int [] desplazarPosicionIzq(int [] listaNumeros) throws Exception {
		
		if (listaNumeros!=null && listaNumeros.length>=2) {
			int primero =listaNumeros[0]; //guardo el primer elemento del vector
		
			for (int i=0; i<listaNumeros.length-1;i++) {
				listaNumeros[i]=listaNumeros[i+1]; //movemos a la posicion anterior
			}
	        
	        listaNumeros[listaNumeros.length-1]= primero; //poner la ultima posicion como la variable primero
        
		}else {
			throw new Exception("No se puede desplazar este vector.");
		}
		
        		
		return listaNumeros;
	}
		

		/**
	 * pide por teclado una lista de 10 numeros enteros
	 * @return lista
	 */
    public static int [] pedirNumeros() { 
    	
    	Scanner teclado = new Scanner(System.in);
		int[] listaNumeros = new int[10];
    	
        for (int i = 0; i < listaNumeros.length; i++) {
        	if (i==0) {
        		System.out.print("Introduce el número en la posición (1/10): ");
            listaNumeros[i] = Integer.parseInt(teclado.nextLine());
        	}
        	else if (i==1) {
        		System.out.print("Introduce el número en la posición (2/10): ");
            listaNumeros[i] = Integer.parseInt(teclado.nextLine());
        	}
        	else if (i==2) {
        		System.out.print("Introduce el número en la posición (3/10): ");
            listaNumeros[i] = Integer.parseInt(teclado.nextLine());
        	}
        	else if (i==3) {
        		System.out.print("Introduce el número en la posición (4/10): ");
            listaNumeros[i] = Integer.parseInt(teclado.nextLine());
        	}
        	else if (i==4) {
        		System.out.print("Introduce el número en la posición (5/10): ");
            listaNumeros[i] = Integer.parseInt(teclado.nextLine());
        	}
        	else if (i==5) {
        		System.out.print("Introduce el número en la posición (6/10): ");
            listaNumeros[i] = Integer.parseInt(teclado.nextLine());
        	}
        	else if (i==6) {
        		System.out.print("Introduce el número en la posición (7/10): ");
            listaNumeros[i] = Integer.parseInt(teclado.nextLine());
        	}
        	else if (i==7) {
        		System.out.print("Introduce el número en la posición (8/10): ");
            listaNumeros[i] = Integer.parseInt(teclado.nextLine());
        	}
        	else if (i==8) {
        		System.out.print("Introduce el número en la posición (9/10): ");
            listaNumeros[i] = Integer.parseInt(teclado.nextLine());
        	}
        	else if (i==9) {
        		System.out.print("Introduce el número en la posición (10/10): ");
            listaNumeros[i] = Integer.parseInt(teclado.nextLine());
        	}
        	
        }
        System.out.println("\nVector original: "+ Matriz.imprimirEnString2(listaNumeros));
        teclado.close();
        
        return listaNumeros;
    }
    
    public static void interfaz() {
    	
    	int [] v1= pedirNumeros();
    	
    	
    	try {
			System.out.println("Vector después de desplazar a la derecha: "+ Matriz.imprimirEnString2(desplazarPosicionDerecha(v1)));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    	
    	
    }
    
}






