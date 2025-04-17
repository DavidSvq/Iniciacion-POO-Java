package ejerciciosInterfaces.ejercicio7;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Double> numeros = new ArrayList<>();
		ArrayList<Double> susCuadrados = new ArrayList<>();
		ArrayList<Double> susInversos = new ArrayList<>();
		
	
		for (int i = 0; i < 20; i++) {
			double aleatorio = Math.random() * 199 + 1;
			aleatorio = Math.round(aleatorio * 100);
			aleatorio = aleatorio / 100;
			numeros.add(aleatorio);
		}
		
		System.out.println("Inicial");
		for (Double dou : numeros) {
			System.out.println(dou);
		}
		
		
		//Calcular Cuadrado
		susCuadrados = Principal.tablaFuncion(numeros, new CalcularCuadrado());
		
		System.out.println("Tras aplicar la función cuadrado");
		for (Double dou : susCuadrados) {
			System.out.println(dou);
		}
		
		//Calcular inverso
		susInversos = Principal.tablaFuncion(numeros, new CalcularInverso());
		
		System.out.println("Tras aplicar la función inverso");
		for (Double dou : susInversos) {
			System.out.println(dou);
		}
		
	}
	
	public static ArrayList<Double> tablaFuncion(ArrayList<Double> num, Funcion f) {
		ArrayList<Double> numerosPostFuncion = new ArrayList<>();
		for (Double dou : num) {
			dou = f.aplicar(dou);
			numerosPostFuncion.add(dou);
		}
		return numerosPostFuncion;
	}

}
