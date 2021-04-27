package simulacro.model;

import simulacro.excep.DniException;
import simulacro.excep.SueldoJefeDepartamentoException;

public class JefeDepartamento extends AbstractEmpleado implements IActualizableSueldo{
	
	private int antiguedad;
	private double sueldo;
	
	private final int SUELDO_BASE_MINIMO_JEFE_DEPARTAMENTO = 1300;
	
	private final double INCREMENTO_SUELDO_JD = 10;
	
	public JefeDepartamento() {
		super();
	}

	public JefeDepartamento(String dni, String nombre, int antiguedad,double sueldo) throws SueldoJefeDepartamentoException, DniException {
		super(dni, nombre);
		this.antiguedad = antiguedad;
		if(sueldo>=SUELDO_BASE_MINIMO_JEFE_DEPARTAMENTO) {
			this.sueldo = sueldo;
		}else {
			throw new SueldoJefeDepartamentoException();
		}
		
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public double getSueldo() {
		return sueldo;
	}

	@Override
	public String toString() {
		
		return super.toString() + 
				"\n\t Tiene una antigüedad de: " + getAntiguedad() + " años en la empresa "
						+ "y su sueldo es " + getSueldo() + " euros.";
	}

	@Override
	public void actualizarSueldo() {
		double sueldoInicial = getSueldo();
		
		this.sueldo = sueldoInicial + (sueldoInicial * INCREMENTO_SUELDO_JD);
		
	}

	@Override
	public int compareTo(AbstractEmpleado emple) {
		int compareResult = 0;
		
		if(this.sueldo < ((EmpleadoBase) emple).getSueldo()) {
			compareResult = 1;
		}else if(this.sueldo > ((EmpleadoBase) emple).getSueldo()) {
			compareResult = -1;
		}
		
		return compareResult;
	}
	
	
	
	

}
