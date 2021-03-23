package interf.pruebaCasa;

public class InstrumentoViento implements IinstrumentoMusical, Iobjeto {
	
	private String nombre;
	
	private String material;
	
	
	

	public InstrumentoViento(String nombre, String material) {
		this.nombre = nombre;
		this.material = material;
	}



	@Override
	public boolean tocarInstrumento() {
		
		return true;
	}

	@Override
	public boolean afinarInstrumento() {
		return true;
	}

	@Override
	public String tipoDeInstrumento() {
		
		return "Es un instrumento de viento.";
	}

	@Override
	public boolean emitirSonido() {
		
		return true;
	}

}
