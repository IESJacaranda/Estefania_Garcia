/**
 * Realizar un programa que solicite una frase e informe de cuantas veces
aparecen cada una de las letras del abecedario en la frase (sólo se
mostrarán las letras que aparezcan al menos una vez).
Pista: Crear un array de contadores (entero) con tantos elementos como
letras del abecedario y un String con las letras del abecedario.
 */

package rel_8_arrays_6;

public class Frase {

	public static void main(String[] args) {
		
		
		String f = "Hola buenos dias";
		/*
		 * h1	o2	l1 	a2	b1	u1	e1	n1	s2	d1	i1
		 */
		
		mostrarLetras(f.toLowerCase());

	}
	
	
	private static char[] abecedario = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	
	//private static int[] contador = new int[letras.length];
	
	public static void mostrarLetras(String frase) {
		
		
		
		for (int i = 0; i<abecedario.length; i++) {
			int contador = 0;
			for (int j = 0; j<frase.length(); j++) {
				
				if (frase.charAt(j)==abecedario[i]) {
					contador++;
				}
			}if (contador>0) //para que no muestre las letras que no aparezcan
				{System.out.println("La letra "+ abecedario[i]+ " aparece un total de "+contador+ " veces.");
			
			
		}
		}
		
		
		
		
	}
	
	
}
