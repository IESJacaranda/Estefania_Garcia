package enume;

public class Main {

	public static void main(String[] args) {
		
		Peso p = Peso.SILLA;
		
		System.out.println(p);
		System.out.println(p.getValor());
		
		p.values();
		
		for(Peso pe : Peso.values()) {
			System.out.println(pe);
		}
	}

}
