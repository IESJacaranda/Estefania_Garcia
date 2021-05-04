package simulacro.v2;

import simulacro.v2.excep.DniExceptionv2;
import simulacro.v2.excep.PuestoExceptionv2;
import simulacro.v2.excep.SueldoJefeDepartamentoExceptionv2;
import simulacro.v2.model.Departamentov2;
import simulacro.v2.model.EmpleadoBasev2;
import simulacro.v2.model.EmpleadoJefev2;

public class Prueba {

	public static void main(String[] args) {
		


		try {
			EmpleadoBasev2 e = new EmpleadoBasev2("47537176V", "Pepito", "operario");
			EmpleadoBasev2 e1 = new EmpleadoBasev2("28676325L", "Juanito", "operario");
			EmpleadoBasev2 e2 = new EmpleadoBasev2("28676320U", "Luis", "contable");
			
			EmpleadoJefev2 j = new EmpleadoJefev2("28541256L", "Lola", 8, 1450);
			EmpleadoJefev2 j1 = new EmpleadoJefev2("28547896L", "Lucas", 5, 1300);
			
			Departamentov2 d = new Departamentov2("Administración");
			
				System.out.println(d.addEmpleado(e));
				System.out.println("----------");
				System.out.println(d.addEmpleado(e1));
				System.out.println("----------");
				System.out.println(d.addEmpleado(e1));
				System.out.println("----------");
				System.out.println(d.addJefe(j));
				System.out.println("----------");
				System.out.println(d.addJefe(j1));
				System.out.println("----------");
				
				System.out.println(d.ordenarEmpleadosPorNombre());
				System.out.println(d.toStringSueldo());
			

		} catch (PuestoExceptionv2 e) {
			System.out.println(e.getMessage());
		} catch (SueldoJefeDepartamentoExceptionv2 e3) {
			System.out.println(e3.getMessage());
		} catch (DniExceptionv2 e3) {
			System.out.println(e3.getMessage());
		}

	}

}
