package practica_2;

public class productoJM {

	private String codigo;
	private final int LONGITUD_MINIMA=5;
	private final int LONGITUD_MAXIMA=12;
	private final int DIGITOS_MINIMOS=3;
	
	
	public productoJM(String codigoProducto) {
		this.codigo=codigoProducto;
	}
	
	public boolean validarCodigo() throws Exception {
		
		if (this.codigo==null) {
			throw new Exception("Debe introducir un código");
		}else if(this.codigo.length()<LONGITUD_MINIMA) {
			throw new Exception("El código debe tener al menos longitud "+ LONGITUD_MINIMA);
		}else if(this.codigo.length()>LONGITUD_MAXIMA) {
			throw new Exception("El código debe tener una longitud menor a  "+ LONGITUD_MAXIMA);	
		}
		int numeroDigitos=0;
		for(int i=0; i<this.codigo.length();i++) {
			if(Character.isDigit(codigo.charAt(i))) {
				numeroDigitos++;
			}
		}
		if(numeroDigitos<DIGITOS_MINIMOS) {
			throw new Exception("No incluye el mínimo de dígitos establecidos");
		}
		
		return true;
	}
}
