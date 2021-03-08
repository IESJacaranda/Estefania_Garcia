package ex_05marzo_casa;

public class PersonalAdministracion extends Empleado {
	
	private String ubicacion;
	private int telefono;
	private String areaRespon;
	
	
	public PersonalAdministracion() {
		super();
	}
	
	public PersonalAdministracion(String nombre, int edad, char genero, String horario, int codigo, String password, String ubicacion, int telefono, String areaRespon) throws PasswordException {
		super(nombre, edad, genero, horario, codigo, password);
		this.ubicacion = ubicacion;
		this.telefono = telefono;
		this.areaRespon = areaRespon;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getAreaRespon() {
		return areaRespon;
	}

	public void setAreaRespon(String areaRespon) {
		this.areaRespon = areaRespon;
	}

	@Override
	public String toString() {
		return super.toString() +" , "+ this.ubicacion +" , "+ this.telefono +" , "+ this.areaRespon;
	}

	
	
}
