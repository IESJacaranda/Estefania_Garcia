package ejeHERENCIA.ejer1;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CuentaJovenTest {
	
	Titular Pepa = new Titular("Pepa Flores", 26);
	
	CuentaJoven c = new CuentaJoven(1000, Pepa);
	

	@Test
	void testHacerReintegro() {
		assertFalse(false);
	}

	@Test
	void testEsTitularValido() {
		assertFalse(false);
	}

	
	

	

}
