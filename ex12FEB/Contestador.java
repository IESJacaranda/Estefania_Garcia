package ex12febCASA;

public class Contestador {

	private String mensaje1;
	private String mensaje2;
	private String mensaje3;
	
	
	public Contestador() {	//constructor que inicializa los mensajes a vacío
		this.mensaje1="";
		this.mensaje2="";
		this.mensaje3="";
		
	}

	
	public void añadirMensaje(String mensaje) throws Exception {
		if (this.mensaje1=="") {
			mensaje1=mensaje;
		}else if (this.mensaje2=="") {
			mensaje2=mensaje;
		}else if (this.mensaje3=="") {
			mensaje3=mensaje;
		}else {
			throw new Exception("Buzón completo.");
		}
	}
	
	
	public void borrarTodosLosMensajes() {	//este método borra todos los mensajes
		if (getMensaje1()!="") {
			this.setMensaje1("");
		}else if (getMensaje2()!="") {
			this.setMensaje2("");
		}else if (getMensaje3()!="") {
			this.setMensaje3("");
		}
	}
	
	
	public String consultarNumeroMensajes() {		//consulta número de mensajes
		
		int contador = 0;
		if (getMensaje1()!="") {
			contador++;
		}else if (getMensaje2()!="") {
			contador++;
		}else if (getMensaje3()!="") {
			contador++;
		}
		
		
		return "Tiene " +contador +" mensajes en su contestador.";
	}
	
	
	
	
	

	public String getMensaje1() {
		return mensaje1;
	}


	public void setMensaje1(String mensaje1) {   //borra el mensaje a vacío
		this.mensaje1="";
	}


	public String getMensaje2() {
		return mensaje2;
	}


	public void setMensaje2(String mensaje2) {
		this.mensaje2 = "";
	}


	public String getMensaje3() {
		return mensaje3;
	}


	public void setMensaje3(String mensaje3) {
		this.mensaje3 = "";
	}


	
	
	
	
	
}
