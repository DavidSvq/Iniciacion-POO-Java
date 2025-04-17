package herencia;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Paquete");
		Paquete p = new Paquete("Sevilla", "Huelva");
		p.calcularCoste();
		System.out.println(p.enviar());
		
		System.out.println("Paquete Grande");
		PaqueteGrande pG = new PaqueteGrande ("Sevilla", "Huelva", 4, 5, 3);
		pG.calcularCoste();
		System.out.println("volumen " + pG.getVolumen());
		System.out.println("coste " + pG.getCosteEnvio());
		pG.setFragil(true);
		pG.calcularCoste();
		System.out.println("coste con fragil " + pG.getCosteEnvio());
		pG.calcularCoste("DES10");
		System.out.println("coste con 10% Dto " + pG.getCosteEnvio());
		pG.calcularCoste("DES25");
		System.out.println("coste con 25% Dto " + pG.getCosteEnvio());
		
		System.out.println("Paquete Pequeño");
		PaquetePequenio pQ = new PaquetePequenio("Sevilla", "Huelva", 4);
		pQ.calcularCoste();
		System.out.println("Coste on 4 k " + pQ.getCosteEnvio());
		
		System.out.println("Carta");
		Carta c = new Carta("Sevilla", "Huelva");
		c.setMensaje("Esto es un mensaje en un carta");
		System.out.println(c.leerMensaje());
		
		System.out.println("coste " + c.getCosteEnvio());
		c.setSello(true);
		c.calcularCoste();
		System.out.println("coste con sello" + c.getCosteEnvio());
		
		if(c.calcularCoste(7)) {
			System.out.println("Promoción realizada");
		}
		System.out.println("coste con promoción" + c.getCosteEnvio());
		
		
		System.out.println("Carta certificada");
		CartaCertificada cC = new CartaCertificada("Sevilla", "Huelva");
		cC.setMensaje("Esto es un mensaje en una carta certificada");
		
		System.out.println(cC.leerMensaje());
		System.out.println(cC.leerMensaje());
		cC.calcularCoste();
		System.out.println("Coste" + cC.getCosteEnvio());

	}

}
