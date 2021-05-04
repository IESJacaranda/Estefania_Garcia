package simulacro.model;

import java.util.Comparator;

public class OrdenaSueldo implements Comparator<AbstractEmpleado> {

	@Override
	public int compare(AbstractEmpleado e1, AbstractEmpleado e2) {
		
		return (int) (e1.getSueldo() - e2.getSueldo());
	}

}
