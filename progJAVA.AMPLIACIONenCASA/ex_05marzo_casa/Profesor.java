package ex_05marzo_casa;

public class Profesor extends Empleado {

	
	
	private String departamento;
	private String modulo;
	private String curso;
	
	public Profesor() {
		super(); //lo que hereda del padre
	}
	
	public Profesor(String nombre, int edad, char genero, String horario, int codigo, String password, String departamento, String modulo, String curso) throws PasswordException {
		super(nombre, edad, genero, horario, codigo, password);
		this.departamento = departamento;
		this.modulo = modulo;
		this.curso = curso;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return super.toString() +" , "+ this.departamento +" , "+ this.curso +" , "+ this.modulo;
	}
	
	
	
	
}
