package examen20Abril_Prog.Enum;

public enum ETipoSala {

	REUNIONES(20), CELEBRACIONES(80);
	
	public int getCapacidad() {
		return capacidad;
	}

	private int capacidad;
	
	ETipoSala(int capacidad){
		this.capacidad = capacidad;
	}
	
	
}
