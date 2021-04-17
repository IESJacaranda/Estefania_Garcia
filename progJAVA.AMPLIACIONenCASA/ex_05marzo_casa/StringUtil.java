package ex_05marzo_casa;

public class StringUtil {

	public static void main(String[] args) {
		

		String cad2 = "murcielago";
		String cad1 = "lago";
		System.out.println(comprobarCadenas(cad1, cad2));

	}
	
	/**
	 * Este método comprueba que una cadena está dentro de otra cadena
	 * @param cad1
	 * @param cad2
	 * @return true si la cadena está contenida en la otra, false si no lo está
	 */
	public static boolean comprobarCadenas(String cad1, String cad2) {
		

		
		boolean estaContenida = false;
		
		if (cad1==null || cad2==null) {
			//lanzar exception
		}else if("".equals(cad1.trim()) || cad1.isBlank()) {
			//lanzar exception
		}else {
			//comprobamos
		}
		
		
		int contador = 0;
		
		if(cad1.length()<cad2.length()) {
			String nuevaCadena = cad1;
			cad1 = cad2;
			cad2 = nuevaCadena;
		}
		
		int long1 = cad1.length();
		int long2 = cad2.length();
		
		for(int i=0; i<long1;i++) {
			
			for(int j=0; j<long2;j++) {
				if(cad1.charAt(i)==cad2.charAt(j)) {
					contador++;
				}
			}
			if (contador==long2) {
				estaContenida = true;
			}
		}
		
		return estaContenida;
	}

}
