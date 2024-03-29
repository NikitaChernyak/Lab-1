package lab1B;

public class Apple extends Food {
	
	private String size;
	
	public Apple(String size) {
		super("Яблоко");
		this.size = size;
	}
	
	@Override
	public void consume() {
		System.out.println(this + " съедено");
	}
	
	public int calculateCalories() {
		switch (size) {
		case "маленькое" : return 40; 
		case "среднее" : return 50; 
		case "большое" : return 60;
		default : return 0; 
		}
	}
	
	public String getSize() {
		return size;
	}
		
	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
	public boolean equals(Object arg) {
		if (super.equals(arg)) { 
			if (!(arg instanceof Apple)) 
				return false;
			return size.equals(((Apple)arg).size); 
		} 
		else return false;
	}
	
	@Override
	public String toString() {
		return super.toString() + " размера '" + size + "'";
	}
}
