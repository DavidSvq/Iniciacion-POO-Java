package ejerciciosInterfaces.ejercicio3;

public class Oficinas extends Edificio implements TipoDeInstalacion {

	private int numeroDeOficinas;
	
	public Oficinas(double superficie, int numeroDeOficinas) {
		super(superficie);
		this.numeroDeOficinas = numeroDeOficinas;
	}

	
	public int getNumeroDeOficinas() {
		return numeroDeOficinas;
	}


	public void setNumeroDeOficinas(int numeroDeOficinas) {
		this.numeroDeOficinas = numeroDeOficinas;
	}


	@Override
	public String toString() {
		return super.toString() + "Oficinas [Número de Oficinas=" + numeroDeOficinas +"]";
	}


	@Override
	public String tipoDeInstalacion() {
		return "Soy unas oficinas";
	}

}
