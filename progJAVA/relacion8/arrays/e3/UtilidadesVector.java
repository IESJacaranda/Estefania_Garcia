/*Ejercicio 3:
 *Realizar un programa que solicite por teclado números entre 1 y 1000
  hasta que el usuario informe de que ya no desea introducir más
  números. Después debe mostrar:
  
		La media de los números leídos.
		Cuántos números terminan en cada uno de los dígitos (0 .. 9).
		El dígito en el que más números terminan.
		En qué dígitos no ha terminado ningún número.
				
  Pista: crear un vector de contadores de 10 elementos.
*/

package relacion8.arrays.e3;

import java.util.Scanner;

import pruebaMATRIZ.Matriz;

public class UtilidadesVector {

	public static void main(String[] args) {
		
		
		int [] vector = {5, 10, 2, 30, 4, 15, 6, 88, 3, 9};
		//media = 17.2
		
		try {
			System.out.println(calcularMedia(vector));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		int [] v1 = {5, 10, 5, 24, 4, 2, 6, 2, 1, 0, 11, 2};
		System.out.println(esUltimoDigito(v1));
		

	}
	
	/**
	 * con este método se calcula la media de los elementos que contiene un vector
	 * @param vector
	 * @return double con el resultado de la media de los elementos
	 * @throws Exception 
	 */
	public static double calcularMedia(int [] vector) throws Exception {
		
		double media = 0.0;
		if(vector!=null && vector.length>=2) {
			
			for (int i=0; i < vector.length; i++) {
			 media = media + vector[i]; //sumar todos los elementos del vector
			}
			
		}else {
			throw new Exception("No se puede calcular la media de los elementos de este vector.");
		}
		
		media = media / vector.length; //divido la suma de todos los elementos por el numero del elementos del vector
		
		return media;
	}
	
	
	/**
	 * este metodo muestra la cantidad de numeros que terminan en los distintos digitos
	 * @param vector
	 * @return String 
	 */
	public static String esUltimoDigito(int[] vector) { 
		
		int c0=0, c1=0, c2=0, c3=0, c4=0, c5=0, c6=0, c7=0, c8=0, c9=0;
		
		
		for(int i =0; i<vector.length;i++) {
			
			//el resto de dividir un numero entre 10 es el ultimo digito del numero.
			
			if(vector[i]%10==0) {
				c0++;
			}else if(vector[i]%10==1) {
				c1++;
			}else if(vector[i]%10==2) {
				c2++;
			}else if(vector[i]%10==3) {
				c3++;
			}else if(vector[i]%10==4) {
				c4++;
			}else if(vector[i]%10==5) {
				c5++;
			}else if(vector[i]%10==6) {
				c6++;
			}else if(vector[i]%10==7) {
				c7++;
			}else if(vector[i]%10==8) {
				c8++;
			}else if(vector[i]%10==9) {
				c9++;
			}
			
		}
		
		
		return "Hay "+c0+ " números que terminan en 0.\n"
				+ "Hay "+c1+ " números que terminan en 1.\n"
				+ "Hay "+c2+ " números que terminan en 2.\n"
				+ "Hay "+c3+ " números que terminan en 3.\n"
				+ "Hay "+c4+ " números que terminan en 4.\n"
				+ "Hay "+c5+ " números que terminan en 5.\n"
				+ "Hay "+c6+ " números que terminan en 6.\n"
				+ "Hay "+c7+ " números que terminan en 7.\n"
				+ "Hay "+c8+ " números que terminan en 8.\n"
				+ "Hay "+c9+ " números que terminan en 9.\n";
		
	}
	
	
	
	public static String esDigitoMasRepetido(int []vector) { //aquí la idea pero falta comprobar
		 
		int mayor;
		mayor = vector[0];
		
		 for (int i=0; i<vector.length;i++) {
			 
			 if(mayor<vector[i]%10) { //comparo mayor con i y asigno i a mayor
				 mayor=i;
			 }
		 }
			return ("El dígito que mas se repite es "+mayor);
		}
	
	
	
	public static int [] pedirNumeros() throws Exception { 
    	
		Scanner teclado = new Scanner(System.in);
    	
		
		
        return null;
    }

}
