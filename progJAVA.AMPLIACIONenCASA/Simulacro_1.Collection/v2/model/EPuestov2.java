package simulacro.v2.model;

public enum EPuestov2 {

	ADMINISTRATIVO(1150), OPERARIO(1100), CONTABLE(1350);
	
	protected int sueldoBase;
	
	EPuestov2(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}
	
	
}
