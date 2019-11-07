package lab1B;
import java.util.Arrays;

public class MainApplication {

	public static void main(String[] args) {
		
		Food[] breakfast = new Food[20];
		
		int itemsSoFar = 0;
		
		for (String arg : args) {
			String[] parts = arg.split("/");
			
			switch (parts[0]) {
			case "Cheese" : breakfast[itemsSoFar] = new Cheese(); break;
			case "Apple" : breakfast[itemsSoFar] = new Apple(parts[1]); break;
			}
			itemsSoFar++; 
		}
	 
		System.out.println("Завтрак:");
		for (Food item : breakfast) {
			if (item != null)
				item.consume();
			else break;
		}

	}

}
