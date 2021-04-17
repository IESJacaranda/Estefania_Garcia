package enume;

public enum Peso {
	
	SILLA(5),
	MESA(20),
	SOFÁ(65),
	MUEBLE(80);
	
	private int valor;
	
	
	//añadir un constructor
	Peso(int v){
		this. valor = v;
	}
	
	public int getValor() {
		return valor;
		
	}
}
