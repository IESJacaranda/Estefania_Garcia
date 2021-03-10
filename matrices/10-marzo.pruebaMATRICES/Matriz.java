package pruebaMATRIZ;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		probarArrays();
	}
	
	
	public static void probarArrays() {
		/*
		int[] vector = new int[3];
		System.out.println(vector);
		
		int [][] matrix = new int[2][3];
		System.out.println(matrix[0][2]);
		
		
		
		for(int i=0; i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {  //entre [] poner siempre el valor de la fila actual
				matrix[i][j]=1;
				//System.out.println(i+" "+j+" "+matrix[i][j]);
				System.out.println(matrix[i][j]);
			}
			
		}*/
		
	
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
		
	}
}
