package factoryPattern;

import java.util.*;

public class PizzaDiavolo implements IPizza {
	private List<String> ingredients = new ArrayList<>();
	
	public PizzaDiavolo()	{
		ingredients.add("DiavoloIngredient1");
		ingredients.add("DiavoloIngredient2");
	}
	
	public void printIngredients()	{
		for (String string : ingredients) {
			System.out.println(string);
		}
	}
}
