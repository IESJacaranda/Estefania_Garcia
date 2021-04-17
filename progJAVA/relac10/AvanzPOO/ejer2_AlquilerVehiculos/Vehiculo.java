package relac10.AvanzPOO.ejer2;

public abstract class Vehiculo {

	protected String matricula;
	protected String tipoGama;
	
	
	public Vehiculo(String matricula, String tipoGama) throws GamaException{
		this.matricula = matricula;
		if(tipoGama.equalsIgnoreCase("BAJA") || tipoGama.equalsIgnoreCase("MEDIA") || tipoGama.equalsIgnoreCase("ALTA")){
			this.tipoGama = tipoGama;
		} else {
			throw new GamaException();
		}
		
	}
	
	
	public abstract void darDeAlta();
//	{
//		int contC = 0;
//		int contM = 0;
//		int contF = 0;
//		if(contC+contM+contF<=200) {
//			
//		}
//	}
	
	
	public double calcularAlquiler() {
		
		double precioBase = 0.0;
		
		if(getTipoGama().equalsIgnoreCase("BAJA")) {
			precioBase = GamaVehiculo.BAJA.getPrecio();
		}else if(getTipoGama().equalsIgnoreCase("MEDIA")) {
			precioBase = GamaVehiculo.MEDIA.getPrecio();
		}else if(getTipoGama().equalsIgnoreCase("ALTA")) {
			precioBase = GamaVehiculo.ALTA.getPrecio();
		}
		return precioBase;
		
	}


	
	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getTipoGama() {
		return tipoGama;
	}


	public void setTipoGama(String tipoGama) {
		this.tipoGama = tipoGama;
	}


	
	
	
	
	
	
	
	
}
