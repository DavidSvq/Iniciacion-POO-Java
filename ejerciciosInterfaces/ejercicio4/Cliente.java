package ejerciciosInterfaces.ejercicio4;

public class Cliente implements Comparable<Cliente> {

	private String dni;
	private String nombre;
	private int edad;
	private double saldo;
	
	public Cliente(String dni, String nombre, int edad, double saldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.saldo = saldo;
	}


	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	

	@Override
	public String toString() {
		return "[Dni " + dni + " Nombre " + nombre + " Edad " + edad + " Saldo=" + saldo + "]";
	}


	@Override
	public int compareTo(Cliente c) {
		int salida = dni.compareTo(c.getDni());
		return salida;
	}

}
