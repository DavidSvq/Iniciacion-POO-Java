package ejerciciosInterfaces.ejercicio6;

import java.util.Scanner;

public class Persona implements Cliente, Empleado {

	private String dni;
	private String nombre;
	private boolean cliente;
	private boolean empleado;
	private double horasTrabajadas;
	private double saldo;
	
	public Persona(String dni, String nombre, boolean cliente, boolean empleado) {
		this.dni = dni;
		this.nombre = nombre;
		this.cliente = cliente;
		this.empleado = empleado;
	}

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean isCliente() {
		return cliente;
	}


	public void setCliente(boolean cliente) {
		this.cliente = cliente;
	}


	public boolean isEmpleado() {
		return empleado;
	}


	public void setEmpleado(boolean empleado) {
		this.empleado = empleado;
	}

	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", horasTrabajadas=" + horasTrabajadas + ", saldo="
				+ saldo + "]";
	}

	public double getHorasTrabajadas() {
		double variableAux = 0;
		if(empleado) {
			variableAux = horasTrabajadas;
		}
		return variableAux;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		if(empleado) {
			this.horasTrabajadas = horasTrabajadas;
		}
		else {
			this.horasTrabajadas = 0;
		}
	}

	public double getSaldo() {
		double variableAux = 0;
		if(cliente) {
			variableAux = saldo;
		}
	
		return variableAux;
	}


	public void setSaldo(double saldo) {
		if(cliente) {
			this.saldo = saldo; 
		}
		else {
			this.saldo = 0;
		}
	}


	public String getDni() {
		return dni;
	}

	@Override
	public double calcular() {
		double horas = 0;
		if(empleado) {
			Scanner tcld = new Scanner(System.in);
			System.out.println("Introduce horas");
			horas = tcld.nextDouble();
		}
		return horas;
		
	}

	@Override
	public double mostrar() {
		if(cliente) {
			Scanner tcld = new Scanner(System.in);
			System.out.println("Introduce cantidad");
			double cantidad = tcld.nextDouble();
			this.saldo += cantidad;
		}
		
		return this.saldo;
	}
}

