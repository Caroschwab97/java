package ar.edu.unlp.oo1.ej11_inversor;


import java.time.LocalDate;
public class plazoFijo extends Inversion{
	
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	
	
	public plazoFijo(LocalDate fecha, double montoDepositado, double porcentajeDeInteresDiario) {
		super();
		this.fechaDeConstitucion = fecha;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}



	public double valorActual() {
		int dias= this.fechaDeConstitucion.until(LocalDate.now()).getDays();
		return this.montoDepositado + (dias*this.porcentajeDeInteresDiario);
	}
}
