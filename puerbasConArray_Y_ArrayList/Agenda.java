/**
 * 
 */
package puerbasConArray_Y_ArrayList;

import java.util.ArrayList;
import java.util.Objects;

import org.junit.contrib.java.lang.system.SystemOutRule;

/**
 * 
 */
public class Agenda {
	private ArrayList<Tareas> tareas;

	/**
	 * @param tareas
	 */
	public Agenda() {
		this.tareas = new ArrayList<>();
	}

	/**
	 * @return the tareas
	 */
	public ArrayList<Tareas> getTareas() {
		return tareas;
	}

	/**
	 * @param tareas the tareas to set
	 */
	public void setTareas(ArrayList<Tareas> tareas) {
		this.tareas = tareas;
	}

	@Override
	public String toString() {
		return "Agenda [tareas=" + tareas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(tareas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		return Objects.equals(tareas, other.tareas);
	}
	
	public void agregarTarea(Tareas tarea) {
		tareas.add(tarea);
	}
	public void borrarTarea (Tareas tarea) {
		tareas.remove(tarea);
	}
	public Tareas buscarTarea(Tareas tarea) {
		for(Tareas tareaAuxiliar : tareas) {
			if (tareaAuxiliar == tarea) {
				return tarea;
			}
			else {
				System.out.println("Tarea inexistente");
			}
		}
		return null;
	}
	
	
}
