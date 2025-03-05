package ejercicioClasePOO3.ejercicio4;

import java.util.ArrayList;

public class CdMusical {
	private ArrayList<Cancion> listado;
	private int posicionCanciones;
	/**
	 * @param posicionCanciones
	 */
	public CdMusical(int posicionCanciones) {
		this.posicionCanciones = posicionCanciones;
		listado = new ArrayList<>();
	}
	/**
	 * @return the listado
	 */
	public ArrayList<Cancion> getListado() {
		return listado;
	}
	/**
	 * @param listado the listado to set
	 */
	public void setListado(ArrayList<Cancion> listado) {
		this.listado = listado;
	}
	/**
	 * @return the posicionCanciones
	 */
	public int getPosicionCanciones() {
		return posicionCanciones;
	}
	/**
	 * @param posicionCanciones the posicionCanciones to set
	 */
	public void setPosicionCanciones(int posicionCanciones) {
		this.posicionCanciones = posicionCanciones;
	}
	@Override
	public String toString() {
		return "CdMusical [listado=" + listado + ", posicionCanciones=" + posicionCanciones + "]";
	}
	//Method give song
	public Cancion darCancion(int posicion) {
		return listado.get(posicion);
	}
	//Method record song
	public void grabarCancion(int posicion, Cancion cancion) {
		listado.remove(posicion);
		listado.add(posicion, cancion);
	}
	//Method add song
	public void agregarCancion(Cancion cancion) {
		listado.add(cancion);
		posicionCanciones ++;
	}
	//Method remove song
	public void eliminarCancion(int poosicion) {
		listado.remove(poosicion);
		posicionCanciones --;
	}
}

