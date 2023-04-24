package ar.edu.unlp.oo1.Presupuestos;

import java.util.List;
import java.util.ArrayList;
public class Presupuesto {
	
	private  java.time.LocalDate fecha;
	private String cliente;
	private List<Item> lista;
	
	public Presupuesto () {
		lista = new ArrayList <Item> ();
	}
	
	public void agregarItem (Item i) {
		lista.add(i);
	}
	
	public double calcularTotal () {
		return (lista.stream().mapToDouble(tot -> tot.costo()).sum());		
	}

	public java.time.LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(java.time.LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void Setcliente(String cliente) {
		this.cliente = cliente;
	}
	
	public Presupuesto cliente(String c) {
		this.cliente = c;
		return this;
	}
}
