package examen20Abril_Prog.Enum;

public enum ETipoHabitacion {

	SIMPLE(1), DOBLE(2), SUITE(2);
	
	public int getInquilino() {
		return inquilino;
	}

	private int inquilino;
	
	ETipoHabitacion(int inquilino){
		this.inquilino = inquilino;
	}
	
}
