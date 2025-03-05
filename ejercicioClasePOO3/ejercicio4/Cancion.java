package ejercicioClasePOO3.ejercicio4;

public class Cancion {
	private String titulo;

	/**
	 * @param titulo
	 */
	public Cancion(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Cancion [" + titulo + "]";
	}
	
}
