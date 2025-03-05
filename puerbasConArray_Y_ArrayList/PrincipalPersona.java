package puerbasConArray_Y_ArrayList;

public class PrincipalPersona {

	public static void main(String[] args) {
		
		//Object creation
		Fecha f1 = new Fecha(1, 11, 2000);
		Dni d1 = new Dni();;
		Persona p1 = new Persona("David", d1, f1);
		Fecha f2 = new Fecha(11, 1, 2000);
		Dni d2 = new Dni("22222222H");;
		Persona p2 = new Persona("Maria", d2, f2);
		
		//Show data
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		//Use method: Check existing id
		if (p2.getDni().comprobarDniGuardado(d2)) {
			System.out.println("Dni encontrado");
		}
		else {
			System.out.println("El dni no existe");
		}
		if (p2.getDni().comprobarDniGuardado(d1)) {
			System.out.println("Dni encontrado");
		}
		else {
			System.out.println("El dni no existe");
		}
		
		
		//Use method: check correct dni
		if(p2.getDni().verificarDniCorrecto(d2)) {
			System.out.println("Letra correcta");
		}
		else {
			System.out.println("La letra es erronea");
		}
		
		if(p2.getDni().verificarDniCorrecto(d1)) {
			System.out.println("Letra correcta");
		}
		else {
			System.out.println("La letra es erronea");
		}
	}

}
