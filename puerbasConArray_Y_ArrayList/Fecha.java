package puerbasConArray_Y_ArrayList;

/**
 * Clase <h1>Fecha<h1>
 * Contiene la información del <b>día</b>, mes y año con el que se cree.
 * Tiene varios métodos para trabajar con la clase.
 * 
 *  @author david
 *  @since 23 (Se puede poner fecha) --> 20 02 2025
 *  @version 1.0.0 Primer número revisiones grandes, segundo número cambios menores y la 
 *	tercera son pequeñas correcciones.
 */
public class Fecha {
	/**
	 * Dia, guarda un valor entero entre [1, 28/29/30/31] dependiendo del mes. (Se pone toda la
	 * información relevante sobre el atributo).
	 */ 
	private int dia;
	
	/**
	 *  Mes
	 */
	private int mes;
	/**
	 * Anio
	 */
	private int anio;
	
	/**
	 * Construye el objeto fecha con los parámetros indicados.(Se expiclan con detalle los
	 * parámetros, además tb se añaden las excepciones)
	 * 
	 * @param anio 
	 * @param mes
	 * @param dia
	 * 
	 * @throws
	 */
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}
	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}
	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}
	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "[" + dia + "/" + mes + "/" + anio + "]";
	}
	/**
	 * Este método calcula si el año es bisiesto
	 * @return 
	 */
	public boolean esBisiesto(){
		boolean bisiesto = false;
		if (anio % 4 == 0) {
			if(anio % 100 == 0) {
				if(anio % 400 == 0) {
					bisiesto = true;
				}
				else {
					bisiesto = false;
				}
			}
			else {
				bisiesto = true;
			}
		}
		else {
			bisiesto = false;
		}
		return bisiesto;
	}
	
	public void pasarDia () {
		dia++;
		if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if(dia > 30) {
				dia = 1;
				mes ++;
			}
		}
		else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes ==8 ||  mes==10 || mes == 12 ) {
			if(dia > 31) {
				dia = 1;
				mes ++;
				if(mes > 12) {
					mes = 1;
					anio ++;
				}
			}
		}
		else if(mes == 2) {
			if(esBisiesto()) {
				if(dia > 29) {
					dia = 1;
					mes ++;
				}
			}
			else {
				if(dia > 28) {
					dia = 1;
					mes ++;
				}
			}
		}
	}
	public void pasarCantidadDias(int numeroDias) {
		while(numeroDias > 0) {
			pasarDia();
			numeroDias --;
		}
	}
	
	public void compararFecha(Fecha fecha) {
		if (this.dia == fecha.getDia()) {
			if(this.mes == fecha.getMes()) {
				if (this.anio == fecha.getAnio()) {
					System.out.println("La fecha coincide");
				}
			}
		}
		else {
			System.out.println("La fecha no coincide");
		}
	}
}
