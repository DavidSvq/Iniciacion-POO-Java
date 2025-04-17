package ejerciciosInterfaces.ejercicio3;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Polideportivo p = new Polideportivo(200, "Depor");
		Polideportivo p1 = new Polideportivo(300, "Deport");
		Polideportivo p2 = new Polideportivo(500, "Deportes");
		
		Oficinas o = new Oficinas(200,20);
		Oficinas o1 = new Oficinas(400,30);
		
		ArrayList<Edificio> e = new ArrayList<>();
		
		e.add(p);
		e.add(p1);
		e.add(p2);
		e.add(o);
		e.add(o1);
		for(Edificio edi : e) {
			System.out.println(edi);
		}
		
	}

}
