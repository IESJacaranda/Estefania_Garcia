package examen20Abril_Prog.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Reserva implements Comparable <Reserva>{

	protected LocalDate fechaIni;
	protected LocalDate fechaFin;
	protected AbstractInstalacion tipoHab;
	
	protected List<Cliente> listaClientes = new ArrayList<Cliente>();

	public Reserva() {}
	
	public Reserva(LocalDate fechaIni, LocalDate fechaFin, AbstractInstalacion tipoHab) {
		super();
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
		this.tipoHab = tipoHab;
		
	}


	public LocalDate getFechaIni() {
		return fechaIni;
	}

	public void setFechaIni(LocalDate fechaIni) {
		this.fechaIni = fechaIni;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public AbstractInstalacion getTipoHab() {
		return tipoHab;
	}

	public void setTipoHab(AbstractInstalacion tipoHab) {
		this.tipoHab = tipoHab;
	}


	public int obtenerDiasReserva() {
		
		return (int) (ChronoUnit.DAYS.between(fechaIni, fechaFin));
	}
	

	@Override
	public int compareTo(Reserva r) {
		
		int compareTo = 0;
		if(this.fechaIni.isAfter(r.getFechaIni())) {
			compareTo = 1;
		}else if(this.fechaIni.isBefore(r.getFechaIni())) {
			compareTo = -1;
		}
		return compareTo;
		//tambien puedo poner directamente en el return this.fechaIni.compareTo(r.getFechaIni);
	}

	@Override
	public String toString() {
		return "Datos de la reserva:\n"
				+ "> Fecha de inicio: " + fechaIni + ",\n"
				+ "> Fecha de fin: " + fechaFin + ",\n"
				+ "> Tipo de instalación:\n" 
				+ "  " +tipoHab + "\n";
	}

	
	
}
