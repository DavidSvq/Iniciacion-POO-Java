package puerbasConArray_Y_ArrayList.Biblioteca;

import java.util.Scanner;

public class Socio {
	private String nombre;
	private int numeroSocio;
	/**
	 * @param nombre
	 * @param numeroSocio
	 */
	public Socio() {
		Scanner tcld = new Scanner(System.in);
		System.out.println("Introduce el nombre del socio: ");
		nombre = tcld.nextLine();
		System.out.println("Introduce el numero de socio: ");
		numeroSocio = tcld.nextInt();	
	}
	/**
	 * @param nombre
	 * @param numeroSocio
	 */
	public Socio(String nombre, int numeroSocio) {
		this.nombre = nombre;
		this.numeroSocio = numeroSocio;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the numeroSocio
	 */
	public int getNumeroSocio() {
		return numeroSocio;
	}
	/**
	 * @param numeroSocio the numeroSocio to set
	 */
	public void setNumeroSocio(int numeroSocio) {
		this.numeroSocio = numeroSocio;
	}
	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", numeroSocio=" + numeroSocio + "]";
	}
	
}
