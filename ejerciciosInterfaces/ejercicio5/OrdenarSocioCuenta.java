package ejerciciosInterfaces.ejercicio5;

import java.util.Comparator;

public class OrdenarSocioCuenta implements Comparator<Socio> {

	@Override
	public int compare(Socio o1, Socio o2) {
		int salida = (int) (o1.getCuenta() - o2.getCuenta());
		return salida;
	}

}
