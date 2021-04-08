package com.edu.main;

import com.edu.geo.Cubo;
import com.edu.geo.CuboSemiEsfera;
import com.edu.geo.Esfera;

public class Main {

	public static void main(String[] args) {
		
		Esfera esfera = new Esfera(3, 150);
		System.out.println(esfera.calcularDensidad());
		System.out.println(esfera.calcularVolumen());
		System.out.println(esfera.flotaEnElAgua());
		
		System.out.println("---------------");
		
		Cubo cubo = new Cubo(6, 25);
		System.out.println(cubo.calcularVolumen());
		System.out.println(cubo.calcularDensidad());
		System.out.println(cubo.flotaEnElAgua());
		
		System.out.println("---------------");
		
		CuboSemiEsfera fig = new CuboSemiEsfera(3, 4, 60);
		System.out.println(fig.calcularDensidad());
		System.out.println(fig.calcularVolumen());
		System.out.println(fig.flotaEnElAgua());

	}

}
