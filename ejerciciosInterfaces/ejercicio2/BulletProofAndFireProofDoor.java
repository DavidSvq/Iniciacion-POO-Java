package ejerciciosInterfaces.ejercicio2;

public class BulletProofAndFireProofDoor extends Door implements BulletSafe, FireSafe {

	public BulletProofAndFireProofDoor() {
		
	}

	@Override
	public String fireProof() {
		return "Puerta Contraincendios";

	}

	@Override
	public String bulletProof() {
		return "Puerta Antibalas";

	}

}
