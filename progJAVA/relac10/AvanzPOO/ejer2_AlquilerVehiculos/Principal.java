package relac10.AvanzPOO.ejer2;

import java.util.Scanner;

import relac10.AvanzPOO.ejer2.Alquiler;
import relac10.AvanzPOO.ejer2.Furgoneta;
import relac10.AvanzPOO.ejer2.GamaException;
import relac10.AvanzPOO.ejer2.AbstractVehiculo;

public class Principal {

	public static void main(String[] args) {
		
		try {
			AbstractVehiculo f = new Furgoneta("25698P", "media", 152.3);
			Alquiler a = new Alquiler(2, f);
			
			System.out.println(a.calcularPrecioAlquiler(2));
			System.out.println(a.darDeAlta());
//			System.out.println(f.getMatricula());
//			System.out.println(((Furgoneta) f).getPma());
//			System.out.println(f.getTipoGama());
//			System.out.println(f.calcularAlquiler());
		} catch (GamaException e) {
			System.out.println(e.getMessage());
		}
		

	}
	
	
	public void mostrarMenu() {
		System.out.println("\nSeleccione una opción:"
				+ "1. Alta de vehículo\n"
				+ "2. Cálculo de precio de alquiler\n"
				+ "3.  Salir\n");	}
	
	
	
	public void gui() {
		
		Scanner teclado = new Scanner(System.in);

		int opcion = 0;
		boolean finalizar = true;
		while(finalizar) {
			
		mostrarMenu();
		opcion = Integer.parseInt(teclado.nextLine());
			
			
				switch (opcion) {
				case 1:
					try {
						System.out.println();
						
						
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				
				case 2:
					try {
						
						
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					break;
					
				case 3:
					System.out.println("Ha salido del programa.");
					finalizar = true;
					
				default:
					break;
			
				}
				
			}
			
			teclado.close();
	}

}
