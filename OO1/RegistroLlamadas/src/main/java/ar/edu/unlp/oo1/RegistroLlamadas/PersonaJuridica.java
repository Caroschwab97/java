package ar.edu.unlp.oo1.RegistroLlamadas;

import java.time.LocalDate;

public class PersonaJuridica extends Cliente {

	private int CUIT;
	private String tipPersonaJuridica;
	
	public PersonaJuridica(String nombre, String direccion, int telefono,int cUIT, String tipPersonaJuridica) {
		super(nombre, direccion,telefono);
		CUIT = cUIT;
		this.tipPersonaJuridica = tipPersonaJuridica;
	}
	
	public Factura getFactura(LocalDate inicio, LocalDate fin) {
		double d = super.calcularMonto(inicio, fin);
		Factura f = new Factura (this, inicio, fin, d);
		return f;
	}
	
	
}
