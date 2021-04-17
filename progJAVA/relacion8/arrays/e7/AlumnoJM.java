package relacion8.arrays.e7;

public class AlumnoJM extends PersonaJM implements Comparable<AlumnoJM>{

	private double nota;
	
	public AlumnoJM(String nombre, String apellido1, String apellido2, double nota) {
		super(nombre, apellido1, apellido2);
		this.nota = nota;
	}

	@Override
	public String toString() {
		return super.toString()+" y su nota es "+this.nota;
	}
	
	
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public int compareTo(AlumnoJM alumnoQuePaso) {
		int compareResult = 0;
		
		if(this.nota > alumnoQuePaso.getNota()) {
			compareResult = 1;
		}else if(this.nota < alumnoQuePaso.getNota()) {
			compareResult = -1;
		}
		return compareResult;
	}
	/*
	public int compareTo2(AlumnoJM o) {
		return this.getNombre().compareTo(o.getNombre());
	}*/
	
}
