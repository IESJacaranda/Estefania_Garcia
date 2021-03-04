package rel7_ejer5_ligaFUTBOL;

public class Equipo {

	private String nombre;
	private String ciudad;
	private int year;
	private String estadio;
	private int partidosGanados;
	
	public Equipo() {}
	
	public Equipo(String nombre, String ciudad, int year, String estadio) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.year = year;
		this.estadio = estadio;
	}

	
	@Override
	public boolean equals(Object obj) {  //para comparar si el nombre de los equipos es igual
		boolean sonIguales=false;
		if (this == obj) {
			sonIguales=true;
		}if (obj == null) {
			sonIguales=false;
		}else if(((Equipo)obj).getNombre()==this.getNombre()) {
			sonIguales = true;
		}
			
		return sonIguales;
	}

	@Override
	public String toString() {
		return "nombre:" +this.nombre;
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

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}


	public int getPartidosGanados() {
		return partidosGanados;
	}

	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}

	
	
	
	
	
}
