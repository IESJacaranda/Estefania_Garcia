package relacion11.EstrAlmacComplejas.ejer2;

import relacion11.EstrAlmacComplejas.ejer1.excep.AddAlumnoException;
import relacion11.EstrAlmacComplejas.ejer1.model.Alumno;

public class Principal {

	public static void main(String[] args) {
		
		EquipoGenerico eq = new EquipoGenerico("Real Betis Balompié");
		
		Alumno alu1 = new Alumno("Pepa", "52147896L");
		String cosa = "Hola";
		double num = 17.5;
		
		try {
			eq.addComponente(alu1);
			eq.addComponente(cosa);
			eq.addComponente(num);
			
			System.out.println(eq.toString());
		} catch (AddAlumnoException e) {
			System.out.println(e.getMessage());
		}

	}

}

//una clase generica es una clase que admite valores que no sé lo que son, se suele usar con los arrays
//sería crear un equipo genérico de cada tipo para añadir cada clase
//EquipoGenerico<Alumno> para añadir Alumno
//EquipoGenerico<String> para añadir cadena
//EquiooGenerico<Sala> para añadir Salas