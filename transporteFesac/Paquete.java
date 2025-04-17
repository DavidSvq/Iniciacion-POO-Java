package transporteFesac;

import java.util.Random;

public class Paquete {
	private int id_paquete;
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
		id_paquete = rd.nextInt(5000000)+ 1;
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
	 * @return the id_paquete
	 */
	public int getId_paquete() {
		return id_paquete;
	}
	public String enviar() {
		if(costeEnvio > 0) return "Todo Correcto, procedemos al envio";
		else return "Error, no se puede enviar";
	}
	public void calcularCoste() {
		System.out.println("Datos insuficientes");
	}
	@Override
	public String toString() {
		return "Paquete [Id: " + id_paquete + "\n Destino: " + destino + "\t Origen: " + origen + "\n Coste de Envio: "
				+ costeEnvio + "]";
	}
}
