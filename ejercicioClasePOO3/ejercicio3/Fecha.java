package ejercicioClasePOO3.ejercicio3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Fecha {
	private final int ANIO_DE_INICIO = 1900;
	private final int ANIO_DE_FIN = 2050;
	private final int MAXIMO_MESES_AÑO = 12;
	private final int MAXIMO_DIAS_MES = 31;
	private final int INICIO_PARA_MES_Y_DIA = 1;
	private int dia;
	private int mes;
	private int anio;
	/**
	 * 
	 */
	public Fecha() {
		resetFecha();
	}
	/**
	 * @param dia
	 * @param mes
	 * @param anio
	 */
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}
	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}
	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}
	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	//Methods to display the date
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("00");
		String mesFormateado = df.format(mes);
		String diaFormateado = String.format("%02d", dia);
		return "Fecha ["+ diaDeLaSemana()+ " " +  diaFormateado + "-" + mesFormateado + "-" + anio + "]";
	}
	//Short
	public void mostrarFechaCorta() {
		DecimalFormat df = new DecimalFormat("00");
		String mesFormateado = df.format(mes);
		String diaFormateado = df.format(dia);
		System.out.println(diaFormateado + "-" + mesFormateado + "-" + anio);
	}
	//Long
	public void mostrarFechaLarga() {
		DecimalFormat df = new DecimalFormat("00");
		String diaFormateado = df.format(dia);
		System.out.println(diaDeLaSemana() + ", " +  diaFormateado + " de " + asignarNombreAlMes(mes - 1) + " del " + anio);
	}
	
	//Sub methods to name the month
	private String asignarNombreAlMes(int mes_a_nombrar) {
		ArrayList<String> nombreMeses = new ArrayList<>();
		nombreMeses.add("Enero");
		nombreMeses.add("Febrero");
		nombreMeses.add("Marzo");
		nombreMeses.add("Abril");
		nombreMeses.add("Mayo");
		nombreMeses.add("Junio");
		nombreMeses.add("Julio");
		nombreMeses.add("Agosto");
		nombreMeses.add("Septiembre");
		nombreMeses.add("Octubre");
		nombreMeses.add("Noviembre");
		nombreMeses.add("Diciembre");
		return nombreMeses.get(mes_a_nombrar);
	}
	//Read method
	public void leer() {
		do {
			System.out.println("Introduce un año (1900-2050): ");
			anio = pedirPorTeclado(ANIO_DE_INICIO, ANIO_DE_FIN);
			System.out.println("Introduce un mes (1-12): ");
			mes = pedirPorTeclado(INICIO_PARA_MES_Y_DIA, MAXIMO_MESES_AÑO);
			System.out.println("Introduce un dia (1-31): ");
			dia = pedirPorTeclado(INICIO_PARA_MES_Y_DIA, MAXIMO_DIAS_MES);
			if(!comprobarDiasDelMes()) System.out.println("Fecha erronea, compruebe la cantidad de dias del mes");
		}while(!comprobarDiasDelMes());
	}
	
	//Request by keyboard sub-method
	private int pedirPorTeclado(int desdeNumero, int hastaNumero) {
		Scanner tcld = new Scanner(System.in);
		int atributoFecha;
		do {
			atributoFecha = tcld.nextInt();
			if (atributoFecha < desdeNumero || atributoFecha > hastaNumero) {
				System.out.println("Error, el valor introducido no está en el rango permitido. Prueba de nuevo");
			}
		} while (atributoFecha < desdeNumero || atributoFecha > hastaNumero);
		tcld.close();
		return atributoFecha;
	}
	
	//Sub method to validate the days
	private boolean comprobarDiasDelMes() {
		boolean diaMesCorrecto = false;
		switch(mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			if(dia <= MAXIMO_DIAS_MES && dia >= INICIO_PARA_MES_Y_DIA) {
				diaMesCorrecto = true;
			}
			break;
		case 4, 6, 9, 11:
			if(dia <= (MAXIMO_DIAS_MES - 1) && dia >= INICIO_PARA_MES_Y_DIA) {
				diaMesCorrecto = true;
			}
			break;
		case 2:
			if(esBisiesto()) {
				if(dia <= (MAXIMO_DIAS_MES - 2) && dia >= INICIO_PARA_MES_Y_DIA) {
					diaMesCorrecto = true;
				}
			}
			else {
				if(dia <= (MAXIMO_DIAS_MES - 3) && dia >= INICIO_PARA_MES_Y_DIA) {
					diaMesCorrecto = true;
				}
			}
			break;
		}
		return diaMesCorrecto;
	}
	//Method is leap
	public boolean esBisiesto(){
		boolean bisiesto = false;
		if(anio % 4 == 0) 
		{
			if(anio % 100 == 0) 
			{
				if(anio % 400 == 0) 
				{
					bisiesto = true;
				}
				else 
				{
					bisiesto = false;
				}
			}
			else {
				bisiesto = true;
			}
		}
		else {
			bisiesto = false;
		}
		return bisiesto;
	}
	//Overload method is leap
	public boolean esBisiesto(int anioInicial){
		boolean bisiesto = false;
		if(anioInicial % 4 == 0) 
		{
			if(anioInicial % 100 == 0) 
			{
				if(anioInicial % 400 == 0) 
				{
					bisiesto = true;
				}
				else 
				{
					bisiesto = false;
				}
			}
			else {
				bisiesto = true;
			}
		}
		else {
			bisiesto = false;
		}
		return bisiesto;
	}
	
	//Method to check dates within range and correct them
	public void comprobar_y_CorregirFechaRangoValido() {
		if (anio < ANIO_DE_INICIO || anio > ANIO_DE_FIN) {
			resetFecha();
			System.out.println("Fecha incorrecta. Reseteada.");
		}
		else {
			System.out.println("Fecha correcta dentro del rango establecido");
	
		}
	}
	//Sub method date reset
	private void resetFecha() {
		dia = INICIO_PARA_MES_Y_DIA;
		mes = INICIO_PARA_MES_Y_DIA;
		anio = ANIO_DE_INICIO;
	}
	//Method days passed
	public int diasTranscurridos() {
		Fecha fechaActual = new Fecha (this.dia, this.mes, this.anio);
		Fecha fechaInicial = new Fecha (INICIO_PARA_MES_Y_DIA, INICIO_PARA_MES_Y_DIA, ANIO_DE_INICIO);
		int contadorDias = 0;
		while(!fechaActual.fechasIguales(fechaInicial)) {
			contadorDias ++;
			fechaActual.pasarDia();
		}
		return contadorDias;
	}
	//Method is date equals
	private boolean fechasIguales(Fecha fechaAuxiliar) {
		return this.anio == fechaAuxiliar.anio && this.mes == fechaAuxiliar.mes && this.dia == fechaAuxiliar.dia;
	}
	//Overload method days passed
	public int diasTranscurridos(Fecha fechaAuxiliar) {
		Fecha fechaActual = new Fecha (this.dia, this.mes, this.anio);
		int contadorDias = 0;
		if (fechaActual.fechaAnterior(fechaAuxiliar)) {
			while(!fechaActual.fechasIguales(fechaAuxiliar)) {
				contadorDias ++;
				fechaActual.pasarDia();
			}
		}
		else if (fechaAuxiliar.fechaAnterior(fechaActual)) {
			while(!fechaActual.fechasIguales(fechaAuxiliar)) {
				contadorDias ++;
				fechaAuxiliar.pasarDia();
			}
		}
		return contadorDias;
	}
	//Method check date old
	private boolean fechaAnterior(Fecha fechaAuxiliar) {
		boolean esAnterior = false;
		if (this.anio < fechaAuxiliar.anio) esAnterior = true;
		else if (this.anio == fechaAuxiliar.anio) {
			if (this.mes < fechaAuxiliar.mes) esAnterior = true;
			else if (this.mes == fechaAuxiliar.mes) {
				if (this.dia < fechaAuxiliar.dia) esAnterior = true;
			}
		}
		return esAnterior;
	}
	
	//Method names of weeks
	public String diaDeLaSemana() {
		ArrayList<String> dSemana = new ArrayList<>();
		dSemana.add("Domingo");
		dSemana.add("Lunes");
		dSemana.add("Martes");
		dSemana.add("Miercoles");
		dSemana.add("Jueves");
		dSemana.add("Viernes");
		dSemana.add("Sabado");
		int ciclosDeSemanas = diasTranscurridos() / 7;
		int restoCicloSemanas = diasTranscurridos() - (ciclosDeSemanas * 7);
		String diaDeLaSemana = "";
		switch(restoCicloSemanas) {
			case 0: 
				diaDeLaSemana = dSemana.get(0);
				break;
			case 1: 
				diaDeLaSemana = dSemana.get(1);
				break;
			case 2:
				diaDeLaSemana = dSemana.get(2);
				break;
			case 3:
				diaDeLaSemana = dSemana.get(3);
				break;
			case 4:
				diaDeLaSemana = dSemana.get(4);
				break;
			case 5:
				diaDeLaSemana = dSemana.get(5);
				break;
			case 6: 
				diaDeLaSemana = dSemana.get(6);
				break;
		}
		return diaDeLaSemana;
	}
	
	//Method spend day
	public void pasarDia () {
		dia++;
		if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if(dia > 30) {
				dia = 1;
				mes ++;
			}
		}
		else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes ==8 ||  mes==10 || mes == 12 ) {
			if(dia > 31) {
				dia = 1;
				mes ++;
				if(mes > 12) {
					mes = 1;
					anio ++;
				}
			}
		}
		else if(mes == 2) {
			if(esBisiesto()) {
				if(dia > 29) {
					dia = 1;
					mes ++;
				}
			}
			else {
				if(dia > 28) {
					dia = 1;
					mes ++;
				}
			}
		}
	}
	//Method return previous day
	public void volverDia() {
		dia --;
		if(mes == 5 || mes == 7 || mes == 10 || mes == 12) {
			if(dia == 0) {
				dia = 30;
				mes --;
			}
		}
		else if(mes == 2 || mes == 4 || mes == 6 || mes == 8 || mes ==9 ||  mes==11 || mes == 1 ) {
			if(dia == 0) {
				dia = 31;
				mes --;
				if(mes == 0) {
					mes = 12;
					anio --;
				}
			}
		}
		else if(mes == 3) {
			if(esBisiesto()) {
				if(dia == 0) {
					dia = 29;
					mes --;
				}
			}
			else {
				if(dia == 0) {
					dia = 28;
					mes --;
				}
			}
		}
	}
	
	//Method
	public void pasarNumeroDeDiasDesdeFechaInicio(int nDias) {
		resetFecha();
		while(nDias > 0) {
			pasarDia();
			nDias --;
		}
	}
}
