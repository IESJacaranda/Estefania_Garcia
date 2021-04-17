package poo.ej2.Cuenta;

import ejeHERENCIA.ejer1.Bonificacion;
import ejeHERENCIA.ejer1.Titular;

public class Cuenta {

	protected double saldo;
	protected int numeroReintegros;
	protected int numeroIngresos;
	
	protected Titular titular;
		
	public Cuenta () {}
	
	public Cuenta(double saldo, Titular titular) {
		this.saldo = saldo;
		this.titular = titular;
	}
	
	//Operación 1
	public void hacerReintegro(double reintegro) throws Exception {
		if(saldo>0 && saldo>=reintegro && reintegro>0) {
			saldo-=reintegro;
			numeroReintegros++;
			//System.out.println("Reintegro realizado correctamente");
		}else {
			throw new Exception("La operación no se puede realizar");
		}
	}
	
	//Operación 2
	public void hacerIngreso(double ingreso) throws Exception {
		if(ingreso>0) {
			saldo+=ingreso;
			numeroIngresos++;
			//System.out.println("Ingreso realizado correctamente"); //el mensaje no suele ir aquí, es por simplificarlo
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

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}
	
	
	
}
