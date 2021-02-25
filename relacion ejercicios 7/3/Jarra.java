package rel7_ejer3_JARRAS;

public class Jarra {

	private double capacidad;
	private double cantidad;
	private double totalAguaGastada;
	
	
	public Jarra() {}
	
	public Jarra(double capacidad, double cantidad) {  //repasar --> no puede ser
		this.capacidad = capacidad;
		this.cantidad = 0.0;
	}

	public void llenarJarra() throws Exception {
		if(this.cantidad < this.capacidad || this.cantidad == 0) {
			this.cantidad = this.capacidad;
		}throw new Exception("No se puede llenar la jarra.");
		
	}
	
	public void vaciarJarra() throws Exception {
		if (this.cantidad == this.capacidad || this.cantidad > 0) {
			this.totalAguaGastada = this.cantidad;
			this.cantidad = 0.0;
		}throw new Exception("No se puede vaciar la jarra.");
	}
	
	public void volcarJarra() {
		
	}
	
	
		@Override
	public String toString() {
		
		return "La capacidad de la Jarra es: "+ this.capacidad 
				+ ", la cantidad de agua es: " + this.cantidad;
	}
	
	
	
	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getTotalAguaGastada() {
		return totalAguaGastada;
	}

	public void setTotalAguaGastada(double totalAguaGastada) {
		this.totalAguaGastada = totalAguaGastada;
	}



	
	
	
}
