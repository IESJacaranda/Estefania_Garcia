package rel_8_arrays_4;

import java.util.Scanner;

public class PrincipalFecha {

	public static void main(String[] args) {
		
		interfaz();
		

	}

	public static void interfaz() {
		int day;
		int month;
		int year;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el día de la fecha:");
		day = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduce el mes de la fecha:");
		month = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduce el año de la fecha:");
		year = Integer.parseInt(teclado.nextLine());
		
		
		try {
			Fecha fecha = new Fecha(day,month,year);
			System.out.println(fecha.pasarAformatoLargo());
			
		} catch (Exception e) { 
			System.out.println(e.getMessage());
		}
		
		teclado.close();
	}
}
