package relacion8.arrays.e7;

import java.util.Collections;

public class PrincipalJM {

	public static void main(String[] args) {
		
		ClaseJM primeroB = new ClaseJM();
		
				
		primeroB.addAlumno(new AlumnoJM("Adela", "A", "",6.0));
		primeroB.addAlumno(new AlumnoJM("Rafa", "R", "",7.0));
		primeroB.addAlumno(new AlumnoJM("Juan", "J", "",4.5));
		primeroB.addAlumno(new AlumnoJM("Laura", "L", "",8.0));
				
		//llama al compareTo
		Collections.sort(primeroB.getAlumnos());
		
			
		System.out.println(primeroB.getAlumnos());
		
		//primeroB.getAlumnos().get(primeroB.getAlumnos().size()-1);
		System.out.println(primeroB.getAlumnosAprobados());
		System.out.println(primeroB.getAlumnosSuspensos());
		System.out.println(primeroB.getNotaMediaClase());
		
		System.out.println(primeroB.getMaximaNotaClase());
		System.out.println(primeroB.getMinimaNotaClase());
		System.out.println(primeroB.getAlumnosSuperarNota(6.0));
		

	}
	
	public static void mostrarMenu() {
		System.out.println("\n1. Mostrar el nombre y la nota de los alumnos aprobados.\n" + 
				"2. Mostrar el nombre y la nota los alumnos suspensos.\n" + 
				"3. Mostrar la nota media de la clase.\n" + 
				"4. Mostrar los alumnos que tienen más de una nota X.\n" + 
				"5. Mostrar el alumno con la nota máxima y mínima.\n" + 
				"6. Mostrar un listado ordenado de forma creciente por la nota.\n" + 
				"7. Salir.");

	}
	
	
	
	
	
}
