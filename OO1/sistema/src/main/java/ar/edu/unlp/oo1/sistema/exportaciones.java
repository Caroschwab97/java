package ar.edu.unlp.oo1.sistema;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class exportaciones {

	private LocalDate fechaExpo;
	private String lugar;
	private String nombre;
	private List<items> itemList;
	private factura facturaExpo;

	
	public exportaciones(String ciudad, LocalDate fechaExpo,String nombre ) {
		super();
		this.fechaExpo = fechaExpo;
		this.lugar = ciudad;
		this.nombre= nombre;
		this.itemList = new ArrayList<items>();
		this.facturaExpo = new factura(fechaExpo);
		
	}
	
	public void agregarBienes(bienes b) {
		this.itemList.add(b);
		facturaExpo.agregarBienes(b);
	}
	
	public void agregarServicios(servicios s) {
		this.itemList.add(s);
		facturaExpo.agergarServicio(s);
	}

	public String getNombre() {
		return nombre;
	}
	
	public void hacerFactura() {

	}
	
	public factura getFactura() {
		return this.facturaExpo;
	}
	
}
