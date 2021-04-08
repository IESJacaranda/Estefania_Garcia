package com.edu.geo;

import static java.lang.Math.pow;

public class Cubo extends AbstractFiguraEspacio {

	private Double lado;
	
	public Cubo(double lado, double peso) {
		super();
		this.lado=lado;
		this.peso=peso;
	}
	
	@Override
	public Double calcularVolumen() {
		return pow(lado, 3);
	}

}
