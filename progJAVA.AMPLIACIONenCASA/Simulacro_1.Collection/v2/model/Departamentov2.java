package simulacro.v2.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import simulacro.model.AbstractEmpleado;

public class Departamentov2 {

	protected String nombre;
	public Set<AbstractEmpleadov2> plantilla;
	//voy a usar un HashSet porque no puede haber empleados repetidos
	
	public Departamentov2() {}
	
	public Departamentov2(String nombre) {
		this.nombre = nombre;
		this.plantilla = new HashSet<AbstractEmpleadov2>();
	}
	
	//añade un empleado base a la lista
	public boolean addEmpleado(AbstractEmpleadov2 e) {
		
		boolean isAdd = false; 
		
		if(e instanceof EmpleadoBasev2 && !plantilla.contains(e)) {
			plantilla.add(e);
			isAdd = true;
		}
		
		return isAdd;
	}
	
	//añade un jefe a la lista
	public boolean addJefe(AbstractEmpleadov2 e) {
		
		boolean isAdd = false; 
		int contador = 0;
//		Iterator<AbstractEmpleadov2> iterador = plantilla.iterator();
		
//		while(iterador.hasNext()) {
//			if(iterador instanceof EmpleadoJefev2) {
//				contador++;
//			}
//		}
		
		for(AbstractEmpleadov2 emple: plantilla) {
			if(emple instanceof EmpleadoJefev2) {
				contador++;
			}
		}
		
		if(e instanceof EmpleadoJefev2 && !plantilla.contains(e) && contador<1) {
			plantilla.add(e);
			isAdd = true;
		}
		
		return isAdd;
	}
	
	
	//obtiene el sueldo total de todos los empleados
	public String obtenerSueldo() {
		double sueldo = 0;
		
		for(AbstractEmpleadov2 emple: plantilla) {
			sueldo+= emple.getSueldo();
		}
		return sueldo+" euros.";
	}

	//muestra el departamento ordenado por sueldo
	public String toStringSueldo() {
		
		StringBuilder sb = new StringBuilder();
		//creo un arrayList para de la plantilla para poder implementar el sort
		List <AbstractEmpleadov2> nueva = new ArrayList<AbstractEmpleadov2>(plantilla);
		//usando el compareTo
		Collections.sort(nueva);
		for(AbstractEmpleadov2 emple: nueva) {
			sb.append("\t> "+emple+"\n");
		}
		return "Departamento de " + getNombre() + "\nFormado por: \n" +sb.toString();
	}

	//ordena los empleados alfabéticamente
	public String ordenarEmpleadosPorNombre() {
		StringBuilder sb = new StringBuilder();
		
		List <AbstractEmpleadov2> nueva = new ArrayList<AbstractEmpleadov2>(plantilla);
		//usando la interfaz comparator
		Collections.sort(nueva, new OrdenaNombresv2());
		
			for(AbstractEmpleadov2 emple: nueva) {
					sb.append("\t> "+emple+"\n");
				
			}
		
		return sb.toString();
	}
	
	//muestra el departamento ordenado por nombre usando OrdenarEmppleadosPorNombre()
	@Override
	public String toString() {
		
		return "Departamento de " + getNombre() + "\nFormado por: \n" + ordenarEmpleadosPorNombre();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<AbstractEmpleadov2> getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(Set<AbstractEmpleadov2> plantilla) {
		this.plantilla = plantilla;
	}

	
	
	
}
