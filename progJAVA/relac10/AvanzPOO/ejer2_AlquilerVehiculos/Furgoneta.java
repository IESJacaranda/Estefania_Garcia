package relac10.AvanzPOO.ejer2;

import java.util.Scanner;

public class Furgoneta extends Vehiculo {
	
	private double pma;
	private final static double SUPLEM_FURG = 0.5;

	public Furgoneta(String matricula, String tipoGama, double peso) throws GamaException {
		super(matricula, tipoGama);
		this.pma = peso;
		
	}

	@Override
	public void darDeAlta() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Para dar de alta una furgoneta necesita introducir los siguientes datos:\n "+
							"matricula, gama seleccionada (BAJA, MEDIA, ALTA), PMA (peso máximo autorizado).\n"
							+"(Presione INTRO tras introducir cada campo)");
		try {
			Furgoneta f = new Furgoneta(teclado.nextLine(), teclado.nextLine(), Double.parseDouble(teclado.nextLine()));
		} catch (GamaException e) {
			System.out.println(e.getMessage());
		}
		teclado.close();

	}
	
	@Override
	public double calcularAlquiler() {
		
		return super.calcularAlquiler()+(getPma()*SUPLEM_FURG) ;
	}

	public double getPma() {
		return pma;
	}

	public void setPma(double pma) {
		this.pma = pma;
	}

	
	
}
