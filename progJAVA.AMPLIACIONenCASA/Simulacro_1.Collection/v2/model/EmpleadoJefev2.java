package simulacro.v2.model;

import simulacro.v2.excep.DniExceptionv2;
import simulacro.v2.excep.SueldoJefeDepartamentoExceptionv2;

public class EmpleadoJefev2 extends AbstractEmpleadov2 implements IActualizableSueldov2 {

	private int antiguedad;
	
	private final int SUELDO_BASE_MINIMO_JEFE_DEPARTAMENTO = 1300;
	
	private final double INCREMENTO_SUELDO_JD = 1.100;
	
	public EmpleadoJefev2() {
		super();
	}

	public EmpleadoJefev2(String dni, String nombre, int antiguedad,double sueldo) throws SueldoJefeDepartamentoExceptionv2, DniExceptionv2 {
		super(dni, nombre);
		this.antiguedad = antiguedad;
		if(sueldo>=SUELDO_BASE_MINIMO_JEFE_DEPARTAMENTO) {
			this.sueldo = sueldo;
		}else {
			throw new SueldoJefeDepartamentoExceptionv2();
		}
		
	}
	
	//compara por sueldo
	@Override
	public int compareTo(AbstractEmpleadov2 emple) {
		int compareResult = 0;
		
		if(this.sueldo < emple.getSueldo()) {
			compareResult = 1;
		}else if(this.sueldo > emple.getSueldo()) {
			compareResult = -1;
		}
		
		return compareResult;
	}

	@Override
	public void actualizarSueldo() {
		double sueldoInicial = getSueldo();
		
		this.sueldo = sueldoInicial  * INCREMENTO_SUELDO_JD;

	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + 
				"\n\t Tiene una antigüedad de: " + getAntiguedad() + " años en la empresa "
						+ "y su sueldo es " + getSueldo() + " euros.";
	}

}
