package ar.edu.unlp.oo1.correo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class carpeta {

	private List<correo> correos;
	
	public carpeta() {
		correos = new ArrayList<correo>();
	}
	
	public void agregar(correo e) {
		correos.add(e);
	}
	
	public void eliminar(correo c) {
		int i =correos.indexOf(c);
		correos.remove(i);
	}
	
	public boolean esta (correo c) {
		return correos.contains(c);
	}

	
	 public List<correo> getEmails() {
			return this.correos;
		    }
}
