package herencia;

public class Adulto extends Persona {
	
	private boolean carnetConducir;
	
	public Adulto() {
		super();
	}
	
	public Adulto(String nombre, int edad, double altura, double peso) {
		super(nombre, edad, altura, peso);
	}

	@Override
	public void obtenerHabitos() {
		System.out.println("Pagar facturas, trabajar, hacer deporte, ver la tele, tomar cerveza");
	}
	
	
	public void conducir() {
		if(carnetConducir) {
			System.out.println("Se está desplazando con el coche");
		}
		
	}

	public boolean isCarnetConducir() {
		return carnetConducir;
	}

	public void setCarnetConducir(boolean carnetConducir) {
		this.carnetConducir = carnetConducir;
	}
	
	

}
