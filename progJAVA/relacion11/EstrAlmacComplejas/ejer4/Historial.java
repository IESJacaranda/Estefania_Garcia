package relacion11.EstrAlmacComplejas.ejer4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Historial {

	protected List<PaginaWeb> historial;
	
	public Historial(){
		super();
		this.historial = new ArrayList<PaginaWeb>();
	}
	
	public void addPagina(PaginaWeb p) throws Exception {
		if(historial.size()!=0 && p.fecha.isBefore(historial.get(historial.size()-1).fecha)) {
			throw new Exception("No se puede añadir la Página Web");
		}else {
			historial.add(p);
			
		}
		
	}
	
	public String consultarHistorial() {
		StringBuilder sb = new StringBuilder("Mostrando historial: \n");
		
		for(PaginaWeb p: historial) {
			sb.append(p+"\n");
		}
		return sb.toString();
	}
	
	public String consultarDia(LocalDateTime consulta) {
		StringBuilder sb = new StringBuilder("Consultas del "+consulta.getDayOfMonth()+" de "+consulta.getMonth() +":\n");
		
		for(PaginaWeb p: historial) {
			if(p.fecha.getYear()==consulta.getYear() && p.fecha.getMonth()==consulta.getMonth()
					&& p.fecha.getDayOfMonth()==consulta.getDayOfMonth()) {
				sb.append(p+"\n");
			}
		}
		
		return sb.toString();
	}
	
	public String borrarHistorial() {
		this.historial = new ArrayList<PaginaWeb>();
		return "El historial ha sido borrado";
	}
	
	
	
	
}
