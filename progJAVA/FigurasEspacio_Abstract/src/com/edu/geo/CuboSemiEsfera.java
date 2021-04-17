package com.edu.geo;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class CuboSemiEsfera extends AbstractFiguraEspacio {
	
	private Double lado;
	private Double radio;
	
	public CuboSemiEsfera(double radio, double lado, double peso) {
		super();
		this.radio = radio;
		this.lado = lado;
		this.peso = peso;
	}

	@Override
	public Double calcularVolumen() {
		
		return (pow(lado, 3)+(((4/3) * PI * pow(this.radio, 3))/2));
	}

}
