package simulacro;


import simulacro.excep.DniException;
import simulacro.excep.PuestoException;
import simulacro.excep.SueldoJefeDepartamentoException;
import simulacro.model.Departamento;
import simulacro.model.EmpleadoBase;
import simulacro.model.JefeDepartamento;

public class Prueba {

	public static void main(String[] args) {
		


		try {
			EmpleadoBase e = new EmpleadoBase("47537176V", "Pepito", "operario");
			EmpleadoBase e1 = new EmpleadoBase("28676325L", "Juanito", "operario");
			EmpleadoBase e2 = new EmpleadoBase("28676320U", "Luis", "contable");
			
			JefeDepartamento j = new JefeDepartamento("28541256L", "Lola", 8, 1450);
			JefeDepartamento j1 = new JefeDepartamento("28547896L", "Lucas", 5, 1300);
			
			Departamento d = new Departamento("Administración");
			
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
				System.out.println(d.toString());
				System.out.println("----------");
				e.actualizarSueldo();
				System.out.println(e.getSueldo());
			

		} catch (PuestoException e) {
			System.out.println(e.getMessage());
		} catch (SueldoJefeDepartamentoException e3) {
			System.out.println(e3.getMessage());
		} catch (DniException e3) {
			System.out.println(e3.getMessage());
		}

	}

}
