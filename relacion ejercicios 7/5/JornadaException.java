package rel7_ejer5_ligaFUTBOL;

public class JornadaException extends Exception{

	public JornadaException() {
		super("La jornada debe estar comprendida entre los números 1 y 39.");
	}
}
