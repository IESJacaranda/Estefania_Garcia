package rel7_ejer5_ligaFUTBOL;

public class Partido {

	private int jornada;
	private Equipo local;
	private Equipo visitante;
	private int golesLocal;
	private int golesVisitante;
	private char quiniela;
	
	
	
	public Partido() {}
	
	public Partido(int jornada, Equipo local, Equipo visitante) {
		this.jornada = jornada;
		this.local = local;
		this.visitante = visitante;
		
	}

	
	
	
	
	
	
	
	
	public int getJornada() {
		return jornada;
	}

	public void setJornada(int jornada) {
		if(jornada>=1 && jornada<=38) {
			this.jornada = jornada;
		}	
	}

	public Equipo getLocal() {
		return local;
	}

	public void setLocal(Equipo local) {
		this.local = local;
	}

	public Equipo getVisitante() {
		return visitante;
	}

	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
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
