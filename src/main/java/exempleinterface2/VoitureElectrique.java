package exempleinterface2;

public class VoitureElectrique extends VoitureAbstraite implements Branchable, Rechargeable {

	public int getTauxRechargement() {
		return 30;
	}

	public void seBrancher() {
	}

	public int getConsommationElectrique() {
		return 40;
	}

	@Override
	public void demarre() {
	}

	public String getNom() {
		return "Voiture Electrique";
	}

}
