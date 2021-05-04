package relacion11.EstrAlmacComplejas.ejer4;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		gui();

	}
	
	
	public static void mostrarMenu() {
		System.out.println("\nSeleccione una opción:\n"
				+ "\t1. Nueva página consultada\n"
				+ "\t2. Consultar historial completo\n"
				+ "\t3. Consultar historial de un día\n"
				+ "\t4. Borrar historial completo\n"
				+ "\t5. Salir\n");
	}
	
	public static void gui(){
		Scanner teclado = new Scanner(System.in);
		Historial historial = new Historial();
		boolean finalizar = true;
		
		
		while(finalizar) {
			
			mostrarMenu();
			int opcion;
			opcion = Integer.parseInt(teclado.nextLine());
			
			
				switch (opcion) {
				case 1:
					
					System.out.println("Introduzca la url a consultar: ");
					String url = teclado.nextLine();
					
					try {
						historial.addPagina(new PaginaWeb(url));
						
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					
					break;
				
				case 2:
					System.out.println(historial.consultarHistorial());
					
					break;
					
				case 3:
					System.out.println("Introduzca día, mes y año: (PULSE ENTER TRAS CADA UNO)");
					int day = Integer.parseInt(teclado.nextLine());
					int month = Integer.parseInt(teclado.nextLine());
					int year = Integer.parseInt(teclado.nextLine());
					
					System.out.println(historial.consultarDia(LocalDateTime.of(year, month, day, 00, 00)));
					
					break;
				case 4:
					
					historial.borrarHistorial();
					
					break;
				case 5:
					System.out.println("Ha salido del programa.");
					finalizar = false;
					
					break;
				default:
					break;
			
				}
				
			}
			
			teclado.close();
	
		
	}

}
