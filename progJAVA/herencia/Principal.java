package herencia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Bebe bebe1 = new Bebe();
		bebe1.desplazarse();
		bebe1.obtenerHabitos();
	
		System.out.println("------------------");
		
		Adulto adulto = new Adulto();
		adulto.desplazarse();
		adulto.obtenerHabitos();
		
		System.out.println("------------------");
		
		Anciano anciano = new Anciano();
		anciano.conducir();
		anciano.desplazarse();
		anciano.obtenerHabitos();
		
		
		
		//polimorfismo
		Persona persona = new Bebe();
		persona.desplazarse();
		persona.obtenerHabitos();
		
		
		persona = new Adulto();
		persona.desplazarse();
		persona.obtenerHabitos();
		((Adulto)persona).conducir(); //casting para convertir a la persona en Adulto y poder obtener el método conducir que es propio de adulto
		

	}

}
