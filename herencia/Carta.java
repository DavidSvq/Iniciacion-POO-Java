package herencia;

public class Carta extends Paquete {

	private boolean sello;
	private String mensaje;
	
	public Carta(String destino, String origen) {
		super(destino, origen);
		sello = false;
		mensaje = null;
	}

	public boolean isSello() {
		return sello;
	}

	public void setSello(boolean sello) {
		this.sello = sello;
	}

	public String getMensaje() {
		return mensaje;
	}

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
		boolean promocion = false;
		if(nLetras < mensaje.length()) {
			promocion = true;
		}
		else if(sello) {
			setCosteEnvio(0.05);
			promocion = false;
		}
		return promocion;
	}

	@Override
	public String toString() {
		return "Carta [sello=" + sello + ", mensaje=" + mensaje + ", toString()=" + super.toString() + "]";
	}
	
	
}
