package ejercicioClasePOO3.ejercicio11;

public class PrincipalLibro {

	public static void main(String[] args) {
		Libro l1 = new Libro("A", "a", 3, 0);
		
		System.out.println(l1.devolverLibro());
		System.out.println(l1.prestarLibro());
		System.out.println(l1);
		System.out.println(l1.prestarLibro());
		System.out.println(l1.prestarLibro());
		System.out.println(l1);
		System.out.println(l1.prestarLibro());
		System.out.println(l1.devolverLibro());
		System.out.println(l1);
		

	}

}
