package observerPattern;

public class Sekretariat implements Observer {

	@Override
	public void notify(int value) {
		// TODO Auto-generated method stub
		System.out.println("Sekretariat meldet Heizungswert: " + value + " Grad.");
	}

}
