package ejerciciosInterfaces.ejercicio7;

public class CalcularInverso implements Funcion {

	@Override
	public double aplicar(double d) {
		double resultado = 1/d;
		//resultado = Math.round(resultado * 1000000)/1000000;
		resultado = resultado * 1000000;
		resultado = Math.round(resultado);
		resultado = resultado / 1000000;
		return resultado;
		//return 1 /d;
	}

}
