package ejercicioClasePOO3.ejercicio1;

public class PrincipalHora {

	public static void main(String[] args) {
		Hora h1 = new Hora(12, 59, 50);
		Hora h2 = new Hora(23,59,50);
		
		System.out.println(h1);
		h1.pasarSegundo();
		System.out.println(h1);
		h1.pasar_N_segundos(13);
		h2.pasar_N_segundos(13);	
	}

}
