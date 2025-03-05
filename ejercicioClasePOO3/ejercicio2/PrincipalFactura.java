package ejercicioClasePOO3.ejercicio2;

public class PrincipalFactura {

	public static void main(String[] args) {
		Producto p1 = new Producto("C1", 24.45);
		Producto p2 = new Producto("H23", 234);
		Producto p3 = new Producto("M30", 109);
		Factura f1 = new Factura(1);
		
		//Using directly the add method of the ArrayList class
		f1.getProductosEnFactura().add(p1);
		
		//Using the addProductInBill method of the bill class
		f1.agregarProductoEnFactura(p2);
		f1.agregarProductoEnFactura(p3);
		
		System.out.println(f1);
		
		//Change of product 2 (position 1 of the ArrayList) through bill objects
		f1.getProductosEnFactura().get(1).setId_producto("K123");
		f1.getProductosEnFactura().get(1).setPrecio(247);
		
		//Change of product 1 through product objects
		p1.setId_producto("K12");
		p1.setPrecio(47.50);
		
		System.out.println(f1);
	}

}
