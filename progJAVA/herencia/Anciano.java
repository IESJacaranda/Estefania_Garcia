package herencia;

public class Anciano extends Adulto {

	
	@Override
	public void obtenerHabitos() {
		System.out.println("Pararse a ver las obras");
	}

	@Override
	public void desplazarse() {
		System.out.println("Andar con bastón");
	}
	
	
}
