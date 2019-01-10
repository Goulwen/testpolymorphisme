package exempleinterface;

import exempleinterface.implementations.Drone;
import exempleinterface.implementations.Ordinateur;

public class Main {

	public static void main(String[] args) {
		Enfant thomas = new Enfant();
		thomas.setJouet(new Drone());
		Enfant andy = new Enfant();
		andy.setJouet(new Ordinateur());

		thomas.joue();
		andy.joue();
	}

}
