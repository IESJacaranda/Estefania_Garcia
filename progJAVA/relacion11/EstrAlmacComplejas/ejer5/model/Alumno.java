package relacion11.EstrAlmacComplejas.ejer5.model;

public class Alumno extends AbstractPersona {

	public Alumno(String nombre, int edad) {
		super(nombre, edad);
		
	}

	/**
	 * Si la persona que envía el mensaje es un alumno y es menor de edad sólo
	puede enviar mensajes a profesores, es decir, si un alumno menor de edad
	intenta enviar un mensaje a otro alumno se debe provocar un error.
	 * @throws Exception 
	 */
	@Override
	public void enviarMensaje(AbstractPersona p, String texto) throws Exception {
		
		if(this.edad<18 && p instanceof Alumno) {
			throw new Exception("Un alumno menor de edad no puede enviar un mensaje a otro alumno.");
		}else {
			super.enviarMensaje(p, texto);
		}
		
		
		
		
	}




	
	

}
