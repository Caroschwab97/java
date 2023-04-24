package ar.edu.unlp.oo1.Ejercicio2_Balanza;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	
	public Balanza() {
		super();
		cantidadDeProductos = 0;
		precioTotal = 0;
		pesoTotal = 0;
	}
	
	public void ponerEnCero () {
		cantidadDeProductos = 0;
		precioTotal = 0.0;
		pesoTotal = 0.0;
	}
	
	public void agregarProducto (Producto p) {
		pesoTotal = pesoTotal + p.getPeso();
		precioTotal = precioTotal + p.getPrecio();
		cantidadDeProductos++;
	}
	
	public Ticket emitirTicket () {
		Ticket t = new Ticket (cantidadDeProductos, precioTotal, pesoTotal);
		t.impuesto();
		return t;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}
	
	
	
	
}
