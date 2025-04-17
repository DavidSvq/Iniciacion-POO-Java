package herencia;

public class PaquetePequenio extends Paquete {
	
	private int peso;
	private final int PESOMAX = 10;
	
	public PaquetePequenio(String destino, String origen) {
		super(destino, origen);
		peso = 0;
	}

	public PaquetePequenio(String destino, String origen, int peso) {
		super(destino, origen);
		this.peso = peso;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getPESOMAX() {
		return PESOMAX;
	}
	
	public void calcularCoste() {
		if (peso <= PESOMAX) {
			setCosteEnvio(peso * 0.5);
		}
	}

	@Override
	public String toString() {
		return "PaquetePequenio [peso=" + peso + ", PESOMAX=" + PESOMAX + ", toString()=" + super.toString() + "]";
	}
	
	
}
