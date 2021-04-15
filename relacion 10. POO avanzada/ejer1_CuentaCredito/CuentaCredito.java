/**
 * Al crear una cuenta de crédito se indica de qué cantidad de
crédito se dispone, es decir, a cuánto puede quedar la cuenta en
números rojos. Por ejemplo, si el crédito es de 100€ la cuenta
podrá llegar a tener un saldo igual a –100.
• Inicialmente, si no se indica nada, el saldo de la cuenta es 0€.
• Inicialmente, si no se indica nada, el crédito es de 100€.
• Se deben incluir los métodos get y set para el crédito. El crédito
nunca puede superar los 300€. También habrá que tener en
cuenta el saldo actual de la cuenta.
• Se deberá modificar los métodos de sacarDinero para incluir el
crédito.
 */

package relac10.AvanzPOO.ejer1_CuentaCredito;

import ejeHERENCIA.ejer1.Titular;
import poo2.Cuenta;

public class CuentaCredito extends Cuenta {
	
	private double credito;
	
	private static final double CANTIDAD_INICIAL_CREDITO = 100;
	private static final double CANTIDAD_MAXIMA_CREDITO = 300;

	public CuentaCredito() {
		super();
		this.credito = getCredito();
		
	}

	public CuentaCredito(double saldo, Titular titular) {
		super(saldo, titular);
		this.credito = getCredito();
		
	}

	public double getCredito() {
		
		if(this.saldo>0 && this.saldo<CANTIDAD_MAXIMA_CREDITO) {
			this.credito = this.saldo;
			
		}else if(this.saldo>CANTIDAD_MAXIMA_CREDITO) {
			this.credito = CANTIDAD_MAXIMA_CREDITO;
		}
		
		else if(this.saldo == 0.0) {
			this.credito = CANTIDAD_INICIAL_CREDITO;
			
		}else if(this.saldo<0) {
			if(this.saldo>(CANTIDAD_MAXIMA_CREDITO*(-1))) {
				this.credito = (this.saldo)*(-1);
			}else {
				this.credito = CANTIDAD_MAXIMA_CREDITO;
			}
			
		}
		
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	@Override
	public void hacerReintegro(double reintegro) throws Exception {
		
		if(saldo>0 && saldo>=reintegro && reintegro>0) {
			saldo-=reintegro;
			numeroReintegros++;
			System.out.println("Reintegro realizado correctamente");
		}else if(saldo<0 || reintegro<=CANTIDAD_MAXIMA_CREDITO) {
			saldo-=reintegro;
			System.out.println("Reintegro realizado correctamente");
		}
		else {
			throw new Exception("La operación no se puede realizar");
		}
	}
	
	
	
	
	
	



	
	
	
	
	

	
	
}
