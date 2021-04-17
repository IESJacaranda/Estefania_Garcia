package relacion8.arrays.e5;

public class BarajaJM {

	private final static int NUMERO_CARTAS = 48;
	private final static int CARTAS_POR_PALO = 12;
	
	
	private CartaJM[] cartas = new CartaJM[NUMERO_CARTAS];
	
	
	private void iniciarBaraja() {
		int index = 0;
		for (int i = 0; i<CartaJM.PALOS.length; i++) {
			for(int j = 0; j<CARTAS_POR_PALO; j++) {
				cartas[index] = new CartaJM(CartaJM.PALOS[i], j+1);
				index++;
		}
		}
		
	}
}
