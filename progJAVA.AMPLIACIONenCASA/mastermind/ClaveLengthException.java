package mastermind;

public class ClaveLengthException extends Exception {

	public ClaveLengthException() {
		super("La clave no es correcta. Tiene que ser un número de cuatro cifras.");
	}
	
}
