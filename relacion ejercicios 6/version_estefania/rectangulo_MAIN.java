package pruebaCASA;

import java.util.Scanner;

public class rectangulo_MAIN {

	public static void main(String[] args) {
		
		rectangulo cuadrado = new rectangulo();
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Introduzca la longitud");
		cuadrado.setLongitud(Double.valueOf(teclado.nextLine()));
		
		System.out.println("Introduzca el ancho");
		cuadrado.setAncho(Double.valueOf(teclado.nextLine()));
		
		System.out.println(cuadrado.getArea());
		System.out.println(cuadrado.getPerimetro());
		
		System.out.println(cuadrado.toString());
		

		cuadrado.setAncho(-1.0);
		cuadrado.setLongitud(22.0);
		
		System.out.println(cuadrado.toString());
		
		teclado.close();
		
	}

}
