package herencia2;

public class Equino extends Animal {

	public Equino() {
		super();
	}
	

	@Override
	public void comer() {
		System.out.println("Es herbívoro");
	}
}
