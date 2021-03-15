package pruebaMATRIZ;


public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//probarArrays();
		
		//int[][]  matriz = {{3, 3,3},{3,3,3},{3,3,3}};
		//System.out.println(imprimirEnString(matriz));
		
		//String st = new String("[1,2,3]");
	
		//System.out.println(st.concat("[4,5]"));
		
		//int [] vector1 = {3,4,5};
		
		int [][] matriz = {{3,1,0},{0,2,4},{0,5,1}};
		
		int [][] derecha = {{0,0,3},{5,2,1},{1,4,0}};
		
		//System.out.println(imprimirEnString(matriz));
		//System.out.println(imprimirEnString(derecha));
		
		//System.out.println(imprimirEnString(rotarAlaDerecha(matriz)));
		//System.out.println(imprimirEnString(rotarAlaIzquierda(matriz)));
		
		System.out.println(rotarMatriz(matriz, derecha));
		
	}
	
	
	public static void probarArrays() {
		/*
		int[] vector = new int[3];
		System.out.println(vector);
		
		int [][] matrix = new int[2][3];
		System.out.println(matrix[0][2]);
		
		*/
		
	
		int[][] matrix = new int [4][4];
		
		
		for (int i=0; i<matrix.length;i++) { //recorre las filas
			matrix[i][i] = 1;
			for(int j=0;j<matrix[i].length;j++) { //recorre las columnas
				System.out.print(matrix[i][j] + " ");	
			}System.out.println();
		}

		System.out.println("--------");
		
		int [][] matrix2 = {{5,5,5,5},{5,5,5,5}, {5,5,5,5}, {5,5,5,5}};
		for (int i=0; i<matrix2.length;i++) { //recorre las filas
			matrix2[i][i] = 1;
			for(int j=0;j<matrix2[i].length;j++) { //recorre las columnas
				System.out.print(matrix2[i][j] + " ");	
			}System.out.println();
		}
		
		System.out.println("--------");
		
		int [][] matriz2 = new int [4][4];
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				if(i==j) {
					matriz2 [i][j]= 1;
				}
				else {
					matriz2[i][j]=5;
				}
				
				System.out.print(matriz2[i][j]+"\t");
			}
			System.out.println("");
		}
			
		}

	
	
	
	public static String imprimirEnString(int [] [] matriz) {
		
		StringBuilder sb = new StringBuilder();
		
		
		if(matriz.length>0) {
			for (int i=0; i<matriz.length;i++) {
				for (int j=0; j<matriz[i].length;j++) {
					if(j==0) {
						sb.append("[");
					}
					sb.append(matriz[i][j]);
					
					if(j==matriz[i].length-1) {
						sb.append("]");
					}else {
						sb.append(",");
					}
				}sb.append("\n");
			}
		}
		
		return sb.toString();
		
	}
	
	
	
	public static String imprimirEnString2(int[] vector) {
		
		return imprimirEnString(new int [][] {vector});
	}
	
	
	
	public static int [][] sumarMatrices(int [][] matrizA, int [][] matrizB){
		
		int[][] resultado = null;
		
		if(matrizA!=null && matrizB!=null
			&& matrizA.length==matrizB.length
			&& matrizA[0].length==matrizB[0].length) {
			
			resultado= new int[matrizA.length][matrizA[0].length];
			
			for(int i=0;i<matrizA.length;i++) {
				for(int j=0;j<matrizA[i].length;j++) {
					resultado[i][j] = matrizA[i][j] + matrizB[i][j];
			
				}
			}
		}
		return resultado;
	}
	
	
	
	public static int [][] restarMatrices(int [][] matrizA, int [][] matrizB){
		
		int[][] resultado = null;
		
		if(matrizA!=null && matrizB!=null
			&& matrizA.length==matrizB.length
			&& matrizA[0].length==matrizB[0].length) {
			
			resultado= new int[matrizA.length][matrizA[0].length];
			
			for(int i=0;i<matrizA.length;i++) {
				for(int j=0;j<matrizA[i].length;j++) {
					resultado[i][j] = matrizA[i][j] - matrizB[i][j];
			
				}
			}
		}
		return resultado;
	}
	
	
	
	public static int [] concatenarListas(int[] vector1, int [] vector2) {
		int [] resultado = null;
		
		if(vector1!=null && vector2!=null) {
			resultado = new int[vector1.length+vector2.length];
			for(int i=0; i<vector1.length;i++) {
				resultado[i]=vector1[i];
			}
			for(int i=0; i<vector2.length;i++) {
				resultado[i+vector1.length]=vector2[i];
			}
		
		}
		return resultado;
			
			
			
		}
	
	
	public static int [][] rotarAlaDerecha(int [][] matriz) {
		
		int [][] matrizDer = new int[matriz.length][matriz.length];
		
		for (int i =0; i<matriz.length;i++) {
			for( int j=0; j<matriz.length;j++) {	//columna pasa a la fila --> j cambia de pos
				//3,0,0 >> 0,0,3 --> primero > último; segundo > penúltimo; último > primero
				
				matrizDer[j][matriz.length-1-i] = matriz[i][j];
			}
		}
		
		return matrizDer;
		
	}
	
	public static int [][] rotarAlaIzquierda(int [][] matriz){
		
		int [][] matrizIzq = new int[matriz.length][matriz.length];
		
		for (int i =0; i<matriz.length;i++) {
			for( int j=0; j<matriz.length;j++) {	//cada fila pasa a ser columna
				//pos 3 pasa a 1; pos 2 igual; pos 1 pasa a 3				
				matrizIzq[matriz.length-1-j][i] = matriz[i][j];
			}
		}
		
		return matrizIzq;
	}
	
	public static boolean rotarMatriz(int [][] matrizA, int [][] matrizB) { //no funciona
		
		boolean resultado = false;
		
		if (rotarAlaDerecha(matrizA)==matrizB) {
			resultado = true;
		}
		
		return resultado;
	}
	
	
		
	}








