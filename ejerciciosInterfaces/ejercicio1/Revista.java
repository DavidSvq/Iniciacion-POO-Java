package ejerciciosInterfaces.ejercicio1;

public class Revista extends Libro {
	
	private int numero;
	
	public Revista(int codigo, String titulo, int fechaPublicacion, int numero) {
		super(codigo, titulo, fechaPublicacion);
		this.numero = numero;
	}

	@Override
	public String toString() {
		return super.toString() + "Numero " + numero +"\n";
	}

	
}
