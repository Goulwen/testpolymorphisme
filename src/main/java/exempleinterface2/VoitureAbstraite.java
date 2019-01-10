package exempleinterface2;

public abstract class VoitureAbstraite implements Nommable {

	public abstract void demarre();

	public void clignote() {
		System.out.println("Clignote");
	}

}
