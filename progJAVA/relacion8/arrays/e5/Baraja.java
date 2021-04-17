package relacion8.arrays.e5;

import static relacion8.arrays.e5.Carta.CARTAS_POR_PALO;
import static relacion8.arrays.e5.Carta.PALOS;

import java.util.ArrayList;

public class Baraja {

	public final static int NUM_CARTAS = 48;
	
	private ArrayList<Carta> baraja;
	
	public Baraja() {
		this.crearBaraja();
	}
	
	
	
	private void crearBaraja() {
		
		this.baraja = new ArrayList<Carta>();
		
		
	}
	
	
}
