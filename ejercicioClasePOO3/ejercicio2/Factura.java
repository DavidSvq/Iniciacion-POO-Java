package ejercicioClasePOO3.ejercicio2;

import java.util.ArrayList;

public class Factura {
	private int idFactura;
	private ArrayList<Producto> productosEnFactura;
	/**
	 * @param idFactura
	 */
	public Factura(int idFactura) {
		this.idFactura = idFactura;
		productosEnFactura = new ArrayList<>();
	}
	/**
	 * @return the idFactura
	 */
	public int getIdFactura() {
		return idFactura;
	}
	/**
	 * @param idFactura the idFactura to set
	 */
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	/**
	 * @return the productosEnFactura
	 */
	public ArrayList<Producto> getProductosEnFactura() {
		return productosEnFactura;
	}
	/**
	 * @param productosEnFactura the productosEnFactura to set
	 */
	public void setProductosEnFactura(ArrayList<Producto> productosEnFactura) {
		this.productosEnFactura = productosEnFactura;
	}
	@Override
	public String toString() {
		return "Factura [idFactura " + idFactura + "\n Productos=" + productosEnFactura + "]";
	}
	public void agregarProductoEnFactura(Producto P1) {
		productosEnFactura.add(P1);
	}
	
}
