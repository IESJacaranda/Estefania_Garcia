package string;

public class boletin_clase {
	
	public static final String VOCALES = "aeiouAEIOU";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(charactersInStringJM("Hola mundo", 'O'));
		
		System.out.println(upperCaseInStringJM("Hola mundo, me llamo Jose Manuel"));
		System.out.println(lowerCaseInStringJM("Hola mundo, me llamo Jose Manuel"));
		
		System.out.println(numberInStringJM("Hola, son las 09:14 horas"));
		
		System.out.println(isPalyndromeJM("CadeNa de textoneDac"));
		System.out.println(isPalyndromeJM("CadeNa de texto OtxEted AneDac"));
		
		System.out.println(buscaPalabraJM("shybaoxlna", "hola"));
		
		System.out.println(reemplazarJM("Hola, Jos�, �c�mo est�s?, Jos�", "Jos�", "Ram�n"));
		
		System.out.println(contarVocalesJM("murcielago"));
		System.out.println(contarVocalesJM("patera"));
		
		System.out.println(reordenarFraseJM("curso de programacion"));
		
		System.out.println(contarPalabrasJM("He estudiado mucho"));
		System.out.println(contarPalabrasJM("     He  estudiado   mucho     "));
	}
	
	/**
	 * *Este metodo devuelve el numero de ocurrencias de un caracter
	 * @param cadena --> cadena de texto a comprobar
	 * @param car --> caracter a buscar
	 * @return numero de ocurrencias
	 */
	public static int charactersInStringJM(String cadena, char car) {
		
		int counter = 0;
		cadena =cadena.toLowerCase();
		car = Character.toLowerCase(car);
		
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i)==car) {
				counter++;
			}
		}
		
		return counter;
	}
	
	
	public static int caseInStringJM(boolean upper, String cadena) {
		int matches = 0;
		
		for (int i = 0; i < cadena.length(); i++ ) {
			if (upper && Character.isUpperCase(cadena.charAt(i))) {
				matches++;
			}
			if (!upper && Character.isLowerCase(cadena.charAt(i))){
				matches++;
			}
		}
		
		return matches;
	}
	public static int upperCaseInStringJM(String cadena) {
		return caseInStringJM(true, cadena);
	}
	public static int lowerCaseInStringJM(String cadena) {
		return caseInStringJM(false, cadena);
	}

	
	
	public static int numberInStringJM(String cadena) {
		
		int contador = 0;
		
		for (int i=0; i<cadena.length(); i++) {
			char c = cadena.charAt(i);
			if (Character.isDigit(c)) {
				contador++;
			}
		}
		return contador;
	}
	
	
	public static boolean isPalyndromeJM(String cadena) {
		boolean isPalyndromeJM=false;
		cadena=cadena.replace(" ", "").toLowerCase();
		String inverse = "";
		for (int i=0;i<cadena.length();i++) {
			inverse = cadena.charAt(i)+inverse;
		}
		isPalyndromeJM = inverse.contentEquals(cadena);
		
		return isPalyndromeJM;
	}
	
	
	public static boolean buscaPalabraJM(String cadenaCompleta, String oculta) {
		
		int indiceOculta = 0;
		if (cadenaCompleta.length()>=oculta.length()) {
			for (int i=0; i<cadenaCompleta.length();i++) {
				if (indiceOculta<oculta.length()&& cadenaCompleta.toLowerCase().charAt(i)==oculta.toLowerCase().charAt(indiceOculta)){
					indiceOculta++;
				}
			}
			
		}
		return indiceOculta==oculta.length();
	}
	
	
	public static String reemplazarJM(String frase, String palabra, String nuevaPalabra) {
		return frase.replace(palabra, nuevaPalabra);
	}
	
	
	public static int contarVocalesJM(String frase) {
		
		frase=frase.toLowerCase();
		String vocalesDistintas = "";
		String vocales = "aeiou";
		
		for(int i=0; i<frase.length();i++) {
			char c = frase.charAt(i);
			
			if (vocalesDistintas.indexOf(c)<0 && vocales.indexOf(c)>=0) {
				vocalesDistintas+=c;
			}
			
		}
		 return vocalesDistintas.length();
	}
	
	
	public static String reordenarFraseJM(String fraseEntrada) {
		
		fraseEntrada=fraseEntrada.replace(" ", "");
		StringBuilder vocales = new StringBuilder();
		StringBuilder consonantes = new StringBuilder();
		
		for(int i=0; i<fraseEntrada.length();i++) {
			char c = fraseEntrada.charAt(i);
			
			if(VOCALES.indexOf(c)>=0) {
				vocales.append(c);
			}
			else {
				consonantes.append(c);
			}
		}
		
		return consonantes.append(vocales.toString()).toString();
	}
	
	public static int contarPalabrasJM(String frase) {
		int numeroPalabras=0;
		
		frase = frase.trim();
		
		while (frase!=frase.replace("  ", " ")) {
			frase = frase.replace("  ", " ");
		}
		
		for (int i=0; i<frase.length();i++) {
			if(frase.charAt(i)==' ') {
				numeroPalabras++;
			}
		}
		
		return numeroPalabras+1;
		//return frase.split(" ").length(); --> otra opción sin usar el bucle for
	}
	
	
}

