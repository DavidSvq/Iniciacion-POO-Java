package transporteFesac;

import java.util.Scanner;

public class PrincipalTransporte {

	public static void main(String[] args) {
		/*Paquete p1 = new Paquete("Sevilla", "Huelva");
		PaqueteGrande pG1 = new PaqueteGrande("Sevilla", "Huelva", 20, 40, 10);
		PaquetePequenio pQ1 = new PaquetePequenio("Sevilla", "Huelva");
		Carta c1 = new Carta("Sevilla", "Huelva");
		CartaCertificada cC1 = new CartaCertificada("Sevilla", "Huelva");*/
		Scanner tcld = new Scanner(System.in);
		
		//Show all data initial
		/*System.out.println(p1);
		System.out.println(pG1);
		System.out.println(pQ1);
		System.out.println(c1);
		System.out.println(cC1);
		
		//Use package class method
		p1.enviar();
		p1.calcularCoste();
		
		//Use big package class method
		pG1.calcularCoste();
		System.out.println("Coste de envío " + pG1.getCosteEnvio());
		pG1.setFragil(true);
		pG1.calcularCoste();
		System.out.println("Coste de envío mas frágil " + pG1.getCosteEnvio());
		pG1.calcularCoste("DES10");
		System.out.println("Coste de envío con 10 % de descuento " + pG1.getCosteEnvio());
		pG1.calcularCoste("DES25");
		System.out.println("Coste de envío con 25 % de descuento " + pG1.getCosteEnvio());
		pG1.calcularCoste("Sin rebaja");
		System.out.println("Coste de envío sin descuento " + pG1.getCosteEnvio());
		
		//Use big package class method
		//Add weight small package
		pQ1.setPeso(3);
		pQ1.calcularCoste();
		System.out.println(pQ1);
		
		//Use letter class method
		System.out.println(c1.enviar());
		c1.calcularCoste();
		c1.setMensaje("Este es un mensaje de prueba");
		System.out.println(c1.leerMensaje());
		c1.calcularCoste(8);
		System.out.println(c1.getCosteEnvio());
		c1.calcularCoste(26);
		System.out.println(c1.getCosteEnvio());
		cC1.setMensaje("esto es una prueba para enviar un mensaje");
		cC1.calcularCoste();
		System.out.println(cC1.getCosteEnvio());
		System.out.println(cC1.leerMensaje());
		cC1.setSello(true);
		System.out.println(cC1);*/
		
		Paquete paq[] = new Paquete[5];
		PaquetePequenio paqP[] = new PaquetePequenio[5];
		Carta c[] = new Carta[5];
		
		int opcion = 0;
		int contadorPaq = 0;
		int contadorPaqP = 0;
		int contadorCarta = 0;
		do {
			System.out.println("Introduce 1 opcion: ");
			System.out.println("Pulsa 1 para añadir un paquete");
			System.out.println("Pulsa 2 para añadir un paquete pequeño");
			System.out.println("Pulsa 3 para añadir un carta");
			System.out.println("Pulsa 4 para listar todos");
			System.out.println("Pulsa 5 para listar uno");
			System.out.println("Pulsa 0 para salir");
			opcion = tcld.nextInt();
			if(opcion == 1) {
				paq[contadorPaq] = new Paquete("Sevilla", "Madrid");
				contadorPaq ++;
			}
			if (opcion == 2) {
				paqP[contadorPaqP] = new PaquetePequenio("Sevilla", "Madrid");
				contadorPaqP ++;
			}
			if (opcion == 3) {
				c[contadorCarta] = new Carta("Sevilla", "Madrid");
				contadorCarta ++;
			}
			if (opcion == 4) {
				for(int i = 0; i < contadorPaq; i++) {
					System.out.println(paq[i]);
				}
				for(int i = 0; i < contadorPaqP; i++) {
					System.out.println(paqP[i]);
				}for(int i = 0; i < contadorCarta; i++) {
					System.out.println(c[i]);
				}
			}
			if(opcion == 5) {
				System.out.println(paq[contadorPaq -1]);
				System.out.println(paqP[contadorPaqP -1]);
				System.out.println(c[contadorCarta -1]);
			}
		}while(opcion != 0);
		tcld.close();
	}
}
