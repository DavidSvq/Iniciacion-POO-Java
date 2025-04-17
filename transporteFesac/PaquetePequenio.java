package transporteFesac;

public class PaquetePequenio extends Paquete {
	private int peso;
	public final double pesoMaximo = 10;
	public PaquetePequenio(String destino, String origen) {
		super(destino, origen);
		peso = 0;
	}
	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}
	/**
	 * @return the pesoMaximo
	 */
	public double getPesoMaximo() {
		return pesoMaximo;
	}
	
	public void calcularCoste() {
		if(peso > pesoMaximo) System.out.println("Peso máximo superado");
		else setCosteEnvio(peso * 0.5);
	}
	@Override
	public String toString() {
		return super.toString() + "\tPaquete Pequeño[Peso: " + peso + "]";
	}
	

}
