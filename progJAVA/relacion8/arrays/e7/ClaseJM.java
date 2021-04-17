package relacion8.arrays.e7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClaseJM {
	
	//Declaro la lista de alumnos. Si no inicializo es null
	private List<AlumnoJM> alumnos;
	
	private final double NOTA_APROBADO = 5;
	
	public ClaseJM() {
		super();
		//inicializo la lista de clase
		alumnos = new ArrayList<AlumnoJM>();
	}
	
	public void addAlumno(AlumnoJM alumno) {
		this.alumnos.add(alumno);
	}

	public List<AlumnoJM> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<AlumnoJM> alumnos) {
		this.alumnos = alumnos;
	}
	
	public String getAlumnosAprobados() {
		StringBuilder aprobados = new StringBuilder("La lista de alumnos aprobados es: \n");
		
		for(int i=0; i<alumnos.size();i++) {
			AlumnoJM al = alumnos.get(i);
			if(al.getNota()>=NOTA_APROBADO) {
				aprobados.append(al.toString()+"\n");
			}
		}
		
		return aprobados.toString();
	}
	
	public String getAlumnosSuspensos() {
		StringBuilder suspensos = new StringBuilder("La lista de alumnos suspensos es: \n");
		
		for(AlumnoJM al : alumnos) {
			if(al.getNota()<NOTA_APROBADO) {
				suspensos.append(al.toString()+"\n");
			}
		}
		return suspensos.toString();
	}
	
	
	public String getAlumnosSuperarNota(double notaCorte) {
		StringBuilder aprobados = new StringBuilder("La lista de alumnos que superan la nota es: \n");
		
		for(int i=0; i<alumnos.size();i++) {
			AlumnoJM al = alumnos.get(i);
			if(al.getNota()>notaCorte) {
				aprobados.append(al.toString()+"\n");
			}
		}
		
		return aprobados.toString();
	}
	
	public String getNotaMediaClase() {
		double sumaNotas = 0.0;
		double result = 0;
		
		for(AlumnoJM alumno : alumnos) {
			sumaNotas+=alumno.getNota();
		}
		
		if(!alumnos.isEmpty()) {
			result = sumaNotas/alumnos.size();
		}
		
		return "La nota media de la clase es: "+sumaNotas/alumnos.size();
	}
	
	public String getMaximaNotaClase() {
		/*
		String result = "No hay datos de alumnos.";
		
		if(!this.alumnos.isEmpty()) {
			Collections.sort(this.alumnos);
			result = "La máxima nota es: "+this.alumnos.get(alumnos.size()-1).getNota();
		}
		
		return result;
		*/
		return getNotaLimiteDeClase(true);
	}
	
	public String getMinimaNotaClase() {
		/*
		String result = "No hay datos de alumnos.";
		
		if(!this.alumnos.isEmpty()) {
			Collections.sort(this.alumnos);
			result = "La mínima nota es: "+this.alumnos.get(0).getNota();
		}
		
		return result;*/
		return getNotaLimiteDeClase(false);
	}
	
	private String getNotaLimiteDeClase(boolean maximaNota) {
		String result = "No hay datos de alumnos.";
		
		if(!this.alumnos.isEmpty()) {
			Collections.sort(this.alumnos);
			int posicion = maximaNota? this.alumnos.size()-1 : 0;
			String mensaje = maximaNota ? "máxima" : "mínima";
			result = "La "+mensaje+" nota es: "+this.alumnos.get(posicion).getNota();
			
		}
		
		return result;
	}
	
	
	
	
	
	
}
