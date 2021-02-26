package galaxia;

public class pelicula {

	private String nombre;
	private int yearEstreno;
	private personaje p1;
	private personaje p2;
	private personaje p3;
	
	public pelicula() {}
	
	public pelicula (String nombre, int yearEstreno, personaje p1, personaje p2, personaje p3) {
		this.nombre = nombre;
		this.yearEstreno = yearEstreno;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getYearEstreno() {
		return yearEstreno;
	}

	public void setYearEstreno(int yearEstreno) {
		this.yearEstreno = yearEstreno;
	}

	public personaje getP1() {
		return p1;
	}

	public void setP1(personaje p1) {
		this.p1 = p1;
	}

	public personaje getP2() {
		return p2;
	}

	public void setP2(personaje p2) {
		this.p2 = p2;
	}

	public personaje getP3() {
		return p3;
	}

	public void setP3(personaje p3) {
		this.p3 = p3;
	}
	
	

	
}
