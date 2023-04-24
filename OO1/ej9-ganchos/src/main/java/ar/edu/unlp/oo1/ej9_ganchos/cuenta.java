package ar.edu.unlp.oo1.ej9_ganchos;

public abstract class cuenta {
	private double saldo;
	
	public cuenta() {
		this.saldo = 0;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void depositar(double monto) {
		this.saldo+=monto;
	}
	
	protected void extraerSinControlar(double monto) {
		this.saldo-=monto;
	}
	
	public boolean extraer(double monto) {
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			return true;
		}
		return false;
		}
	public boolean transferirACuenta (double monto, cuenta cuentaDestino) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	
	protected boolean puedeExtraer(double monto) {
		if (this.saldo > monto) 
			return true;
		return false;
	}
}
