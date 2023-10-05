package ar.edu.unlp.info.oo1.Ejercicio9_CuentaConGanchos;

public class CuentaCorriente extends Cuenta{

	private double limiteDeDescubierto;
	
	public CuentaCorriente() {
		super();
		this.limiteDeDescubierto = 0;
	}

	public double getLimiteDeDescubierto() {
		return limiteDeDescubierto;
	}
	public void setLimiteDeDescubierto(double limiteDeDescubierto) {
		this.limiteDeDescubierto = limiteDeDescubierto;
	}
	@Override
	protected boolean puedeExtraer(double monto) {
		return this.getSaldo() - monto >= - this.limiteDeDescubierto;
	}
	
}

