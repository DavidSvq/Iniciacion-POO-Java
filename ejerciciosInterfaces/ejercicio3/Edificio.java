package ejerciciosInterfaces.ejercicio3;

public abstract class Edificio implements SuperficieEdificio {
	
	private double superficie;
	
	public Edificio(double superficie) {
		this.superficie = superficie;
	}

	
	public double getSuperficie() {
		return superficie;
	}


	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	
	@Override
	public String toString() {
		return "Edificio [Superficie " + superficie + "]";
	}


	@Override
	public double superficieEdificio() {
		return superficie;
	}

}
