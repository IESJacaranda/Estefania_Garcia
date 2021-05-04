package relacion11.EstrAlmacComplejas.ejer5.model;

public class Profesor extends AbstractPersona {

	public Profesor(String nombre, int edad) {
		super(nombre, edad);
		
	}

	@Override
	public void enviarMensaje(AbstractPersona p, String texto) throws Exception {
		
		super.enviarMensaje(p, texto);
	}

}
