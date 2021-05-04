package relacion11.EstrAlmacComplejas.ejer5.model;

import java.time.LocalDateTime;

public class Mensaje implements Comparable<Mensaje>{

	protected String remitente;
	protected String texto;
	protected LocalDateTime fecha;
	
	protected int codigo;
	protected static int CONTADOR_MENSAJES = 1;
	
	
	public Mensaje(String remitente, String texto) {
		super();
		this.remitente = remitente;
		this.texto = texto;
		this.fecha = LocalDateTime.now();
		this.codigo = CONTADOR_MENSAJES;
		CONTADOR_MENSAJES++;
		
	}
	

	@Override
	public String toString() {
		return "Mensaje " + getCodigo() + ": De: " + getRemitente()+ " Texto: " + getTexto() + 
				"\nFecha y hora: " + getFecha().getDayOfMonth()+"-"+getFecha().getMonthValue()+"-"+getFecha().getYear()
				+ " " 
				+ getFecha().getHour()+":"+getFecha().getMinute()+
				".\n";
	}



	public String getRemitente() {
		return remitente;
	}


	public String getTexto() {
		return texto;
	}



	public LocalDateTime getFecha() {
		return fecha;
	}



	public int getCodigo() {
		return codigo;
	}


	@Override
	public int compareTo(Mensaje o) {
		
		return (int)this.remitente.compareTo(o.getRemitente());
	}
	
	
	
	
	
}
