package ex_05marzo_casa;

public class PasswordException extends Exception{

	public PasswordException() {
		super("La contraseña no es correcta. Debe tener mínimo 10 caracteres, 2 mayúsculas y 3 numéricos.");
	}
	
}
