package relacion11.EstrAlmacComplejas.ejer5;

import relacion11.EstrAlmacComplejas.ejer5.excep.BuzonNoMensajeException;
import relacion11.EstrAlmacComplejas.ejer5.model.Alumno;
import relacion11.EstrAlmacComplejas.ejer5.model.Mensaje;
import relacion11.EstrAlmacComplejas.ejer5.model.Profesor;

public class Principal {

	public static void main(String[] args) {
		
		Profesor profe = new Profesor("Pepe", 30);
		Alumno alum = new Alumno("Luis", 17);
		Alumno alum2 = new Alumno("Paco", 19);
		
		
		try {
			profe.enviarMensaje(alum, "Estudia mucho");
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
		try {
			alum2.enviarMensaje(alum, "Casi lo tienes");
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		
		try {
		
			System.out.println(alum.leerMensaje());
			System.out.println("-----\n");
			
			System.out.println(alum.leerMensajeAlfabeticamente());
		} catch (BuzonNoMensajeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("-----\n");
			//System.out.println(alum.borrarMensaje(3)); //salta la excepcion
			System.out.println(alum.borrarMensaje(2));
		} catch (BuzonNoMensajeException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("-----\n");
		//comprobando la excepcion de que un alumno menor envie mensaje a otro alumno
		Alumno alumno = new Alumno("Luis", 17);
		Alumno alumno2 = new Alumno("Paco", 19);
		try {
			alumno.enviarMensaje(alumno2, "A ver si llega");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("-----\n");
		try {
			System.out.println(alum.buscarFrase("estudia"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("-----\n");
		try {
			//salta la excepcion
			System.out.println(alum.buscarFrase("hola"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
