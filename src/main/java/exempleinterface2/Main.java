package exempleinterface2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		VoitureAbstraite voiture = new VoitureElectrique();
		voiture.demarre();

		TelephoneMobile telephoneMobile = new TelephoneMobile();
		Televiseur televiseur = new Televiseur();

		List < Branchable > parcAppareilsElectriques = new ArrayList < Branchable >();
		if (voiture instanceof Branchable) {
			parcAppareilsElectriques.add((Branchable) voiture);
		}
		parcAppareilsElectriques.add(telephoneMobile);
		parcAppareilsElectriques.add(televiseur);

		for (Branchable branchable : parcAppareilsElectriques) {
			System.out.println("L'appareil " + branchable.getNom() + " consomme " + branchable.getConsommationElectrique());
			if (branchable instanceof Rechargeable) {
				Rechargeable rechargeable = (Rechargeable) branchable;
				System.out.println("Son taux de rechargement est " + rechargeable.getTauxRechargement());
			}
		}

	}

}
