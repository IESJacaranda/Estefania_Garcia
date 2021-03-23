package interf.pruebaCasa;

import interf.ejemplo.prueba.Vivienda;

public class Principal {

	public static void main(String[] args) {
		
		
		IinstrumentoMusical f = new InstrumentoViento("flauta", "madera");
		
		//clase InstrumentoViento implementa de IinstrumentoMusical y de Iobjeto
		
		//metodos de la interfaz IinstrumentoMusical
		System.out.println(f.afinarInstrumento());
		System.out.println(f.tocarInstrumento());
		System.out.println(f.tipoDeInstrumento());
		
		
		//si quiero acceder al metodo emitirSonido (Iobjeto) de la clase InstrumentoDeViento, le hago casting
		System.out.println(((InstrumentoViento) f).emitirSonido());
		
		System.out.println("---------------------------------------");
		
		InstrumentoViento f2 = new InstrumentoViento("flauta", "madera");
		//en este caso al usar el filtro InstrumentoViento que está implementado por ambas interfaces,
		//tengo acceso los metodos de las dos sin tener que hacer casting
		
		System.out.println(f2.afinarInstrumento());
		System.out.println(f2.tocarInstrumento());
		System.out.println(f2.tipoDeInstrumento());
		System.out.println(f2.emitirSonido());
		
		
		System.out.println("---------------------------------------");
		
		Iobjeto o = new Silbato("plástico");
		System.out.println(o.emitirSonido());  //metodo de la interfaz Iobjeto
		//System.out.println(o.obtenerColor()); no puedo acceder porque es un metodo propio de la clase silbato
		// y estoy usando de filtro la interfaz Iobjeto, para poder acceder tengo que convertirlo a la clase silbato
		
		Silbato o1 = (Silbato)o;	
		System.out.println(o1.obtenerColor());
		
		
		//no puedo acceder a los metodos afinar, tocar y tipoDeInstrumento
		//porque pertenecen a la interfaz IinstrumentoMusical y no puedo hacer un new de una interfaz
		
	}

}
