package interf.pruebaCasa;

public class Violin extends InstrumentoCuerda {
	
	private String tipo;

	public Violin(int numeroCuerdas, String nombre) {
		super(numeroCuerdas, nombre);
		this.tipo = tipo;
		
	}
	
	public String esPosibleTocarConLosDedos() {
		return "No, necesitas usar el arco para tocar instrumentos de cuerda frotada";
	}

}
