package ar.edu.unlp.oo1.Ejercicio2_Balanza;

public class Ticket {

	private java.time.LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	public Ticket (int c, double p, double pt) {
		fecha = java.time.LocalDate.now();
		cantidadDeProductos = c;
		pesoTotal = p;
		precioTotal = pt;
	}
	
	public Ticket () {
		fecha = java.time.LocalDate.now();
		cantidadDeProductos = 0;
		pesoTotal = 0;
		precioTotal = 0;
	}
	
	public void impuesto () {
		double d = 31*precioTotal/100;
		precioTotal = precioTotal + d;
	}

	public java.time.LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(java.time.LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantProductos(int cantProductos) {
		this.cantidadDeProductos = cantProductos;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	
}
