package almacen;

public class Producto {

	private String codigo;
	private String categoria;
	
	private final int LONGITUD_MAX = 12;
	private final int LONGITUD_MIN = 5;
	private final int DIGITOS_MIN = 3;
	
	private final int LONG_CAT_MIN = 2;
	private final int LONG_CAT_MAX = 5;
	

	public Producto () {}
	
	public Producto (String codigo, String categoria) {
		this.codigo = codigo;
		this.categoria = categoria;
	}
	
	
	public String validarCodigo() throws Exception {
		int contadorDigitos = 0;
		for (int i=0; i<this.codigo.length();i++) {
			if(Character.isDigit(codigo.charAt(i))) {
				contadorDigitos++;
			}
		}
		
		if (this.codigo.length()>LONGITUD_MAX) {
			throw new Exception("El código no es correcto.");
		}else if (this.codigo.length()<LONGITUD_MIN) {
			throw new Exception("El código no es correcto.");
		}else if(contadorDigitos<DIGITOS_MIN)
			throw new Exception("El código no es correcto.");
		
		return "El código es correcto";
	}
	
	
	public String validarCategoria() throws Exception {
		int contador = 0;
		String  categoria2 = this.categoria.substring(1);
		//System.out.println(categoria2);
		
		for (int i=1; i<categoria2.length();i++) {
			char c=categoria2.charAt(i);
			
			if(c!='a'&& c!='e'&& c!='i'&& c!='o'&& c!='u'
					&& c!='A'&& c!='E'&& c!='I'&& c!='O'&& c!='U'){
				contador++;
			}
		}
		
		if (this.categoria.length()<LONG_CAT_MIN) {
			throw new Exception("La categoría no es correcta.");
		}else if (this.categoria.length()>LONG_CAT_MAX) {
			throw new Exception("La categoría no es correcta.");
		}else if(this.categoria.charAt(0)!='C') {
			throw new Exception("La categoría no es correcta.");
		}else if(contador>0) {
			throw new Exception("La categoría no es correcta.");
		}
		
		return "La categoría es correcta";
	}
	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
