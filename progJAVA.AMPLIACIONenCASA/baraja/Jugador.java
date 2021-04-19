package baraja;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
	
	private List<Carta> manoDeCartas;
	
	
	
	public Jugador() {
		this.manoDeCartas = new ArrayList<Carta>();
	}
	
	public void addCarta(Carta carta) {
		this.manoDeCartas.add(carta);
	}
	
	public void mostrarMano() {
		System.out.print(manoDeCartas.toString()+"\n");
	}

	public List<Carta> getManoDeCartas() {
		return manoDeCartas;
	}

	public void setManoDeCartas(List<Carta> manoDeCartas) {
		this.manoDeCartas = manoDeCartas;
	}
	
	

}
