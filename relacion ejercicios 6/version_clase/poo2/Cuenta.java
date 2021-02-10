package poo2;

public class Cuenta {

	private double saldo;
	private int numeroReintegros;
	private int numeroIngresos;
		
	public Cuenta () {}
	
	public Cuenta(double saldo) {
		this.saldo = saldo;
	}
	
	//Operación 1
	public void hacerReintegro(double reintegro) throws Exception {
		if(saldo>0 && saldo>=reintegro && reintegro>0) {
			saldo-=reintegro;
			numeroReintegros++;
			System.out.println("Reintegro realizado correctamente");
		}else {
			throw new Exception("La operación no se puede realizar");
		}
	}
	
	//Operación 2
	public void hacerIngreso(double ingreso) throws Exception {
		if(ingreso>0) {
			saldo+=ingreso;
			numeroIngresos++;
			System.out.println("Ingreso realizado correctamente"); //el mensaje no suele ir aquí, es por simplificarlo
		}else {
			throw new Exception("La operación no se puede realizar");		
		}
	}
	
	//Operación 3
	public String getStatus() { 
		return "El saldo es "+ this.saldo+
				", el número de ingresos es " + this.numeroIngresos 
				+ " y el de reintregos, " + this.numeroReintegros;
	}
	
	//Operación 4
	public String getSaldoFinal() { 
		return "El saldo final es "+ this.saldo;
	}
	
}
