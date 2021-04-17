package relacion7.ejer5_ligaFutbol;

public class Principal {

	public static void main(String[] args) {
	
	
	
	Equipo equi1 = new Equipo("Betis", "Sevilla", 1907, "Benito Villamarín");
	Equipo equi2 = new Equipo("Sevilla", "Sevilla", 9874, "Sanchez Pizjuan" );
	
	//System.out.println(equi1.equals(equi2));
	
	try {
		Partido partido = new Partido(40, equi1, equi1);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	System.out.println("-----------------------------------------------------------------");
	try {
		Partido partido2 = new Partido(40, equi1, equi2);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	System.out.println("-----------------------------------------------------------------");
	
	try {
		Partido partido = new Partido(32, equi1, equi1);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	System.out.println("-----------------------------------------------------------------");
	
	try {
		Partido partido = new Partido(32, equi1, equi2);
		System.out.println(partido.toString());
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	System.out.println("-----------------------------------------------------------------");
	try {
		Partido partido = new Partido(32, equi1, equi2);
		partido.obtenerQuiniela('z');
		System.out.println(partido.toString());
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	System.out.println("-----------------------------------------------------------------");
	try {
		Partido partido = new Partido(32, equi1, equi2);
		partido.ponerResultado("6-0");
		System.out.println(partido.toString());
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	
	
	}
}
	
	

