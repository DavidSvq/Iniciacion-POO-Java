package ejerciciosInterfaces.ejercicio1;

import java.util.ArrayList;

public class Biblioteca {

	public static void main(String[] args) {
		LibroBiclioteca lb = new LibroBiclioteca(45,"aaaaa", 1999);
		LibroBiclioteca lb1 = new LibroBiclioteca(99,"bbbbb", 2009);
		Comic c = new Comic(101, "cccc", 2023);
		Comic c1 = new Comic(104, "dddd", 2023);
		Revista r = new Revista(111, "T", 2025, 1000);
		Revista r1 = new Revista(133, "T", 2025, 1001);
		ArrayList<Libro> l = new ArrayList<>();
		l.add(lb);
		l.add(lb1);
		l.add(c);
		l.add(c1);
		l.add(r);
		l.add(r1);
		lb.prestar();
		c1.prestar();
		for(Libro lib : l) {
			System.out.println(lib);
		}
	}

}
