package ejerciciosInterfaces.ejercicio5;

public class Socio implements Comparable<Socio> {
	private int idSocio;
	private String nombre;
	private FechaNacimiento fechaNacimiento;
	private double cuenta;
	
	public Socio() {
	}
	
	public Socio(int idSocio, String nombre, int dia, int mes,int anio, double cuenta) throws FechaErrorException {
			this.idSocio = idSocio;
			this.nombre = nombre;
			this.fechaNacimiento = new FechaNacimiento(dia, mes, anio);
			this.cuenta = cuenta;
			if(this.idSocio < 0) {
				throw new SocioNoValidoException("ID Socio no válido.");
			}
			else if(this.cuenta < 100) {
				throw new SocioNoValidoException("Cuenta no válida.");
			}
		
	}

	public int getIdSocio() {
		return idSocio;
	}

	public void setIdSocio(int idSocio) {
		this.idSocio = idSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public FechaNacimiento getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(FechaNacimiento fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getCuenta() {
		return cuenta;
	}

	public void setCuenta(double cuenta) {
		this.cuenta = cuenta;
	}

	


	@Override
	public String toString() {
		return "Persona [idSocio=" + idSocio + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento
				+ ", cuenta=" + cuenta + "]";
	}


	@Override
	public int compareTo(Socio p) {
		
		
		int salida2= this.idSocio-p.getIdSocio();
		
		if(salida2==0){
			salida2= this.nombre.compareTo(p.getNombre());
			if(salida2==0) {
				salida2 = this.fechaNacimiento.compareTo(p.getFechaNacimiento());
				if(salida2 == 2) {
					salida2 = (int)(this.cuenta - p.getCuenta());
				}
			}
		}
		
		return salida2;
		
		
		/*int salida = -1;
		if(this.idSocio > p.getIdSocio()) {
			salida = 1;
		}
		else if(this.idSocio == p.getIdSocio()) {
			salida = this.nombre.compareTo(p.getNombre());
			if (this.nombre.equals(p.getNombre())) {
				// salida = this.fechaNacimiento.compareTo(p.getFechaNacimiento());
				if(this.fechaNacimiento.compareTo(p.getFechaNacimiento()) == 0) {
					if(this.cuenta > p.getCuenta()) {
						salida = 1;
					}
					else if(this.cuenta == p.getCuenta()) {
						salida = 0;		}
				}
				else if(this.fechaNacimiento.compareTo(p.getFechaNacimiento()) > 0){
					salida = 1;
				}
			}
		}
		return salida;*/
	}

}
