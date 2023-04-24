package ar.edu.unlp.oo1.OOBnB;

import java.util.ArrayList;
import java.util.List;

public class usuario {

	private String nombre;
	private int DNI;
	private String direccion;
	private List<propiedades> prop;
	private List<reserva> res;
	
	public usuario(String nombre, int dNI, String direccion) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.direccion = direccion;
		prop = new ArrayList<propiedades> ();
		res = new ArrayList<reserva>();
	}
	
	
}
