package exempleinterface2;

public class TelephoneMobile implements Branchable, Rechargeable {

	public int getTauxRechargement() {
		return 77;
	}

	public void seBrancher() {

	}

	public int getConsommationElectrique() {
		return 2;
	}

	public String getNom() {
		return "Téléphone mobile";
	}

}
