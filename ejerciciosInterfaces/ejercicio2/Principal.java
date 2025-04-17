package ejerciciosInterfaces.ejercicio2;

public class Principal {

	public static void main(String[] args) {
		FireProofDoor fpd = new FireProofDoor();
		BulletProofDoor bpd = new BulletProofDoor();
		BulletProofAndFireProofDoor bpfpD = new BulletProofAndFireProofDoor();
		FireProofWindow fpw = new FireProofWindow();
		Coche c = new Coche();
		
		
		System.out.println(fpd.isAbierto());
		fpd.open();
		System.out.println(fpd.isAbierto());
		
		System.out.println(bpd.isAbierto());
		bpd.open();
		System.out.println(bpd.isAbierto());
		
		bpfpD.open();
		System.out.println(bpfpD.isAbierto());
		
		System.out.println(fpd.fireProof());
		System.out.println(bpd.bulletProof());
		System.out.println(bpfpD.bulletProof() + " y " + bpfpD.fireProof());
		System.out.println(fpw.fireProof());
		System.out.println(c.bulletProof());
	}

}
