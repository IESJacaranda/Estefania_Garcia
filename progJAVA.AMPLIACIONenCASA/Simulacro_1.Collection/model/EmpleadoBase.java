package simulacro.model;

import simulacro.excep.DniException;
import simulacro.excep.PuestoException;

public class EmpleadoBase extends AbstractEmpleado implements IActualizableSueldo{
	
	private String puesto;
	
	private final double INCREMENTO_SUELDO_EB = 1.025; //2.5 % se multiplica el 1, y el tanto por ciento
														//si quieres decrementar dividir entre 1 y el tanto por ciento
	
	public EmpleadoBase() {
		super();
	}

	public EmpleadoBase(String dni, String nombre, String puesto) throws PuestoException, DniException {
		super(dni, nombre);
		if(puesto.equalsIgnoreCase(EPuesto.ADMINISTRATIVO.toString()) ||
				puesto.equalsIgnoreCase(EPuesto.OPERARIO.toString()) || 
				puesto.equalsIgnoreCase(EPuesto.CONTABLE.toString())) {
			this.puesto = puesto;
		}else {
			throw new PuestoException();
		}
		if(puesto.equalsIgnoreCase(EPuesto.ADMINISTRATIVO.toString())){
			this.sueldo = EPuesto.ADMINISTRATIVO.getSueldoBase();
		}else if(puesto.equalsIgnoreCase(EPuesto.OPERARIO.toString())){
			this.sueldo = EPuesto.OPERARIO.getSueldoBase();
		}else if(puesto.equalsIgnoreCase(EPuesto.CONTABLE.toString())){
			this.sueldo = EPuesto.CONTABLE.getSueldoBase();
		}
	}

	public String getPuesto() {
		return puesto;
	}

	

	@Override
	public String toString() {
		
		return super.toString() +
				"\n\t Desempeña un puesto de: " + getPuesto() + " y su sueldo es " + getSueldo() + " euros.";
	}

	

	@Override
	public void actualizarSueldo() {
		
		double sueldoInicial = getSueldo();
		
		this.sueldo = sueldoInicial * INCREMENTO_SUELDO_EB;
		
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
