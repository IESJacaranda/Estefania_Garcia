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

	private int day;
	private int month;
	private int year;
	
	private static String[] listaMeses= {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
									"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

	private static int[] dias_mes= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	
	static Scanner teclado = new Scanner(System.in);
	
	public Fecha(int day, int month, int year) throws Exception {
		
		if(comprobarFecha(day, month, year)) {
			this.day = day;
			this.month = month;
			this.year = year;
		}else {
			throw new FechaIncorrectaException();
		}
		
	}
	
	private boolean comprobarFecha(int day, int month, int year) {
		
		boolean esCorrecta = false;
		
		if(day> 0 && month >0) {
			if(dias_mes[month-1]>=day) {
				esCorrecta =  true;
			}else if(isLeapYear(year) && month==2 && day==29) { 
				esCorrecta = true;
			}
			
		}return esCorrecta;
	}
	
	
	
	public static boolean isLeapYear(int year) {
		
		boolean esBisiesto = false;
		
		if (year%4==0 && year%100!=0 || year%400==0) {
			esBisiesto = true;
		}
		return esBisiesto;
	}
	
	
	public String pasarAformatoLargo() { 
		
		
		return "La fecha en formato largo es " +this.day+ " de " +listaMeses[this.month-1]+ " de " +this.year+".";
	}

}
