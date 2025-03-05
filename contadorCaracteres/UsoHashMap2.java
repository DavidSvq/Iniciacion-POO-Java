package contadorCaracteres;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UsoHashMap2 {

	public static void main(String[] args) {
		Scanner tcld = new Scanner(System.in);
		String texto = tcld.nextLine().toLowerCase();
		tcld.close();
		LinkedHashMap<String, Integer> letraVeces = new LinkedHashMap<>();
		for(int i = 0; i < texto.length(); i++) {
			char letra = texto.charAt(i);
			String letraS = String.valueOf(letra);
			int nVeces = 1;
			if(letraVeces.containsKey((letraS))) letraVeces.put(letraS, letraVeces.get(letraS) +  1);
			else letraVeces.put(letraS, nVeces);
		}
		for(Map.Entry<String, Integer> entrada : letraVeces.entrySet()) {
			System.out.println("Caracter: " + entrada.getKey() + " Repeticiones: " + entrada.getValue());
		}
	}

}
