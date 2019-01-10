package testpolymorphisme;

public class Main3 {

	public static void main(String[] args) {
		Voiture v = new VoitureElectrique();
		v = new VoitureSolaire();
		if (v instanceof VoitureElectrique) {
			VoitureElectrique ve = (VoitureElectrique) v;
			ve.chargeBatterieElectrique();
		} else {
			System.out.println("Je ne suis pas une voiture electrique");
		}
	}

}
