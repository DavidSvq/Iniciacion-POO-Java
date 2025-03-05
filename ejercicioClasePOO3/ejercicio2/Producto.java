package ejercicioClasePOO3.ejercicio2;

import java.text.DecimalFormat;

public class Producto {
	private String id_producto;
	private double precio;
	/**
	 * @param id_producto
	 * @param precio
	 */
	public Producto(String id_producto, double precio) {
		this.id_producto = id_producto;
		this.precio = precio;
	}
	/**
	 * @return the id_producto
	 */
	public String getId_producto() {
		return id_producto;
	}
	/**
	 * @param id_producto the id_producto to set
	 */
	public void setId_producto(String id_producto) {
		this.id_producto = id_producto;
	}
	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00€");
		String formatoPrecio = df.format(precio);
		return "Producto [Id:" + id_producto + " // Precio: " + formatoPrecio + "]";
	}
	
	
}
