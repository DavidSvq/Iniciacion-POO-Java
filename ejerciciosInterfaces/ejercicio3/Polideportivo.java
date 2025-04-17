package ejerciciosInterfaces.ejercicio3;

public class Polideportivo extends Edificio implements TipoDeInstalacion {
	
	private String nombre;
	
	public Polideportivo(double superficie, String nombre) {
		super(superficie);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	@Override
	public String toString() {
		return super.toString() + "Polideportivo [Nombre " + nombre + "]";
	}

	@Override
	public String tipoDeInstalacion() {
		
		return "Soy una instalación polideportiva";
	}

}
