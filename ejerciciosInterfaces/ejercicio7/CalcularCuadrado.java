package ejerciciosInterfaces.ejercicio7;

public class CalcularCuadrado implements Funcion {

	@Override
	public double aplicar(double d) {
		double resultado = d * d;
		resultado = resultado  * 100;
		resultado = Math.round(resultado);
		resultado = resultado / 100;
		return resultado;
	}

}
