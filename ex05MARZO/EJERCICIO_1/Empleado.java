package ex_05marzo_casa;

import java.util.Objects;

public class Empleado {

	private String nombre;
	private int edad;
	private char genero;
	private String horario;
	private int codigo;
	private String password;
	
	
	public Empleado(){}
	
	public Empleado(String nombre, int edad) {
		this.nombre= nombre;
		this.edad = edad;
		
	}
	public Empleado(String nombre, int edad, char genero, String horario, int codigo, String password) throws PasswordException {
		this(nombre,edad);
		this.genero = genero;
		this.horario = horario;
		this.codigo = this.hashCode();
		
		
		
		int mayus=0;
		int num =0;
		
		if(password.length()<10) {
			throw new PasswordException();
		}else {
			for(int i=0; i<password.length(); i++) { //no funciona
			char c= password.charAt(i);
			
	        if(Character.isUpperCase(c)) {
	        	mayus+=1;
	        }else if(Character.isDigit(c)) {
	        	num +=1;
	        }
		}
	
	        
	     if(mayus>=2 && num >=3) {
	    	 this.password= password;
	     }else {
	    	 throw new PasswordException();
	     }
	            
		}
		
	}
	
	
	
	/**
	 * Para crear el código de identificacion
	 */
	@Override
	public int hashCode() {
		
		return Objects.hash(codigo);
	}

	
	
	
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", horario=" + horario
				+ ", codigo=" + codigo + ", password=" + password + "]";
	}

	
	
	
	
	
	
	
	
	
}
