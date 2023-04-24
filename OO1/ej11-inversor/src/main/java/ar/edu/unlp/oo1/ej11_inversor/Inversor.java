package ar.edu.unlp.oo1.ej11_inversor;

import java.util.ArrayList;
import java.util.List;

public class Inversor extends Inversion{
	
	private String nombre;
	private List<Inversion> inversiones;
	
	
	
	public Inversor(String nombre) {
		super();
		this.nombre = nombre;
		this.inversiones = new ArrayList<Inversion>();
	}

	public double valorActual() {
		double in = inversiones.stream()
				.mapToDouble(inversiones -> inversiones.valorActual())
				.sum();
		return in;
	}
	
	public void agregarInversion(Inversion inv) {
		inversiones.add(inv);
	}
	

}
