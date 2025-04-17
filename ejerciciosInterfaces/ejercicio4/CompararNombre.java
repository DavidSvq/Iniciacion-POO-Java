package ejerciciosInterfaces.ejercicio4;

import java.util.Comparator;

public class CompararNombre implements Comparator<Cliente> {

	@Override
	public int compare(Cliente o1, Cliente o2) {
		int salida = o1.getNombre().compareTo(o2.getNombre());
		return salida;
	}

}
