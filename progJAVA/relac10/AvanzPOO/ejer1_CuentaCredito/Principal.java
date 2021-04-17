package relac10.AvanzPOO.ejer1_CuentaCredito;

import ejeHERENCIA.ejer1.Titular;

public class Principal {

	public static void main(String[] args) {
		
		Titular t = new Titular();
		
		
		CuentaCredito cc = new CuentaCredito(200, t);
		System.out.println(cc.getSaldoFinal());
		System.out.println(cc.getCredito());
		
		try {
			cc.hacerReintegro(110);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(cc.getStatus());
		
		
		System.out.println("\n");
		CuentaCredito sinSaldoIni = new CuentaCredito();
		System.out.println(sinSaldoIni.getSaldoFinal());
		System.out.println(sinSaldoIni.getCredito());
		
		try {
			sinSaldoIni.hacerReintegro(90);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(sinSaldoIni.getStatus());
		
		System.out.println("\n");
		CuentaCredito conSaldoMayor = new CuentaCredito(500, t);
		System.out.println(conSaldoMayor.getSaldoFinal());
		System.out.println(conSaldoMayor.getCredito());
		
		try {
			conSaldoMayor.hacerReintegro(100);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(conSaldoMayor.getStatus());

		
		
	}

}
