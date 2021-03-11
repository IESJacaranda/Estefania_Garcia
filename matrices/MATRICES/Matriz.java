package pruebaMATRIZ;


public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//probarArrays();
		
		int[][]  matriz = {{3,3,3},{3,3,3},{3,3,3}};
		System.out.println(imprimirEnString(matriz));
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
	
	
	
	
	
	
	
	
}
