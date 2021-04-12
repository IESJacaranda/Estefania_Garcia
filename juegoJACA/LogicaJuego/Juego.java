package juegoJACA.LogicaJuego;

import juegoJACA.Elementos.Arbol;
import juegoJACA.Elementos.Dinero;
import juegoJACA.Elementos.Elemento;
import juegoJACA.Elementos.Gema;
import juegoJACA.Elementos.Jugador;
import juegoJACA.Elementos.Pocion;
import juegoJACA.Elementos.Roca;

public class Juego {

	private Elemento [][] tablero;
	private Jugador [] jugadores;
	private int alto = Constantes.ALTO;
	private int ancho = Constantes.ANCHO;
	private int numJugadores;
	private boolean finished = false;
	private int jugadorJuega;
	
	
	
	public Juego() {}
	
	public Juego(int numJugadores) {
		tablero = new Elemento [alto][ancho];
		this.numJugadores = numJugadores;
		
	
	}
	
	public void iniciarTablero() {
		//tablero[0][3] = new Arbol();
		
		crearRocas();
		crearArboles();
		crearGemas();
		crearPociones();
		crearDinero();
		imprimirTablero();
	}
	
	public void imprimirTablero() {
					
		StringBuilder sb = new StringBuilder();
		
		if(tablero.length>0) {
			
			for (int i=0; i<tablero.length;i++) {
				sb.append("---------------------");
				sb.append("\n");
				sb.append("|");
				for (int j=0; j<tablero[i].length;j++) {
					
					if(tablero[i][j]!=null) {
						sb.append(tablero[i][j]);
					}else {
						sb.append(" ");
					}
					
					if(j==tablero[i].length-1) {
						sb.append("|");
					}else {
						sb.append("|");
					}
				}sb.append("\n");
				
			}sb.append("---------------------");
			
		}
		
		System.out.println(sb.toString());
		
		}
	
	//creo las rocas
	private void crearRocas() {
		
		int a = 0;
		
		while(a<Constantes.NUM_ROCAS) {
			
			int posX = (int) (Math.random()*(ancho)); // () para que primero multiplique y luego haga el casting
			int posY = (int) (Math.random()*(alto));
			
			if(tablero[posX][posY]==null) {
				tablero[posX][posY] = new Roca();
				a++;
			}
				
				}
			
	}
	
	//crea los arboles
	private void crearArboles() {
		
		int a = 0;
		
		while(a<Constantes.NUM_ARBOLES) {
			
			int posX = (int) (Math.random()*(ancho)); 
			int posY = (int) (Math.random()*(alto));
			
			if(tablero[posX][posY]==null) {
				tablero[posX][posY] = new Arbol();
				a++;
			}
				
				}
	}
	
	//crea las gemas
	private void crearGemas() {
		
		int a = 0;
		
		while(a<Constantes.NUM_GEMAS) {
			
			int posX = (int) (Math.random()*(ancho)); 
			int posY = (int) (Math.random()*(alto));
			
			if(tablero[posX][posY]==null) {
				tablero[posX][posY] = new Gema();
				a++;
			}
				
				}
		
	}
	
	//crea las pociones
	private void crearPociones() {
		
		int a = 0;
		
		while(a<Constantes.NUM_POCIONES) {
			
			int posX = (int) (Math.random()*(ancho)); 
			int posY = (int) (Math.random()*(alto));
			
			if(tablero[posX][posY]==null) {
				tablero[posX][posY] = new Pocion();
				a++;
			}
				
				}
		
	}
	
	//crea el dinero
	private void crearDinero() {
		
		int a = 0;
		
		while(a<Constantes.NUM_DINERO) {
			
			int posX = (int) (Math.random()*(ancho)); 
			int posY = (int) (Math.random()*(alto));
			
			if(tablero[posX][posY]==null) {
				tablero[posX][posY] = new Dinero();
				a++;
			}
				
				}
		
	}
	
	
	
	
	
	
}

	
