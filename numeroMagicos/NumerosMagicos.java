package numeroMagicos;

public class NumerosMagicos {
	public static int definirNumero(int numero) {
		int suma = 1;
		for(int i = 2; i < numero; i++) {
			if(numero%i == 0) {
				suma += i;
			}
		}
		return comprobarResultado(numero, suma);
	}
	private static int comprobarResultado(int numero, int suma) {
		int tipoDeNumero;
		if (suma == numero) {
			tipoDeNumero = 1;
		}
		else if (suma < numero) {
			tipoDeNumero = 2;
		}
		else {
			tipoDeNumero = 3;
		}
		return tipoDeNumero;
	}
	public static void mostrarResultado(int tipoNumero) {
		switch(tipoNumero) {
		case 1:
			System.out.println("Número perfecto");
			break;
		case 2:
			System.out.println("Número deficiente");
			break;
		case 3:
			System.out.println("Número Abundante");
			break;
		}
	}
	public static void mostrarNumerosHasta(int nVeces, int opcionElegida) {
		switch(opcionElegida) {
		case 1:
			MostrarSegunTipoDeNumero(1, nVeces, 1);
			break;
		case 2:
			MostrarSegunTipoDeNumero(1, nVeces, 2);
			break;
		case 3:
			MostrarSegunTipoDeNumero(1, nVeces, 3);
			break;
		}		
	}
	private static void MostrarSegunTipoDeNumero(int i, int nVeces, int tipoDeNumero) {
		while (nVeces > 0) {
			if (definirNumero(i) == tipoDeNumero) {
				System.out.println(i);
				nVeces --;
			}
			i ++;
		}
	}
}

