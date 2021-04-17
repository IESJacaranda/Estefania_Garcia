package relacion7.ejer2_producto;


public class Producto {

	private int codigo;
	private String descripcion;
	private double precio;
	
	private final static double IVA = 20.0;
	
	
	
	public Producto() {
		this.codigo = (int)(1000 * Math.random()); // codigo único que se asigna automaticamente a cada producto
	
	}
	
	public Producto (int codigo, String descripcion, double precio) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	
	
	/**
	 * este metodo añade el IVA a un precio
	 * @param precio
	 * @return precio con IVA
	 */
	public String calcularPrecioConIVA(double precio) {
		
		double iva = precio * IVA/100;
		
		return "El precio con IVA del producto es de: "+ (precio + iva) + " €.";
	}
	
	
	@Override
	public String toString() {
		return "El código del producto es: " + codigo + ",\nsu descripcion es: " + descripcion + ",\ny su precio sin IVA es: " + precio + ".";
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
		
	
}
