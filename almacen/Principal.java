package almacen;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Producto  prod = new Producto();
		
		System.out.println("Introduzca el código del producto");
		prod.setCodigo(teclado.nextLine());
		
		System.out.println("Introduzca la categoría del producto");
		prod.setCategoria(teclado.nextLine());
		
		
		try {
			System.out.println(prod.validarCodigo());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(prod.validarCategoria());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		teclado.close();
		
		/*
		Producto pro1 = new Producto("a11bb", "A1aabb");
		Producto pro2 = new Producto("112a", "Caaaasaaee");
		Producto pro3 = new Producto("112233", "Caeiu");
		
		try {
			System.out.println(pro1.validarCodigo());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(pro2.validarCodigo());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(pro3.validarCodigo());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		try {
			System.out.println(pro1.validarCategoria());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(pro2.validarCategoria());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(pro3.validarCategoria());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		*/
		
	
		
	} 
	
}
