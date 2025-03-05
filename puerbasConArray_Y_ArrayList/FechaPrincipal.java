package puerbasConArray_Y_ArrayList;

public class FechaPrincipal {

	public static void main(String[] args) {
		Fecha fc = new Fecha(28, 02, 2000);
		Fecha fc2 = new Fecha(28, 02, 2001);
		Fecha fc3 = new Fecha(31, 12, 2024);
		Fecha fc4 = new Fecha(30, 04, 2024);
		fc.pasarDia();
		fc2.pasarDia();
		fc3.pasarDia();
		fc4.pasarDia();
		System.out.println(fc);
		System.out.println(fc2);
		System.out.println(fc3);
		System.out.println(fc4);
		
		
		final int NUMERO_DE_ALEATORIOS = 5;
		final int MAXIMOS_DIAS_MES = 31;
		final int MAXIMOS_MESES_ANIO = 12;
		final int ANIO_INICIO = 1582;
		final int ANIO_FINAL = 2050;
		final int RANGO_DE_ANIOS = ANIO_FINAL - ANIO_INICIO;
		Fecha fcA[] = new Fecha[NUMERO_DE_ALEATORIOS];
		
		for(int i = 0; i < fcA.length; i++) {
			 int dia = (int) (Math.random() * MAXIMOS_DIAS_MES) + 1;
			 int mes = (int) (Math.random() * MAXIMOS_MESES_ANIO) + 1;
			 int anio = (int) (Math.random() * (RANGO_DE_ANIOS +1)) + ANIO_INICIO;
			 fcA[i] = new Fecha(dia, mes, anio);
		}
		
		for(int i = 0; i < fcA.length; i++) {
			if(fcA[i].getMes() == 4 || fcA[i].getMes() == 6 || fcA[i].getMes() == 9 || fcA[i].getMes() == 11) {
				if(fcA[i].getDia() == 31) {
					fcA[i].setDia(30);
				}
			}
			else if (fcA[i].getMes() == 2) {
				if(!(fcA[i].esBisiesto())) {
					switch(fcA[i].getDia()) {
						case 29:
						case 30:
						case 31:
							fcA[i].setDia(28);
							break;
					}
				}
				else if(fcA[i].esBisiesto()) {
					switch(fcA[i].getDia()) {
						case 30:
						case 31:
							fcA[i].setDia(29);
							break;
					}
				}
				
				/*if(!(fcA[i].esBisiesto()) && (fcA[i].getDia() == 31 || fcA[i].getDia() == 30 || fcA[i].getDia() == 29)) {
					fcA[i].setDia(28);
				}
				else if((fcA[i].esBisiesto()) && (fcA[i].getDia() == 31 || fcA[i].getDia() == 30)) {
					fcA[i].setDia(29);
				}*/
			}
			String si_o_no = "";
			if(fcA[i].esBisiesto()) {
				si_o_no = "Si.";
			}
			else {
				si_o_no = "No.";
			}
			System.out.println((i + 1) + " " + fcA[i].toString() + " Año Bisiesto: " + si_o_no);
			fcA[i].pasarDia();
		}
		for(int i = 0; i < fcA.length; i++) {
			System.out.println("Nueva Fecha " + (i + 1) + ": " + fcA[i].getDia() + "/" + fcA[i].getMes() + "/" + fcA[i].getAnio());
		}
	}
	
}
