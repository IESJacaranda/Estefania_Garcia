package relacion11.EstrAlmacComplejas.ejer2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import relacion11.EstrAlmacComplejas.ejer1.excep.AddAlumnoException;
import relacion11.EstrAlmacComplejas.ejer1.excep.BorrarAlumnoException;
import relacion11.EstrAlmacComplejas.ejer1.model.Alumno;

public class EquipoGenerico <T> {
	

	private String nombre;
	private Set<T> lista; 
	
	public EquipoGenerico() {
		this.lista = new HashSet<T>();
	}
	
	public EquipoGenerico(String nombre) {
		this.nombre = nombre;
		this.lista = new HashSet<T>();
	}

//	Añadir un alumno (recibe como parámetro el objeto alumno a insertar). Si el
//	alumno ya existe en el equipo debe saltar una excepción.
	public void addComponente(T a) throws AddAlumnoException {
		
		if(lista.contains(a)) {
			throw new AddAlumnoException();
		}else {
			lista.add(a);
		}
	}
	
//	Borrar un alumno (recibe como parámetro el objeto alumno a borrar). Si el
//	alumno no existe en el equipo debe saltar una excepción.
	public void borrarComponente(T a) throws BorrarAlumnoException {
		if(lista.isEmpty() || !lista.contains(a)) {
			throw new BorrarAlumnoException();
		}else {
			lista.remove(a);
		}
	}
	
//	Saber si un alumno pertenece al equipo. Recibe como parámetro el objeto
//	alumno a buscar y devuelve null si no lo encuentra y el objeto alumno si existe.
	public T buscarComponente(T a) {
		T a1 = null;
		if(lista.contains(a)) {
			a1 = a;
		}
		
		return a1;
	}
	
	//Mostrar en pantalla la lista de personas del equipo.
	public String mostrarJugadores() {
		StringBuilder sb = new StringBuilder();
		
		for(T a: lista) {
			sb.append(a+"\n");
		}
		
		return sb.toString();
	}
	
	//Devuelve un equipo formado por los alumnos de ambos equipos.
	public EquipoGenerico<T> unirEquipos(EquipoGenerico<T> e) {
		EquipoGenerico<T> nuevo = new EquipoGenerico<T>("Nuevo Equipo");
		nuevo.lista.addAll(e.lista); //añade la lista del equipo que paso al nuevo equipo
		nuevo.lista.addAll(this.lista); //añado la lista de mi equipo
		
		
		return nuevo;
	}
	//Intersección de equipos. Devuelve un equipo formado por los alumnos que están en los dos equipos
	public EquipoGenerico<T> unirEquipos2(EquipoGenerico<T> e) {
		EquipoGenerico<T> nuevo = new EquipoGenerico<T>("Nuevo Equipo");
		
		nuevo.lista.addAll(e.lista); 
		nuevo.lista.retainAll(this.lista); //quedarte solo con los repetidos
		
		return nuevo;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<T> getListaJugadores() {
		return lista;
	}

	public void setListaJugadores(Set<T> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Nombre del equipo: " + getNombre() + ", formado por: \n" + mostrarJugadores();
	}


	

}
