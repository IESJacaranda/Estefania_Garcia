package examen20Abril_Prog.model;

import java.util.Objects;

import examen20Abril_Prog.Enum.ETipoHabitacion;
import examen20Abril_Prog.Excep.HabitacionException;

public class Habitacion extends AbstractInstalacion{
	
	private final double FACTOR_HAB_SD = 1.15;
	private final double FACTOR_HAB_SUITE = 1.9;
	
	protected String tipo;
	protected int codigo;
	
	public Habitacion(String tipo) throws HabitacionException {
		super();
	
		if(tipo.equalsIgnoreCase(ETipoHabitacion.SIMPLE.toString()) || tipo.equalsIgnoreCase(ETipoHabitacion.DOBLE.toString()) || tipo.equalsIgnoreCase(ETipoHabitacion.SUITE.toString())){
			this.tipo = tipo;
		}else {
			throw new HabitacionException();
		}
		this.codigo = hashCode();
	}
	
	@Override
	 public int hashCode() {
		
		return Objects.hash((int)(Math.random()*1000));
		
	 }
	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		String mensaje = "";
		if(getTipo().equalsIgnoreCase(ETipoHabitacion.SIMPLE.toString())) {
			mensaje = "Una habitación con código "+getCodigo()+ ", de tipo " + getTipo() + ", y capacidad para "+(ETipoHabitacion.SIMPLE.getInquilino()) +" personas.";
		}else if(getTipo().equalsIgnoreCase(ETipoHabitacion.DOBLE.toString())) {
			mensaje = "Una habitación con código "+getCodigo()+ ", de tipo " + getTipo() + ", y capacidad para "+(ETipoHabitacion.DOBLE.getInquilino()) +" personas.";
		}else if(getTipo().equalsIgnoreCase(ETipoHabitacion.SUITE.toString())) {
			mensaje = "Una habitación con código "+getCodigo()+ ", de tipo " + getTipo() + ", y capacidad para "+(ETipoHabitacion.SUITE.getInquilino()) +" personas.";
		}
	return mensaje;
	}

	@Override
	public double calcularAlquiler() {
		
		double precio =0;
		if (getTipo().equalsIgnoreCase(ETipoHabitacion.SIMPLE.toString())){
			precio = FACTOR_HAB_SD*ETipoHabitacion.SIMPLE.getInquilino();	
		}else if(getTipo().equalsIgnoreCase(ETipoHabitacion.DOBLE.toString())) {
			precio = FACTOR_HAB_SD*ETipoHabitacion.DOBLE.getInquilino();	
		}else if(getTipo().equalsIgnoreCase(ETipoHabitacion.SUITE.toString())) {
			precio = FACTOR_HAB_SUITE*ETipoHabitacion.DOBLE.getInquilino();	
		}
		
		return super.calcularAlquiler()*precio;
	}
	
	

	
	
}
