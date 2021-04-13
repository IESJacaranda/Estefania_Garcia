package ejeHERENCIA.ejer2;

public class Velero extends Barco {

	private int mastil;
	
	public Velero() {
		super();
	}

	public Velero(String matricula, double eslora, int year, int mastil) {
		super(matricula, eslora, year);
		this.mastil = mastil;
	}
	

	public int getMastil() {
		return mastil;
	}

	public void setMastil(int mastil) {
		this.mastil = mastil;
	}

	@Override
	public double calcularAlquiler() {
		
		return super.calcularAlquiler()+this.mastil;
	}
	
	
	
	
}
