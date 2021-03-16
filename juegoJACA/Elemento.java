package juegoJACA;

public class Elemento {

	private char simbolo;
	
	public Elemento() {
		super();
	}
	
	public Elemento(char simbolo) {
		this.simbolo = simbolo;
	}

	@Override
	public String toString() {
		return Character.toString(this.simbolo);
	}
	
	
	
}
