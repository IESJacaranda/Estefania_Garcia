package interf.pruebaCasa;

public class InstrumentoCuerda implements IinstrumentoMusical, Iobjeto {
	
	private int numeroCuerdas;
	
	private String nombre;
	
	

	public InstrumentoCuerda(int numeroCuerdas, String nombre) {
		this.numeroCuerdas = numeroCuerdas;
		this.nombre = nombre;
	}
	

	@Override
	public boolean emitirSonido() {
		
		return true;
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
		
		return "Es un instrumento de cuerda";
	}
	
	

}
