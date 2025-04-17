package ejerciciosTryCacht;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcion2 {
    static Scanner sc = new Scanner(System.in);
    
	public static void main(String args[]) {
	      double n;
	        int posicion;
	        String cadena ;
	        double[] valores = {9.83, 4.5, -3.06, 0.06, 2.52, -11.3, 7.60, 3.00, -30.4, 105.2};                       

	        System.out.println("Contenido del array antes de modificar:");
	        for (int i = 0; i < valores.length; i++) {
	            System.out.printf("%.2f ", valores[i]);
	        }

	        System.out.print("\n\nIntroduce la posici�n del array a modificar: ");
	        cadena = sc.nextLine();
	        try {
	        	//Aquí se puede lanzar NumberFormatException
	        	posicion = Integer.parseInt(cadena);

		        System.out.print("\nIntroduce el nuevo valor de la posici�n " + posicion + ": ");     
		        
		        //Aquí se puede lanzar InputMismatchException
		        n = sc.nextDouble();
		        
		        //Aquí se puede lanzar ArrayIndexOutOfBoundsException
		        valores[posicion] = n;
		        
		        System.out.println("\nPosici�n a modificar " + posicion);
		        System.out.println("Nuevo valor: " + n);
		        System.out.println("Contenido del array modificado:");
		        for (int i = 0; i < valores.length; i++) {
		            System.out.printf("%.2f ", valores[i]);
		        }
	        }
	        catch(ArrayIndexOutOfBoundsException e) {
	        	System.out.println("Error, posición del array inexistente");
	        }
	        catch(InputMismatchException e2) {
	        	System.out.println("Error, entrada no válida, revise que introduce un número, o si es decimal que lo separa con una coma");
	        }
	        catch(NumberFormatException e3) {
	        	System.out.println("Error, entrada no válida, revise que introduce un número entero.");
	        }
	}
}
