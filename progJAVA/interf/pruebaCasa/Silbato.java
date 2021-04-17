package interf.pruebaCasa;

public class Silbato implements Iobjeto {
	
	
	private String material;
	
	public Silbato(String material) {
		this.material = material;
	}

	@Override
	public boolean emitirSonido() {
		
		return true;
	}
	
	public String obtenerColor() {
		return "verde";	}

}
