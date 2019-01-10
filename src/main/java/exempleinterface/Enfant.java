package exempleinterface;

import exempleinterface.implementations.Drone;
import exempleinterface.implementations.Ordinateur;
import exempleinterface.interfaces.JouetDemarrable;

public class Enfant {

	private JouetDemarrable jouet;

	public void setJouet(JouetDemarrable jouet) {
		this.jouet = jouet;
	}

	public void joue() {
		if (jouet != null) {
			jouet.demarre();
		}
	}

	public void joue(String nomJouet) {
		if (nomJouet == "ordinateur") {
			jouet = new Ordinateur();
		} else {
			jouet = new Drone();
		}
	}
}
