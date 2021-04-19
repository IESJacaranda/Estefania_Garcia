package baraja;

import java.util.Random;

public class Partida {

	private Jugador j1;
	private Jugador j2;
	private Baraja baraja;
	
	public Partida() {}
	
	public Partida(Jugador j1, Jugador j2, Baraja baraja) {
		this.j1 = j1;
		this.j2 = j2;
		this.baraja = baraja;
	}


	public void repartirCartas(int numero, Jugador j) throws Exception {
		if(esPosibleRepartirCartas(numero)) {
			for(int i=0; i<numero;i++) {
			Carta c = this.baraja.cogerCarta();
			j.addCarta(c);
			}
		}else {
			throw new Exception("No quedan cartas suficientes en la baraja.");
		}
		
	}
	
	public boolean esPosibleRepartirCartas(int numero) {
		boolean esPosible = false;
		if(this.baraja!= null && baraja.mostrarLongitud()>numero) {
			esPosible = true;
		}
		
		return esPosible;
	}



}
