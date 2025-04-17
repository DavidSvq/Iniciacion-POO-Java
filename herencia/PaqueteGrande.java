package herencia;

public class PaqueteGrande extends Paquete {
	private int h;
	private int ancho;
	private int grosor;
	private double volumen;
	private boolean fragil;
	
	
	public PaqueteGrande(String destino, String origen) {
		super(destino, origen);
		h = -1;
		ancho = -1;
		grosor = -1;
		volumen = -1;
		fragil = false;
	}


	/**
	 * @param destino
	 * @param origen
	 * @param h
	 * @param ancho
	 * @param grosor
	 */
	public PaqueteGrande(String destino, String origen, int h, int ancho, int grosor) {
		super(destino, origen);
		this.h = h;
		this.ancho = ancho;
		this.grosor = grosor;
		volumen = - 1;
		fragil = false;
	}


	public int getH() {
		return h;
	}


	public void setH(int h) {
		this.h = h;
	}


	public int getAncho() {
		return ancho;
	}


	public void setAncho(int ancho) {
		this.ancho = ancho;
	}


	public int getGrosor() {
		return grosor;
	}


	public void setGrosor(int grosor) {
		this.grosor = grosor;
	}


	public boolean isFragil() {
		return fragil;
	}


	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}


	public double getVolumen() {
		return volumen;
	}
	
	private int calcularVolumen() {
		volumen = h * ancho * grosor;
		return (int) volumen;
	}
	
	public void calcularCoste() {
		
		if(fragil) setCosteEnvio((calcularVolumen() * 0.05) + 10);
		
		else setCosteEnvio(calcularVolumen() * 0.05);
	}
	
	public void calcularCoste(String dto) {
		double volumenAux = calcularVolumen();
		if(dto.equals("DES10")){
			volumenAux = volumenAux * 0.9;
		}
		else if(dto.equals("DES25")) {
			volumenAux = volumenAux * 0.75;
		}
		setCosteEnvio(volumenAux * 0.05);
	}


	@Override
	public String toString() {
		return "PaqueteGrande [h=" + h + ", ancho=" + ancho + ", grosor=" + grosor + ", volumen=" + volumen
				+ ", fragil=" + fragil + ", toString()=" + super.toString() + "]";
	}
	
	
}
