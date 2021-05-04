package simulacro.excep;

public class PuestoException extends Exception {

	public PuestoException() {
		super("El puesto seleccionado no existe en la lista de opciones disponibles.");
	}
}
