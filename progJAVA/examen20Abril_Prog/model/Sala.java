package examen20Abril_Prog.model;

import java.util.Objects;

import examen20Abril_Prog.Enum.ETipoSala;
import examen20Abril_Prog.Excep.SalaException;

public class Sala extends AbstractInstalacion {
	
	private final double FACTOR_REU = 1;
	private final double FACTOR_CEL = 2.15;
	
	protected String tipo;
	protected int codigo;
	
	public Sala(String tipo) throws SalaException {
		if(tipo.equalsIgnoreCase(ETipoSala.CELEBRACIONES.toString()) || tipo.equalsIgnoreCase(ETipoSala.REUNIONES.toString())) {
			this.tipo = tipo;
		}else {
			throw new SalaException();
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
		if(getTipo().equalsIgnoreCase(ETipoSala.CELEBRACIONES.toString())) {
			mensaje = "Una sala con código "+getCodigo()+", de tipo " + getTipo() + ", y capacidad para "+(ETipoSala.CELEBRACIONES.getCapacidad()) +" personas.";
		}else if(getTipo().equalsIgnoreCase(ETipoSala.REUNIONES.toString())) {
			mensaje = "Una sala con código "+getCodigo()+", de tipo " + getTipo() + ", y capacidad para "+(ETipoSala.REUNIONES.getCapacidad()) +" personas.";
		}
		return mensaje;
	}

	@Override
	public double calcularAlquiler() {
		double precio =0;
		if (getTipo().equalsIgnoreCase(ETipoSala.CELEBRACIONES.toString())){
			precio = FACTOR_CEL*ETipoSala.CELEBRACIONES.getCapacidad();	
		}else if(getTipo().equalsIgnoreCase(ETipoSala.REUNIONES.toString())) {
			precio = FACTOR_REU*ETipoSala.REUNIONES.getCapacidad();	
		}
		
		return super.calcularAlquiler()*precio;
	}

	
	

}
