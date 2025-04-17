package algoritmoEntorno;

import java.util.Scanner;

public class AlgoritmoEntornos {
	
	public static final int VALOR_CERO = 0;
	private static final int DIVISOR_LONGITUD = 2;
	private static final int DESCONTAR_PRIMERA_LINEA = 1;
	
	public static void main(String[] args) {
		Scanner tcld = new Scanner(System.in);
		int espaciosIniciales;
		int longitudTexto;
		int lineasEnBlanco;
		int diferenciasEntreLineas;
		System.out.println("Indica los espacios iniciales(Ejemplo 3): ");
		espaciosIniciales = tcld.nextInt();
		//espaciosIniciales = 3;
		System.out.println("Indica la longitud del texto: ");
		longitudTexto = tcld.nextInt();
		//longitudTexto = 20;
		System.out.println("Indica las líneas en blanco(Ejemplo 3): ");
		lineasEnBlanco = tcld.nextInt();
		//lineasEnBlanco = 3;
		System.out.println("Indica la diferencia entre líneas(Ejemplo 2) : ");
		diferenciasEntreLineas = tcld.nextInt();
		//diferenciasEntreLineas = 2;
		int auxiliarLongitud = longitudTexto/DIVISOR_LONGITUD;
		int vuelta = diferenciasEntreLineas;
		int espaciosTotales = 0;
		int auxiliarEspaciosIniciales = espaciosIniciales;
		int auxiliarLineasEnBlanco = lineasEnBlanco;
		while(auxiliarLongitud > VALOR_CERO) {
			if(auxiliarLineasEnBlanco > VALOR_CERO) {
				for (int i = VALOR_CERO; i < longitudTexto; i++) {
					if(auxiliarEspaciosIniciales > i) {
						System.out.print(" ");
					}
					else {
						System.out.print("1");
					}
				}
			System.out.print("\n");
			auxiliarEspaciosIniciales = auxiliarEspaciosIniciales + diferenciasEntreLineas;
			auxiliarLongitud --;
			auxiliarLineasEnBlanco --;
			}
			else {
				espaciosTotales = espaciosIniciales + (diferenciasEntreLineas * (lineasEnBlanco - DESCONTAR_PRIMERA_LINEA));
				for (int i = VALOR_CERO; i < longitudTexto; i++) {
					if(vuelta > i) {
						System.out.print("1");
					
					}
					else if(espaciosTotales > VALOR_CERO) {
						System.out.print(" ");
						espaciosTotales --;
					}
					else System.out.print("1");
				}
				System.out.print("\n");
				auxiliarLongitud --;
				auxiliarLineasEnBlanco --;
				vuelta = vuelta + diferenciasEntreLineas;
			}
		}
		tcld.close();
	}
}
