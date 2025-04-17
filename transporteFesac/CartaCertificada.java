package transporteFesac;

import java.util.Scanner;

public class CartaCertificada extends Carta {

	public CartaCertificada(String destino, String origen) {
		super(destino, origen);
	}
	private boolean desproteger() {
		Scanner tcld = new Scanner(System.in);
		
		String preguntas[] = new String[3];
		String soluciones[] = new String[3];
		
		asignarPreguntas_y_Respuestas(preguntas, soluciones);
		
		int posicion = 0;
		int posicion1 = 0;
		int posicion2 = 0;
		boolean acertado = false;
		//int aciertos = 0;
		String respuesta = "";
		
		posicion = (int) (Math.random() * 3);
		
		while(posicion1 == posicion) posicion1 = (int) (Math.random() * 3);
		
		while(posicion2 == posicion1 || posicion2 == posicion) posicion2 = (int) (Math.random() * 3);
		
		System.out.println(preguntas[posicion]); 
		respuesta = tcld.nextLine();
		if (respuesta.equals(soluciones[posicion])) acertado = true;
		if(acertado) {
			acertado = false;
			System.out.println(preguntas[posicion1]);
			respuesta = tcld.nextLine();
			if (respuesta.equals(soluciones[posicion1])) acertado = true;
			if(acertado) {
				acertado = false;
				System.out.println(preguntas[posicion2]);
				respuesta = tcld.nextLine();
				if (respuesta.equals(soluciones[posicion2])) acertado = true;
			}
		}
		/*switch(posicion) {
		case 0:
			System.out.println(preguntas[0]);
			respuesta = tcld.nextLine();
			if (respuesta.equals(soluciones[0])) aciertos ++;
			System.out.println(preguntas[1]);
			respuesta = tcld.nextLine();
			if (respuesta.equals(soluciones[1])) aciertos ++;
			System.out.println(preguntas[2]);
			respuesta = tcld.nextLine();
			if (respuesta.equals(soluciones[2])) aciertos ++;
			break;
		case 1:
			System.out.println(preguntas[1]);
			respuesta = tcld.nextLine();
			if (respuesta.equals(soluciones[1])) aciertos ++;
			System.out.println(preguntas[2]);
			respuesta = tcld.nextLine();
			if (respuesta.equals(soluciones[2])) aciertos ++;
			System.out.println(preguntas[0]);
			respuesta = tcld.nextLine();
			if (respuesta.equals(soluciones[0])) aciertos ++;
			break;
		case 2:
			System.out.println(preguntas[2]);
			respuesta = tcld.nextLine();
			if (respuesta.equals(soluciones[2])) aciertos ++;
			System.out.println(preguntas[0]);
			respuesta = tcld.nextLine();
			if (respuesta.equals(soluciones[0])) aciertos ++;
			System.out.println(preguntas[1]);
			respuesta = tcld.nextLine();
			if (respuesta.equals(soluciones[1])) aciertos ++;
			break;
		}*/
		//if (aciertos == 3) return true;
		
		if (acertado) { 
			tcld.close();
			return true;
		}
		
		tcld.close();
		return false;
		
	}
	private void asignarPreguntas_y_Respuestas(String[] preg, String[] solu) {
				preg[0] = "Clavo clavito pabló un...?";
				solu[0] = "pablito";
				
				preg[1]="qué pablito pabló clavo...?";
				solu[1] = "clavito";
	
				preg[2] = "Andonde?";
				solu[2] = "en la pade";

	}
	public String leerMensaje() {
		String mensajeAuxiliar;
		if(getMensaje().isEmpty()) {
			mensajeAuxiliar = "Todavia no hay mensaje";
		}
		else {
			if(desproteger()) mensajeAuxiliar = getMensaje();
			else {
				setMensaje(reemplazarLetras("a", "p"));
				setMensaje(reemplazarLetras("o", "m"));
				setMensaje(reemplazarLetras("e", "d"));
				mensajeAuxiliar = getMensaje();
			}
		}
		return mensajeAuxiliar;
	}
	private String reemplazarLetras(String l1, String l2) {
		String texto = "";
		texto = getMensaje().replaceAll(l1, l2);
		return texto;
	}
	
	public void calcularCoste() {
		setCosteEnvio(1.5);
	}
	@Override
	public String toString() {
		return super.toString() + "Carta Certificada ";
	}
}
