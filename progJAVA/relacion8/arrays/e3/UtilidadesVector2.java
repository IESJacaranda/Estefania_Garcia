package relacion8.arrays.e3;

import static pruebaMATRIZ.Matriz.imprimirEnString2;

import java.util.Scanner;


public class UtilidadesVector2 {

	public static void main(String[] args) {
		
		//int [] v1 = {5, 10, 5, 24, 4, 2, 6, 2, 1, 0, 11, 2};
		
		System.out.println(calcularUltimoDigito(548));
		System.out.println(saberDigitoMasRepetido(contadorDigitos));
		System.out.println(saberDigitosNoAparecidos(contadorDigitos));
		
		//pedirNumeros();
		
	}
	
	
	public void pedirNumeros() {
		
		Scanner teclado = new Scanner(System.in);
		int numero = -1;
		
		while(numero!=0) {
			System.out.println("Introduce un número entre 1 y 1000: ");
			numero = Integer.parseInt(teclado.nextLine());
			if(numero > 0 && numero <1001) {
				suma+=numero;
				contadorDigitos[numero%10]++; //con el %10 obtiene el numero y a la vez lo almacena en la posicion
				
			}
		}
		//Imprimimos info
		//obtenerEstadisticas();
		teclado.close();
	}
	
	private static int[] contadorDigitos = new int[10];
	private int suma = 0;
		
	
	public static String calcularUltimoDigito(int numero) {
	 			 
			if (numero%10==0) {
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
			}
			
			System.out.println(imprimirEnString2(contadorDigitos));
			
			return "Hay "+contadorDigitos[0]+ " números que terminan en 0.\n"
					+ "Hay "+contadorDigitos[1]+ " números que terminan en 1.\n"
					+ "Hay "+contadorDigitos[2]+ " números que terminan en 2.\n"
					+ "Hay "+contadorDigitos[3]+ " números que terminan en 3.\n"
					+ "Hay "+contadorDigitos[4]+ " números que terminan en 4.\n"
					+ "Hay "+contadorDigitos[5]+ " números que terminan en 5.\n"
					+ "Hay "+contadorDigitos[6]+ " números que terminan en 6.\n"
					+ "Hay "+contadorDigitos[7]+ " números que terminan en 7.\n"
					+ "Hay "+contadorDigitos[8]+ " números que terminan en 8.\n"
					+ "Hay "+contadorDigitos[9]+ " números que terminan en 9.\n";
	
			
	}
	
	public static double calcularMedia(int [] vector) {
		
		double media = 0.0;
		/*int contadorNumero = 0;
		
		while(numero>=1) {
			media = media+numero;
			contadorNumero++;
			
		}
		media = media/contadorNumero;*/
		
		
		for (int i =0; i<contadorDigitos.length;i++) {
			
		}
		
		return media;
		
	}
	
	public static String saberDigitoMasRepetido(int [] vector) { 
		 
		int masRepetido;
		masRepetido = contadorDigitos[0];
		
		
		 for (int i=0; i<contadorDigitos.length;i++) {
			 
			 if(masRepetido<contadorDigitos[i]) { //comparo masRepetido con i y asigno i a masRepetido
				 masRepetido=i;
			 }
		 }
			return ("El dígito que más se repite es "+masRepetido+".");
		}
	
	
	public static String  saberDigitosNoAparecidos(int [] vector) {
		
		String no = "";
		
		for (int i=0; i<contadorDigitos.length;i++) {
			if(contadorDigitos[i]==0) {
				no+=i+" ";
			}
		}
		
		return "Los dígitos que no aparecen son: "+no;
	}
	
	
	
	
	
	
	
	
	
	

}
