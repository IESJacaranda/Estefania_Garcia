package interf.ejemplo;

public class Polideportivo implements IEdificio, IInstalacionDeportiva {

	//métodos de la inferfaz InstalacionDeportiva
	@Override
	public double superficieJuego() {
		// TODO Auto-generated method stub
		return 250;
	}

	@Override
	public int aforoMaximoPublico() {
		// TODO Auto-generated method stub
		return 150;
	}

	@Override
	public String actividadesOfrecidas() {
		// TODO Auto-generated method stub
		return "Baloncesto, tenis, natación";
	}

	
	//métodos de la inferfaz Edificio
	@Override
	public double getSuperficieTotal() {
		// TODO Auto-generated method stub
		return 850.20;
	}

	
	@Override
	public int getNumeroPlantas() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int aforoMaximo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
