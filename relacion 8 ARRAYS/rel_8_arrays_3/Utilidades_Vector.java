package rel_8_arrays_3;


import java.util.Scanner;

public class Utilidades_Vector {

	public static void main(String[] args) {
		Utilidades_Vector v1 = new Utilidades_Vector();
		v1.pedirNumeros();
		

	}
	
	private static int[] contadorDigitos = new int[10];
	private static int suma = 0;
	
	
	public static int calcularUltimoDigito(int numero) {
		 
		/*if (numero%10==0) {
			contadorDigitos[0]++;
		}else if(numero%10==1) {
			contadorDigitos[1]++;
		}else if(numero%10==2) {
			contadorDigitos[2]++;
		}else if(numero%10==3) {
			contadorDigitos[3]++;
		}else if(numero%10==4) {
			contadorDigitos[4]++;
		}else if(numero%10==5) {
			contadorDigitos[5]++;
		}else if(numero%10==6) {
			contadorDigitos[6]++;
		}else if(numero%10==7) {
			contadorDigitos[7]++;
		}else if(numero%10==8) {
			contadorDigitos[8]++;
		}else if(numero%10==9) {
			contadorDigitos[9]++;
		}*/
		
		return numero%10; 
		
		
	}
	
	
	public static double calcularMedia() {
		
		int totalDigitos = 0;
		
		for(int i=0; i<contadorDigitos.length; i++) {
			totalDigitos+=contadorDigitos[i];
				
		}
		return suma/totalDigitos;
			
	}
	
	public static int saberDigitoMasRepetido() { 
		 
		int masRepetido;
		masRepetido = contadorDigitos[0];
		
		 for (int i=0; i<contadorDigitos.length;i++) {
			 
			 if(masRepetido<contadorDigitos[i]) { //comparo masRepetido con i y asigno i a masRepetido
				 masRepetido=i;
			 }
		 }
			return masRepetido;
		}
	
	
	public static String saberDigitosNoAparecidos() {
		
		String no = "";
		
		for (int i=0; i<contadorDigitos.length;i++) {
			if(contadorDigitos[i]==0) {
				no+=i+" ";
			}
		}
		
		return no;
	}
	
	
	
	
	
	public static void pedirNumeros() {
		
		Scanner teclado = new Scanner(System.in);
		int numero = -1;
		
		while(numero!=0) {
			System.out.println("Introduce un número entre 1 y 1000: ");
			numero = Integer.parseInt(teclado.nextLine());
			
			if(numero > 0 && numero <1001) {
				suma+=numero;
				contadorDigitos[calcularUltimoDigito(numero)]++;
			}
		}
		
		imprimirResultados();
		teclado.close();
	}
	
	
	public static void imprimirResultados() {
		System.out.println("\nLa media total de los números introducidos es: " + calcularMedia()+".\n");
		System.out.println("Hay "+contadorDigitos[0]+ " números que terminan en 0.\n"
					+ "Hay "+contadorDigitos[1]+ " números que terminan en 1.\n"
					+ "Hay "+contadorDigitos[2]+ " números que terminan en 2.\n"
					+ "Hay "+contadorDigitos[3]+ " números que terminan en 3.\n"
					+ "Hay "+contadorDigitos[4]+ " números que terminan en 4.\n"
					+ "Hay "+contadorDigitos[5]+ " números que terminan en 5.\n"
					+ "Hay "+contadorDigitos[6]+ " números que terminan en 6.\n"
					+ "Hay "+contadorDigitos[7]+ " números que terminan en 7.\n"
					+ "Hay "+contadorDigitos[8]+ " números que terminan en 8.\n"
					+ "Hay "+contadorDigitos[9]+ " números que terminan en 9.\n");
		System.out.println("El dígito que más se repite es el: "+ saberDigitoMasRepetido()+".\n");
		System.out.println("Los dígitos que no aparecen son: "+saberDigitosNoAparecidos()+".\n");
		
	}

}
