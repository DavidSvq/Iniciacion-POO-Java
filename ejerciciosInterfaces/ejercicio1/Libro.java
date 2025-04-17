package ejerciciosInterfaces.ejercicio1;

public abstract class Libro implements Prestado {

	private int codigo;
	private String titulo;
	private int fechaPublicacion;
	
	public Libro(int codigo, String titulo, int fechaPublicacion) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.fechaPublicacion = fechaPublicacion;
	}

	
	public int getCodido() {
		return codigo;
	}


	public void setCodido(int codigo) {
		this.codigo = codigo;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getFechaPublicacion() {
		return fechaPublicacion;
	}


	public void setFechaPublicacion(int fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	
	@Override
	public String toString() {
		return "Codidgo " + codigo + "\nTitulo " + titulo + "\nAño Publicacion " + fechaPublicacion + "\n";
	}

	@Override
	public void prestar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub

	}

	

}
