package ar.edu.unlp.oo1.RegistroLlamadas;

import java.time.LocalDate;

public class LlamadasInternacionales extends Llamada {
	private double montoLlamada;
	private String paisOrigen;
	private String paisDestino;
	public LlamadasInternacionales(LocalDate fechaComienzo, int horaComienzo, int duracionMinutos, int telefonoLlama, int telefonoRecibe, String paisOrigen, String paisDestino) {
		super(fechaComienzo, horaComienzo, duracionMinutos, telefonoLlama, telefonoRecibe);
		this.paisOrigen = paisOrigen;
		this.paisDestino = paisDestino;
		this.montoLlamada = this.setMontoLlamada();
	}
	
	protected double setMontoLlamada() {
		if ((super.getHoraComienzo() < 20) && (super.getHoraComienzo() > 8)) {
			return super.getDuracionMinutos() * 4; }
		return super.getDuracionMinutos() * 3;
	}
	
	public double getMontoLlamada() {
		return this.montoLlamada;
	}
	
}
