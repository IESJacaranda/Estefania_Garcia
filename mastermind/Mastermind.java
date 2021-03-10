package mastermind;


import java.util.concurrent.ThreadLocalRandom;

public class Mastermind {
	
	private String claveSecreta;
	
	
	public Mastermind() {}
	
	public Mastermind(String claveSecreta) {
		this.claveSecreta = generarClave();
	}
	
	
	
	/**
	 * este método genera una clave aleatoria de 4 cifras
	 * @return entero de 4 cifras
	 */
	public static String generarClave() {
		int claveSecreta = ThreadLocalRandom.current().nextInt(1000, 10000);
		String cs = Integer.toString(claveSecreta); //lo convierto a String para luego poder comparar las cadenas
		return cs;
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
		String mensaje2 = "";
		int coincidencias = 0;
		int aciertos = 0;
		//int intentos = 0;
		
		
		
		for(int i=0; i<clave.length(); i++) {
			
				//comparar aciertos
			if (clave.charAt(0)==this.claveSecreta.charAt(0)) {    
			    aciertos++;
			  }
			if(clave.charAt(1)==this.claveSecreta.charAt(1)) {
				  aciertos++;  
			  }
			if(clave.charAt(2)==this.claveSecreta.charAt(2)) {
				  aciertos++;  
			  }
			if(clave.charAt(3)==this.claveSecreta.charAt(3)) {
				  aciertos++;  
			  }
		
		
			//comparar coincidencias
			if (clave.charAt(0)==this.claveSecreta.charAt(1) ||clave.charAt(0)==this.claveSecreta.charAt(2) ||clave.charAt(0)==this.claveSecreta.charAt(3)) {    
			    coincidencias++;
			  }
			if (clave.charAt(1)==this.claveSecreta.charAt(0) ||clave.charAt(1)==this.claveSecreta.charAt(2) ||clave.charAt(1)==this.claveSecreta.charAt(3)) {    
			    coincidencias++;
			  }
			if (clave.charAt(2)==this.claveSecreta.charAt(0) ||clave.charAt(2)==this.claveSecreta.charAt(1) ||clave.charAt(2)==this.claveSecreta.charAt(3)) {    
			    coincidencias++;
			  }
			if (clave.charAt(3)==this.claveSecreta.charAt(0) ||clave.charAt(3)==this.claveSecreta.charAt(1) ||clave.charAt(3)==this.claveSecreta.charAt(2)) {    
			    coincidencias++;
			  }
		//intentos++;
		
		}
		
			
			if(coincidencias==0) {
			mensaje = "No coincide ningún dígito";
		}else if(coincidencias==1) {
			mensaje = "Coincide 1 dígito";
		}else if(coincidencias==2) {
			mensaje = "Coinciden 2 dígitos";
		}else if(coincidencias==3) {
			mensaje = "Coinciden 3 dígitos";
		}else if(coincidencias==4) {
			mensaje = "Coinciden 4 dígitos";
		}
		
		if(aciertos==0) {
			mensaje2 = "Ninguno en posición correcta";
		}else if(aciertos==1) {
			mensaje2 = "1 dígito en posición correcta";
		}else if(aciertos==2) {
			mensaje2 = "2 dígitos en posición correcta";
		}else if(aciertos==3) {
			mensaje = "3 dígitos en posición correcta";
		}else if(aciertos==4) {
			mensaje2 = "Enhorabuena, has acertado la clave secreta";
		}
			
		
		
		return mensaje + mensaje2;
	}
	

	
	
	
	
	
	
	
	
	public String getClaveSecreta() {
		return claveSecreta;
	}

	public void setClaveSecreta(String claveSecreta) {
		this.claveSecreta = claveSecreta;
	}
	
	
	
	
	
	
	
	
	
}


