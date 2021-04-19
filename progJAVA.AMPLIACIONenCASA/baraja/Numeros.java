package baraja;

public enum Numeros {
	
	UNO(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), OCHO(8), NUEVE(9), DIEZ(10), ONCE(11), DOCE(12);

	private int valor;
	
	Numeros(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}
	
	

}
