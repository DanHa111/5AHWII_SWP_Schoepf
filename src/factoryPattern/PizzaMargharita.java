package factoryPattern;

import java.util.ArrayList;
import java.util.List;

public class PizzaMargharita implements IPizza {
	private List<String> ingredients = new ArrayList<>();
	
	public PizzaMargharita()	{
		ingredients.add("MargharitaIngredient1");
		ingredients.add("MargharitaIngredient2");
	}
	
	public void printIngredients()	{
		for (String string : ingredients) {
			System.out.println(string);
		}
	}
}
