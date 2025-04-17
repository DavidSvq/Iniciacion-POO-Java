package ejerciciosTryCacht.ejercicio1;

public class Ejercicio1 {
	/*
	 * Escribe un programa que genere un número aleatorio e indique si el número
		generado es par o impar. El programa utilizará para ello el lanzamiento de una
		excepción.
	 * */
	public static void main(String[] args) {
		int num = (int) (Math.random()*5000) + 1;
		try {
			if(num%2 == 0) {
				throw new ParException("Número Par");
			}
			else {
				throw new ImparException("Número Impar");
			}
		}
		catch(ParException e){
			System.out.println("El " + num + " es " + e.getMessage());
		}
		catch(ImparException e1){
			System.out.println("El " + num + " es " + e1.getMessage());
		}

	}

}
