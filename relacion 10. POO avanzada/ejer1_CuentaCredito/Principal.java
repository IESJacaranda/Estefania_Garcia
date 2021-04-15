package relac10.AvanzPOO.ejer1_CuentaCredito;

import ejeHERENCIA.ejer1.Titular;

public class Principal {

	public static void main(String[] args) {
		
		Titular t = new Titular();
		CuentaCredito cc = new CuentaCredito(200, t);
		CuentaCredito sinSaldoIni = new CuentaCredito();
		CuentaCredito conSaldoMayor = new CuentaCredito(500, t);
		CuentaCredito neg = new CuentaCredito(-100, t);
		CuentaCredito neg2 = new CuentaCredito(-600, t);
		
		System.out.println(cc.getSaldoFinal());
		System.out.println(cc.getCredito());
		
		System.out.println("\n");
		
		System.out.println(sinSaldoIni.getSaldoFinal());
		System.out.println(sinSaldoIni.getCredito());
		
		System.out.println("\n");
		System.out.println(conSaldoMayor.getSaldoFinal());
		System.out.println(conSaldoMayor.getCredito());
		
		System.out.println("\n");
		System.out.println(neg.getSaldoFinal());
		System.out.println(neg.getCredito());
		
		System.out.println("\n");
		System.out.println(neg2.getSaldoFinal());
		System.out.println(neg2.getCredito());
		

		try {
			neg.hacerReintegro(20);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
