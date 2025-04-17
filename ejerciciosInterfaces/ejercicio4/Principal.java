package ejerciciosInterfaces.ejercicio4;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {

	public static void main(String[] args) {
		Cliente c = new Cliente("22A", "David", 25, 3000);
		Cliente c1 = new Cliente("22A", "Davinia", 25, 3000);
		Cliente c2 = new Cliente("22A", "Davinia", 23, 3000);
		Cliente c3 = new Cliente("22A", "Davinia", 23, 2000);
		Cliente c4 = new Cliente("22B", "Luis", 24, 3500);
		Cliente c5 = new Cliente("22B", "Luisa", 24, 3500);
		Cliente c6 = new Cliente("22B", "Luis", 22, 3500);
		Cliente c7 = new Cliente("22B", "Luisa", 22, 2500);
		
		ArrayList<Cliente> clientes = new ArrayList<>();
		
		clientes.add(c4);
		clientes.add(c1);
		clientes.add(c6);
		clientes.add(c2);
		clientes.add(c7);
		clientes.add(c);
		clientes.add(c3);
		clientes.add(c5);
		
		System.out.println("Sin ordenar");
		for(Cliente cli : clientes) {
			System.out.println(cli);
		}
		
		Collections.sort(clientes);
		System.out.println("Orden natural, por dni");
		for(Cliente cli : clientes) {
			System.out.println(cli);
		}
		
		Collections.sort(clientes, new CompararNombre());
		System.out.println("Orden por nombre");
		for(Cliente cli : clientes) {
			System.out.println(cli);
		}
		
		Collections.sort(clientes, new CompararEdad());
		System.out.println("Orden por edad");
		for(Cliente cli : clientes) {
			System.out.println(cli);
		}
		
		Collections.sort(clientes, new CompararSaldo());
		System.out.println("Orden por saldo");
		for(Cliente cli : clientes) {
			System.out.println(cli);
		}
		
	}

}
