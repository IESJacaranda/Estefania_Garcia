package relacion11.EstrAlmacComplejas.ejer5.model;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import relacion11.EstrAlmacComplejas.ejer5.excep.BuzonNoMensajeException;

public abstract class AbstractPersona{

	protected String nombre;
	protected int edad;
	protected List <Mensaje> buzon;
	
	
	public AbstractPersona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.buzon = new LinkedList<Mensaje>();
	}

	
	/**
	 * enviar un mensaje a otra persona. 
		Recibirá como parámetro la persona destinataria y el texto del mensaje.
	 * Si la persona que envía el mensaje es un alumno y es menor de edad sólo
	puede enviar mensajes a profesores, es decir, si un alumno menor de edad
	intenta enviar un mensaje a otro alumno se debe provocar un error.
	 * @param destino
	 * @param texto
	 * @throws Exception 
	 */
	public void enviarMensaje(AbstractPersona destino, String texto) throws Exception {
		destino.buzon.add(new Mensaje(this.nombre, texto));
	}
	
	public String leerMensaje() throws BuzonNoMensajeException {
		StringBuilder sb = new StringBuilder();
		
		if(buzon.isEmpty()) {
			throw new BuzonNoMensajeException();
		}else {
			for(Mensaje mensa:buzon) {
			sb.append(mensa+"\n");
		}
		}
		
		return sb.toString();
	}
	
	/**
	 * leer los mensajes del buzón pero ordenado por el nombre del remitente alfabéticamente
	 * @return string con los mensajes
	 */
	public String leerMensajeAlfabeticamente() {
		StringBuilder sb = new StringBuilder();
		
		//usando el compareTo de la clase Mensaje
		Collections.sort(buzon);
		
		for(Mensaje mensa:buzon) {
			sb.append(mensa+"\n");
		}
		
		return sb.toString();
		
	}
	
	/**
	 * borra un mensaje, si no existe lanza excepcion
	 * @param numero
	 * @return true si lo borra
	 * @throws BuzonNoMensajeException
	 */
	public boolean borrarMensaje(int numero) throws BuzonNoMensajeException {
		boolean esBorrado = false;
		
		Iterator <Mensaje> iterador = buzon.iterator();
		
		while(iterador.hasNext() && !esBorrado) {
			Mensaje m = iterador.next();
			if(m.getCodigo()==numero) {
				buzon.remove(m);
				esBorrado = true;
			}
		}
		if(esBorrado == false || buzon.isEmpty()) {
			throw new BuzonNoMensajeException();
		}
		
		return esBorrado;
	}
	
	/**
	 * busca los mensajes del buzón que contienen una frase dada.
	 * @return String con el mensaje que contiene la frase a buscar
	 * @throws Exception  si la frase no se encuentra en ningun mensaje
	 */
	public String buscarFrase(String frase) throws Exception {
		StringBuilder sb = new StringBuilder("Los siguientes mensajes contienen la frase <"+frase+">: \n");
		
		for(Mensaje mensaje:buzon) {
			if(mensaje.getTexto().toLowerCase().contains(frase.toLowerCase())) {
				sb.append(mensaje+"\n");
			}else {
				throw new Exception("No existen mensajes con la frase introducida");
			}
		}
				
		return sb.toString();
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public int getEdad() {
		return edad;
	}

	
	public List<Mensaje> getBuzon() {
		return buzon;
	}



	@Override
	public String toString() {
		return "Nombre: " + getNombre() + ", edad: " + getEdad() + ".\n";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buzon == null) ? 0 : buzon.hashCode());
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractPersona other = (AbstractPersona) obj;
		if (buzon == null) {
			if (other.buzon != null)
				return false;
		} else if (!buzon.equals(other.buzon))
			return false;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	
	
	






	
	
	
	
}
