package relac10.AvanzPOO.ejer2;

public class Alquiler {
	
	private int dias;
	private Vehiculo vehiculo;
	
	public Alquiler() {
		super();
	}
	public Alquiler(int dias, Vehiculo vehiculo) {
		super();
		this.dias = dias;
		this.vehiculo = vehiculo;
	}
	//falta comprobar
	public double calcularPrecioAlquiler(int dias) {

		return getDias()*(this.vehiculo.calcularAlquiler());
		
	}
	//falta
	public void darDeAlta() {
		
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	
	
}
