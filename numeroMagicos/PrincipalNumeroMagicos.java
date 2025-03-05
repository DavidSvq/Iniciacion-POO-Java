package numeroMagicos;

import java.util.Scanner;

public class PrincipalNumeroMagicos {

	public static void main(String[] args) {
		Scanner tcld = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int AuxiliarNumerosMagicos = NumerosMagicos.definirNumero(tcld.nextInt());
		NumerosMagicos.mostrarResultado(AuxiliarNumerosMagicos);
		System.out.println("Introduce el número que deseas:");
		System.out.println("Pulsa 1 para Perfectos");
		System.out.println("Pulsa 2 para Deficientes");
		System.out.println("Pulsa 3 para Abundantes");
		int opcion = tcld.nextInt();
		System.out.println("Introduce la cantidad de numeros a buscar:");
		int numeros_a_buscar = tcld.nextInt();
		NumerosMagicos.mostrarNumerosHasta(numeros_a_buscar, opcion);
		tcld.close();
	}

}
