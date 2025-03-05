package puerbasConArray_Y_ArrayList;

public class Persona {
	private String nombre;
	private Dni dni;
	private Fecha fecha_nacimiento;
	/**
	 * @param nombre
	 * @param dni
	 * @param fecha_nacimiento
	 */
	public Persona(String nombre, Dni dni, Fecha fecha_nacimiento) {
		this.nombre = nombre;
		this.dni = dni;
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	/**
	 * 
	 */
	public Persona(String nombre, Fecha fecha_nacimiento) {
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni.getDni() + ", fecha_nacimiento=" + fecha_nacimiento + "]";
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
	 * @return the dni
	 */
	public Dni getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(Dni dni) {
		this.dni = dni;
	}
	/**
	 * @return the fecha_nacimiento
	 */
	public Fecha getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	/**
	 * @param fecha_nacimiento the fecha_nacimiento to set
	 */
	public void setFecha_nacimiento(Fecha fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	
	
}
