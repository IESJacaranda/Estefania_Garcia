package simulacro.v2.excep;

public class PuestoExceptionv2 extends Exception {

	public PuestoExceptionv2() {
		super("El puesto seleccionado no existe en la lista de opciones disponibles.");
	}
}
