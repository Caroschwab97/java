package ar.edu.unlp.oo1.sistema;

public class servicios extends items {

	private String descripcion;
	private double materiales;
	private double manoDeObra;
	
	public servicios(String descripcion, double materiales, double manoDeObra) {
		super();
		this.descripcion = descripcion;
		this.materiales = materiales;
		this.manoDeObra = manoDeObra;
	}

	public double getMateriales() {
		return materiales;
	}

	public double getManoDeObra() {
		return manoDeObra;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
}
