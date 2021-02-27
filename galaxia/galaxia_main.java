package galaxia;

public class galaxia_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		pelicula pel = new pelicula();
		personaje p1 = new personaje("Yoda", 29, pel, 60, "Yoda", 15);
		personaje p2 = new personaje("Luke Skywalker", 67, pel, 180, "humano", 80);
		personaje p3 = new personaje("Chewbacca", 54, pel, 214, "wookiee", 110);

		
		System.out.println(p1.toString());
		
		
		pelicula peli = new pelicula("Star Wars: Episodio IV - Una nueva esperanza", 1977, p1, p2, p3);
		pelicula peli2 = new pelicula("Star Wars: Episodio I - La amenaza fantasma", 1999, p1, p2, p3);
		
		System.out.println(peli.compararPelicula(peli2));
		
		//pelicula pelicula = new pelicula("SW", 2018, p1, p2, p3);
		//pelicula peliculita = new pelicula("SWII", 2018, p1, p2, p3);
		
		//System.out.println(pelicula.compararPelicula(peliculita));
		
		
		System.out.println(peli.obtenerPoderMaximoPelicula());
		
		System.out.println(peli.obtenerPoderPelicula());
		
		
		//System.out.println(p1.getNombre().compareTo(p2.getNombre()));
		
		
		System.out.println(peli.toString());
	}
	
	

}
