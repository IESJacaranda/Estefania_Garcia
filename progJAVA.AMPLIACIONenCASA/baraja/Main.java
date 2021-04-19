/**
 * Se desea realizar un programa que simule el reparto de cartas en un
juego. El juego tiene 48 cartas, separadas en 4 palos (oros, copas,
espadas y bastos) y numeradas del 1 al 12. Se desea realizar un
programa que solicite cuantas cartas se van a repartir y cree un vector
de cartas para el jugador 1 y otro para el jugador 2. Se deben cargar
aleatoriamente las cartas de cada jugador. Las cartas no se repiten.
¿Cuántas cartas reparto?: 5
Cartas del jugador 1:
7 de oros, 8 de espadas, 5 de copas, 4 de copas, 3 de bastos
Cartas del jugador 2:
5 de espadas, 7 de copas, 9 de copas, 10 de bastos, 3 de oros
 */

package baraja;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Baraja baraja = new Baraja();
		
//		baraja.mostrarBaraja();
//		System.out.println("----------------");
//		System.out.println(baraja.cogerCarta());
//		System.out.println("----------------");
//		baraja.mostrarBaraja();
		
//		
//		Jugador j1 = new Jugador();
//		Jugador j2 = new Jugador();
//		Partida p = new Partida(j1, j2, baraja);
//		
//		
//		p.repartirCartas(2, j1);
//		
//		j1.mostrarMano();
//		System.out.println("----------------");
//		baraja.mostrarBaraja();
		gui();
	}
	
	public static void gui(){
		
		Scanner teclado = new Scanner(System.in);
		boolean finalizar = true;
		
		Baraja baraja = new Baraja();
		Jugador j1 = new Jugador();
		Jugador j2 = new Jugador();
		Partida p = new Partida(j1, j2, baraja);
		
		while(finalizar) {
			System.out.println("¿Cuántas cartas reparto? ");
		int cartasReparto = Integer.parseInt(teclado.nextLine());
		
			try {
				System.out.println("Cartas del jugador 1: ");
				p.repartirCartas(cartasReparto, j1);
				j1.mostrarMano();
			} catch (Exception e) {
				finalizar=false;
				System.out.println(e.getMessage());
			}
			
			System.out.println("");
			
			try {
				System.out.println("Cartas del jugador 2: ");
				p.repartirCartas(cartasReparto, j2);
				j2.mostrarMano();
			} catch (Exception e) {
				finalizar=false;
				System.out.println(e.getMessage());
			}
			
		}
		
		
		
	}

}
