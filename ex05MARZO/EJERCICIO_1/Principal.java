package ex_05marzo_casa;

public class Principal {

	public static void main(String[] args) {
		

		
		//Empleado empleado = new Empleado();
		
		//System.out.println(empleado.hashCode());
		
		
		try {
			Empleado em = new Empleado("pp", 23, 'M', "mañana", 0, "ASqwert");
			System.out.println(em);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Empleado emple = new Empleado("pp", 23, 'M', "mañana", 0, "AS123qwert");
			System.out.println(emple);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		//Profesor prof = new Profesor();
		//prof.hashCode();
		
		//PersonalDireccion pd = (PersonalDireccion) new Profesor();
		//System.out.println(pd.getEdad());
		
		
	}
	

}
