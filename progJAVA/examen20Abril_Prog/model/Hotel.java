package examen20Abril_Prog.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import examen20Abril_Prog.Excep.HabitacionException;
import examen20Abril_Prog.Excep.SalaException;


public class Hotel {

	
	public static List<AbstractInstalacion> listaHotel;
	public static List<Reserva> listaReserva;
	
	public Hotel() {
		super();
		listaHotel = new ArrayList<AbstractInstalacion>();
		listaReserva = new ArrayList<Reserva>();
	}
	

	public void inicializarHotel() {
		
		listaHotel = new ArrayList<AbstractInstalacion>(); //para que siempre se ponga a cero antes de inicializar
		listaReserva = new ArrayList<Reserva>();
	
		try {
			
			listaHotel.add(new Habitacion("simple"));
			listaHotel.add(new Habitacion("simple"));
			listaHotel.add(new Habitacion("simple"));
			listaHotel.add(new Habitacion("simple"));
			listaHotel.add(new Habitacion("simple"));
			listaHotel.add(new Habitacion("doble"));
			listaHotel.add(new Habitacion("doble"));
			listaHotel.add(new Habitacion("doble"));
			listaHotel.add(new Habitacion("suite"));
			listaHotel.add(new Sala("celebraciones"));
			listaHotel.add(new Sala("celebraciones"));
			listaHotel.add(new Sala("celebraciones"));
			listaHotel.add(new Sala("reuniones"));
			listaHotel.add(new Sala("reuniones"));
			
			
		} catch (HabitacionException e) {
			System.out.println(e.getMessage());
		} catch (SalaException e) {
			System.out.println(e.getMessage());
		}
	}
		
	
	public void listarInstalaciones(){
		System.out.println("\nEl hotel dispone de "+ listaHotel.size() +" instalaciones en total:\n");
		
			for(AbstractInstalacion hab: listaHotel) {
					System.out.println("> "+hab+"\n");
			}
		
	}
	//este metodo añade una reserva a la listaDeReservas
	public void addReserva(Reserva r) {
	
		listaReserva.add(r);
		System.out.println(r);
	}
	//este metodo calcula los ingresos generados por todas las reservas contenidas en la listaDeReservas
	public void calcularIngresosGenerados(){
		
		double ingresos = 0;
		
		for(Reserva reserva: listaReserva) {
			
			ingresos += reserva.getTipoHab().calcularAlquiler()*reserva.obtenerDiasReserva();
	
		}
		System.out.println("\nLos ingresos obtenidos ascienden a un total de "+ingresos +" euros.\n");
		
	}
	//este metodo muestra las reservas a partir de la fecha dada	
	public void listarInstalacionesEnFecha(LocalDate fecha) {
		
		for(Reserva reserva: listaReserva) {
			if(reserva.getFechaIni().isAfter(fecha)) {
				System.out.println(reserva+"\n");
			}
		}
		
	}
	//este metodo ordena por fecha la listaDeReservas, primero la fecha más actual
	public void listarReservaInstalaciones() {
		Collections.sort(listaReserva);
		for(Reserva r: listaReserva) {
			System.out.println(r+"\n");
		}
		
	}
		





	
	

	
}
