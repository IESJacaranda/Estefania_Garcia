package relacion7.ejer1_linea;

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
		
		this.puntoA.moverArriba(distancia);
		this.puntoB.moverArriba(distancia);
	}
	
	public void moverAbajo(double distancia) {
		
		this.puntoA.moverAbajo(distancia);
		this.puntoB.moverAbajo(distancia);
	}
	
	public void moverDerecha(double distancia) {
		
		this.puntoA.moverDerecha(distancia);
		this.puntoB.moverDerecha(distancia);	
	}
	
	public void moverIzquierda(double distancia) {
		
		this.puntoA.moverIzquierda(distancia);
		this.puntoB.moverIzquierda(distancia);
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
