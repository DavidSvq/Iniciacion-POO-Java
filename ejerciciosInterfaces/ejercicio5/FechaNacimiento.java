package ejerciciosInterfaces.ejercicio5;

import java.time.Year;

public class FechaNacimiento implements Comparable<FechaNacimiento>{

	private int dia;
	private int mes;
	private int anio;
	
	public FechaNacimiento (int dia, int mes, int anio) throws FechaErrorException {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		int anioActual = Year.now().getValue();
		if(this.dia < 1 || this.dia > 31) {
			throw new FechaErrorException("Dia incorrecto");
		}
		else if(this.mes < 1 || this.mes > 12) {
			throw new FechaErrorException("Mes incorrecto");
		}
		else if(this.anio < 1925 || this.anio > anioActual) {
			throw new FechaErrorException("Año incorrecto");
		}
	}
	
	public FechaNacimiento() {
		// TODO Auto-generated constructor stub
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAnio() {
		return anio;
	}
	
	public void setAnio(int anio) {
		this.anio = anio;
	}

	
	
	@Override
	public String toString() {
		return "FechaNacimiento [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}

	@Override
	public int compareTo(FechaNacimiento fn) {
		int salida = -1;
		if(this.anio > fn.getAnio()) {
			salida = 1;
		}
		else if(this.anio == fn.getAnio()) {
			if(this.mes > fn.getMes()) {
				salida = 1;
			}
			else if(this.mes == fn.getMes()) {
				if(this.dia > fn.getDia()) {
					salida = 1;
				}
				else if(this.dia == fn.getDia()) {
					salida = 0;
				}
				else {
					salida = -1;
				}
			}else {
				salida = -1;
			}
		}else {
			salida = -1;
		}
		return salida;
	}

}
