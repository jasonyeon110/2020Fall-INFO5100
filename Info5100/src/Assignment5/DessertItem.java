package Assignment5;

public abstract class DessertItem {

	private String name;
	
	//Null Constructor
	DessertItem() {
		
	}
	
	//Constructor with String parameter
	public DessertItem(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public abstract int getCost();
	
	
}
