package relac10.AvanzPOO.ejer2;

import relac10.AvanzPOO.ejer2.GamaException;

public class Furgoneta extends AbstractVehiculo {

	private double pma;
	private final static double SUPLEM_FURG = 0.5;
	

	public Furgoneta(String matricula, String tipoGama, double peso) throws GamaException {
		super(matricula, tipoGama);
		this.pma = peso;
		
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
