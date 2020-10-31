package observerPattern;

public class Lehrer implements Observer {
	private String name;

	public Lehrer(String name) {
		super();
		this.name = name;
	}

	@Override
	public void notify(int value) {
		// TODO Auto-generated method stub
		if(value >= 25)	{
			System.out.println("Lehrer " + name + " meldet Heizungswert: " + value + " Grad.");
		}
	}
	
}
