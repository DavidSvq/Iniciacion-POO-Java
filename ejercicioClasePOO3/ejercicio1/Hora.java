package ejercicioClasePOO3.ejercicio1;

import java.text.DecimalFormat;

public class Hora {
	private int hora;
	private int minuto;
	private int segundo;
	/**
	 * @param hora
	 * @param minuto
	 * @param segundo
	 */
	public Hora(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	/**
	 * @return the hora
	 */
	public int getHora() {
		return hora;
	}
	/**
	 * @param hora the hora to set
	 */
	public void setHora(int hora) {
		this.hora = hora;
	}
	/**
	 * @return the minuto
	 */
	public int getMinuto() {
		return minuto;
	}
	/**
	 * @param minuto the minuto to set
	 */
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	/**
	 * @return the segundo
	 */
	public int getSegundo() {
		return segundo;
	}
	/**
	 * @param segundo the segundo to set
	 */
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	public void pasarSegundo() {
		this.segundo++;
		if(this.segundo > 59) {
			this.segundo = 0;
			pasarMinuto();
		}
		
	}
	public void pasarMinuto() {
		this.minuto++;
		if(this.minuto > 59) {
			this.minuto = 0;
			pasarHora();
		}
	}
	public void pasarHora() {
		this.hora++;
		if(this.hora > 23) {
			this.hora = 0;
		}
	}
	public void pasar_N_segundos(int nSegundos) {
		while(nSegundos > 0) {
			pasarSegundo();
		
			System.out.println(toString());
			nSegundos --;
		}
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("00");
		String horaFormateada = df.format(hora);
		String minutoFormateado = df.format(minuto);
		String segundoFormateado = df.format(segundo);
		
		/*DecimalFormat dfh = new DecimalFormat("00h");
		DecimalFormat dfm = new DecimalFormat("00m");
		DecimalFormat dfs = new DecimalFormat("00s");
		String horaFormateada = dfh.format(hora);
		String minutoFormateado = dfm.format(minuto);
		String segundoFormateado = dfs.format(segundo);*/
		
		/*Utilizando String.format
		String horaFormateada = String.format("%02d", hora);
		String minutoFormateado = String.format("%02d", minuto);
		String segundoFormateado = String.format("%02d", segundo);*/
		return "Hora [" + horaFormateada + ":" + minutoFormateado + ":" + segundoFormateado + "]";
	}
	
}
