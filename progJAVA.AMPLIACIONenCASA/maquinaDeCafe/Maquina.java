package maquinaDeCafe;

public class Maquina {

	private int depositoCafe;
	private int depositoLeche;
	private int depositoVasos;
	private double monedero;
	
	private final static double PRECIO_CAFE=1;
	private final static double PRECIO_LECHE=0.8;
	private final static double PRECIO_CAFE_LECHE=1.5;
	
	
	public Maquina() {
		this.depositoCafe = depositoCafe;
		this.depositoLeche = depositoLeche;
		this.depositoVasos = depositoVasos;
		this.monedero = monedero;
	}


	
	
	
	
	
	
	
	public int getDepositoCafe() {
		return depositoCafe;
	}


	public void setDepositoCafe(int depositoCafe) {
		this.depositoCafe = depositoCafe;
	}


	public int getDepositoLeche() {
		return depositoLeche;
	}


	public void setDepositoLeche(int depositoLeche) {
		this.depositoLeche = depositoLeche;
	}


	public int getDepositoVasos() {
		return depositoVasos;
	}


	public void setDepositoVasos(int depositoVasos) {
		this.depositoVasos = depositoVasos;
	}


	public double getMonedero() {
		return monedero;
	}


	public void setMonedero(double monedero) {
		this.monedero = monedero;
	}
	
	
}
