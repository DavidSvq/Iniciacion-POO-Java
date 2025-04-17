package transporteFesac;

public class PaqueteGrande extends Paquete {
	private int altura;
	private int anchura;
	private int grosor;
	private double volumen;
	private boolean fragil;
	
	public PaqueteGrande(String destino, String origen) {
		super(destino, origen);
		altura = -1;
		anchura = -1;
		grosor = -1;
		volumen = -1;
		fragil = false;	
	}

	/**
	 * @param destino
	 * @param origen
	 * @param altura
	 * @param anchura
	 * @param grosor
	 * @param volumen
	 * @param fragil
	 */
	public PaqueteGrande(String destino, String origen, int altura, int anchura, int grosor) {
		super(destino, origen);
		this.altura = altura;
		this.anchura = anchura;
		this.grosor = grosor;
		volumen = -1;
		fragil = false;
	}

	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * @return the anchura
	 */
	public int getAnchura() {
		return anchura;
	}

	/**
	 * @param anchura the anchura to set
	 */
	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}

	/**
	 * @return the grosor
	 */
	public int getGrosor() {
		return grosor;
	}

	/**
	 * @param grosor the grosor to set
	 */
	public void setGrosor(int grosor) {
		this.grosor = grosor;
	}

	/**
	 * @return the fragil
	 */
	public boolean isFragil() {
		return fragil;
	}

	/**
	 * @param fragil the fragil to set
	 */
	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}

	/**
	 * @return the volumen
	 */
	public double getVolumen() {
		return volumen;
	}
	
	private int calcularVolumen() {
		return anchura * altura * grosor;
	}
	public void calcularCoste() {
		if(fragil) setCosteEnvio((calcularVolumen() * 0.05) + 10);
		else setCosteEnvio(calcularVolumen() * 0.05);
	}
	public void calcularCoste(String descuento) {
		double volumenAuxiliar = calcularVolumen();
		if(descuento.equals("DES10")) volumenAuxiliar = volumenAuxiliar * 0.9;
		else if(descuento.equals("DES25"))volumenAuxiliar = volumenAuxiliar * 0.75;
		setCosteEnvio(volumenAuxiliar * 0.05);	
	}

	@Override
	public String toString() {
		return super.toString() + "\nPaqueteGrande\n [Altura: " + altura + "\t Anchura: " + anchura + "\t Grosor: " + grosor + "\n Volumen: "
				+ volumen + "\t Frágil: " + fragil + "]";
	}
	
}
