package rel7_ejer3_JARRAS;

public class Jarra {

	private double capacidad;
	private double cantidad;
	private double totalAguaGastada;
	
	
	public Jarra() {}
	
	public Jarra(double capacidad) {  
		this.capacidad = capacidad;
		this.cantidad = 0.0;
	}

	/**
	 * Este método llena una jarra hasta su total capacidad
	 * @throws Exception  Si la jarra ya está llena
	 */
	public void llenarJarra() throws Exception {
		if(this.cantidad < this.capacidad || this.cantidad == 0) {
			this.cantidad = this.capacidad;
			System.out.println("La jarra se ha llenado correctamente.");
		}
		else{
			throw new Exception("No se puede llenar la jarra.");
		}
		
	}
	
	/**
	 * Este método vacía una jarra hasta dejar su cantidad de agua a 0
	 * @throws Exception Si la jarra ya está vacía
	 */
	public void vaciarJarra() throws Exception {
		if (this.cantidad == this.capacidad || this.cantidad > 0) {
			this.totalAguaGastada = this.cantidad;
			this.cantidad = 0.0;
			System.out.println("La jarra se ha vaciado correctamente.");
		}
		else{
			throw new Exception("No se puede vaciar la jarra.");
		}
	}
	
	/**
	 * Este método vuelca el contenido de una jarra en otra
	 * @param jarra
	 * @throws Exception Si la jarra en la que se desea volcar ya está llena
	 */
	public void volcarJarra(Jarra jarra) throws Exception {
		if(jarra.getCantidad()<jarra.getCapacidad() && this.cantidad!=0) {			
			while(jarra.getCantidad()<jarra.getCapacidad() && this.cantidad > 0) {
				this.cantidad-=1;
				jarra.setCantidad(jarra.getCantidad()+1);
			}
			System.out.println("La jarra se ha volcado correctamente.");
		}else{
			throw new Exception("No se puede volcar la cantidad de la jarra.");
		}
			
	}
	
	/**
	 * Este método muestra el estado de las jarras
	 */
		@Override
	public String toString() {
		
		return "Su capacidad es de: "+ this.capacidad +" litros"
				+ " y ahora contiene: " + this.cantidad +" litros.";
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
