package classeabstraite;

import java.util.ArrayList;
import java.util.List;

public class ConcreteFakeEnregistreur extends FakeEnregistreur {

	@Override
	public void enregistrer(Object objet) {
		System.out.println("Enregistrement");
	}

	@Override
	public void supprimer(Object objet) {
		System.out.println("Suppression");
	}

	@Override
	public List < Object > lireTout() {
		System.out.println("Liste");
		List < Object > resultat = new ArrayList < Object >();
		resultat.add("Un");
		resultat.add("Deux");
		return resultat;
	}

}
