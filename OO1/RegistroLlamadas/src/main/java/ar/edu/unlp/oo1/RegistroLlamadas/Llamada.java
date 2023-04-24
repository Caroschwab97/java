package ar.edu.unlp.oo1.RegistroLlamadas;

import java.time.LocalDate;

public abstract class Llamada {

	private LocalDate fecha;
	private int horaComienzo;
	private int duracionMinutos;
	private int telefonoLlama;
	private int telefonoRecibe;
	
	
	
	public Llamada(LocalDate fechaComienzo, int horaComienzo, int duracionMinutos, int telefonoLlama, int telefonoRecibe) {
		super();
		this.fecha = fechaComienzo;
		this.horaComienzo = horaComienzo;
		this.duracionMinutos = duracionMinutos;
		this.telefonoLlama = telefonoLlama;
		this.telefonoRecibe = telefonoRecibe;
}

	protected abstract double setMontoLlamada();
	
	public abstract double getMontoLlamada();

	
	public int getHoraComienzo() {
		return horaComienzo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public int getTelefonoLlama() {
		return telefonoLlama;
	}

	public int getDuracionMinutos() {
		return duracionMinutos;
	}
	
	
	
	
}
