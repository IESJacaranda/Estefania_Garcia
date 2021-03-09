package mastermind;


import java.util.concurrent.ThreadLocalRandom;

public class Mastermind {
	
	private int claveSecreta;
	
	
	public Mastermind() {}
	
	public Mastermind(int claveSecreta) {
		this.claveSecreta = generarClave();
	}
	
	
	
	/**
	 * este método genera una clave aleatoria de 4 cifras
	 * @return entero de 4 cifras
	 */
	public static int generarClave() {
		int claveSecreta = ThreadLocalRandom.current().nextInt(1000, 10000);
		return claveSecreta;
	}
	
	/**
	 * Este metodo comprueba si la clave introducida tiene 4 cifras
	 * @param clave
	 * @return true si la la clave cumple las condiciones
	 * @throws Exception si la clave tiene +- 4 cifras
	 */
	public boolean comprobarClaveUsuario(String clave) throws Exception {
		
		if(clave.length()!=4) {
			throw new ClaveLengthException();
		}
		
		return true;
	}
	
	public String compararClaves(String clave) {
		String mensaje = "";
		
		
		
		
		
		return mensaje;
	}
	

	
	
	
	
	
	
	
	
	public int getClaveSecreta() {
		return claveSecreta;
	}

	public void setClaveSecreta(int claveSecreta) {
		this.claveSecreta = claveSecreta;
	}
	
	
	
	
	
	
	
	
	
}


