package pruebaCASA;

public class Complejo {

	private double real;
	private double imaginaria;
	
	
	public Complejo() {}
	
	public Complejo(double real, double imaginaria) {
		this.real=real;
		this.imaginaria=imaginaria;
		
	}
	
	
	public Complejo sumaComplejo(Complejo b) {
		double realA = this.real;
		double imaginariaA = this.imaginaria;
		double realB = b.getReal();
		double imaginariaB = b.getImaginaria();
		
		Complejo respuesta = new Complejo((realA+realB), (imaginariaA+imaginariaB));
		
		return respuesta;
		
	}
	
	public Complejo restaComplejo(Complejo b) {
		double realA = this.real;
		double imaginariaA = this.imaginaria;
		double realB = b.getReal();
		double imaginariaB = b.getImaginaria();
		
		Complejo respuesta = new Complejo((realA-realB), (imaginariaA-imaginariaB));
		
		return respuesta;
		
	}
	
	
	@Override //(a,b) es el formato que pide el enunciado
	public String toString() {
		return "(" + real + "," + imaginaria + ")";
	}
	
	public String equals(Complejo b) {
		String mensaje= "";
			if (this.real>b.getReal()) {
				mensaje="La parte real del complejo A es mayor que la parte real del complejo B";
			}else if(this.real<b.getReal()) {
				mensaje="La parte real del complejo B es mayor que la parte real del complejo A";
			}else {
				if(this.imaginaria>b.getImaginaria()) {
					mensaje="La parte imaginaria del complejo A es mayor que la parte imaginaria del complejo B";
				}else if (this.imaginaria<b.getImaginaria()) {
					mensaje="La parte imaginaria del complejo B es mayor que la parte imaginaria del complejo A";
				}
				else {
					mensaje = "Ambas partes son iguales";
				}
			}
			return mensaje;
	}
	
	

	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImaginaria() {
		return imaginaria;
	}
	public void setImaginaria(double imaginaria) {
		this.imaginaria = imaginaria;
	}
	
	
}
