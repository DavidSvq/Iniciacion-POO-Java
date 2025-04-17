package ejerciciosInterfaces.ejercicio2;

public class BulletProofDoor extends Door implements BulletSafe {

	public BulletProofDoor() {
	}

	@Override
	public String bulletProof() {
		return "Puerta Antibalas";

	}

}
