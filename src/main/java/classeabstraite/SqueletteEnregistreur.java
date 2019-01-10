package classeabstraite;

import java.util.List;

public abstract class SqueletteEnregistreur {

	public abstract void enregistrer(Object objet);

	public abstract void supprimer(Object objet);

	public abstract List < Object > lireTout();

	public int getNombreElements() {
		return lireTout().size();
	}

	public void supprimerTout(List < Object > objects) {
		for (Object object : objects) {
			supprimer(object);
		}
	}

}
