package juegoJACA.Elementos;

public class Jugador extends Elemento {
	
	private int fuerza;
	private int magia;
	private int velocidad;
	private int fil;
	private int col;
	private int dinero;
	private int pociones;
	private int gemas;

	public Jugador() {
		super();
	}

	public Jugador(char simbolo, int fuerza, int magia, int velocidad) {
		super(simbolo);
		this.fuerza = fuerza;
		this.magia = magia;
		this.velocidad = velocidad;
		
	}
	
	

	
	
	
	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getMagia() {
		return magia;
	}

	public void setMagia(int magia) {
		this.magia = magia;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getFil() {
		return fil;
	}

	public void setFil(int fil) {
		this.fil = fil;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public int getPociones() {
		return pociones;
	}

	public void setPociones(int pociones) {
		this.pociones = pociones;
	}

	public int getGemas() {
		return gemas;
	}

	public void setGemas(int gemas) {
		this.gemas = gemas;
	}
	
	

	@Override
	public String toString() {
		return "Jugador: "+this.simbolo+". Dinero: "+this.dinero+" Pociones: "+this.pociones+" Gemas: "+this.gemas;
	}
	
	
}
