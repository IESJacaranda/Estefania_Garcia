/*
 * matriz.length nos da el número de filas
 * matriz[0].length nos da el número de columnas
 * el último elemento de la matriz es matriz[matriz.length-1][matriz[0].length-1]
 *-Arrays.sort(v) ordena los elementos del vector.
 *-Arrays.equals(v1,v2) comprueba si dos vectores son iguales.
 *-Arrays.fill(v,val) rellena el vector v con el valor val.
 *-Arrays.toString(v) devuelve una cadena que representa el contenido del vector.
 *-Arrays.binarySearch(v, k) busca el valor k dentro del vector v (que previamente ha de estar ordenado). 
 */




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
		
		try {
			System.out.println(sonMatricesIguales(rotarAlaDerecha(matriz), derecha));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(sonMatricesIguales(rotarAlaIzquierda(derecha), matriz));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		mostrarMatriz(derecha);
		
	}
	
	/**
	 * muestra el contenido de una matriz
	 * @param matriz
	 */
	public static void mostrarMatriz (int matriz[][]){  
		int i,j;   
		int filas = matriz.length;  
		int columnas = matriz[0].length;  
		// Recorrido de las filas de la matriz
		for (i=0; i<filas; i++) {      
			// Recorrido de las celdas de una fila      
			for (j=0; j<columnas; j++) {          
				System.out.println ("matriz["+i+"]["+j+"]="+ matriz[i][j] );
			}
		}
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

	
	
	/**
	 * convierte el formato de la matriz añadiendo corchetes de inicio, fin y comas
	 * @param matriz
	 * @return matriz con formato
	 */
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
	
	
	/**
	 * Este metodo suma dos matrices
	 * @param matrizA
	 * @param matrizB
	 * @return la suma de dos matrices
	 */
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
	
	
	/**
	 * Este metodo recibe dos matrices y las resta
	 * @param matrizA
	 * @param matrizB
	 * @return
	 */
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
	
	
	/**
	 * Este método concatena dos vectores
	 * @param vector1
	 * @param vector2
	 * @return un único vector que contiene los dos anteriores
	 */
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
	
	/**
	 * Rota una matriz a la derecha
	 * @param matriz
	 * @return matriz rotada a la derecha
	 */
	public static int [][] rotarAlaDerecha(int [][] matriz) {
		
		int [][] matrizDer = new int[matriz.length][matriz.length];
		
		for (int i =0; i<matriz.length;i++) {
			for( int j=0; j<matriz.length;j++) {	//columna pasa a la fila --> j cambia de pos
				//3,0,0 >> 0,0,3 --> primero > último; segundo > penúltimo; último > primero
				
				matrizDer[j][matriz.length-1-i] = matriz[i][j];  //length-1 porque la matriz empieza a contar desde 0, por lo que aunque tenga 4 valores tiene 3 posiciones: 0-1-2-3
			}
		}
		
		return matrizDer;
		
	}
	/**
	 * Rota una matriz a la izquierda
	 * @param matriz
	 * @return matriz rotada a la izquierda
	 */
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
	
	
	/**
	 * Dos matrices son iguales si sus dimensiones son las mismas (numero de filas y columnas)
	 * @param matrizA
	 * @param matrizB
	 * @return
	 * @throws Exception 
	 */
	public static boolean sonMatricesIguales(int [][] matrizA, int [][] matrizB) throws Exception {
		
		boolean sonIguales = true;
		
		
		if(matrizA!=null && matrizB!=null && matrizA.length == matrizB.length 
				&& matrizA[0]!=null && matrizB[0]!=null && 
				matrizA[0].length == matrizB[0].length) {
			
			for (int i =0; i<matrizA.length && sonIguales;i++) {
				for(int j=0; j<matrizA[i].length && sonIguales;j++) {
					
					if(matrizA[i][j]!=matrizB[i][j]) {
						sonIguales = false;
					}
				
				}
			}
			
		}else {
			throw new Exception("Estas matrices no se pueden comparar.");
		}
		
		
		return sonIguales;
	}
	
	
	//ejercicio 6//
	
	public static int [][]	rotarMatrizDerechaJM(int[][] matriz){
		
		int [][] matrizRotada = new int [matriz[0].length][matriz.length];
		int nFilas = matriz.length;
		
		for(int i=0; i<matriz.length;i++) {
			for (int j=0; j<matriz[i].length;j++) {
				matrizRotada[j][nFilas-1-i]= matriz[i][j];
			}
		}
		
		
		return matrizRotada;
	}
	
	
	public static int [][] rotarMatrizInversaJM(int [][] matriz){
		return rotarMatrizDerechaJM(rotarMatrizDerechaJM(matriz));
	}
	
	public static int [][] rotarMatrizIzquierdaJM(int [][] matriz){
		return rotarMatrizDerechaJM(rotarMatrizInversaJM(matriz));
	}
	
	/**
	 * este metodo comprueba si las matrices que recibe como parametros, son equivalentes,
	 * es decir si contienen los mismos elementos pero rotados
	 * @param matrizA matriz original
	 * @param matrizB matriz original o rotada
	 * @return true si son equivalentes, false si no lo son
	 * @throws Exception 
	 */
	public static boolean compruebaMatricesEquivalentesJM(int [][] matrizA, int [][] matrizB) throws Exception {
		
		return sonMatricesIguales(matrizA, matrizB)
				|| sonMatricesIguales(matrizA, rotarMatrizInversaJM(matrizB))
				|| sonMatricesIguales(matrizA, rotarMatrizIzquierdaJM(matrizB))
				|| sonMatricesIguales(matrizA, rotarMatrizDerechaJM(matrizB));
		
	}
		
	
	}








