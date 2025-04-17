package transporteFesac;

public class Carta extends Paquete {
	private boolean sello;
	private String mensaje;
	
	public Carta(String destino, String origen) {
		super(destino, origen);
		sello = false;
		mensaje = "";
	}

	/**
	 * @return the sello
	 */
	public boolean isSello() {
		return sello;
	}

	/**
	 * @param sello the sello to set
	 */
	public void setSello(boolean sello) {
		this.sello = sello;
	}

	/**
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String leerMensaje() {
		return mensaje;
	}
	public void calcularCoste() {
		if(sello) setCosteEnvio(0.05);
	}
	public boolean calcularCoste(int nLetras) {
		if (nLetras < mensaje.length()) {
			setCosteEnvio(0.05);
			return false;
		}
		else return true;
	}

	@Override
	public String toString() {
		return super.toString() + "Carta [sello=" + sello + "]";
	}
	
}
