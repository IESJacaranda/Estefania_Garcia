package relacion7;

public class Linea {

	private Punto puntoA;
	private Punto puntoB;
	
	public Linea() {}
	public Linea(Punto puntoA, Punto puntoB) {
		this.puntoA = puntoA;
		this.puntoB = puntoB;
	}

	
	public boolean equals(Object obj) {
			
			boolean sonIguales = false;
			
			if (this==obj) {
				sonIguales = true;
				
			}else if(obj!=null && obj instanceof Linea) { 
				if (((Linea)obj).getPuntoA().equals(this.puntoA) 
						&& ((Linea)obj).getPuntoB().equals(this.puntoB)) {
							sonIguales=true;
						}	
		}
			return sonIguales;
		}

	
	public void moverArriba(double distancia) {
		
		double A = puntoA.getCoordY();
		distancia += A;
		puntoA.setCoordY(distancia);
		
		double B = puntoB.getCoordY();
		distancia += B;
		puntoB.setCoordY(distancia);
	}
	
	public void moverAbajo(double distancia) {
		
		double A = puntoA.getCoordY();
		distancia -= A;
		puntoA.setCoordY(distancia);
		
		double B = puntoB.getCoordY();
		distancia -= B;
		puntoB.setCoordY(distancia);
	}
	
	public void moverDerecha(double distancia) {
		
		double A = puntoA.getCoordX();
		distancia += A;
		puntoA.setCoordX(distancia);
		
		double B = puntoB.getCoordX();
		distancia += B;
		puntoB.setCoordX(distancia);	
	}
	
	public void moverIzquierda(double distancia) {
		
		double A = puntoA.getCoordX();
		distancia -= A;
		puntoA.setCoordX(distancia);
		
		double B = puntoB.getCoordX();
		distancia -= B;
		puntoB.setCoordX(distancia);
	}
	
	
	@Override
	public String toString() {
		return "Su línea es: [" + this.getPuntoA() + "," + this.getPuntoB() +"]";
	}
	
	
	
	public Punto getPuntoA() {
		return puntoA;
	}


	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}


	public Punto getPuntoB() {
		return puntoB;
	}


	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}


	
	
	
	
	
	
	
	
	
	
	
	
}
