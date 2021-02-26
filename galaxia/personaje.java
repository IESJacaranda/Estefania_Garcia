package galaxia;

public class personaje {

	private String nombre;
	private double destruccion;
	private pelicula pelicula;
	private double estatura;
	private String especie;
	private double peso;
	
	public personaje() {}
	
	public personaje(String nombre, double destruccion, pelicula pelicula, double estatura, String especie, double peso) {
		
		this.nombre = nombre;
		this.destruccion = destruccion;
		this.pelicula = pelicula;
		this.estatura = estatura;
		this.especie = especie;
		this.peso = peso;	
		
	}

	
	
	
	
	
	
	
	
	
	
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getDestruccion() {
		return destruccion;
	}


	public void setDestruccion(int destruccion) { //el poder de destruccion tiene q ser entre 1-100
		if(destruccion>=1 && destruccion<=100) {
			this.destruccion = destruccion;
		}
		
	}
	
	/**
	 * mostrar el nombre, la estatura, la especie, y a
continuación lo que sea mayor, la capacidad de destrucción o el peso
	 */
	@Override
	public String toString() {
		String mensaje = "";
		
		if(this.destruccion>this.peso) {
			mensaje = "El nombre del personaje es: "+this.nombre + ","
					+ "\n su estatura es: " + this.estatura + ","
					+ "\n pertenece a la especie: " + this.especie + ","
					+ "\n su poder de destrucción es: " + this.destruccion;
		}
		else if (this.destruccion<this.peso) {
			mensaje = "El nombre del personaje es: "+this.nombre + ",\n"
					+ "su estatura es: " +this.estatura + ",\n"
					+ "pertenece a la especie: " +this.especie + ",\n"
					+ "su peso es: " + this.peso;
		}
		
		return mensaje;
	}


	public pelicula getPelicula() {
		return pelicula;
	}


	public void setPelicula(pelicula pelicula) {
		this.pelicula = pelicula;
	}


	public double getEstatura() {
		return estatura;
	}


	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
