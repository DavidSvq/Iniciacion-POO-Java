package ejerciciosInterfaces.ejercicio2;

public abstract class Window {
	private boolean abierta;
	
	public Window() {
	}

	public boolean isAbierta() {
		return abierta;
	}

	public void setAbierta(boolean abierta) {
		this.abierta = abierta;
	}
	
	public void open() {
		abierta = true;
	}
	public void close() {
		abierta = false;
	}
	
}
