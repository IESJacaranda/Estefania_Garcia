package herencia;

public class Persona {

	
	private String nombre;
	private int edad;
	private double altura;
	private double peso;
	
	public Persona() {
		super();
	}
	
	public Persona (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona(String nombre, int edad, double altura, double peso) {
		this(nombre,edad);
		this.altura = altura;
		this.peso = peso;
	}
	
	
	public void desplazarse() {
		System.out.println("Andar");
	}
	
	public void obtenerHabitos() {
		System.out.println("Varios");
	}
	
	
	
	
	
	
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	
	
	
	
}
