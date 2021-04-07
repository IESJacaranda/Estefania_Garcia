/**
 * Realiza un programa que solicite el número de alumnos de una clase y
pida por pantalla para cada uno de los alumnos su nombre y su nota.
Después se presentará un menú que permitirá realizar las siguientes
operaciones:
1. Mostrar el nombre y la nota de los alumnos aprobados.
2. Mostrar el nombre y la nota los alumnos suspensos.
3. Mostrar la nota media de la clase.
4. Mostrar los alumnos que tienen más de una nota X (se solicitara X por teclado).
5. Mostrar el alumno con la nota máxima y mínima.
6. Mostrar un listado ordenado de forma creciente por la nota.
7. Salir.
 */

package rel_8_arrays_7;

import java.util.Arrays;
import java.util.Scanner;

public class Alumno {

	public static void main(String[] args) {
		
		//pedirNombreyNota();
		gui();

	}
	
	static Scanner teclado = new Scanner (System.in);
	
	
	/**
	 * este metodo pregunta por teclado el numero de alumnos
	 * @return devuelve la cantidad de alumnos que sera usado para la longitud de los arrays
	 * @throws Exception 
	 */
	public static int pedirNumeroAlumnos(){
		
		int numAlumnos;
		
		System.out.println("Introduce el número de alumnos de la clase: ");
		numAlumnos = Integer.parseInt(teclado.nextLine());
		
		
		return numAlumnos;
	}
	
	private static String [] nombreAlumnos = new String[pedirNumeroAlumnos()];
	private static double [] notasAlumnos = new double[nombreAlumnos.length];
	
	/**
	 * este metodo pide por teclado los nombres y las notas de los alumnos y las almacena en los arrays correspondientes
	 */
	public static void pedirNombreyNota() {
		
		for(int i = 0; i<nombreAlumnos.length; i++) {
			
			System.out.println("Escribe el nombre del alumno: ");
			nombreAlumnos[i] = teclado.nextLine();
			
			System.out.println("Escribe su nota: ");
			notasAlumnos[i]= Double.parseDouble(teclado.nextLine());
		}
		
		//System.out.println(Arrays.toString(nombreAlumnos)); 
		//System.out.println(Arrays.toString(notasAlumnos));
		
	}
	/**
	 * este metodo calcula la nota media del array notasAlumnos
	 * @return double con la media
	 */
	public static double calcularNotaMedia() {
		
		double suma=0;
		for(int i=0; i<notasAlumnos.length;i++) {
			suma+=notasAlumnos[i];
		}
		
		return suma/notasAlumnos.length;
	}
	public static void mostrarMenu() {
		System.out.println("\n1. Mostrar el nombre y la nota de los alumnos aprobados.\n" + 
				"2. Mostrar el nombre y la nota los alumnos suspensos.\n" + 
				"3. Mostrar la nota media de la clase.\n" + 
				"4. Mostrar los alumnos que tienen más de una nota X.\n" + 
				"5. Mostrar el alumno con la nota máxima y mínima.\n" + 
				"6. Mostrar un listado ordenado de forma creciente por la nota.\n" + 
				"7. Salir.");
	}
	
	public static void gui() {
		double numNota;
		boolean finalizar = false;
		
		pedirNombreyNota();
		
		while(!finalizar) {
			
			mostrarMenu();
			int opcion = Integer.parseInt(teclado.nextLine());
			
			switch (opcion) {
			case 1:
				System.out.println("Los alumnos aprobados son: ");
				for(int i = 0; i<notasAlumnos.length;i++) {
					if (notasAlumnos[i]>=5) {
						System.out.println(nombreAlumnos[i] + " con un "+notasAlumnos[i]+".");
					}
				}
				break;
			
			case 2:
				System.out.println("Los alumnos suspensos son: ");
				for(int i = 0; i<notasAlumnos.length;i++) {
					if (notasAlumnos[i]<5) {
						System.out.println(nombreAlumnos[i] + " con un "+notasAlumnos[i]+".");
					}
				}
				break;
				
			case 3:
				System.out.println("La nota media de la clase es: "+calcularNotaMedia());
				break;
				
			case 4:
				System.out.println("Escribe la nota a partir de la que quieres buscar: ");
				numNota = Double.parseDouble(teclado.nextLine());
				System.out.println("\nLos alumnos que tienen más de un "+numNota+ " son: ");
				for(int i = 0; i<notasAlumnos.length;i++) {
					if (notasAlumnos[i]>numNota) {
						System.out.println(nombreAlumnos[i] + " con un "+notasAlumnos[i]+".");
					}
				}
				break;
				
			case 5:
				/* NO FUNCIONA
				double max = notasAlumnos[0];
				int i;
				for (i=0; i<notasAlumnos.length;i++) {
					if(max<notasAlumnos[i]) {
						max = notasAlumnos[i];
					}
				}
				System.out.println("El alumno "+nombreAlumnos[i]+ " tiene la máxima nota con un "+max);
				
				*/
				
				break;
				
			case 6:
				
				break;
				
			case 7:
				
				finalizar = true;
				break;

			
			}
		}
		
		teclado.close();
	}
	
	
}