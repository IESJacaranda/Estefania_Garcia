package relac10.AvanzPOO.ejer2;

public class Principal {

	public static void main(String[] args) {
		
		
//		try {
//			Coche c = new Coche("2356LPO", "baja", "gasolina");
//			System.out.println(c.getMatricula());
//			System.out.println(c.getTipoCombustible());
//			System.out.println(c.getTipoGama());
//			System.out.println(c.calcularAlquiler());
//			
//		} catch (CombustibleException e) {
//			System.out.println(e.getMessage());
//		} catch (GamaException e) {
//			System.out.println(e.getMessage());
//		}
		
		
		try {
			Furgoneta f = new Furgoneta("25698P", "media", 152.3);
			System.out.println(f.getMatricula());
			System.out.println(f.getPma());
			System.out.println(f.getTipoGama());
			System.out.println(f.calcularAlquiler());
		} catch (GamaException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
