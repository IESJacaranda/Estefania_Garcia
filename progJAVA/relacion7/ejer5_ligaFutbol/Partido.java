package relacion7.ejer5_ligaFutbol;

public class Partido {

	private int jornada;
	private Equipo local;
	private Equipo visitante;
	private int golesLocal;
	private int golesVisitante;
	private char quiniela;
	private boolean partido_jugado=false;
	
	
	
	public Partido() {}
	
	public Partido(int jornada, Equipo local, Equipo visitante) throws Exception {
		int i= 0;
		
		while(i==0) {
		if((jornada<=0 || jornada >=40) && (local.equals(visitante))) {
			throw new JornadaYequipoException();
		}
			
		else if (jornada<=0 || jornada >=40) {
			throw new JornadaException();
		}
		else if (local.equals(visitante)){
				throw new NombreEquipoException();
		}else {
				this.jornada = jornada;
				this.local = local;
				this.visitante = visitante;
				i=1;
			
		}
		}
		
		
	}

	public void ponerResultado (String cadena) throws Exception {
	
		if (cadena.length()>3) {
			throw new Exception("El formato del resultado debe ser 1-2");
		}else if (cadena.length()==3 && cadena.charAt(1)=='-') {
			this.golesLocal = Character.getNumericValue(cadena.charAt(0));
			this.golesVisitante = Character.getNumericValue(cadena.charAt(2));
			this.partido_jugado = true;
		}
		if(this.golesLocal>this.golesVisitante) {
			this.quiniela = '1';
			local.setPartidosGanados(local.getPartidosGanados()+1);
			
		}else if(this.golesLocal<this.golesVisitante) {
			this.quiniela = '2';
			visitante.setPartidosGanados(visitante.getPartidosGanados()+1);
			
		}if(this.golesLocal==this.golesVisitante) {
			this.quiniela = 'x';
		}
		
		
	}
	
	public void obtenerQuiniela(char quiniela) throws Exception {
		
		if(this.quiniela!='1' || this.quiniela!='2' || this.quiniela!='x') {
			throw new Exception ("No es un caracter válido. Los caracteres válidos son 1,x,2");
		}
		
	}
	

	@Override
	public String toString() {
		String mensaje ="";
		
		if (this.partido_jugado) {
		mensaje= "Partido entre equipo local: "+local.getNombre() +" y el equipo visitante "+visitante.getNombre() +", jugado en el estadio: "+local.getEstadio()+ " de la ciudad "+local.getCiudad()+",\nha finalizado con "+golesLocal+" gol(es) de equipo local y "+golesVisitante+ " gol(es) de equipo visitante. Resultado quiniela= "+quiniela+".";
		}
		else {
			mensaje= "Partido entre equipo local: "+local.getNombre() +" y equipo visitante: "+visitante.getNombre() +" todavía no se ha jugado.";
		}
		
		return mensaje;
		
	}
	
	
	
	
	public int getJornada() throws Exception {
		return jornada;
	}

	public Equipo getLocal() {
		return local;
	}

	public Equipo getVisitante() {
		return visitante;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}
	
	public int getGolesVisitante() {
		return golesVisitante;
	}

	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

	public char getQuiniela() {
		return quiniela;
	}

	public void setQuiniela(char quiniela) {
		this.quiniela = quiniela;
	}

	

	
	
	
	
	
}
