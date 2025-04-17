package ejerciciosInterfaces.ejercicio2;

public abstract class Door {
	private boolean abierto;
	
	public Door() {
	}
	
	public boolean isAbierto() {
		return abierto;
	}

	public void setAbierto(boolean abierto) {
		this.abierto = abierto;
	}

	public void open() {
		abierto = true;
	}
	public void close() {
		abierto = false;
	}
}
