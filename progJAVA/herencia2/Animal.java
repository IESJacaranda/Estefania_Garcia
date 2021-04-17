package herencia2;

public class Animal {

	private double peso;

	private String sexo;
	
	public Animal() {
		super();
	}
	
	public Animal(double peso, String sexo) {
		this.peso = peso;
		this.sexo = sexo;
	}

	
	public void vivirLugar() {
		System.out.println("Vive en libertad");
	}
	
	public void comer() {
		System.out.println("Es omnívoro");
	}
	
	
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}


	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}
