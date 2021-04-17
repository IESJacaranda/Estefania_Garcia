package interf.ejemplo;

public class Principal {

	public static void main(String[] args) {
		
		IEdificio casa = new Casa();
		//o
		IEdificio casa1 = new Polideportivo();
		//Esto último se puede hacer debido a que 
		//me puedo salir de la rama en la que estoy porque uso la interfaz y no la herencia.
		
		casa.getSuperficieTotal();
		
		
		//IInstalacionDeportiva o IEdificio es un filtro de visibilidad
		IInstalacionDeportiva gimnasio = new Polideportivo();
		gimnasio.actividadesOfrecidas();
		
		Polideportivo gimnasio2 = new Polideportivo();
		gimnasio2.getNumeroPlantas();
		
		//Si en vez de interfaz, le pongo la clase, voy a ver todo
		
		//Con los castings
		((Polideportivo)gimnasio).actividadesOfrecidas();
		//((Polideportivo)casa).actividadesOfrecidas(); //este falla en tiempo de ejecución porque no puede acceder al método, que es de InstalacionDeportiva
		
		((Casa)casa).numeroDeHabitaciones(); //De esta manera accedemos a este método, que no está disponible en la interfaz IEdificio, sino que es propio de la clase casa.
	
		Casa casa3 = new Casa();
		casa3.numeroDeHabitaciones(); //así tb podría usar este método exclusivo de la clase Casa
		
		
		
	}
}
