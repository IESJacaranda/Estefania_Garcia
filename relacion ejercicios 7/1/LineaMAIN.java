package relacion7;

import java.util.Scanner;

public class LineaMAIN {

	public final static String MENU = "1. Mover línea\n" + 
										"2. Mostrar línea\n" + 
										"3. Salir";
	
	public static void main(String[] args) {
		
		/*Punto puntito = new Punto(5.0, 3.0);
		Punto puntito2 = new Punto(3.0, 2.0);
		
		Punto puntito3 = new Punto(5.0, 3.0);
		Punto puntito4 = new Punto(3.0, 2.0);
		
		System.out.println(puntito.equals(puntito2));
		
		Linea line = new Linea(puntito, puntito2);
		Linea line2 = new Linea(puntito3, puntito4);
		
		System.out.println(line.equals(line2));
		
		System.out.println(line.toString());*/
		
		interfaz();
		
	}
	static Scanner teclado = new Scanner(System.in);
	
	public static void interfaz() {
		
		
		int opcion = 0;
		Linea nuevaLinea = pedirLinea();
		
		
		
		while(opcion!=3) {
			System.out.println("Escoge una opción: ");
			System.out.println(MENU);
			opcion = Integer.parseInt(teclado.nextLine());
			
			if (opcion<1 || opcion>3) {
				System.out.println("La opción seleccionada no existe.");
			}
			switch (opcion) {
			case 1:
				subInterfaz();
				break;
			case 2:
				System.out.println(nuevaLinea.toString());
				break;
			
			default:
				break;
			}

		}
		
	}
	
	public static void subInterfaz() {  /*NO FUNCIONA*/
		
		Linea nuevaLinea = new Linea();
		System.out.println("Escoge una opción: (A-Arriba, B-Abajo, I-Izquierda, D-Derecha) ");
		char letra = teclado.nextLine().charAt(0);
		
		switch (letra) {
		case 'A':
			System.out.println("Escriba la distancia que desea mover su línea: ");
			nuevaLinea.moverArriba(teclado.nextDouble());
			
			break;
		case 'B':
			System.out.println("Escriba la distancia que desea mover su línea: ");
			nuevaLinea.moverAbajo(teclado.nextDouble());
			break;
		case 'I':
			System.out.println("Escriba la distancia que desea mover su línea: ");
			nuevaLinea.moverIzquierda(teclado.nextDouble());
			break;
		case 'D':
			System.out.println("Escriba la distancia que desea mover su línea: ");
			nuevaLinea.moverDerecha(teclado.nextDouble());
			break;
		
		default:
			break;
		}
		
	}
	
	public static Linea pedirLinea(){
		
		Linea nuevaLinea = new Linea();
		
		Punto p1 = new Punto();
		
		Punto p2 = new Punto();
		
		System.out.println("Escriba las coordenadas del punto A (x,y): ");
		p1.setCoordX(Double.parseDouble(teclado.nextLine()));
		p1.setCoordY(Double.parseDouble(teclado.nextLine()));
		nuevaLinea.setPuntoA(p1);
		
		System.out.println("Escriba las coordenadas del punto B (x,y): ");
		p2.setCoordX(Double.parseDouble(teclado.nextLine()));
		p2.setCoordY(Double.parseDouble(teclado.nextLine()));
		nuevaLinea.setPuntoB(p2);
			
		return nuevaLinea;
		

}
}




