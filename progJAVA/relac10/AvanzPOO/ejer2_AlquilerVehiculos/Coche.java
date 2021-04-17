package relac10.AvanzPOO.ejer2;

import java.util.Scanner;

public class Coche extends Vehiculo {
	
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
	public void darDeAlta() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Para dar de alta un coche necesita introducir los siguientes datos:\n "+
							"matricula, gama seleccionada (BAJA, MEDIA, ALTA), combustible(GASOLINA, DIESEL).\n"
							+"(Presione INTRO tras introducir cada campo)");
		try {
			Coche c = new Coche(teclado.nextLine(), teclado.nextLine(), teclado.nextLine());
		} catch (CombustibleException e) {
			System.out.println(e.getMessage());
		} catch (GamaException e) {
			System.out.println(e.getMessage());
		}
		teclado.close();
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
