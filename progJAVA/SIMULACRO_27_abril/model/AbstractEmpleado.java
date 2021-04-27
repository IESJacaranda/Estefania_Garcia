package simulacro.model;

import simulacro.excep.DniException;

public abstract class AbstractEmpleado implements Comparable<AbstractEmpleado> {
	
	protected String dni;
	protected String nombre;
	
	
	public AbstractEmpleado() {}
	
	public AbstractEmpleado(String dni, String nombre) throws DniException {
		if(validarDni(dni)) {
			this.dni = dni;
		}else {
			throw new DniException();
		}
		
		this.nombre = nombre;
		
	}
	//comprueba que la longitud del DNI es 9 y que tiene una letra
	public boolean validarDni(String dni) {
		boolean esValido = false;
		
		int contLetra = 0;
		for(int i=0;i<dni.length(); i++) {
			if(Character.isUpperCase(dni.charAt(i))) {
				contLetra++;
			}
		}
		if(dni.length()==9 && contLetra == 1) {
			esValido = true;
		}
		
		
		return esValido;
	}
	

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	@Override
	public String toString() {
		return "Empleado con DNI " + getDni() + " y nombre: " + getNombre() + ".";
	}
	
	
	
	

}
