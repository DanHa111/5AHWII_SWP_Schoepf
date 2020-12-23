package factoryPattern;

import java.util.ArrayList;
import java.util.List;

public interface IPizza {
	List<String> ingredients = new ArrayList<>();
	
	static void printIngredients()	{
		for (String string : ingredients) {
			System.out.println(string);
		}
	}
	
}
