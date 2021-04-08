package com.edu.geo;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Esfera extends AbstractFiguraEspacio {

	private Double radio;
	
	public Esfera(double radio, double peso) {
		super();
		this.radio = radio;
		this.peso = peso;
	}
	
	@Override
	public Double calcularVolumen() {
		return (4/3) * PI * pow(radio, 3);  //Ctrl+Shift+M para importar
	}


}
