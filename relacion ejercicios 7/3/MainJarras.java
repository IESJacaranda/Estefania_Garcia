package rel7_ejer3_JARRAS;

import java.util.Scanner;


public class MainJarras {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		
		/**System.out.println("Introduce una opción (A/B)");
		
		String opcion = new Scanner(System.in).nextLine();
		if (opcion.equalsIgnoreCase("A")) {
			System.out.println("Lo tienes");
		}else {
			System.out.println("No!");
		}*/
		
		
		interfaz();
		
	}
	
	/**
	 * Este método imprime por pantalla el menú
	 */
	public static void mostrarMenu() {
		System.out.println("\n Escoja una opción: "
							+ "\n 1.Llenar Jarra"
							+ "\n 2.Vaciar jarra"
							+ "\n 3.Volcar jarra A en B"
							+ "\n 4.Volcar jarra B en A"
							+ "\n 5.Ver estado de las jarras"
							+ "\n 6.Salir \n");
	}
	
/**
 * Este método imprime por pantalla la selección de la jarra
 */
	public static void  escogerJarra() {
		System.out.println("Escoja una jarra:"
							+ "\n Opción 1: JARRA A"
							+ "\n Opción 2: JARRA B");
	}
  
	
	public static void interfaz() {
		
		System.out.println("Introduce la capacidad de la jarra A: ");
		Jarra A = new Jarra(Double.parseDouble(teclado.nextLine()));
		
		System.out.println("Introduce la capacidad de la jarra B: ");
		Jarra B = new Jarra(Double.parseDouble(teclado.nextLine()));
		
		int opcion = 0;
		int opcion2 = 0;
		
		while (opcion!=6) {
			
			mostrarMenu();
			opcion = Integer.parseInt(teclado.nextLine());
			
			
			try {
				
				switch (opcion) {
				
			case 1:
				escogerJarra();
				opcion2 = Integer.parseInt(teclado.nextLine());
				
				while (opcion2!=2 && opcion2!=1) {
					escogerJarra();
					opcion2 = Integer.parseInt(teclado.nextLine());
				}
				if (opcion2 == 1) {
					A.llenarJarra();
				}else if (opcion == 2) {
					B.llenarJarra();
				}
				break;
				
			case 2:
				escogerJarra();
				opcion2 = Integer.parseInt(teclado.nextLine());
				
				while (opcion2!=2 && opcion2!=1) {
					escogerJarra();
					opcion2 = Integer.parseInt(teclado.nextLine());
				}
				if (opcion2==1) {
					A.vaciarJarra();
				}else if (opcion2 == 2){
					B.vaciarJarra();
				}
				break;
				
			case 3:
				A.volcarJarra(B);
				break;
				
			case 4:
				B.volcarJarra(A);
				break;
				
			case 5:
				System.out.println("JARRA A:");
				System.out.println(A.toString());
				
				System.out.println("JARRA B:");
				System.out.println(B.toString());
				break;
				
			case 6:
				System.out.println("Ha salido del programa.");
				
			}
			}catch (Exception ex) {
				System.out.println(ex.getMessage());
			}

		}
	}
	
}
