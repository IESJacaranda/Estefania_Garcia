package relac10.AvanzPOO.ejer2;

import relac10.AvanzPOO.ejer2.CombustibleException;
import relac10.AvanzPOO.ejer2.GamaException;

public class Coche extends AbstractVehiculo {
	

	private final static double SUPLEM_GASOLINA = 3.5;
	private final static int SUPLEM_DIESEL = 2;
	private String tipoCombustible;
	

	public Coche(String matricula, String tipoGama, String tipoCombustible) throws CombustibleException, GamaException {
		super(matricula, tipoGama);
		if(tipoCombustible.equalsIgnoreCase("GASOLINA") || tipoCombustible.equalsIgnoreCase("DIESEL")){
			this.tipoCombustible = tipoCombustible;
		} else {
			throw new CombustibleException();
		}
	}

	@Override
	public double calcularAlquiler() {
		double precio=0;
		
		if(getTipoCombustible().equalsIgnoreCase("GASOLINA") ) {
			precio = SUPLEM_GASOLINA + super.calcularAlquiler();
		}
		else if(getTipoCombustible() == "DIESEL") {
			precio = SUPLEM_DIESEL + super.calcularAlquiler();
		}
		return precio ;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	
	
	

}
