package com.edu.geo;

public abstract class AbstractFiguraEspacio {
	
	private static final Double DENSIDAD_AGUA = 1.0;

	protected Double peso;
	
	public abstract Double calcularVolumen();
	
	
	
	private Double obtenerPeso() {
		return peso;
	}
	
	public Double calcularDensidad() {
		return obtenerPeso()/calcularVolumen();
	}
	
	public boolean flotaEnElAgua() {
		return calcularDensidad() < DENSIDAD_AGUA;
	}
}
