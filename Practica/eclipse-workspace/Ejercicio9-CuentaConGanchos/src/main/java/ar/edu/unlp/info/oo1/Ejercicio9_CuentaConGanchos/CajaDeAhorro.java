package ar.edu.unlp.info.oo1.Ejercicio9_CuentaConGanchos;

public class CajaDeAhorro extends Cuenta{

	
	
	
	@Override
	public boolean extraer(double monto) {
		return super.extraer(monto*1.02);
	}
	
	@Override
	protected boolean puedeExtraer(double monto) {
		return this.getSaldo() >= (monto);
	}
	

}
