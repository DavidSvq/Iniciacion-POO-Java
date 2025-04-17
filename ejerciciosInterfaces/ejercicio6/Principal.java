package ejerciciosInterfaces.ejercicio6;

public class Principal {

	public static void main(String[] args) {
		Persona p = new Persona("2345", "David", true, true);
		Persona p1 = new Persona("2346", "Jose", false, true);
		Persona p2 = new Persona("2347", "Maria", true, false);
		
		System.out.println(p);
		System.out.println(p1);
		
		p.setHorasTrabajadas(p.calcular());
		p1.setHorasTrabajadas(p1.calcular());
		p2.setHorasTrabajadas(p2.calcular());
		p.setSaldo(p.mostrar());
		p1.setSaldo(p1.mostrar());
		p2.setSaldo(p2.mostrar());
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p2);

	}

}
