package ejercicioClasePOO3.ejercicio3;

public class PrincipalFecha {

	public static void main(String[] args) {
		Fecha f1 = new Fecha();
		Fecha f2 = new Fecha(12, 12, 1890);
		Fecha f3 = new Fecha(23, 2, 2025);
		Fecha f4 = new Fecha(12, 12, 2025);
		Fecha f5 = new Fecha(28, 2, 2025);
		
		
		System.out.println(f1);
		f1.leer();
		System.out.println(f1);
		f1.mostrarFechaCorta();
		f1.mostrarFechaLarga();
		f2.comprobar_y_CorregirFechaRangoValido();
		System.out.println(f2);
		System.out.println("Número de días transcurridos: " + f1.diasTranscurridos());
		System.out.println(f3);
		f3.pasarNumeroDeDiasDesdeFechaInicio(26000);
		System.out.println(f3);
		System.out.println("Días transcurridos: " + f3.diasTranscurridos(f4));
		System.out.println("Días transcurridos: " + f1.diasTranscurridos(f5));
		System.out.println("Días transcurridos: " + f1.diasTranscurridos(new Fecha(12, 8, 1998)));
		
	}

}
