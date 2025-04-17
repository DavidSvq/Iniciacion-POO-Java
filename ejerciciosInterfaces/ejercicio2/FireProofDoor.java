package ejerciciosInterfaces.ejercicio2;

public class FireProofDoor extends Door implements FireSafe {

	public FireProofDoor() {
	}

	@Override
	public String fireProof() {
		return "Puerta Contraincendios";

	}

}
