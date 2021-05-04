package simulacro.model;

public enum EPuesto {

	ADMINISTRATIVO(1150), OPERARIO(1100), CONTABLE(1350);
	
	protected int sueldoBase;
	
	EPuesto(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}
	
	
}
