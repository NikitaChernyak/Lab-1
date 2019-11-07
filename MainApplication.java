package lab1B;
import java.util.Arrays;

public class MainApplication {

	public static void main(String[] args) {
		
		Food[] breakfast = new Food[20];
		
		int itemsSoFar = 0;
		boolean c = false, s = false;
		
		for (String arg : args) {
			String[] parts = arg.split("/");
			
			switch (parts[0]) {
			case "Cheese" : breakfast[itemsSoFar] = new Cheese(); break;
			case "Apple" : breakfast[itemsSoFar] = new Apple(parts[1]); break;
			case "IceCream" : breakfast[itemsSoFar] = new IceCream(parts[1]); break;
			case "-calories" : c = true; break;
			case "-sort" : s = true; break;
			}
			itemsSoFar++; 
		}
	 
		System.out.println("Завтрак:");
		for (Food item : breakfast) {
			if (item != null)
				item.consume();
			else break;
		}
		
		if(c) {
			int caloriesCounter = 0;
			for(Food item : breakfast)	{
				if(item != null)
					caloriesCounter += item.calculateCalories();
			}
			System.out.println("Общая калорийность завтрака: " + caloriesCounter);
		}
		
		if(s) {
			System.out.println("Завтрак в отсортированном порядке:");
			Arrays.sort(breakfast,new FoodComparator());
			for(Food item : breakfast) 
				if(item != null)
					item.consume();       	 	   		        	
		}

	}

}
