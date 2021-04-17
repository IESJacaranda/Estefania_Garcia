package relacion8.arrays.e6;

public class FraseJM {

	private final String CARACTERES = "abcdefghijklmnñopqrstuvwxyz";
	private int[] ocurrencias = new int[CARACTERES.length()];
	/**
	 * Consulta en el array de caracteres la ocurrencia de un caracater
	 * pasado como parametro e incrementa su contador
	 * @param c caracter a comprobar
	 */
	private void contarOcurrencias(char c) {
		for (int i=0; i<CARACTERES.length();i++) {
			if(Character.toLowerCase(CARACTERES.charAt(i))==Character.toLowerCase(c)){
				ocurrencias[i]++;
			}
		}
		
	}
	
	private void contarOcurrenciasFrase(String frase) {
		for(int i = 0; i<frase.length();i++) {
			contarOcurrencias(frase.charAt(i));
		}
	}
	
	
	public String mostrarOcurrencias(String frase) {
		StringBuilder mensaje = new StringBuilder();
		
		contarOcurrenciasFrase(frase);
		
		for (int i=0; i<ocurrencias.length;i++) {
			if(ocurrencias[i]>0) {
				
				mensaje.append("La letra "+CARACTERES.charAt(i)+" ha aparecido "+ocurrencias[i]+(ocurrencias[i]>1 ? " veces.": " vez.")+"\n");
			}
		}
		
		
		return mensaje.toString();
	}
	
}
