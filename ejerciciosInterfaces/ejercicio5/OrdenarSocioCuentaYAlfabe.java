package ejerciciosInterfaces.ejercicio5;

import java.util.Comparator;

public class OrdenarSocioCuentaYAlfabe implements Comparator<Socio> {

	@Override
	public int compare(Socio o1, Socio o2) {
		int salida = (int) (o1.getCuenta()-o2.getCuenta());
		if(salida == 0) {
			salida = o1.getNombre().compareTo(o2.getNombre());
		}
		return salida;
	}

}
