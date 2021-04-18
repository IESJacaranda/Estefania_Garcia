package relac10.AvanzPOO.ejer2;

import java.util.ArrayList;

import relac10.AvanzPOO.ejer2.Coche;
import relac10.AvanzPOO.ejer2.Furgoneta;
import relac10.AvanzPOO.ejer2.Microbus;

public class Alquiler {
	
	private int dias;
	private AbstractVehiculo vehiculo;
	protected ArrayList<AbstractVehiculo> listaVehiculos = new ArrayList<>();
	private static final int MAXIMA_VEHICULOS =200;
	
	public Alquiler() {
		super();
	}
	
	public Alquiler(int dias, AbstractVehiculo vehiculo) {
		super();
		this.dias = dias;
		this.vehiculo = vehiculo;
	}
	
	public boolean esPosibleDarDeAlta() {
		
		boolean esPosible = true;
		if(listaVehiculos.size()>=MAXIMA_VEHICULOS) {
			esPosible = false;
		}
		
		return esPosible;
	}
	
	public AbstractVehiculo darDeAlta() {
		if(esPosibleDarDeAlta()) {
			
		}
		
		return vehiculo;
	}
	
	public double calcularPrecioAlquiler(int dias) {

		return getDias()*(this.vehiculo.calcularAlquiler());
		
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	
	

}
