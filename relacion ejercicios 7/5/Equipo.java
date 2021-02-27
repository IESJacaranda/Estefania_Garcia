package rel7_ejer5_ligaFUTBOL;

public class Equipo {

	private String nombre;
	private String ciudad;
	private int year;
	private String presidente;
	private String estadio;
	
	public Equipo() {}
	
	public Equipo(String nombre, String ciudad, int year, String presidente, String estadio) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.year = year;
		this.presidente = presidente;
		this.estadio = estadio;
	}

	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getPresidente() {
		return presidente;
	}

	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}
	
	
}
