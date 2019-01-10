package testpolymorphisme;

public class VoitureSolaire extends Voiture {

	@Override
	public void demarre() {
		System.out.println("Je suis une voiture solaire qui démarre");
	}
}
