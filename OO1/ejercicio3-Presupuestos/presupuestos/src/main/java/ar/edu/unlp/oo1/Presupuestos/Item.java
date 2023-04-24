package ar.edu.unlp.oo1.Presupuestos;

public class Item {

	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item () {
		
	}
	
	public double costo () {
		double d = costoUnitario*cantidad;
		return d;
	}
	
	public Item detalle (String d) {
		this.detalle = d;
		return this;
	}
	
	public Item cantidad (int i) {
		this.cantidad = i;
		return this;
	}
	
	public Item costoUnitario (double d) {
		this.costoUnitario = d;
		return this;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}

	public void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}

}
