package ejerciciosInterfaces.ejercicio1;

public class LibroBiclioteca extends Libro {
	private boolean prestado;
	
	public LibroBiclioteca(int codigo, String titulo, int fechaPublicacion) {
		super(codigo, titulo, fechaPublicacion);
		prestado = false;
	}
	
	
	public boolean isPrestado() {
		return prestado;
	}


	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}


	@Override
	public String toString() {
		return super.toString() + "Prestado " + prestado + "\n";
	}

	@Override
	public void prestar() {
		prestado = true;

	}

	@Override
	public void devolver() {
		prestado = false;

	}

}
