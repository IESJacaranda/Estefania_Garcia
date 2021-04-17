package relacion8.arrays.e5;

public class Carta {

	public final static String[] PALOS = {"Oro", "Bastos", "Espadas", "Copas"};
	public final static int CARTAS_POR_PALO = 12;
	
	private int numero;
	private String palo;
	
	public Carta() {}
	
	public Carta(int numero, String palo) {
		super();
		if(comprobarPalo(palo)) {
			this.numero = numero;
		this.palo = palo;
		}
		
	}

	private boolean comprobarPalo(String palo) {
		boolean contiene = false;
		
		for (int i = 0; i<PALOS.length; i++) {
			if(PALOS[i].contentEquals(palo)) {
				contiene = true;
			}
		}
		return contiene;
	}
	private boolean comprobarNumero(int numero) {
		boolean contiene = false;
		
			
		return contiene;
	}
	
	@Override
	public String toString() {
		return "Su carta es el " + this.numero + " de " + this.palo + ".";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	
	
	
	
}
