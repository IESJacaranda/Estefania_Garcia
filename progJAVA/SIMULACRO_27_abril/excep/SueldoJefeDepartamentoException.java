package simulacro.excep;

public class SueldoJefeDepartamentoException extends Exception {

	public SueldoJefeDepartamentoException() {
		super("El sueldo debe ser igual o mayor a 1300 euros.");
	}
}
