package ar.edu.unlp.oo1.RegistroLlamadas;

import java.time.LocalDate;

public class LlamadasLocales extends Llamada {
	
	private double montoLlamada;

	public LlamadasLocales(LocalDate fechaComienzo, int horaComienzo, int duracionMinutos, int telefonoLlama, int telefonoRecibe) {
		super(fechaComienzo, horaComienzo, duracionMinutos, telefonoLlama, telefonoRecibe);
		this.montoLlamada = this.setMontoLlamada();
	}

	protected double setMontoLlamada() {
		return super.getDuracionMinutos();
	}
	
	public double getMontoLlamada() {
		return this.montoLlamada;
	}
}
