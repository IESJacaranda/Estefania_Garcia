package pruebaCASA;

import java.util.Scanner;

public class MaquinaCafe_MAIN {

	public static final String MENU = "1. Servir café (1 euro)\n" + 
			  "2. Servir leche (0,8 euros)\n" + 
			  "3. Servir café con leche (1,5 euros)\n" + 
			  "4. Consultar estado de la máquina.\n" + 
			  "5. Apagar máquina y salir";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		MaquinaCafe cafetera = new MaquinaCafe();
		double cantidad =0;
		
			while(opcion!=5) {
				try {
					System.out.println(MENU);
					opcion = Integer.parseInt(teclado.nextLine());
					
					switch (opcion) {
					case 1:
						if(cafetera.sePuedeServirCafe()) {
							System.out.println("Introduzca el importe");
							cantidad = Double.parseDouble(teclado.nextLine());
							System.out.println(cafetera.darCambio(cantidad, MaquinaCafe.PRECIO_CAFE));
							cafetera.servirCafe();
						}
						else {
							System.out.println("No hay suficiente café");
						}
						break;
					case 2:
						if(cafetera.sePuedeServirLeche()) {
							System.out.println("Introduzca el importe");
							cantidad = Double.parseDouble(teclado.nextLine());
							System.out.println(cafetera.darCambio(cantidad, MaquinaCafe.PRECIO_LECHE));
							cafetera.servirLeche();
						}else {
							System.out.println("No hay suficiente leche");
						}
						break;
					case 3:
						if(cafetera.sePuedeServirCafeConLeche()) {
							System.out.println("Introduzca el importe");
							cantidad = Double.parseDouble(teclado.nextLine());
							System.out.println(cafetera.darCambio(cantidad, MaquinaCafe.PRECIO_CAFE_LECHE));
							cafetera.servirCafeConLeche();
						}else {
							System.out.println("No hay suficiente cafe con leche");
						}
						break;
					case 4:
						//status
						System.out.println(cafetera.toString());
					default:
						break;
					}
				}catch(Exception ex) {
					
				}	
			}	teclado.close();
	}
			
}	
