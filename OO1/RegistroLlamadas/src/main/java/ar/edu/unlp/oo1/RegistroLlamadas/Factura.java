package ar.edu.unlp.oo1.RegistroLlamadas;

import java.time.LocalDate;

public class Factura {
	
	private Cliente cliente;
	private LocalDate fechaFacturacion;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private double montoTotal;
	
	
	public Factura(Cliente cliente, LocalDate fechaInicio, LocalDate fechaFin, double montoTotal) {
		this.cliente = cliente;
		this.fechaFacturacion = LocalDate.now();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.montoTotal = montoTotal;
	}


	@Override
	public String toString() {
		return "Factura: cliente=" + cliente.getNombre() + ", fechaFacturacion=" + fechaFacturacion + ", fechaInicio=" + fechaInicio
				+ ", fechaFin=" + fechaFin + ", montoTotal=" + montoTotal;
	}
	
	
	
	
	
}
