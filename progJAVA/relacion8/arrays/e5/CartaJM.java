package relacion8.arrays.e5;

public class CartaJM {
	
	public final static String[] PALOS = {"Oro", "Bastos", "Espadas", "Copas"};

	private String palo;
	private int numero;
	
	public CartaJM() {}
	
	public CartaJM(String palo, int numero) {
		super();
		if (comprobarPalo(palo)) {
			this.palo = palo;
			this.numero = numero;
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

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	

	
	
	
	
	
	
}
