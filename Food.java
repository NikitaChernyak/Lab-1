package lab1B;

public abstract class Food implements Consumable, Nutritious {

	private String name = null;
	private int calories = 0;
	
	public Food(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public boolean equals(Object arg) {	
		if(!(arg instanceof Food)) return false;
		if(name == null || ((Food)arg).name == null) return false;
		return name.equals(((Food)arg).name);
	}

}
