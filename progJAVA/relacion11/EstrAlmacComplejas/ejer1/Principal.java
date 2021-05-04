/**
 * Escribir un programa para gestionar conjuntos de alumnos apuntados a equipos
deportivos. El programa dispondrá de:
• La Clase Alumno, con los atributos: nombre y DNI de tipo String. Implementar el
método constructor y los métodos toString() y equals,
• La Clase Equipo. Cada equipo deportivo se representa en una clase que contiene el
nombre del equipo y un conjunto de alumnos.
El equipo tiene operaciones para:
- Añadir un alumno (recibe como parámetro el objeto alumno a insertar). Si el
alumno ya existe en el equipo debe saltar una excepción.
- Borrar un alumno (recibe como parámetro el objeto alumno a borrar). Si el
alumno no existe en el equipo debe saltar una excepción.
- Saber si un alumno pertenece al equipo. Recibe como parámetro el objeto
alumno a buscar y devuelve null si no lo encuentra y el objeto alumno si existe.
- Mostrar en pantalla la lista de personas del equipo.
- Unión de equipos. El método lo llamará un equipo y se le pasará por parámetro
el otro equipo con el que se quiere unir. Devuelve un equipo formado por los
alumnos de ambos equipos.
- Intersección de equipos. Idem al anterior pero devuelve un equipo formado por
los alumnos que están en los dos equipos
Se pide:
1. Decidir la estructura de almacenamiento más indicada para este ejercicio. No
debe establecerse ningún límite de jugadores en los equipos.
2. Realizar las clases Alumno, Equipo así como un programa de prueba que cree
varios equipos y prueba todas las operaciones mostrando en pantalla los
resultados.
 */


package relacion11.EstrAlmacComplejas.ejer1;

import relacion11.EstrAlmacComplejas.ejer1.excep.AddAlumnoException;
import relacion11.EstrAlmacComplejas.ejer1.excep.BorrarAlumnoException;
import relacion11.EstrAlmacComplejas.ejer1.model.Alumno;
import relacion11.EstrAlmacComplejas.ejer1.model.Equipo;

public class Principal {

	public static void main(String[] args) {
		
		Alumno a = new Alumno("Pepe", "2514789P");
		Alumno a1 = new Alumno("Laura", "2589739Q");
		Alumno a2 = new Alumno("Manuel", "4714339S");
		Alumno a3 = new Alumno("Lolo", "4714339S");
		
		Equipo e = new Equipo("Equipillo Futbol Club");
		Equipo eq = new Equipo("L");
		
		Alumno a4 = new Alumno("Jose", "25114799P");
		Alumno a5 = new Alumno("Juan", "3689711Q");
		Alumno a6 = new Alumno("Cristina", "4711144S");
		Alumno a7 = new Alumno("Lola", "47143851D");
		
		
		try {
			//añadir alumnos al equipo
			e.addAlumno(a);
			e.addAlumno(a1);
			e.addAlumno(a2);
			//e.addAlumno(a3); //no lo añade porque tiene el mismo dni que a2 y salta la excepcion
			
			eq.addAlumno(a4);
			eq.addAlumno(a5);
			eq.addAlumno(a6);
			eq.addAlumno(a7);
			eq.addAlumno(a);
			
			//mostrar la lista de jugadores del equipo
			System.out.println(e.mostrarJugadores());
			System.out.println(eq.mostrarJugadores());
			
			System.out.println("----------");
			//borrar un alumno existente
			e.borrarAlumno(a2);
		
			//mostrar la lista de jugadores del equipo
			System.out.println(e.mostrarJugadores());
			
			System.out.println("----------");
			
			//buscar alumno en el equipo
			System.out.println(e.buscarAlumno(a1));
			System.out.println(e.buscarAlumno(a2));
			
			System.out.println("----------");
			
			//Devuelve un equipo formado por los alumnos de ambos equipos.
			System.out.println(e.unirEquipos(eq));
			
			System.out.println("----------");
			//Intersección de equipos. Devuelve un equipo formado por los alumnos que están en los dos equipos
			System.out.println(e.unirEquipos2(eq));
			
			
		} catch (AddAlumnoException e1) {
			System.out.println(e1.getMessage());
		} catch (BorrarAlumnoException e1) {
			System.out.println(e1.getMessage());
		}
		

	}

}
