package poo3;

public class Maquina {
	public final static double PRECIO_CAFE = 1;
	public final static double PRECIO_CAFE_LECHE = 1.5;
	public final static double PRECIO_LECHE = 0.8;
	
	private int depositoCafe;
	private int depositoLeche;
	private int depositoVasos;
	private double monedero;
	
	//Se inicializa
	public Maquina() {
		this.monedero=50.0;
		llenarDeposito();
	}
	
	public boolean esPosibleServirCafe() {
		return this.depositoCafe>0 && this.depositoVasos>0;
	}
	
	public boolean esPosibleServirLeche() {
		return this.depositoLeche>0 && this.depositoCafe>0 && this.depositoVasos>0;
	}
	
	public boolean esPosibleServirCafeConLeche() {
		return this.depositoCafe>0 && this.depositoLeche>0 && this.depositoVasos>0;
	}
	
	public void vaciarMonedero() {
		this.monedero=0;
	}
	public void llenarDeposito() {
		this.depositoCafe=50;
		this.depositoLeche=50;
		this.depositoVasos=80;
	}
	
	public String consultaEstado() {
		return "Deposito de cafe: "+this.depositoCafe+", Deposito de leche: "+this.depositoLeche+", Deposito de vasos: "+this.depositoVasos+", Monedero: "+this.monedero;
	}
	
	public double darCambio(double cantidadIntroducida, double precio) throws Exception {
		double cambio = 0;
		if(cantidadIntroducida < precio) {
			throw new Exception("La cantidad introducida es insuficiente");
		}else if ((cantidadIntroducida-precio)> this.monedero) {
			throw new Exception("No tenemos suficiente cambio");
		}else {
			cambio = cantidadIntroducida - precio;
		}
		this.monedero-=cambio;
		
		return cambio;
	}
	
	public void servirCafe() throws Exception {
		if(this.depositoCafe>0 && this.depositoVasos>0) {
			this.depositoCafe--;
			this.depositoVasos--;
			this.monedero+=PRECIO_CAFE;
		}
		else {
			throw new Exception("Operación no permitida");
		}
	}
	
	public void servirCafeConLeche() throws Exception {
		if(this.depositoCafe >0 && this.depositoLeche >0 && this.depositoVasos >0) {
			this.depositoLeche--;
			this.depositoCafe--;
			this.depositoVasos--;
			this.monedero+=PRECIO_CAFE_LECHE;
		}
		else {
			throw new Exception("Operación no permitida");
		}
	}
	
	public void servirLeche() throws Exception {
		if(this.depositoLeche>0 && this.depositoVasos>0) {
			this.depositoLeche--;
			this.depositoVasos--;
			this.monedero+=PRECIO_LECHE;
		}
		else {
			throw new Exception("Operación no permitida");
		}
	}
	@Override
	public String toString () {
		return "Deposito de cafe: "+this.depositoCafe+", Deposito de leche: "+this.depositoLeche+", Deposito de vasos: "+this.depositoVasos+", Monedero: "+this.monedero;
	}
}
