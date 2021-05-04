package simulacro.v2.model;

import simulacro.v2.excep.DniExceptionv2;

public abstract class AbstractEmpleadov2 implements Comparable<AbstractEmpleadov2>{

	protected String nombre;
	protected String dni;
	protected double sueldo;
	
	public AbstractEmpleadov2() {}

	public AbstractEmpleadov2(String dni, String nombre) throws DniExceptionv2 {
		if(validarDni(dni)) {
			this.dni = dni;
		}else {
			throw new DniExceptionv2();
		}
		
		this.nombre = nombre;
	}
	
	//comprueba que la longitud del DNI es 9 y que tiene una letra
	public boolean validarDni(String dni) {
		boolean esValido = false;
		
		int contLetra = 0;
		for(int i=0;i<dni.length(); i++) {
			if(Character.isAlphabetic(dni.charAt(i))) {
				contLetra++;
			}
		}
		if(dni.length()==9 && contLetra == 1) {
			esValido = true;
		}
		
		
		return esValido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getSueldo() {
		return sueldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractEmpleadov2 other = (AbstractEmpleadov2) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Empleado con DNI " + getDni() + " y nombre: " + getNombre() + ".";
	}
	
}
