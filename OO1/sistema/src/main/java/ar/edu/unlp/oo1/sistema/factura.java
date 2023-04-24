package ar.edu.unlp.oo1.sistema;

import java.time.LocalDate;
import java.util.List;

public class factura {

	private LocalDate fechaDeFacturacion;
	private LocalDate fechaDeExportacion;
	private double costoBasico;
	private double costoFinal;
	private double costoExportacion;
	private List<items> exportados;


	public factura(LocalDate fechaExpo) {
		this.fechaDeExportacion = fechaExpo;
		this.fechaDeFacturacion = LocalDate.now();
		this.costoBasico=0;
		this.costoFinal=0;
		this.costoExportacion= 0;
	}
	
	public void agregarBienes(bienes b) {
		exportados.add(b);
		costoBasico+=(b.getUnidades()*b.getValor());
		if (b.getPesoKG()*b.getUnidades() > 1000) {
			costoBasico+=((10*(b.getUnidades()*b.getValor()))/100);
		}
	}
	
	public void agergarServicio (servicios s) {
		exportados.add(s);
		costoBasico+=(s.getManoDeObra()+s.getMateriales());
	}
	
	public void costoFinales() { 
		this.costoExportacion = ((5*this.costoBasico)/100);
		this.costoFinal = this.costoExportacion + this.costoBasico;
	}
	
	public LocalDate getFecha() {
		return this.fechaDeFacturacion;
	}
	
	public double getCostoFinal () {
		return this.costoFinal;
	}
}
