package ejerciciosInterfaces.ejercicio5;

public class FechaErrorException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public FechaErrorException() {
	}

	public FechaErrorException(String mensaje) {
		super(mensaje);
	}
}
