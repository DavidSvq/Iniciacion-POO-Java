package ejercicioClasePOO3.ejercicio4;

public class PrincipalCdMusical {

	public static void main(String[] args) {
		Cancion c1 = new Cancion("Canción");
		Cancion c2 = new Cancion("Canción 2");
		Cancion c3 = new Cancion("Canción 3");
		Cancion c4 = new Cancion("Canción 4");
		CdMusical cd = new CdMusical(0);
		
		cd.agregarCancion(c1);
		cd.agregarCancion(c2);
		System.out.println(cd);
		cd.grabarCancion(0, c4);
		System.out.println(cd);
		cd.agregarCancion(c3);
		System.out.println(cd);
		System.out.println(cd.darCancion(1));
		cd.eliminarCancion(2);
		System.out.println(cd);
	}

}
