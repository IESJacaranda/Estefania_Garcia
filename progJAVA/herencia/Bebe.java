package herencia;

public class Bebe extends Persona {
	
	public Bebe() {
		super();
	}
	
	public Bebe(String nombre, int edad, double altura, double peso) {
		super(nombre, edad, altura, peso);
	}

	
	
	
	
	@Override
	public void desplazarse() {
		System.out.println("Está gateando.");
	}

	@Override
	public void obtenerHabitos() {
		System.out.println("Jugar, aprender a controlar los esfínteres y comer.");
	}
	
	
	

}
