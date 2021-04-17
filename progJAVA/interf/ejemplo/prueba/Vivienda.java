package interf.ejemplo.prueba;

public class Vivienda implements IEdificio {

	private double largo;
	private double ancho;
	private int plantas;
	private int habitantes;
	
	
	
	
	
	public Vivienda(double largo, double ancho, int plantas) {
		super(); //en este caso no es necesario
		this.largo=largo;
		this.ancho=ancho;
		this.plantas=plantas;
	}
	
	public Vivienda(double largo, double ancho, int plantas, int habitantes) {
		this(largo,ancho,plantas); //llama al constructor anterior
		this.habitantes=habitantes;
	}
	
	@Override
	public double getSuperficieEdificio() {
		return ancho*largo*plantas;
	}

	@Override
	public double getPrecioEdificio() {
		return PRECIO_POR_METRO * getSuperficieEdificio();
	}

	//Método para ver cuántos habitantes hay.
	public int getHabitantes() {
		return habitantes;
	}

}
