package interf.ejemplo.prueba;

public class Tienda implements ILocalComercial {

	private double largo;
	private double ancho;
	private String actividad;
	
	private int cantidadProducto;
	
	
	public Tienda(double largo, double ancho, String actividad) {
		this.actividad=actividad;
		this.largo=largo;
		this.ancho=ancho;
	}
	
	public Tienda(double largo, double ancho, String actividad, int inventario) {
		this(largo, ancho, actividad);
		this.cantidadProducto=inventario;
	}
	
	public int getCantidadProducto() {
		return this.cantidadProducto;
	}
	
	@Override
	public double getSuperficieEdificio() {
		return largo*ancho;
	}

	@Override
	public double getPrecioEdificio() {
		return getSuperficieEdificio()*PRECIO_METRO_LOCAL_COMERCIAL;
	}

	@Override
	public String actividadComercial() {  //este método es un get
		return this.actividad;
	}

}
