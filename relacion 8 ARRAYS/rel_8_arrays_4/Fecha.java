/**
 * Realizar un programa que solicite la fecha como tres datos numéricos
(día, mes y año). Deberá mostrar la fecha en formato largo.
Introduce el día de la fecha: 15
Introduce el mes de la fecha: 3
Introduce el año de la fecha: 2009
La fecha en formato largo es 15 de Marzo de 2009

Si la fecha introducida es incorrecta se mostrará un mensaje de error:
“Fecha incorrecta” y el programa terminará.
Crear la clase Fecha e incluir el método pasarAformatoLargo que
devuelva una cadena con formato largo.
NOTAS:
	• Para guardar los meses del año, utilizar un array de String.
	• Utilizar el método diasDeUnMes que devuelve el número de días
	de un mes (Relación 4, ejercicio 4).
	• Se deben tratar los errores con Excepciones.
 */

package rel_8_arrays_4;

import java.util.Scanner;

public class Fecha {

	public static void main(String[] args) {
		

	}
	
	private static String[] listaMeses= {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
									"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

	
	static Scanner teclado = new Scanner(System.in);
	
	public static String pasarAformatoLargo(int day, int month, int year) { //completar
		
		
		
		return "La fecha en formato largo es " +day+ " de " +listaMeses[month-1]+ " de " +year+".";
	}
	
	
	public static int getDay(int day) {  //completar
		
		//int month = getMonth();
		
		//int year = getYear();
		
		System.out.println("Introduce el día de la fecha: ");
		
		day = Integer.parseInt(teclado.nextLine());
		
		
		
		
		return day;
	}
	
	
	public static int getMonth() throws Exception {
		
		int month;
		
		System.out.println("Introduce el mes de la fecha: ");
		
		month = Integer.parseInt(teclado.nextLine());
		
		if(month<1 || month>12) {
			throw new MonthException();
		}
		
		return month;
	}
	
	
	public static int getYear() throws YearException {
		
		int year;
		
		System.out.println("Introduce el año de la fecha: ");
		
		year = Integer.parseInt(teclado.nextLine());
		
		if (year<0 || year>2099) {
			throw new YearException();
		}
		
		
		return year;
	}
	
	
	public static boolean isLeapYear(int year) {
		
		boolean esBisiesto = false;
		
		if (year%4==0 && year%100!=0 || year%400==0) {
			esBisiesto = true;
		}
		return esBisiesto;
	}
	

}
