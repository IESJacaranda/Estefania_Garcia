package relac10.AvanzPOO.ejer2;

import java.util.Scanner;

public class Microbus extends Vehiculo {
	
	private int numPlazas;
	private final static int SUPLEM_MICRO = 5;

	public Microbus(String matricula, String tipoGama, int plazas) throws GamaException {
		super(matricula, tipoGama);
		this.numPlazas = plazas;
	}

	@Override
	public void darDeAlta() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Para dar de alta un microbús necesita introducir los siguientes datos:\n "+
							"matricula, gama seleccionada (BAJA, MEDIA, ALTA), número de plazas.\n"
							+"(Presione INTRO tras introducir cada campo)");
		try {
			Furgoneta f = new Furgoneta(teclado.nextLine(), teclado.nextLine(), Integer.parseInt(teclado.nextLine()));
		} catch (GamaException e) {
			System.out.println(e.getMessage());
		}
		teclado.close();

	}
	
	@Override
	public double calcularAlquiler() {
		
		return super.calcularAlquiler()+(getNumPlazas()*SUPLEM_MICRO) ;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}
	
	

}
