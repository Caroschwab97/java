package ar.edu.unlp.oo1.ej9_ganchos;

public class CajaDeAhorro extends cuenta {

	
	public void depositar(double monto) {
		double adicional = (2*monto)/100; 
		super.depositar(monto);
		super.extraerSinControlar(adicional);
		}
	
	
	public boolean transferencia (double monto, cuenta cuentaDestino) {
		double adicional = (2*monto)/100; 
		if (super.puedeExtraer(monto+adicional)) {
			super.depositar(monto);
			super.transferirACuenta(monto, cuentaDestino);
			return true;
	}
		return false;
	}
	

	public boolean extraer(double monto) {
		double adicional = (2*monto)/100; 
		if (super.puedeExtraer(monto+adicional)) {
			super.depositar(monto);
			super.extraer(monto);
			return true;
	}
	return false;	}
	
	
}
