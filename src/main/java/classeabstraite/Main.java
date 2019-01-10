package classeabstraite;

public class Main {

	public static void main(String[] args) {
		SqueletteEnregistreur enregistreur = new ConcreteFakeEnregistreur();
		enregistreur.enregistrer(null);
		System.out.println(enregistreur.getNombreElements());
	}

}
