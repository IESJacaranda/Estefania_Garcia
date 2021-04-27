package simulacro.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Departamento {

	protected String nombre;
	public List<AbstractEmpleado> plantilla;
	
	
	public Departamento() {}
	
	public Departamento(String nombre) {
		this.nombre = nombre;
		this.plantilla = new ArrayList<AbstractEmpleado>();
	}
	
	
	public boolean addEmpleado(AbstractEmpleado e){
		boolean isAdd = false;
		
		if(plantilla.isEmpty() || (e instanceof EmpleadoBase && !plantilla.contains(e))) {
				plantilla.add(e);
				isAdd = true;
			}
			
		return isAdd;
		
	}
	
	
	public boolean addJefe(AbstractEmpleado j) {
		boolean isAdd = false;
		int contador = 0;
		
			for(AbstractEmpleado emple: plantilla) {
				if(emple instanceof JefeDepartamento) {
					contador++;
				}
			}
			if(plantilla.isEmpty() || (j instanceof JefeDepartamento && !plantilla.contains(j) && contador <1)) {
				plantilla.add(j);
				isAdd = true;
			}
			
		return isAdd;
		
	}
	
	public double obtenerSueldo() {
		double sueldoTotalE = 0;
		double sueldoTotalJ = 0;
		
		for(AbstractEmpleado emple: plantilla) {
			
			if(emple instanceof EmpleadoBase) {
				sueldoTotalE += ((EmpleadoBase) emple).getSueldo();
			}else if( emple instanceof JefeDepartamento) {
				sueldoTotalJ += ((JefeDepartamento) emple).getSueldo();
			}
			
		}
		
		return sueldoTotalE+sueldoTotalJ;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<AbstractEmpleado> getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(List<AbstractEmpleado> plantilla) {
		this.plantilla = plantilla;
	}
	
	//devuelve los empleados ordenados por sueldo
	public String toStringSueldo() {
		StringBuilder sb = new StringBuilder();
		Collections.sort(plantilla);
		
		for(AbstractEmpleado emple: plantilla) {
			sb.append("\t> "+emple+"\n");
		}
		
		return sb.toString();
	}

	//ordena los empleados alfabéticamente
	public String ordenarEmpleadosPorNombre() {
		
		List<String> nombres = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		
		
		for (AbstractEmpleado emple: plantilla) {
			nombres.add(emple.getNombre().toUpperCase());
		}
		
		Collections.sort(nombres);
		
		
		for(String nombre: nombres) {
			for(AbstractEmpleado emple: plantilla) {
				if(nombre.equalsIgnoreCase(emple.getNombre())) {
					sb.append("\t> "+emple+"\n");
				}
			}
		}
		
		return sb.toString();
	}
	
	
	//llama al ordenarEmpleadosPorNombre y los devuelve ordenados alfabeticamente
	@Override
	public String toString() {
		
		return "Departamento de " + getNombre() + "\nFormado por: \n" + ordenarEmpleadosPorNombre() ; 
		 
	}



	
	
	
}

