package ar.edu.unlp.oo1.RegistroLlamadas;

import java.time.LocalDate;

public class PersonaFisica extends Cliente{
	
	private int DNI;

	public PersonaFisica(String nombre, String direccion, int telefono, int dNI) {
		super(nombre, direccion, telefono);
		DNI = dNI;
	}
	
	public Factura getFactura(LocalDate inicio, LocalDate fin) {
		double d = super.calcularMonto(inicio, fin);
		d = (d * 10) / 100;
		Factura f = new Factura (this, inicio, fin, d);
		return f;
	}
}
