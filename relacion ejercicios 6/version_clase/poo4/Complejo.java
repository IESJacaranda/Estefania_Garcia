package poo4;

public class Complejo {

	private double real;
	private double imaginaria;
	
	public Complejo(){}
	
	public Complejo(double real, double imaginaria) {
		this.real = real;
		this.imaginaria = imaginaria;
		
	}
	
	
	public Complejo suma(double realC1, double imC1, double realC2, double imC2) {
		double sumaReal = realC1+realC2;
		double sumaIm = imC1 + imC2;
		
		Complejo resultadoSuma = new Complejo(sumaReal, sumaIm);
		return resultadoSuma;
	}
	
	//otro modo de hacer la suma
	public Complejo suma(Complejo complejo) {
		return new Complejo(this.getReal() + complejo.getReal(),
				this.getImaginaria() + complejo.getImaginaria());	
	}
	
	public Complejo resta(Complejo complejoArestar) {
		return new Complejo(this.getReal() - complejoArestar.getReal(),
				this.getImaginaria() - complejoArestar.getImaginaria());
	}
	
	
	@Override
	public String toString() {
		return this.real + " + "+ this.imaginaria+ "i";
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		if (this==obj) {
			sonIguales = true;
		}else if(obj!=null && obj instanceof Complejo) { //consulta si el obj es de tipo complejo
			//Complejo casting = (Complejo)obj; //transforma el obj en complejo
			if (((Complejo)obj).getImaginaria() == this.getImaginaria() 
					&& ((Complejo)obj).getReal() == this.getReal());
		}
		return sonIguales;
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
