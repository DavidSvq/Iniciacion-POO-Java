package puerbasConArray_Y_ArrayList.Biblioteca;

public class PrincipalBiblioteca {

	public static void main(String[] args) {
		Socio s1 = new Socio();
		Socio s2 = new Socio("Maria", 2);
		Libro lb1 = new Libro();
		Libro lb2 = new Libro("La recta circular", "Compas", "1111");
		Biblioteca bbltc = new Biblioteca();
		
		bbltc.agregarLibro(lb1);
		bbltc.agregarLibro(lb2);
		bbltc.agregarSocio(s1);
		bbltc.agregarSocio(s2);
		
		System.out.println(bbltc);
		
		bbltc.prestarLibro("1111", 2);
	}

}
