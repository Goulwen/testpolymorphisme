package testpolymorphisme;

public class VoitureElectrique extends Voiture {

	@Override
	public void demarre() {
		System.out.println("Je suis une voiture electrique qui démarre");
	}

	public void chargeBatterieElectrique() {
		System.out.println("Je charge ma batterie electrique");
	}

}
