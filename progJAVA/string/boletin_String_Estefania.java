
//ESTEFANÍA GARCÍA SÁNCHEZ//

package string;

import java.util.Scanner;

public class boletin_String_Estefania {
	
	static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(charactersInString("EstefAnia Garcia", 'a'));	
		
		System.out.println(lowCaseInString("perro PLATO"));
		
		System.out.println(upperCaseInString("El lobo FEROZ"));
		
		System.out.println(numberInString("Tenía 35.6 grados"));
		
		System.out.println(isPalindrome("anilina"));
		
		System.out.println(palabraEscondida("shybaoxlna", "hola"));
		
		System.out.println(numeroDeVocalesDiferentes("murcielago"));
		System.out.println(numeroDeVocalesDiferentes("patera"));
		
		System.out.println(ordenarConsonantesYvocales("curso de programacion"));
		
		System.out.println(buscarYreemplazar("hola Juan, hola Pepe", "hola", "adi�s"));
		
		System.out.println(numeroDepalabras(" El perro de Don Tomas "));
		System.out.println(numeroDepalabras("He estudiado mucho"));
		System.out.println(numeroDepalabras(" El      barco veloz    "));
	}
	
/**
 * Este metodo devuelve el numero de ocurrencias de un caracter
 * @param cadena --> cadena de texto a comprobar
 * @param caracter --> caracter a buscar
 * @return numero de ocurrencias
 */
	public static int charactersInString(String cadena, char caracter) {
		
		String nuevaCadena = cadena.toLowerCase();
		
		int contador = 0; //si no asigno =0, por defecto su valor ya es 0
		for (int i = 0; i < nuevaCadena.length(); i++) {
			if (nuevaCadena.charAt(i) == Character.toLowerCase(caracter)) {
				contador++;
			}
		} 
		
		return contador;
	}
	
	
/**
 * Este método devuelve el número de caracteres en minúscula de una cadena
 * @param cadena --> cadena de texto a comprobar
 * @return numero de ocurrencias en minúscula
 */
	public static int lowCaseInString(String cadena) {
		
		int contador = 0;
		
		for (int i = 0; i < cadena.length(); i++ ) {
			if (Character.isLowerCase(cadena.charAt(i))) {
				contador++;
			}
		}
		
		return contador;
	}
/**
 * Este método devuelve el número de caracteres en mayúscula de una cadena
 * @param cadena --> cadena de texto a comprobar
 * @return numero de ocurrencias en mayúscula
 */
	public static int upperCaseInString(String cadena) {
		
		int contador = 0;
		
		for (int i = 0; i < cadena.length(); i++ ) {
			if (Character.isUpperCase(cadena.charAt(i))) {
				contador++;
			}
		}
		
		return contador;
	}
	
/**
 * Este método devuelve el número de caracteres numéricos de una cadena	
 * @param cadena --> cadena de texto a comprobar
 * @return numero de ocurrencias numéricas
 */
	public static int numberInString(String cadena) {
		
		int contador = 0;
		
		for (int i = 0; i < cadena.length(); i++ ) {
			if (Character.isDigit(cadena.charAt(i))) {
				contador++;
			}
		}
		
		return contador;
	}
	
/**
 * Este metodo determina si una palabra es palíndroma o no 
 (se lee igual en ambos sentidos)	
 * @param cadena --> cadena de texto a comprobar
 * @return true si es palíndroma, false si no lo es
 */
	public static boolean isPalindrome(String cadena) {
		
		String cadenaNueva;
		String inversa = "";
		boolean mensaje = false;
		
		cadenaNueva = cadena.replace(" ", "");
		
		for (int i = 0; i < cadenaNueva.length(); i++) {
			inversa = cadenaNueva.charAt(i) + inversa;
		}
		
		if (cadenaNueva.equals(inversa)){
			mensaje = true;
		}
		
		return mensaje;
	}
	
/**
 * Este método averigua si una palabra se encuentra oculta en otra cadena
 * @param texto --> cadena de texto a comprobar
 * @param palabra --> palabra a buscar en la cadena
 * @return true si se encuentra la palabra, false si no está en la cadena
 */
	public static boolean palabraEscondida(String texto, String palabra) {
		
		int indiceOculta = 0;
		if (texto.length()>=palabra.length()) {
			for (int i=0; i<texto.length();i++) {
				if (indiceOculta<palabra.length()&& texto.toLowerCase().charAt(i)==palabra.toLowerCase().charAt(indiceOculta)){
					indiceOculta++;
				}
			}
			
		}
		return indiceOculta==palabra.length();
	}
	
/**
 * Este método reemplaza una palabra por otra dada, dentro de una cadena	
 * @param cadena --> cadena de texto que contiene la palabra a reemplazar
 * @param palabra --> palabra a buscar en la cadena para ser reemplazada
 * @param reemplazo --> palabra por la que se va a reemplazar en la cadena
 * @return una nueva cadena con la palabra reemplazada
 */
	public static String buscarYreemplazar(String cadena, String palabra, String reemplazo) {
		 
		return cadena.replace(palabra, reemplazo);
	}
	
/**
 * Este método devuelve el número de vocales diferentes que hay en una cadena	
 * @param cadena --> cadena de texto a comprobar
 * @return --> numero de vocales diferentes
 */
	public static int numeroDeVocalesDiferentes(String cadena) {
		
		int contadorA = 0;
		int contadorE = 0;
		int contadorI = 0;
		int contadorO = 0;
		int contadorU = 0;
		
		for (int i=0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A') {
				contadorA=1;
			}
			else if (cadena.charAt(i) == 'e' || cadena.charAt(i) == 'E') {
				contadorE=1;
			}
			else if (cadena.charAt(i) == 'i' || cadena.charAt(i) == 'I') {
				contadorI=1;
			}
			else if (cadena.charAt(i) == 'o' || cadena.charAt(i) == 'O') {
				contadorO=1;
			}
			else if (cadena.charAt(i) == 'u' || cadena.charAt(i) == 'U') {
				contadorU=1;
			}
		}
		
		return (contadorA+contadorE+contadorI+contadorO+contadorU);
	}
	
/**
 * Este método ordena las consonantes y vocales de una cadena	
 * @param cadena --> cadena de texto a ordenar
 * @return cadena de texto con las consonantes en primer lugar y las vocales al final
 */
	public static String ordenarConsonantesYvocales(String cadena) {
		
		StringBuilder cadenaVocales = new StringBuilder();
		StringBuilder cadenaConsonantes = new StringBuilder();
		String cadenaNueva = cadena.replace(" ", "");
		
		for (int i=0; i < cadenaNueva.length(); i++) {
			
			char c = cadenaNueva.charAt(i);
			
			if (cadenaNueva.charAt(i) == 'a' || cadenaNueva.charAt(i) == 'A' 
					|| cadenaNueva.charAt(i) == 'e' || cadenaNueva.charAt(i) == 'E' 
					|| cadenaNueva.charAt(i) == 'i' || cadenaNueva.charAt(i) == 'I' 
					|| cadenaNueva.charAt(i) == 'o' || cadenaNueva.charAt(i) == 'O' 
					|| cadenaNueva.charAt(i) == 'u' || cadenaNueva.charAt(i) == 'U') {
				cadenaVocales.append(c);
			}
			else {
				cadenaConsonantes.append(c);		}
		}
		
		String vocales = cadenaVocales.toString();
		String consonantes = cadenaConsonantes.toString();
		
		
		return consonantes+vocales;
	}
	
/**
 * Este método cuenta el número de palabras que hay en una cadena	
 * @param cadena --> cadena de texto a comprobar
 * @return número de palabras que contiene la cadena
 */
	public static int numeroDepalabras(String cadena) {
		
		int contador = 0;
		char espacio = ' ';
	    //cadena = cadena.trim(); 
	    
	    for (int i=0; i<cadena.length();i++) {
	    	if (espacio == ' ') {
	    		if (cadena.charAt(i) != ' ') {
	    			contador++;
	    		}
	    	}
	    	espacio = cadena.charAt(i);
	    }
	    return contador;
			
	
	}
}
