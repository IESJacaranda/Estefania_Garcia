package pruebaCASA;

public class cuenta {

	private Double saldo;
	
	
	private int contadorReintegro;
	private int contadorIngreso;
	
	public cuenta() {}
	
	public cuenta(Double saldo) {
		if (saldo>0) {
			this.saldo=saldo;
		}
	}
	
	
	public void reintegro(double cantidad) throws Exception{
		if (cantidad<=saldo) {
			this.saldo= this.saldo-cantidad;
			this.contadorReintegro++;
		}else {
			throw new Exception("La operación no se puede realizar.");
		}
	}
	
	public void ingreso(double cantidad) throws Exception{
		if (cantidad>0) {
			this.saldo= this.saldo+cantidad;
			this.contadorIngreso++;
		}else {
			throw new Exception("La operación no se puede realizar.");
		}
	}
	
	
	@Override
	public String toString() {
		return "Su saldo es=" + saldo + ", Número de reintegros=" + contadorReintegro + ", Número de ingresos="
				+ contadorIngreso + "";
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
}
