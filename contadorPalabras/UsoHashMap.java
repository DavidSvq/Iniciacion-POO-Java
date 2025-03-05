package contadorPalabras;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UsoHashMap {

	public static void main(String[] args) {
		Scanner tcld = new Scanner(System.in);
		String texto = tcld.nextLine();
		tcld.close();
		LinkedHashMap<String, Integer> palabraRepeticion = new LinkedHashMap<>();
		Scanner tcldp = new Scanner(texto);
		while(tcldp.hasNext()) {
			String palabra = tcldp.next();
			palabra = palabra.toLowerCase();
			int nVeces = 1;
			if(palabraRepeticion.containsKey(palabra)) palabraRepeticion.put(palabra,palabraRepeticion.get(palabra) + 1);
			else palabraRepeticion.put(palabra,nVeces);
		}
		tcldp.close();
		for(Map.Entry<String, Integer> entrada : palabraRepeticion.entrySet()) {
			System.out.println("Palabra:" + entrada.getKey() + " Repetida: " + entrada.getValue());
		}
	}

}
