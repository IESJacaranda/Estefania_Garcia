package baraja;

public class Carta {

	private Numeros numero;
	private Palos palo;
	
	public Carta() {}
	
	public Carta(Numeros numero, Palos palo){
		this.numero = numero;
		this.palo = palo;
		
	}
	

	public Numeros getNumero() {
		return numero;
	}

	public void setNumero(Numeros numero) {
		this.numero = numero;
	}

	public Palos getPalo() {
		return palo;
	}

	public void setPalo(Palos palo) {
		this.palo = palo;
	}
	
	@Override
	public String toString() {
		return (this.numero.getValor() +" DE "+ this.palo).toLowerCase();
	}
	
	
}
