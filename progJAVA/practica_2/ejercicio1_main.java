package practica_2;

public class ejercicio1_main {

	public static void main(String[] args) {
		

		productoJM p = new productoJM("12aaaaaaa");
		try {
			System.out.println(p.validarCodigo());
		} catch (Exception e) {
			
			System.out.println(e.getMessage());;
		}
	}

}
