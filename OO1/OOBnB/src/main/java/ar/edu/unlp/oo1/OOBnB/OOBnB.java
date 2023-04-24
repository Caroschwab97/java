package ar.edu.unlp.oo1.OOBnB;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class OOBnB {

	private List<propiedades> prop;
	private List<usuario> usuarios;
	
	public OOBnB () {
		prop = new ArrayList<propiedades>();
		usuarios = new ArrayList<usuario> ();
	}
	
	public usuario registrarUsuario (String n, String dir, int d) {
		usuario u = new usuario (n,d,dir);
		usuarios.add(u);
		return u;
	}
	
	public propiedades registrarPropAlquiler(String n, double p, String dir, String d) {
		propiedades propiedad1 = new propiedades (n,p,dir,d);
		this.prop.add(propiedad1);
		return propiedad1;
	}
	
	public List<propiedades> buscarPropPeriodo (LocalDate from, LocalDate to) {
		return prop.stream()
				.filter(c -> !c.getLibre(from,to).equals(null))
				.collect(Collectors.toList());	
	}
	
	public void hacerReserva(propiedades p, DateLapse dt, usuario u ) {
		p.getLibre(null, null)
	}
}
