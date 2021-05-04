package simulacro.excep;

public class DniException extends Exception {

	public DniException() {
		super("El DNI introducido no es correcto.");
	}
}
