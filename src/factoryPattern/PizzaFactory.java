package factoryPattern;

public class PizzaFactory {
	public static IPizza getPizza(String type)	{
		if(type.equals("Diavolo"))	{
			return new PizzaDiavolo();
		}
		if(type.equals("Margharita"))	{
			return new PizzaMargharita();
		}
		return null;
	}
}
