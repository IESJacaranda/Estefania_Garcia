package relacion7;


public class Punto {
	
	private double coordX;
	private double coordY;
	
	public Punto() {}
	
	public Punto(double coordX, double coordY) {
		this.coordX = coordX;
		this.coordY = coordY;

	}
	
	
	public boolean equals(Object obj) {
		
		boolean sonIguales = false;
		
		if (this==obj) {
			sonIguales = true;
		}else if(obj!=null && obj instanceof Punto) { //consulta si el obj es de tipo Punto
			if (((Punto)obj).getCoordX() == this.getCoordX() 
					&& ((Punto)obj).getCoordY() == this.getCoordY()) {
						sonIguales=true;
					}	
	}
		return sonIguales;
	}
	
	
	public void moverArriba(double distancia) {
		this.coordY+=distancia;
	}
	
	public void moverAbajo(double distancia) {
		this.coordY-=distancia;
	}

	public void moverDerecha(double distancia) {
		this.coordX+=distancia;
	}
	public void moverIzquierda(double distancia) {
		this.coordX-=distancia;
	}
	


	@Override
	public String toString() {
		return "(" + coordX + "," + coordY +")";
	}


	public double getCoordX() {
		return coordX;
	}


	public void setCoordX(double coordX) {
		this.coordX = coordX;
	}


	public double getCoordY() {
		return coordY;
	}


	public void setCoordY(double coordY) {
		this.coordY = coordY;
	}
	
	

}
