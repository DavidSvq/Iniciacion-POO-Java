/**
 * 
 */
package puerbasConArray_Y_ArrayList;

import java.util.Objects;

/**
 * 
 */
public class Tareas {
	private String descripcion;
	private boolean completada;
	/**
	 * @param descripcion
	 * @param completada
	 */
	public Tareas(String descripcion, boolean completada) {
		this.descripcion = descripcion;
		this.completada = completada;
	}
	/**
	 * 
	 */
	public Tareas() {
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the completada
	 */
	public boolean isCompletada() {
		return completada;
	}
	/**
	 * @param completada the completada to set
	 */
	public void setCompletada(boolean completada) {
		this.completada = completada;
	}
	@Override
	public String toString() {
		return "Tareas [descripcion=" + descripcion + ", completada=" + completada + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(completada, descripcion);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tareas other = (Tareas) obj;
		return completada == other.completada && Objects.equals(descripcion, other.descripcion);
	}
	
	
}
