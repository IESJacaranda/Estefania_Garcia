package poo3;

import java.util.Scanner;

public class principal {

	public static final String MENU = "1. Servir café solo (1 euro)\n" + 
									  "2. Servir leche (0,8 euros)\n" + 
									  "3. Servir café con leche (1,5 euros)\n" + 
									  "4. Consultar estado máquina. Aparecen los datos de los depósitos y del monedero\n" + 
									  "5. Apagar máquina y salir";
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		Maquina maquina = new Maquina();
		double cantidad =0;
		
			while(opcion!=5) {
				try {
					mostrarMenu();
					opcion = Integer.parseInt(teclado.nextLine());
					
					switch (opcion) {
					case 1:
						if(maquina.esPosibleServirCafe()) {
							System.out.println("Introduzca la cantidad");
							cantidad = Double.parseDouble(teclado.nextLine());
							System.out.println(maquina.darCambio(cantidad, Maquina.PRECIO_CAFE));
							maquina.servirCafe();
						}
						else {
							System.out.println("No hay suficiente café");
						}
						break;
					case 2:
						if(maquina.esPosibleServirLeche()) {
							System.out.println("Introduzca la cantidad");
							cantidad = Double.parseDouble(teclado.nextLine());
							System.out.println(maquina.darCambio(cantidad, maquina.PRECIO_LECHE));
							maquina.servirLeche();
						}else {
							System.out.println("No hay suficiente leche");
						}
						break;
					case 3:
						if(maquina.esPosibleServirCafeConLeche()) {
							System.out.println("Introduzca la cantidad");
							cantidad = Double.parseDouble(teclado.nextLine());
							System.out.println(maquina.darCambio(cantidad, maquina.PRECIO_CAFE_LECHE));
							maquina.servirCafeConLeche();
						}else {
							System.out.println("No hay suficiente cafe con leche");
						}
						break;
					case 4:
						//status
						System.out.println(maquina);
					default:
						break;
					}
				}catch(Exception ex) {
					
				}	
			}	
	}
	public static void mostrarMenu() {
		System.out.println(MENU);
	}

}

