package ejeHERENCIA.ejer1;

public class Titular {

	private String nombre;
	protected static int edad;
	
	public Titular() {}

	public Titular(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "El titular es " + this.nombre + "y su edad es "+this.edad;
	}

	public static int getEdad() {
		return edad;
	}

	public static void setEdad(int edad) {
		Titular.edad = edad;
	}
	
	

	
}
