package pruebaCASA;

public class rectangulo {

	private Double longitud;
	private Double ancho;
	
	
	public rectangulo() {}
	
	public rectangulo(double longitud, double ancho) {
		this.longitud=longitud;
		this.ancho=ancho;
	}
	
	
	public Double getArea() {
		return this.longitud*this.ancho;
	}
	
	/**
	 * este metodo devuelve el perimetro de un rectangulo
	 * @return perimetro rectangulo
	 */
	public Double getPerimetro() {
		return 2*(longitud+ancho);
	}
	
	
	public Double getLongitud() {
		return longitud;
	}
	public void setLongitud(Double longitud) {
		if (longitud>0 && longitud<20) {
			this.longitud = longitud;
		}
		
	}
	public Double getAncho() {
		return ancho;
	}
	public void setAncho(Double ancho) {
		if (ancho>0 && ancho<20) {
			this.ancho = ancho;
		}
		
		
	}

	@Override
	public String toString() {
		return "[longitud=" + longitud + ", ancho=" + ancho + ", área=" + getArea()
				+ ", perimetro=" + getPerimetro() + "]";
	}
	
	
}
