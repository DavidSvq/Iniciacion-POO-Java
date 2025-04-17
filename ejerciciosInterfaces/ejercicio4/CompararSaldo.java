package ejerciciosInterfaces.ejercicio4;

import java.util.Comparator;

public class CompararSaldo implements Comparator<Cliente> {

	@Override
	public int compare(Cliente o1, Cliente o2) {
		int salida =(int) (o1.getSaldo() - o2.getSaldo());
		return salida;
	}

}
