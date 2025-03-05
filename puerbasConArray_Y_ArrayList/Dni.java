package puerbasConArray_Y_ArrayList;

import java.util.Random;

public class Dni {
		private int nif;
		private char letraDni;
		private String dni;
		
	
	/**
	* @param dni
	*/
	public Dni(String dni) {
		this.dni = dni;
	}
		
	public Dni() {
		this.guardarDni();
	}
	private void generarNumeroDni() {
		Random aleatorio = new Random(); //Random generate method
		nif = aleatorio.nextInt(90000000) + 10000000;
	}
		
	public char asignarLetra(int restoDni) {
		String letrasDniSegunResto = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letraDni = letrasDniSegunResto.charAt(restoDni);
		return letraDni;	
	}
	public void guardarDni() {
		int restoDni = 0;
		generarNumeroDni();
		restoDni = nif % 23;
		letraDni = asignarLetra(restoDni);
		//To pass an integer to a string and concatenated + letter
		dni = Integer.toString(nif) + letraDni;
	}


	/**
	 * @return the nif
	 */
	public int getNif() {
		return nif;
	}

	/**
	 * @param nif the nif to set
	 */
	public void setNif(int nif) {
		this.nif = nif;
	}

	/**
	 * @return the letraDni
	 */
	public char getLetraDni() {
		return letraDni;
	}

	/**
	 * @param letraDni the letraDni to set
	 */
	public void setLetraDni(char letraDni) {
		this.letraDni = letraDni;
	}

	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public boolean comprobarDniGuardado(Dni dni) {
		if(this.getDni().equals(dni.getDni())) {
			return true;
		}
		return false;
	}
	
	public boolean verificarDniCorrecto(Dni dni) {
		int resto = dni.getNif() % 23;
		char letraAuxiliar = asignarLetra(resto);
		if(letraAuxiliar == dni.getLetraDni()) {
			return true;
		}
		return false;
	}
}
