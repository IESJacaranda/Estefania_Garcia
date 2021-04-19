package baraja;

import java.util.ArrayList;
import java.util.List;

public class Baraja {

	private final static int NUMERO_CARTAS = 48;
	
	private List<Carta> listaCartas = new ArrayList<Carta>(NUMERO_CARTAS);

	public Baraja() {
		this.listaCartas = listaCartas;
		iniciarBaraja();
	}
	
	private void iniciarBaraja() {
		for(Palos palo: Palos.values() ) {
			for(Numeros numero: Numeros.values()) {
				listaCartas.add(new Carta(numero,palo));
			
				}
			}
	}
	
	public void mostrarBaraja() {
		
		for(Carta c: this.listaCartas) {
			System.out.println(c+".\n");
		}
		
	}
	
	public int mostrarLongitud() {
		return listaCartas.size();
	}
	
	public Carta cogerCarta() {
		Carta c = null;
		
		//int aleatorio = (int)Math.random()*12+1;
		
		for(int i=0;i<listaCartas.size();i++) {
			c = listaCartas.get((int)(Math.random()*12+1));
			
		}listaCartas.remove(c);
		
		return c;
	}
	

	public List<Carta> getListaCartas() {
		return listaCartas;
	}

	public void setListaCartas(List<Carta> listaCartas) {
		this.listaCartas = listaCartas;
	}
		
	






}
