package ex12febCASA;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave1 = new String ("aaahhhhuuqaa");
		System.out.println(comprimirClave(clave1));
		
	}

	
	public static StringBuilder comprimirClave(String clave){
		//String claveComprimida = "";
		int contador = 0;
		char c = clave.charAt(0);
		
		StringBuilder resultado = new StringBuilder();
		
		if(clave!=null && clave.length()>0) { //se comprueba que la clave no está vacía
			for (int i =0; i<clave.length(); i++) {
				if (c==clave.charAt(i)) {
					contador++;
				}
				else {
			resultado.append(c);
			resultado.append(contador); 
			c = clave.charAt(i);
			contador=1;
		}
			}
			resultado.append(c);   //para añadir el caracter final
			resultado.append(contador);
		}
		
		return resultado;
	}

	
	
	
	
	public static StringBuilder descomprimirClave(String clave){
		
		StringBuilder sb = new StringBuilder();
		char c = ' ';
		int contador = 0;
		
		if(clave!=null && clave.length()>=2) { //se comprueba que la clave no está vacía
			for (int i =0; i<clave.length(); i++) {
				if (Character.isDigit(clave.charAt(i))==false) {
					c = sb.charAt(i);
				}else {
					
				}
		
		
		
		
	}
}
		return sb;
	}
}

