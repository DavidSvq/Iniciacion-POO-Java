package ejercicioClasePOO3.ejercicio11;

public class Libro {
	private String titulo;
	private String autor;
	private int nEjemplares;
	private int nEjemplaresPrestados;
	
	/**
	 * 
	 */
	public Libro() {
	}
	/**
	 * @param titulo
	 * @param autor
	 * @param nEjemplares
	 * @param nEjemplaresPrestados
	 */
	public Libro(String titulo, String autor, int nEjemplares, int nEjemplaresPrestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.nEjemplares = nEjemplares;
		this.nEjemplaresPrestados = nEjemplaresPrestados;
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
	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * @return the nEjemplares
	 */
	public int getnEjemplares() {
		return nEjemplares;
	}
	/**
	 * @param nEjemplares the nEjemplares to set
	 */
	public void setnEjemplares(int nEjemplares) {
		this.nEjemplares = nEjemplares;
	}
	/**
	 * @return the nEjemplaresPrestados
	 */
	public int getnEjemplaresPrestados() {
		return nEjemplaresPrestados;
	}
	/**
	 * @param nEjemplaresPrestados the nEjemplaresPrestados to set
	 */
	public void setnEjemplaresPrestados(int nEjemplaresPrestados) {
		this.nEjemplaresPrestados = nEjemplaresPrestados;
	}
	
	public boolean prestarLibro() {
		boolean libroPrestado = false;
		if(nEjemplaresPrestados < nEjemplares) {
			nEjemplaresPrestados++;
			libroPrestado = true;
		}
		return libroPrestado;
	}
	
	public boolean devolverLibro() {
		boolean libroDevuelto = true;
		if(nEjemplaresPrestados == 0) {
			libroDevuelto = false;
		}
		else {
			nEjemplaresPrestados --;
		}
		return libroDevuelto;
	}
	@Override
	public String toString() {
		return "Libro [Titulo " + titulo + "\n Autor " + autor + "\n Número de ejemplares=" + nEjemplares
				+ "\n Ejemplares prestados=" + nEjemplaresPrestados + "]";
	}
	
	
}
