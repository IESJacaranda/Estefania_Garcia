package simulacro.v2.model;

import java.util.Comparator;

public class OrdenaNombresv2 implements Comparator<AbstractEmpleadov2> {

	@Override
	public int compare(AbstractEmpleadov2 e1, AbstractEmpleadov2 e2) {
		
		return (int) (e1.getNombre().compareTo(e2.getNombre()));
	}

}
