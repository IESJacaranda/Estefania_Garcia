package ex_05marzo_casa;

public class PersonalDireccion extends Profesor {

	private String ubicacion;
	private String competencias;
	
	public PersonalDireccion() {
		super();
	}
	
	public PersonalDireccion(String nombre, int edad, char genero, String horario, int codigo, String password, String departamento, String modulo, String curso, String ubicacion, String competencias) throws PasswordException {
		super(nombre, edad, genero, horario, codigo, password, departamento, modulo, curso);
		this.ubicacion= ubicacion;
		this.competencias= competencias;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}

	@Override
	public String toString() {
		return super.toString() +" , "+ this.ubicacion +" , "+ this.competencias ;
	}
	
	
	
	
}

