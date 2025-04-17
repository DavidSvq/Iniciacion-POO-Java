package herencia;

import java.util.ArrayList;
import java.util.Scanner;

public class CartaCertificada extends Carta {

	public CartaCertificada(String destino, String origen) {
		super(destino, origen);

	}

	@Override
	public String toString() {
		return "CartaCertificada [isSello()=" + isSello() + ", getDestino()=" + getDestino() + ", getOrigen()="
				+ getOrigen() + ", getCosteEnvio()=" + getCosteEnvio() + ", getIdPaquete()=" + getIdPaquete() + "]";
	}

	public boolean desproteger() {
		boolean resul_ok = false;
		String respuesta;
		Scanner tcld = new Scanner(System.in);
		
		ArrayList<String> preguntas = new ArrayList<>();
		ArrayList<String> soluciones = new ArrayList<>();
		
		preguntas.add("2 + 2");
		soluciones.add("4");
		
		preguntas.add("Todo");
		soluciones.add("Nada");
		
		preguntas.add("De donde?");
		soluciones.add("Sevilla");
		
		int indice2;
		int indice3;
		int indice = (int) (Math.random() * 3);
		do {
			indice2 = (int) (Math.random() * 3);
		}while(indice == indice2);
		do {
			indice3 = (int) (Math.random() * 3);
		}while(indice3 == indice || indice3 == indice2);
		
		System.out.println(preguntas.get(indice));
		respuesta = tcld.nextLine();
		if(soluciones.get(indice).equals(respuesta)) {
			System.out.println(preguntas.get(indice2));
			respuesta = tcld.nextLine();
			if(soluciones.get(indice2).equals(respuesta)) {
				System.out.println(preguntas.get(indice3));
				respuesta = tcld.nextLine();
				if(soluciones.get(indice3).equals(respuesta)) {
					resul_ok = true;
				}
			}
		}
		return resul_ok;
	}
	
	public String leerMensaje() {
		String mensajeAux = "";
		if (getMensaje() == null) {
			mensajeAux = "Todavia no hay mensaje";
		}
		else {
			if(desproteger()) {
				mensajeAux = getMensaje();
			}
			else {
				String auxMensaje = getMensaje();
				setMensaje(reemplazarLetra(getMensaje(), "a", "p"));
				setMensaje(reemplazarLetra(getMensaje(), "o", "m"));
				setMensaje(reemplazarLetra(getMensaje(), "e", "d"));
				mensajeAux = getMensaje();
				setMensaje(auxMensaje);
			}
		}
		
		return mensajeAux;
	}
	
	public void calcularCoste() {
		setCosteEnvio(1.5);
	}
	
	private String reemplazarLetra(String  mensaje, String le1, String le2) {
		return mensaje.replaceAll(le1,le2);
		
	}
	
}
