package herencia;

import java.util.Random;

public class Paquete {
	private int idPaquete;
	private String destino;
	private String origen;
	private double costeEnvio;
	/**
	 * @param destino
	 * @param origen
	 */
	public Paquete(String destino, String origen) {
		this.destino = destino;
		this.origen = origen;
		Random rd = new Random();
		idPaquete = rd.nextInt(5000001);
		costeEnvio = 0;
	}
	
	/**
	 * @return the destino
	 */
	public String getDestino() {
		return destino;
	}
	
	/**
	 * @param destino the destino to set
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}
	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}
	
	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	/**
	 * @return the costeEnvio
	 */
	public double getCosteEnvio() {
		return costeEnvio;
	}
	/**
	 * @param costeEnvio the costeEnvio to set
	 */
	public void setCosteEnvio(double costeEnvio) {
		this.costeEnvio = costeEnvio;
	}
	/**
	 * @return the idPaquete
	 */
	public int getIdPaquete() {
		return idPaquete;
	}

	@Override
	public String toString() {
		return "Paquete [idPaquete=" + idPaquete + ", destino=" + destino + ", origen=" + origen + ", costeEnvio="
				+ costeEnvio + "]";
	}
	
	public String enviar() {
		
		if (costeEnvio > 0 ) return "Todo correcto, procedemos al envío";
		
		else return "Error";
	}
	
	public void calcularCoste() {
		System.out.println("No hay suficientes datos.");
	}
}
