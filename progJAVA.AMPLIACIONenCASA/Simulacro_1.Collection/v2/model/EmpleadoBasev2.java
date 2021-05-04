package simulacro.v2.model;

import simulacro.v2.excep.DniExceptionv2;
import simulacro.v2.excep.PuestoExceptionv2;

public class EmpleadoBasev2 extends AbstractEmpleadov2 implements IActualizableSueldov2{
	
	private String puesto;
	
	private final double INCREMENTO_SUELDO_EB = 1.025;
	
	public EmpleadoBasev2() {
		super();
	}
	
	public EmpleadoBasev2(String dni, String nombre, String puesto) throws PuestoExceptionv2, DniExceptionv2 {
		super(dni, nombre);
		if(puesto.equalsIgnoreCase(EPuestov2.ADMINISTRATIVO.toString()) ||
				puesto.equalsIgnoreCase(EPuestov2.OPERARIO.toString()) || 
				puesto.equalsIgnoreCase(EPuestov2.CONTABLE.toString())) {
			this.puesto = puesto;
		}else {
			throw new PuestoExceptionv2();
		}
		//asignar sueldo en funcion del puesto
		if(puesto.equalsIgnoreCase(EPuestov2.ADMINISTRATIVO.toString())){
			this.sueldo = EPuestov2.ADMINISTRATIVO.getSueldoBase();
		}else if(puesto.equalsIgnoreCase(EPuestov2.OPERARIO.toString())){
			this.sueldo = EPuestov2.OPERARIO.getSueldoBase();
		}else if(puesto.equalsIgnoreCase(EPuestov2.CONTABLE.toString())){
			this.sueldo = EPuestov2.CONTABLE.getSueldoBase();
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

	public String getPuesto() {
		return puesto;
	}

	@Override
	public void actualizarSueldo() {
		double sueldoInicial = getSueldo();
		
		this.sueldo = sueldoInicial * INCREMENTO_SUELDO_EB;
		
	}
	
	@Override
	public String toString() {
		
		return super.toString() +
				"\n\t Desempeña un puesto de: " + getPuesto() + " y su sueldo es " + getSueldo() + " euros.";
	}

}
