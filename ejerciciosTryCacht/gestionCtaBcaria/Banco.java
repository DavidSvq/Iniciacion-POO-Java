package ejerciciosTryCacht.gestionCtaBcaria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Banco {

	public static void main(String[] args) throws SaldoInsuficienteException, OperacionInvalidadExcepcion {
		Scanner tcld = new Scanner(System.in);
		CuentaBancaria cb = new CuentaBancaria(2000,"David");
		System.out.println("Introduce la cantidad a ingresar");
		try {
			cb.depositar(tcld.nextDouble());
		}
		catch(OperacionInvalidadExcepcion e){
			System.out.println(e);
		}
		catch(InputMismatchException e1) {
			System.out.println("Error, solo se aceptan números enteros.");
			tcld.nextLine();
		}
		System.out.println("Introduce la cantidad a retirar");
		try {
			cb.retirar(tcld.nextDouble());
		}
		catch(OperacionInvalidadExcepcion e) {
			System.out.println(e);
		}
		catch(SaldoInsuficienteException e1) {
			System.out.println(e1);
		}
		catch(InputMismatchException e2) {
			System.out.println("Error, solo se aceptan números enteros.");
			tcld.nextLine();
		}
		finally {
			tcld.close();
		}
	}

}
