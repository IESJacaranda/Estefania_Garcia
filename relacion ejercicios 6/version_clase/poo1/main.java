package poo1;

import java.util.Scanner;

public class main {

	
	
	public static void main(String[] args) {
		
		
		Rectangulo rectangulo = new Rectangulo();
		
		rectangulo.setAncho(20);
		rectangulo.setLongitud(-3);
		
		System.out.println("Introduzca la longitud");
		Scanner teclado = new Scanner(System.in);
		rectangulo.setLongitud(Double.valueOf(teclado.nextLine()));
		
		System.out.println("Introduzca el ancho");
		rectangulo.setAncho(Double.valueOf(teclado.nextLine()));

		
		System.out.println(rectangulo.calcularPerimetro());
		System.out.println(rectangulo.calcularArea());
		
	}

}
