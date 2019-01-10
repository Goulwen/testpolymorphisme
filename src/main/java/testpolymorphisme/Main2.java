package testpolymorphisme;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		List < Voiture > parcAuto = new ArrayList < Voiture >();
		parcAuto.add(new VoitureElectrique());
		parcAuto.add(new VoitureElectrique());
		parcAuto.add(new VoitureSolaire());
		parcAuto.add(new VoitureElectrique());

		for (Voiture voiture : parcAuto) {
			voiture.demarre();
		}
	}

}
