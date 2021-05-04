package relacion11.EstrAlmacComplejas.ejer1.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import relacion11.EstrAlmacComplejas.ejer1.excep.AddAlumnoException;
import relacion11.EstrAlmacComplejas.ejer1.excep.BorrarAlumnoException;

public class Equipo {

	private String nombre;
	private Set<Alumno> listaJugadores; 
	
	public Equipo() {
		this.listaJugadores = new HashSet<Alumno>();
	}
	
	public Equipo(String nombre) {
		this.nombre = nombre;
		this.listaJugadores = new HashSet<Alumno>();
	}

	
//	public boolean addAlumno2(Alumno a) throws Exception {
//		if(!this.listaJugadores.add(a)) {
//			throw new Exception();
//			
//		}return true;
//	}
	
	
//	Añadir un alumno (recibe como parámetro el objeto alumno a insertar). Si el
//	alumno ya existe en el equipo debe saltar una excepción.
	public void addAlumno(Alumno a) throws AddAlumnoException {
		
		if(listaJugadores.contains(a)) {
			throw new AddAlumnoException();
		}else {
			listaJugadores.add(a);
		}
	}
	
//	Borrar un alumno (recibe como parámetro el objeto alumno a borrar). Si el
//	alumno no existe en el equipo debe saltar una excepción.
	public void borrarAlumno(Alumno a) throws BorrarAlumnoException {
		if(listaJugadores.isEmpty() || !listaJugadores.contains(a)) {
			throw new BorrarAlumnoException();
		}else {
			listaJugadores.remove(a);
		}
	}
	
//	Saber si un alumno pertenece al equipo. Recibe como parámetro el objeto
//	alumno a buscar y devuelve null si no lo encuentra y el objeto alumno si existe.
	public Alumno buscarAlumno(Alumno a) {
		Alumno a1 = null;
		if(listaJugadores.contains(a)) {
			a1 = a;
		}
		
		return a1;
	}
	
	//Mostrar en pantalla la lista de personas del equipo.
	public String mostrarJugadores() {
		StringBuilder sb = new StringBuilder();
		
		for(Alumno a: listaJugadores) {
			sb.append(a+"\n");
		}
		
		return sb.toString();
	}
	
	//Devuelve un equipo formado por los alumnos de ambos equipos.
	public Equipo unirEquipos(Equipo e) {
		Equipo nuevo = new Equipo("Nuevo Equipo");
		
		nuevo.listaJugadores.addAll(e.listaJugadores); //añade la lista del equipo que paso al nuevo equipo
		nuevo.listaJugadores.addAll(this.listaJugadores); //añado la lista de mi equipo
		
		return nuevo;
	}
	
	//Intersección de equipos. Devuelve un equipo formado por los alumnos que están en los dos equipos
	public Equipo unirEquipos2(Equipo e) {
		Equipo nuevo = new Equipo("Nuevo Equipo");
		
		nuevo.listaJugadores.addAll(e.listaJugadores); 
		nuevo.listaJugadores.retainAll(this.listaJugadores); //quedarte solo con los repetidos
		
		return nuevo;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Alumno> getListaJugadores() {
		return listaJugadores;
	}


	@Override
	public String toString() {
		return "Nombre del equipo: " + getNombre() + ", formado por: \n" + mostrarJugadores();
	}


	
	
	
	
	
	
}
