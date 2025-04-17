package ejerciciosInterfaces.ejercicio4;

import java.util.Comparator;

public class CompararEdad implements Comparator<Cliente> {

	@Override
	public int compare(Cliente o1, Cliente o2) {
		int salida = o1.getEdad()-o2.getEdad();
		return salida;
	}

}
