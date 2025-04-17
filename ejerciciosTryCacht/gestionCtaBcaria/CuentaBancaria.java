package ejerciciosTryCacht.gestionCtaBcaria;

public class CuentaBancaria {
	private double saldo;
	private String titular;
	/**
	 * @param saldo
	 * @param titular
	 */
	public CuentaBancaria(double saldo, String titular) {
		this.saldo = saldo;
		this.titular = titular;
	}
	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}
	/**
	 * @param titular the titular to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void depositar(double cantidad) throws OperacionInvalidadExcepcion {
		if(cantidad < 0) {
			throw new OperacionInvalidadExcepcion("Error, cantidad negativa");
		}
		saldo += cantidad;
	}
	public void retirar(double cantidad) throws OperacionInvalidadExcepcion, SaldoInsuficienteException {
		if(cantidad < 0) {
			throw new OperacionInvalidadExcepcion("Error, cantidad negativa");
		}
		if(cantidad > saldo) {
			throw new SaldoInsuficienteException("Error, saldo insuficiente");
		}
			saldo -= cantidad;
	}
	
}
