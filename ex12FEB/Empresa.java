package primeraPruebaEstefaniaGarcia;

public class Empresa {

	public static void main(String[] args) {
	
		String clave1 = new String ("aaahhhhuuqaa");
		String clave2 = new String ("kkkkkaaaaabbbbbessaaaaaa");
		
		String clave3 = new String ("a3z2q3");
		String clave4= new String ("b1o2m1e1r1a1n1g1 ");
		
		System.out.println(comprimirClave(clave1));
		System.out.println(comprimirClave(clave2));
		System.out.println(descomprimirClave(clave3));
		System.out.println(descomprimirClave(clave4));
		
		
	}

	/**
	 * Este método comprime un String
	 * @param String clave
	 * @return String comprimido
	 */
	public static String comprimirClave(String clave) {
		
		StringBuilder sb = new StringBuilder();
		
		if(clave!=null && clave.length()>0) {
			int contador = 1;
			char a = clave.charAt(0);
			for (int i=1; i<clave.length();i++) {
			if(a== clave.charAt(i)) {
				contador++;
			}else {
				sb.append(a).append(contador);
				a = clave.charAt(i);
				contador=1;
			}
		}
		}
		
		return sb.toString();
		
		
	}
	/**
	 * Este método descomprime un String
	 * @param String clave
	 * @return String descomprimido
	 */
	public static String descomprimirClave(String clave) {
		
		StringBuilder resultado = new StringBuilder();
		if (clave!= null && clave.isEmpty() && clave.length()>=2) {
			for (int i=0; i<clave.length()-1;i+=2) {
				char caracterArepetir =clave.charAt(i);
				int repeticiones = Integer.parseInt(String.valueOf(clave.charAt(i+1)));
				for (int j=0; j<repeticiones;j++) {
					resultado.append(caracterArepetir);
				}
			}
		}

		return resultado.toString();
	}
	
	
	

}
