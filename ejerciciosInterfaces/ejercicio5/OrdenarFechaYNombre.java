package ejerciciosInterfaces.ejercicio5;

import java.util.Comparator;

public class OrdenarFechaYNombre implements Comparator<Socio> {

	@Override
	public int compare(Socio o1, Socio o2) {
		int salida = o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
		if( salida == 0) {
			salida = o1.getNombre().compareTo(o2.getNombre());
		}
		return salida;
	}

}
