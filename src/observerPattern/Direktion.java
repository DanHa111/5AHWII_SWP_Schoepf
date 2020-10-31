package observerPattern;

public class Direktion implements Observer {

	@Override
	public void notify(int value) {
		// TODO Auto-generated method stub
		if(value >= 30)	{
			System.out.println("Direktion meldet Heizungswert: " + value + " Grad.");
		}
	}

}
