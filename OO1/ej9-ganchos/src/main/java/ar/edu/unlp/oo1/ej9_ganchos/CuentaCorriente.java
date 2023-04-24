package ar.edu.unlp.oo1.ej9_ganchos;

public class CuentaCorriente extends cuenta {
	
	private double descubierto;
	
	public CuentaCorriente() {
		descubierto=0;
	}
	
	public double getDescubierto() {
		return this.descubierto;
	}
	
	public void setDescubierto(double des) {
		this.descubierto = des;
	}
	
	public boolean extraer(double monto) {
		if ((super.getSaldo() + this.descubierto) >= monto) {
			super.extraerSinControlar(monto);
			return true;
		}
		return false;
	}

}
