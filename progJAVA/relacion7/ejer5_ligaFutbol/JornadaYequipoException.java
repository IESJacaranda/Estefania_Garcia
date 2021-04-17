package relacion7.ejer5_ligaFutbol;

public class JornadaYequipoException extends Exception{
 
	public JornadaYequipoException() {
		super("La jornada debe estar comprendida entre los números 1 y 39 y no puede jugar contra el mismo equipo.");
	}
}
