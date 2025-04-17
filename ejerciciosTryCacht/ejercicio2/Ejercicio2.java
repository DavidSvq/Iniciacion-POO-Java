package ejerciciosTryCacht.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	/**
	 * Escribe un programa que juegue con el usuario a adivinar un número. El
		ordenador debe generar un número entre 1 y 500, y el usuario tiene que
		intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, el
		ordenador debe decirle al usuario si el número que tiene que adivinar es mayor
		o menor que el que ha introducido el usuario. Cuando consiga adivinarlo, debe
		indicárselo e imprimir en pantalla el número de veces que el usuario ha
		intentado adivinar el número. Si el usuario introduce algo que no es un número,
		debe indicarlo en pantalla, y contarlo como un intento.
	 * 
	 */
	public static void main(String[] args) {
		Scanner tcld = new Scanner(System.in);
		int numUsuario = 0;
		int intentos = 0;
		int aleatorio = 0;
		boolean acertado = false;
		aleatorio = (int)(Math.random()*499) + 1;
		do {
			try {
				System.out.println("Introduce el número");
				numUsuario = tcld.nextInt();
				if(numUsuario == aleatorio) {
					acertado = true;
				}
				else if(numUsuario > aleatorio) {
					System.out.println("El número es menor.");
				}
				else {
					System.out.println("El número es mayor.");
				}
				intentos ++;
			}
			catch(InputMismatchException e){
				System.out.println("Error, solo se aceptan números enteros.");
				intentos ++;
				numUsuario = 0;
				tcld.nextLine();
			}
		}while(!acertado);
		
		System.out.println("Acertaste, lo hiciste en " + intentos + " intentos.");
		tcld.close();
		
	}

}
