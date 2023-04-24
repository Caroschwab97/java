package ar.edu.unlp.oo1.RegistroLlamadas;

import java.time.LocalDate;

public class LlamadasInterurbanas extends Llamada {

	private double montoLlamada;
	private double distanciaKm;

	public LlamadasInterurbanas(LocalDate fechaComienzo, int horaComienzo, int duracionMinutos, int telefonoLlama, int telefonoRecibe, double distancia) {
		super(fechaComienzo, horaComienzo, duracionMinutos, telefonoLlama, telefonoRecibe);
		this.montoLlamada = this.setMontoLlamada();
		this.distanciaKm = distancia;
	}
	
	protected double setMontoLlamada() {
		if (this.distanciaKm < 100) {
			return 5 + (super.getDuracionMinutos()*2);}
			else 
				if ((this.distanciaKm <= 500) && (this.distanciaKm >= 100)) {
					return 5 + (super.getDuracionMinutos() * 2.5);
			}
		return 5 + (super.getDuracionMinutos() * 3);
	}
	
	public double getMontoLlamada() {
		return this.montoLlamada;
	}
	
}
