package poo1;

public class Rectangulo {

	private double longitud = 1.0; //o = 1 o =(double)1
	private double ancho = 1.0; //tipo básico
		
	private double area;
	private double perimetro;
	
	public Rectangulo() {}
	
	public Rectangulo(double longitud, double ancho) {
		this.longitud = longitud;
		this.ancho = ancho;
		this.area = calcularArea();
		this.perimetro = calcularPerimetro();
	}
	
	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		if(longitud>0 && longitud<20) {
			this.longitud = longitud;
			//System.out.println(this.longitud);
		}
	}
		
	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		if(ancho>0 && ancho<20) {
			this.ancho = ancho;
			//System.out.println(this.ancho);
		}
	}
	
	/**
	 * Este método calcula el área de un rectángulo
	 * @return área del rectángulo
	 */
	public double calcularArea() {
		return this.ancho*this.longitud;
	}
	
	/**
	 * Este método calcula el perímetro de un rectángulo
	 * @return perímetro del rectángulo
	 */
	public double calcularPerimetro() {
		return 2*(longitud+ancho);
	}

	public double getArea() {
		return area;
	}

	public double getPerimetro() {
		return perimetro;
	}
	
	@Override //implica que voy a sobreescribir un método que ya está por defecto, en este caso el id y voy a ponerle otros valores
	public String toString() { //convierte la clase Rectangulo a cadena de texto
		return "La longitud de este rectángulo es "
				+ this.getLongitud() + " y ancho "+
				this.getAncho();				
	}
	
}
