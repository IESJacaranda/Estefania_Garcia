package interf.ejemplo.prueba;

public class Main {

	public static void main(String[] args) {
		
		//Filtro Vivienda
		Vivienda casa = new Vivienda(30, 10, 3, 4);
		System.out.println(casa.getPrecioEdificio());
		System.out.println(casa.getSuperficieEdificio());
		System.out.println(casa.getHabitantes()); 
		
		//Filtro IEdificio
		IEdificio chalet = new Vivienda(100, 50, 2);
		System.out.println(chalet.getSuperficieEdificio());
		System.out.println(chalet.getPrecioEdificio());
		System.out.println(((Vivienda)chalet).getHabitantes()); //En este caso tengo que llamar al método exclusivo de la clase Vivienda con un casting, para que vea que chalet es un tipo de Vivienda
																//devuelve 0, pq en la línea 8 no le he dado valor
		
		Vivienda c = (Vivienda) chalet; //forma de no hacer el casting cada vez que lo necesitemos. chalet ya tendría accesible las propiedades de la clase Vivienda.
		System.out.println(c.getHabitantes());
		//De la interfaz nunca se puede hacer un new, por ejemplo "= new Edificio();"
		//NO SE PUEDE HACER NEW ni de una INTERFAZ NI DE LA CLASE ABSTRACT.
		//Podemos hacer new de una clase, siempre que tengamos un constructor.

		//Creamos la tienda, que la podemos ver como una clase tienda, como un local comercial o como un edificio
		
		Tienda mediaMarkt = new Tienda(100, 50, "Venta de productos de electrónica");
		ILocalComercial mm = new Tienda(100, 50, "Venta de productos de electrónica");
		IEdificio mmm = new Tienda(100, 50, "Venta de productos de electrónica");
		System.out.println(mediaMarkt.getCantidadProducto());
		System.out.println(mm.getSuperficieEdificio());
		System.out.println(((Tienda)mmm).getCantidadProducto());
		
		
		mediaMarkt.getPrecioEdificio();
		mediaMarkt.getPrecioEdificio();
		mediaMarkt.getSuperficieEdificio();
		
		
	}

}
