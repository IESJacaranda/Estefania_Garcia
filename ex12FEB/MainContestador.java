package ex12febCASA;

import java.util.Scanner;

public class MainContestador {

	public static void main(String[] args) {
		
		interfaz();
		
	}

	
	
	public static void mostrarMenu() {
		System.out.println("\n1. Consultar número de mensajes\n"+
				"2. Consultar mensaje \n"+"3. Añadir mensaje\n"+"4. Borrar todos los mensajes \n"
				+"5. Salir\n");
	}
	
	public static void mostrarMenu2() {
		System.out.println("\nMensaje número 1"+"\nMensaje número 2" + "\nMensaje número 3");
	}
	
	public static void mostrarMenu3() {
		System.out.println("\n1. Oír"+"\n2. Borrar");
	}
	
	public static void interfaz() {
		Scanner teclado = new Scanner(System.in);
		
		int menu = 0;
		String mensaje = "";
		
		Contestador contestador = new Contestador();
		
		while (menu!=5) {
			mostrarMenu();
			menu = Integer.parseInt(teclado.nextLine());
			
			switch (menu) {
			case 1:
				System.out.println(contestador.consultarNumeroMensajes());
				break;
				
			case 2:
				mostrarMenu2();
				int opcion = 0;
				opcion = Integer.parseInt(teclado.nextLine());
				
				while (opcion!=1 || opcion!=2 || opcion!=3) {
					System.out.println("La opción seleccionada no existe. Inténtelo de nuevo. ");
					mostrarMenu2();
					opcion = Integer.parseInt(teclado.nextLine());
				}
				
				switch (menu) {
				case 1:
					mostrarMenu3();
					menu = Integer.parseInt(teclado.nextLine());
					
					
					break;
				case 2:
					break;
				case 3:
					break;
				default:
					break;
				}
				
				break;
				
			case 3:
				System.out.println("Introduzca su mensaje: ");
				mensaje = teclado.nextLine();
				try {
					contestador.añadirMensaje(mensaje);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 4:
				contestador.borrarTodosLosMensajes();
				break;
			case 5:
				System.out.println("Ha salido del contestador.");
				break;
			default:
				break;
				}

				
				
				
			}
			
			
			
		}
		
		
		
	}
	
	
	

