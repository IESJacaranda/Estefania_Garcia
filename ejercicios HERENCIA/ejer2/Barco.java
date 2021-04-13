package ejeHERENCIA.ejer2;

import java.time.LocalDate;

public abstract class Barco {
	
	private String matricula;
	private double eslora;
	private int year;
	
	private final static int VALOR_FIJO = 20;
	
	public Barco() {
		super();
	}
	
	public Barco(String matricula, double eslora, int year) {
		super();
		this.matricula = matricula;
		this.eslora = eslora;
		this.year = year;
	}

	public double calcularAlquiler() {
		
		return (this.eslora*10)+VALOR_FIJO;
	}
	
	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getEslora() {
		return eslora;
	}

	public void setEslora(double eslora) {
		this.eslora = eslora;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	

}
